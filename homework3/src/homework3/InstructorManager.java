package homework3;

public class InstructorManager extends UserManager{
	@Override
	public void addUser(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "Eğitmen Eklendi");
	}
	
	public void addCourse(Instructor ınsInstructor) {
		System.out.println(ınsInstructor.getCourse() + " " + "Kursu Eklendi");
		System.out.println("////////////////////////");
	}
	
}