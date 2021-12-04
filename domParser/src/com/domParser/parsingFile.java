package com.domParser;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class parsingFile {

	public parsingFile() throws SAXException, IOException, ParserConfigurationException {
		DocumentBuilderFactory  factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder= factory.newDocumentBuilder();
		Document doc=builder.parse("input.xml");

		doc.getDocumentElement().normalize();
		System.out.println("the root element is \t "+doc.getDocumentElement().getNodeName());
		System.out.println(doc.getDocumentElement().getAttribute("student"));
		NodeList nList = doc.getElementsByTagName("student");

		for (int i = 0; i < nList.getLength(); i++) {
			Node n=nList.item(i);
			//System.out.println(n.getNodeName());
			Element e=(Element)n;
			System.out.println(e.getAttribute("rollno")+"\t"+
			e.getElementsByTagName("firstname").item(0).getTextContent()+"\t"+
			e.getElementsByTagName("lastname").item(0).getTextContent()+"\t"+
			e.getElementsByTagName("nickname").item(0).getTextContent()+"\t"+
			e.getElementsByTagName("marks").item(0).getTextContent()
			
					
					
					);
			}
	}

}
