package collection.list.student;

import java.util.*;


public class MainClass {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		Student stu = null;
		
		for (int i = 0; i < 2; i++) {
			stu = new Student();
			stu.inputStuInfo();
			stu.calcTotAvgGrade();
			students.add(stu);
			
		}

		Point.showPointUI();
		for (Student s : students) {
			s.outputStuInfo();
		}

	}
}
