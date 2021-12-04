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

public class domParser {

	public domParser() {}

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		parsingFile pf= new  parsingFile();
	}

}
