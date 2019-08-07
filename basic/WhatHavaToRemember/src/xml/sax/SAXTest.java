package xml.sax;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

//SAX技术
//1.SAX主要用于对xml文件解析(读取),不能去修改,删除,添加元素
//2.SAX是推的机制,把发现的内容告诉程序员(函数),程序员可以自己决定如何处理
public class SAXTest {
	//使用SAX技术解析文件
	public static void main(String[] args) throws Exception, SAXException {
		//1
		SAXParserFactory newInstance = SAXParserFactory.newInstance();
		//2
		SAXParser newSAXParser = newInstance.newSAXParser();
		newSAXParser.parse("src/xml/sax/myClass2.xml",new MyDefaultHandler2());
	}
}
//定义事件处理类
class MyDefaultHandler1 extends DefaultHandler{
	//发现文档开始,调用一次
	@Override
	public void startDocument() throws SAXException {
		System.out.println("发现文档开始");
	}
	//发现xml中的一个元W素开始,反复调用
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		System.out.println("元素名称:"+qName);
	}
	//发现xml文件中的文本
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		//显示文本内容
		//System.out.println(ch); //ch其实是文档本身
		//System.out.println("start="+start+",length="+length); //start代表发现的文本处于第几个位置
		if(!new String(ch,start,length).trim().equals("")){
			System.out.println(new String(ch,start,length));
		}
	}
	//发现xml文件中一个元素结束,反复调用
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.println("结束元素");
	}
	//发现文档结束,调用一次
	@Override
	public void endDocument() throws SAXException {
		System.out.println("发现文档结束");
	}
}
//定义事件处理类2
class MyDefaultHandler2 extends DefaultHandler{
	private boolean isName = false;
	private boolean isAge = false;
	@Override
	public void startDocument() throws SAXException {
	}
	//如何只显示名字和年龄
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if(qName.equals("名字")){
			this.isName=true;
		}else if(qName.equals("年龄")){
			this.isAge=true;
		}
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		//显示文本内容
		if(!new String(ch,start,length).trim().equals("")&&(isName||isAge)){
			System.out.println(new String(ch,start,length));
		}
		isName = false;
		isAge = false;
	}
	@Override
	public void endElement(String uri, String localName, String qName)
	throws SAXException {
	}
	@Override
	public void endDocument() throws SAXException {
	}
}
