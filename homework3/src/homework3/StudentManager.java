package homework3;

public class StudentManager extends UserManager {
	public void addUser(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "Öðrenci Eklendi");
	}
	public void addCourses(Student student) {
		System.out.println(student.getCourses() + " " + "Kursunu Seçti");
	}
}
