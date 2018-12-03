/**
 * 
 * @author Prabhdeep Kainth
 * Period # 4
 *
 */
	

public class CollegeStudent extends Student {

	//Your code goes here
	private String major;
	private int year;
	
	/**
	 * Parameter Constructor for the Sollege Student class
	 * @param myName - name of the student
	 * @param age - age of the student
	 * @param gender - gender of the student
	 * @param idNum - id number of the student
	 * @param gpa - gpa of the student
	 * @param year - year of college the student is in
	 * @param major - major the student is studying
	 */
	public CollegeStudent(String myName, int age, String gender, String idNum, double gpa, int year, String major) {
		super(myName, age, gender, idNum, gpa);

		this.year = year;
		this.major = major;
	}
	
	/**
	 * Getter method for the major
	 * @return - returns the major
	 */
	public String getMajor() {
		return major;
	}
	
	/**
	 * getter method for the year of school the student is in
	 * @return - return the year of school
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * Setter method for the major
	 * @param major - major
	 */
	public void setMajor(String major) {
		this.major = major;
	}
	
	/**
	 * Setter method for the year the student is in
	 * @param year - year the student is in
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * To String method for College student class
	 * @return - toString
	 */
	public String toString() {
		return super.toString() + ", year: " + year + ", major: " + major;
	}
	
}