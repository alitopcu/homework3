package homework3;

public class Main {

	public static void main(String[] args) {
		Instructor user1 = new Instructor();
		user1.setId(1);
		user1.setFirstName("Engin");
		user1.setLastName("Demirog");
		user1.setCourse("Java + React Yaz�l�m Geli�tirme Kamp�");
		user1.setAge(27);
		user1.setPrice(4000);

		InstructorManager �nsInstructorManager = new InstructorManager();
		�nsInstructorManager.addUser(user1);
		�nsInstructorManager.addCourse(user1);

		Student user2 = new Student();
		user2.setId(2);
		user2.setFirstName("Ali");
		user2.setLastName("Top�u");
		user2.setCourses("Java + React Yaz�l�m Geli�tirme Kamp� ve C# Angular");
		user2.setEmail("ali123@gmail.com");

		StudentManager studentManager = new StudentManager();
		studentManager.addUser(user2);
		studentManager.addCourses(user2);

	}

}
