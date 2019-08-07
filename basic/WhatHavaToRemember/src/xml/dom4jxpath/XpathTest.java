package xml.dom4jxpath;

import java.util.List;

import org.dom4j.*;
import org.dom4j.io.*;

/**
 * @author WUSD
 *	需要引入jaxen-1.1-beta-6.jar这个包
 */
public class XpathTest {
	public static void main(String[] args) throws Exception {
		//1.得到SAXReader解析器
		SAXReader reader = new SAXReader();
		//2.指定去解析哪个文件
		Document document = reader.read("src/xml/dom4jxpath/test.xml");
		//3.得到根元素
		Element root = document.getRootElement();
		//4.可以使用xpath随心读取
		//List<Element> e = document.selectNodes("//*");//返回所有元素
		//List<Element> e = document.selectNodes("/AAA");//返回多个元素,document.selectSingleNode返回一个元素
		//List<Element> e = document.selectNodes("/AAA/CCC");//返回/AAA下的CCC元素
		//List<Element> e = document.selectNodes("//BBB");//返回所有BBB元素
		//List<Element> e = document.selectNodes("/AAA/BBB/CCC/DDD/*");//返回路径下的所有元素
		//List<Element> e = document.selectNodes("/*/*/*/BBB");//返回有3个父元素的BBB元素
		List<Element> e = document.selectNodes("//DDD/BBB");//返回所有父元素是DDD的BBB元素
		System.out.println(e.size());
		System.out.println(e.get(e.size()-1).getText());
		
		// [/AAA/BBB[2]]返回指定的哪一个元素
		//Element e2 = (Element) document.selectSingleNode("/AAA/BBB[2]");
		//Element e2 = (Element) document.selectSingleNode("/AAA/BBB[last()]");//取最后一个
		//Element e2 = (Element) document.selectSingleNode("@id");//
		//Element e2 = (Element) document.selectSingleNode("//BBB[@id]");//
		
	}
}
