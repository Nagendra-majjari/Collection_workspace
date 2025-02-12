package in.ashokit;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
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

public class SerializationDemo {

	public static void main(String[] args) {
		Student s1 = new Student("nagendra", "s1", 958);
		try {
			FileOutputStream file = new FileOutputStream("C:\\Serialization\\sreeja.txt");
			ObjectOutputStream o1 = new ObjectOutputStream(file);
			o1.writeObject(s1);

			o1.close();
			file.close();
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(s1);
	}

}
