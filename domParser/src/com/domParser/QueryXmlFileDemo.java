package com.domParser;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class QueryXmlFileDemo {

	public QueryXmlFileDemo()  throws Exception{
		
		DocumentBuilderFactory  factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder= factory.newDocumentBuilder();
		Document doc=builder.parse("cars.xml");

		doc.getDocumentElement().normalize();
		
		
	}

}
