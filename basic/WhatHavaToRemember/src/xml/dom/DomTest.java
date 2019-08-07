package xml.dom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author WUSD
 * 调用JAXP中的DOM解析器步骤
 * 1.调用DocumentBuilderFactory.newInstance()方法得到创建DOM解析器的工厂
 * 2.调用工厂对象newDocumentBuilder方法得到DOM解析器对象。
 * 3.调用DOM解析器对象parse()方法解析XML文档,得到代表整个文档的Document对象,进行可以利用DOM特性对整个XML文档进行操作了。
 * 
 */
public class DomTest{
	public static void main(String[] args) throws Exception{
		//1
		DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
		//2
		DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
		//3
		Document document = newDocumentBuilder.parse("src/xml/dom/myclass2.xml");
		
		//list(document);
		
		//read(document);
		
		//add(document);
		
		//delete(document);
		
		update(document);
		
		
	}
	
	//遍历该xml文件
	public static void list(Node node){
		if(node.getNodeType() == node.ELEMENT_NODE){
			System.out.println(node.getNodeName());
		}
		//取出node的子节点
		NodeList childNodes = node.getChildNodes();
		for (int i = 0; i < childNodes.getLength(); i++) {
			Node node2 = childNodes.item(i);
			list(node2);
		}
	}
	
	//具体的查询某个学生的信息(显示第一个学生信息)
	public static void read(Document doc){
		NodeList list = doc.getElementsByTagName("学生");
		//取出第一个学生
		Element stu = (Element) list.item(0);
		
		System.out.println(stu.getAttribute("性别"));
		
		Element name = (Element) stu.getElementsByTagName("名字").item(0);
		System.out.println(name.getTextContent());
		System.out.println("发现学生数:"+list.getLength());
	}
	
	//添加一个学生到xml文件中去
	public static void add(Document doc) throws Exception{
		//创建一个新的学生节点
		Element newStu = doc.createElement("学生");
		Element newStu_name = doc.createElement("名字");
		newStu_name.setTextContent("小明");
		
		Element newStu_age = doc.createElement("年龄");
		newStu_age.setTextContent("34");
		
		Element newStu_intro = doc.createElement("介绍");
		newStu_intro.setTextContent("这是个好孩子");
		
		newStu.appendChild(newStu_name);
		newStu.appendChild(newStu_age);
		newStu.appendChild(newStu_intro);
		
		//把新的学生节点添加到根元素
		doc.getDocumentElement().appendChild(newStu);
		
		//.1
		TransformerFactory newInstance = TransformerFactory.newInstance();
		//2
		Transformer newTransformer = newInstance.newTransformer();
		
		newTransformer.transform(new DOMSource(doc), new StreamResult("src/xml/dom/myclass2.xml"));
		
	}
	
	public static void delete(Document doc) throws Exception{
		//Node element = doc.getElementsByTagName("学生").item(0);
		Element element = (Element) doc.getElementsByTagName("学生").item(0);
		//element.getParentNode().removeChild(element);
		element.removeAttribute("性别");
		//删除
		//.1
		TransformerFactory newInstance = TransformerFactory.newInstance();
		//2
		Transformer newTransformer = newInstance.newTransformer();
		
		newTransformer.transform(new DOMSource(doc), new StreamResult("src/xml/dom/myclass2.xml"));
	}
	
	
	public static void update(Document doc) throws Exception{
		Element element = (Element) doc.getElementsByTagName("学生").item(0);
		Element node_name = (Element) doc.getElementsByTagName("名字").item(0);
		node_name.setTextContent("周星驰");

		//更新
		//.1
		TransformerFactory newInstance = TransformerFactory.newInstance();
		//2
		Transformer newTransformer = newInstance.newTransformer();
		
		newTransformer.transform(new DOMSource(doc), new StreamResult("src/xml/dom/myclass2.xml"));
	}
}
