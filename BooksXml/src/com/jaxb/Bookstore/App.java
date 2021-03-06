package com.jaxb.Bookstore;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.SchemaOutputResolver;

public class App {

	public App() {	}

	public static void main(String[] args) throws JAXBException, IOException {
		JAXBContext Context =JAXBContext.newInstance(Book.class);
		Context.generateSchema(new SchemaOutputResolver() {
			@Override
			public Result createOutput(String namespaceUri, String fileName) throws IOException {
				
				File output =new File("book.xsd");
				System.out.println("Generating the file\t"+namespaceUri+"output\t"+output);
				return new StreamResult(output);
			}
		});

	}

}
