package homework3;

public class InstructorManager extends UserManager{
	@Override
	public void addUser(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "Eðitmen Eklendi");
	}
	
	public void addCourse(Instructor ýnsInstructor) {
		System.out.println(ýnsInstructor.getCourse() + " " + "Kursu Eklendi");
	}
	
}
