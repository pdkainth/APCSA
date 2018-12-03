/**
 * 
 * @author Prabhdeep Kainth
 * Period #4
 *
 */
	
public class Teacher extends Person{
	//Your code goes here
	
	private String subject;
	private double salary;
	
	/**
	 * Parameter constructor for the teacher class
	 * @param myName - name of teacher
	 * @param myAge - age of teacher
	 * @param myGender - gender of teacher
	 * @param subject - subject that teacher is teaching
	 * @param salary - salary of teacher
	 */
	public Teacher(String myName, int myAge, String myGender, String subject, double salary) {
		super(myName, myAge, myGender);
		
		this.subject = subject;
		this.salary = salary;
		
	}
	
	/**
	 * Getter method for subject
	 * @return - subject that the teacher is teaching
	 */
	public String getSubject() {
		return subject;
	}
	
	/**
	 * Getter method for salary
	 * @return - salary of teacher
	 */
	public double getSalary() {
		return salary;
	}
	
	/**
	 * Setter method for subject
	 * @param subject - subject that teacher is teaching
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	/**
	 * Setter method for salary
	 * @param salary - salary of the teacher
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/**
	 * toString methos for teacher class
	 * @return - toString
	 */
	public String toString() {
		return super.toString() + ", subject: " + subject + ", salary: " + salary;
	}

}