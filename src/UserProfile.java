/*
THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
A TUTOR OR CODE WRITTEN BY OTHER STUDENTS.
Jorvon Carter. No team.
*/


import java.util.ArrayList;

public class UserProfile {
	public String firstName;
	public String lastName;
	public String middleName;
	public String name;
	public String fullName;
	public String age;
	public String status;
	public String country, state, city;
	public String education, employment;
	public String religion;
	public String anything;
	ArrayList<String> friends = new ArrayList<String>();
	
	public UserProfile(){
	}
	
	public UserProfile(String fn, String ln, String age){
		this.firstName = fn;
		this.lastName = ln;
		this.age = age;
	}
	
	public UserProfile(String fn, String ln, String mn, String age, String status, String country, String state, String city, String education, String employment, String religion, String anything){
		this.firstName = fn;
		this.lastName = ln;
		this.middleName = mn;
		this.name = fn + " " + ln;
		this.fullName = fn + " " + mn + " " + ln;
		this.age = age;
		this.status = status;
		this.country = country;
		this.state = state;
		this. city = city;
		this.education = education;
		this.employment = employment;
		this.religion = employment;
		this.anything = anything;
	}
}
