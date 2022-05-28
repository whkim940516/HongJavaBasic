package scorexml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class scorexml {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		// xml 파싱 : 서버에서 데이터를 요청하면 XML 형식으로 준다.우린 이걸 받아서 해석하고 필요한 부분을 만들 수 있다.
		
		// DocumentBuilderFactory DocumentBuilder
		// DocumentBuilderFactory 클래스로 XML문서에서 DOM 오브젝트 트리를 생성하는 parser를 얻을 수 있다고 한다.
		// DocumentBuilder 클래스는 XML 문서에서 DOM Document instance를 얻는다고 한다.
		// 이 DocumentBuilder 클래스를 사용하면 XML로부터 Document를 얻을 수 있다고 한다.
		// DocumentBuilder의 인스턴스를 할당하기 위해서는 DocumentBuilderFactory.newDocumentBuilder() 메서드를 사용한다.
		// 이름에서부터 나와있듯이 팩토리 패턴을 사용한다.
		// 팩토리 패턴이란 다른 클래스의 인스턴스를 가지고 객체를 생성하면 팩토리 패턴이다.
		// DocumentBuilder를 가지고 XML 입력 소스에서 XML을 파싱할 수있는데 여기서 사용되는 입력 소스로는 InputStreams, Files, URL, SAXInputSources가 있다.
		
		
		// 파싱이란?  해석하는 것
		
		// DOM이란?
		// DOM은 Document Object Model의 약자이다.
		// 문서 객체란 <html>이나 <body>같은 html 문서의 태그들을 JavaScript가 이용할 수 있는 객체로 만들면 그것을 문서 객체라고 한다.
		// Model은 모듈의 의미를 가지고 있다. 비슷하게 여기서는 문서 객체를 '인식하는 방식'이라고 해석할 수 있다.
		// DOM은 넓은 의미로 웹 브라우저가 HTML 페이지를 인식하는 방식을 의미한다. 좁은 의미로 보면 document 객체와 관련된 객체의 집합을 의미할 수도 있다.
		// 즉 DOM이란 웹 브라우저가 html 페이지를 인식하는 방식을 이야기하거나 문서 객체(document object)와 관련된 객체의 집합에 관한 이야기라는 것을 알 수 있다.
		
		
		// DocumentBuilderFactory 인스턴스를 생성하는 코드
		DocumentBuilder k07_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();	// DocumentBuilderFactory의 인스턴스를 통해 newDocumentBuilder()를 만들어 주었다.
																								// exception을 만들어 주라고 했으니까 만들어줌
		Document k07_doc = k07_docBuilder.parse(new File("C:\\dev\\javaChapter9_Data\\twiceScore.xml"));  	// docBuilder객체를 통해 parse라는 메서드를 사용하여 파일을 하나 열어서 경로를 입력하여 보내주었다.
																									// import 할 때 orq.w3c.dom을 클릭해줘야 한다.
		Element k07_root = k07_doc.getDocumentElement();	// 하나의 요소를 가지고 오며 getDocumentElement를 통해 root를 가지고 왔다.(맨꼭대기이다.)
		
		NodeList k07_tag_name = k07_doc.getElementsByTagName("name");		// Document의 객체 k07_doc에 메서드 getElementsByTagName을 사용하여 태그명이 name인 것이 NodeList로 쭉 들어간다.(NodeList의 객체 k07_tag_name에 대입된다.) 
		NodeList k07_tag_studentid = k07_doc.getElementsByTagName("studentid");		// Document의 객체 k07_doc에 메서드 getElementsByTagName을 사용하여 태그명이 studentid인 것이 NodeList로 쭉 들어간다.(NodeList의 객체 k07_tag_studentid에 대입된다.)
		NodeList k07_tag_kor = k07_doc.getElementsByTagName("kor");		// Document의 객체 k07_doc에 메서드 getElementsByTagName을 사용하여 태그명이 kor인 것이 NodeList로 쭉 들어간다.(NodeList의 객체 k07_tag_kor에 대입된다.)
		NodeList k07_tag_eng = k07_doc.getElementsByTagName("eng");		// Document의 객체 k07_doc에 메서드 getElementsByTagName을 사용하여 태그명이 eng인 것이 NodeList로 쭉 들어간다.(NodeList의 객체 k07_tag_eng에 대입된다.)
		NodeList k07_tag_mat = k07_doc.getElementsByTagName("mat");		// Document의 객체 k07_doc에 메서드 getElementsByTagName을 사용하여 태그명이 mat인 것이 NodeList로 쭉 들어간다.(NodeList의 객체 k07_tag_mat에 대입된다.)
		
		System.out.printf("*************************************\n");  // 끝을 표시하기 위해서 헤더를 찍어준다.
		
		for(int i = 0; i < k07_tag_name.getLength(); i++) {	// name이라는 태그에 몇개가 들어와있는지에 따라서 1씩 증가하며 반복해준다.
			System.out.printf("이름 : %s\n", k07_tag_name.item(i).getFirstChild().getNodeValue());  // getFirstChild()메서드와 getNodeValue()를 사용하여 name첫번째 값을 확인한다. NodeName이 아니라 NodeValue로 해야 값이 나온다.
			System.out.printf("학번 : %s\n", k07_tag_studentid.item(i).getFirstChild().getNodeValue());  // getFirstChild()메서드와 getNodeValue()를 사용하여 stdentid첫번째 값을 확인한다. NodeName이 아니라 NodeValue로 해야 값이 나온다.
			System.out.printf("국어 : %s\n", k07_tag_kor.item(i).getFirstChild().getNodeValue());  // getFirstChild()메서드와 getNodeValue()를 사용하여 kor 첫번째 값을 확인한다. NodeName이 아니라 NodeValue로 해야 값이 나온다.
			System.out.printf("영어 : %s\n", k07_tag_eng.item(i).getFirstChild().getNodeValue());  // getFirstChild()메서드와 getNodeValue()를 사용하여 eng 첫번째 값을 확인한다. NodeName이 아니라 NodeValue로 해야 값이 나온다.
			System.out.printf("수학 : %s\n", k07_tag_mat.item(i).getFirstChild().getNodeValue());  // getFirstChild()메서드와 getNodeValue()를 사용하여 mat 첫번째 값을 확인한다. NodeName이 아니라 NodeValue로 해야 값이 나온다.
			System.out.printf("*************************************\n");  // 표시하기 위해서 헤더를 찍어준다.	
		}
	}
}

// 우리가 어떤 서버에서 데이터를 받아올 때 요청을 하면 이렇게 XML형식으로 준다. 우린 이걸 받아서 해석해서 필요한 부분을 만들 수 있다.
// 우리는 해당 코드를 통해 XML을 만드는 것과 Parsing하는 것에 대해서 익혀보았다. => OpenApi 및 Application을 만드는 데 사용된다.
// xml 안의 value들은 무조건 String이다. 그래서 국어 영어 수학 점수들을 계산하려면 수치형으로 형변환 해줘야 한다.