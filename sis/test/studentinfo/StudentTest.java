package studentinfo;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
	public void testCreate() {
		String firstName = "�缺";
		Student student = new Student(firstName);
		assertEquals(firstName, student.getName());
		
		String secondName = "����";
		Student secondStudent = new Student(secondName);
		assertEquals(secondName, secondStudent.getName());
		
		assertEquals(firstName, student.getName());
	}
}
