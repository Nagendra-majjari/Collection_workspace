package com.ashokit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	String sname;
	String section;
	int marks;
	public Student(String sname, String section, int marks) {
		super();
		this.sname = sname;
		this.section = section;
		this.marks = marks;
	}
}
public class Serialization {
	
    public static void main(String[] args) throws IOException,ClassNotFoundException{
     Student stu = new Student("Nagendra","j1",998);
     
   	  FileOutputStream file = new FileOutputStream("C:\\Serialization\\sreeja.txt");
   	  ObjectOutputStream o1 = new ObjectOutputStream(file);
   	  o1.writeObject(stu);
   	 
   	  file.close();
   	  o1.close();
   	  System.out.println("success");
     
   	  FileInputStream out =new FileInputStream("C:\\Serialization\\sreeja.txt");
 	  ObjectInputStream in = new ObjectInputStream(out);
 	  Student student =(Student)in.readObject();
 	  System.out.println(student.sname+"  "+student.section+"  "+student.marks);
 	  in.close();
 }
}

