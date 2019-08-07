package xml.dom4j;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;


/**
 * @author WUSD
 *	dom4j
 *	1.为什么有dom4j?
 *	dom缺点:比较消耗内存
 *	sax缺点:只能对xml进行读取,但是不能去 修改,添加,删除
 *	dom4j是效率更高,同时也可以进行crud操作
 *
 *	特别说明:因为dom4j不是sun公司的产品,所以我们开发dom4j需要单独的引入jar包
 */
public class Dom4JTest {
	static SAXReader reader;
	static Document document;
	static XMLWriter writer;
	static OutputFormat format = OutputFormat.createPrettyPrint();
	
	static{
		reader = new SAXReader();
		format.setEncoding("utf-8");//指定输出编码
		try {
			document = reader.read("src/xml/dom4j/myClass2.xml");
			writer = new XMLWriter(new FileOutputStream(document.getName()),format);
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//演示使用dom4j对xml文件进行crud操作
	public static void main(String[] args) throws DocumentException, IOException {
		//list(document.getRootElement());
		//list2(document);
		//readFirst(document);
		//add2(document);
		//delete(document);
		//update(document);
		addByIndex(document);
	}
	
	//遍历我们的xml文件
	public static void list(Element element){
		System.out.println(element.getName()+":"+element.getTextTrim());
		Iterator elementIterator = element.elementIterator();
		while (elementIterator.hasNext()) {
			Element e = (Element) elementIterator.next();
			list(e);
		}
	}
	
	//遍历我们的xml文件
	public static void list2(Document document){
		Element element = document.getRootElement();
		System.out.println(element.getName()+":"+element.getTextTrim());
		Iterator elementIterator = element.elementIterator();
		while (elementIterator.hasNext()) {
			Element e = (Element) elementIterator.next();
			list2(e.getDocument());
		}
	}
	
	//如何指定读取某个元素(要求:读取第一个学生的信息)
	public static void readFirst(Document document){
		//得到根元素
		Element root = document.getRootElement();
		//root.element("学生")：表示取出root元素下的第一个
		//root.elements("学生")：表示取出root元素下的所有学生
		Element stu = (Element) root.elements("学生").get(0);//表示取出root元素下的第一个学生元素
		Element stu_name = stu.element("名字");
		System.out.println(stu_name.getText()+",别名:"+stu_name.attributeValue("别名"));
		//System.out.println(stu.elements("名字").get(0).getText());
		
		//2.看看下面的代码是否能够(跨层取),不能的
		//Element stu2 = (Element) root.elements("名字").get(0);
		//System.out.println(stu2.getText());
		
	}
	
	public static void add(Document document) throws IOException{
		//创建一个学生节点对象Node=Element
		Element newStu = DocumentHelper.createElement("学生");
		Element newStu_name = DocumentHelper.createElement("名字");
		newStu_name.setText("邬胜达");
		Element newStu_age = DocumentHelper.createElement("年龄");
		newStu_age.setText("23");
		Element newStu_intro = DocumentHelper.createElement("介绍");
		newStu_intro.setText("亚信集团职员");
		
		newStu.add(newStu_name);
		newStu.add(newStu_age);
		newStu.add(newStu_intro);
		document.getRootElement().add(newStu);
		//更新xml文件
		writer.write(document);
		writer.close();
	}
	
	public static void add2(Document document) throws IOException{
		Element stu1 = DocumentHelper.createElement("学生");
		stu1.addElement("名字")
		.addAttribute("地址", "长沙")
		.addAttribute("大哥", "vs001")
		.addAttribute("学号", "vs002")
		.addAttribute("性别", "男")
		.addText("邬胜达2");
		stu1.addElement("年龄").addText("23");
		stu1.addElement("介绍").addText("一个努力的职员");
		
		Element stu2 = DocumentHelper.createElement("学生");
		stu2.addElement("名字")
		.addAttribute("地址", "长沙")
		.addAttribute("大哥", "vs003")
		.addAttribute("学号", "vs004")
		.addAttribute("性别", "男")
		.addText("邬胜达3");
		stu2.addElement("年龄").addText("22");
		stu2.addElement("介绍").addText("一个职员");
		//更新xml文件
		document.getRootElement().add(stu1);
		document.getRootElement().add(stu2);
		writer.write(document);
		writer.close();
	}
	
	//删除元素(要求:删除第一个学生)
	public static void delete(Document document) throws IOException{
		Element rootElement = document.getRootElement();
		Element stu1 = rootElement.element("学生");
		//Element stu1 = rootElement.element("学生");
		//rootElement.remove(stu1);
		stu1.remove(stu1.attribute("大哥"));
		
		writer.write(document);
		writer.close();
	}
	
	//修改元素
	public static void update(Document document) throws IOException{
		Element rootElement = document.getRootElement();
		
		//更新元素
		List<Element> stus = rootElement.elements("学生");
		for (Element stu : stus) {
			Element age = stu.element("年龄");
			age.setText(Integer.parseInt(stu.element("年龄").getText())+3+"");
		}
		
		//更新属性
		Element stu1 = rootElement.element("学生");
		//stu1.setAttributeValue("大哥", "hellowold");
		stu1.addAttribute("大哥", "helloworld");
		
		writer.write(document);  
		writer.close();
	}
	
	//添加一个元素到指定位置
	public static void addByIndex(Document document) throws IOException{
		//创建一个新元素
		Element new1 = DocumentHelper.createElement("学生");
		new1.setText("林冲");
		
		List<Element> all = document.getRootElement().elements("学生");
		
		for (int i = 0; i < all.size(); i++) {
			if(all.get(i).element("名字").getText().equals("周星驰")){
				all.add(i+1,new1);
				break;
			}
		}
		
		writer.write(document);  
		writer.close();
	}	
	
	
	
	
	
}