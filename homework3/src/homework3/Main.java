package homework3;

public class Main {

	public static void main(String[] args) {
		Instructor user1 = new Instructor();
		user1.setId(1);
		user1.setFirstName("Engin");
		user1.setLastName("Demirog");
		user1.setCourse("Java + React Yazılım Geliştirme Kampı");
		user1.setAge(27);
		user1.setPrice(4000);

		InstructorManager ınsInstructorManager = new InstructorManager();
		ınsInstructorManager.addUser(user1);
		ınsInstructorManager.addCourse(user1);

		Student user2 = new Student();
		user2.setId(2);
		user2.setFirstName("Ali");
		user2.setLastName("Topçu");
		user2.setCourses("Java + React Yazılım Geliştirme Kampı ve C# Angular");
		user2.setEmail("ali123@gmail.com");

		StudentManager studentManager = new StudentManager();
		studentManager.addUser(user2);
		studentManager.addCourses(user2);

	}

}
