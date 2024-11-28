import in.ashokit;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
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

public class serialization{

	public static void main(String[] args) {
      try {
    	  FileInputStream file = new FileInputStream("C:\\Serialization\\sreeja.txt");
    	  ObjectInputStream o1 = new ObjectInputStream(file);
    	  o1.readObject();
    	  file.close();
    	  o1.close();
      
      }
      catch(Exception e) {
    	  System.out.println(e);
      }
      System.out.println();
	}
}

