package com.json;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import jakarta.json.Json;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonGeneratorFactory;

public class Apps {

	public Apps() {}

	public static void main(String[] args) throws IOException {
		Jsonb jsonb= JsonbBuilder.create();
		Employee e=new Employee();
		Address add= new Address();
		Employee e2=new Employee();
		Address add1= new Address();
		add.setHousenumber("2rbf59/5");
		add.setCity("bhubaneswar");
		add.setState("odisha");
		add.setCountry("india");
		add.setZipCode(751022);
		add1.setHousenumber("2rbf59/6");
		add1.setCity("bhubaneswar");
		add1.setState("odisha");
		add1.setCountry("india");
		add1.setZipCode(751022);
		String json= "{\"id\":1,\"name\":\"swastin\",\"phone_number\":87}";
		e.setId(1);
		e.setName("swastin");
		e.setPhone_number(82);
		e.setAddress(add);
		e2.setId(1);
		e2.setName("swastin");
		e2.setPhone_number(84);
		e2.setAddress(add1);	
		List<Employee> ems1=new ArrayList<Employee>();
		ems1.add(e);
		ems1.add(e2);
		String s=jsonb.toJson(ems1);
		System.out.println(s);
		 FileWriter myWriter = new FileWriter("file.json");
		  myWriter.write(s);
		  myWriter.flush(); //just makes sure that any buffered data is written to disk
		  myWriter.close(); 
		 FileReader fr=new FileReader("file.json") ;
		System.out.println(fr.read()); 
		  //flushes the data and indicates that there isn't any more data.
		Employee e1=jsonb.fromJson(json,Employee.class);
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getPhone_number());
		//best way to read/scan the file and display in single string
		File file = new File("file.json");
		String contents = new Scanner(file).useDelimiter("\\z").next();
		System.out.println(contents);
		

	}

}
