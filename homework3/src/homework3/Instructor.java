package homework3;

public class Instructor extends User {

	private String course;
	private double price;

	public Instructor() {

	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}