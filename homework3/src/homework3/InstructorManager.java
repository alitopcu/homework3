package homework3;

public class InstructorManager extends UserManager{
	@Override
	public void addUser(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "E�itmen Eklendi");
	}
	
	public void addCourse(Instructor �nsInstructor) {
		System.out.println(�nsInstructor.getCourse() + " " + "Kursu Eklendi");
		System.out.println("////////////////////////");
	}
	
}