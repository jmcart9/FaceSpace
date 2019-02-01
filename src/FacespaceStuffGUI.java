import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class FacespaceStuffGUI extends FacespaceGUI{
	HashMap<String, UserProfile> cache = new HashMap<String, UserProfile>();
	Scanner scan = new Scanner(System.in);
	
	
	public FacespaceStuffGUI(){
	}
	
	public UserProfile buildProfile(){
		System.out.println("Enter desired user information.");
		
		System.out.println("First name: ");
		String fn = scan.nextLine().toLowerCase();
		
		System.out.println("Last name: ");
		String ln = scan.nextLine().toLowerCase();
		
		System.out.println("Middle name: ");
		String mn = scan.nextLine().toLowerCase();
		
		System.out.println("Age: ");
		String age = scan.nextLine().toLowerCase();
		
		System.out.println("Relationship status: ");
		String status = scan.nextLine().toLowerCase();
		
		System.out.println("Country: ");
		String country = scan.nextLine().toLowerCase();
		
		System.out.println("State, province, whatever: ");
		String state = scan.nextLine().toLowerCase();
		
		System.out.println("City: ");
		String city = scan.nextLine().toLowerCase();
		
		System.out.println("Education: ");
		String education = scan.nextLine().toLowerCase();
		
		System.out.println("Employment: ");
		String employment = scan.nextLine().toLowerCase();
		
		System.out.println("Religion: ");
		String religion = scan.nextLine().toLowerCase();
		
		System.out.println("Anything else: ");
		String anything = scan.nextLine().toLowerCase();
		
		UserProfile profile = new UserProfile(fn, ln, mn, age, status, country, state, city, education, employment, religion, anything);
		return profile;
	}
	
	public void addUser(UserProfile p){	
		if (cache.containsKey(p.name)){
			System.out.println(p.firstName + " is already in the netowrk.");
			System.out.println("You can try a different name or update this user instead.");
		}
		else {
			cache.put(p.name, p);
			System.out.println(p.name + " added.");
		}
	}
	
	public void updateUser(){
		
		System.out.println("User to update. First name: ");
		String fn = scan.nextLine().toLowerCase();
		System.out.println("Last name: ");
		String ln = scan.nextLine().toLowerCase();
		String name = fn + " " + ln;
		
		if (!cache.containsKey(name)){
			System.out.println(name + " is not in the netowrk.");
			System.out.println("You can try to add this user.");
		}
		else {
			UserProfile profile = cache.get(name);
			cache.remove(name);
			
			System.out.println("Enter information to be updated.");
			System.out.println("Enter nothing in order to retain old data.");
			
			System.out.println("First name: ");
			String fnNew = scan.nextLine().toLowerCase();
			if (!fnNew.equals("")){ // if different
				profile.firstName = fnNew;
			}
			
			System.out.println("Last name: ");
			String lnNew = scan.nextLine().toLowerCase();
			if (!lnNew.equals("")){
				profile.lastName = lnNew;
			}
			
			System.out.println("Middle name: ");
			String mnNew = scan.nextLine().toLowerCase();
			if (!mnNew.equals("")){
				profile.middleName = mnNew;
			}
	
			profile.name = fn + " " + ln;
			profile.fullName = profile.firstName + " " + profile.middleName + " " + profile.lastName;
			
			
			System.out.println("Age: ");
			String age = scan.nextLine().toLowerCase();
			if (!age.equals("")){
				profile.age = age;
			}
			
			System.out.println("Relationship status: ");
			String status = scan.nextLine().toLowerCase();
			if (!status.equals("")){
				profile.status = status;
			}
			
			System.out.println("Country: ");
			String country = scan.nextLine().toLowerCase();
			if (!country.equals("")){
				profile.country = country;
			}
			
			System.out.println("State, province, whatever: ");
			String state = scan.nextLine().toLowerCase();
			if (!state.equals("")){
				profile.state = state;
			}
			
			System.out.println("City: ");
			String city = scan.nextLine().toLowerCase();
			if (!city.equals("")){
				profile.city = city;
			}
			
			System.out.println("Education: ");
			String education = scan.nextLine().toLowerCase();
			if (!education.equals("")){
				profile.education = education;
			}
			
			System.out.println("Employment: ");
			String employment = scan.nextLine().toLowerCase();
			if (!employment.equals("")){
				profile.employment = employment;
			}
			
			System.out.println("Religion: ");
			String religion = scan.nextLine().toLowerCase();
			if (!religion.equals("")){
				profile.religion = religion;
			}
			
			System.out.println("Anything else: ");
			String anything = scan.nextLine().toLowerCase();
			if (!anything.equals("")){
				profile.anything = anything;
			}
			
			Iterator it = cache.entrySet().iterator();
			while (it.hasNext()){
				Map.Entry pairs = (Map.Entry)it.next();
				UserProfile user = cache.get(pairs.getKey());
				if (user.friends.contains(name)){
					user.friends.remove(name);
					user.friends.add(profile.name);
				}
				//it.remove();
			}
			addUser(profile);
			System.out.println(name + " updated.");
		}
	}
	
	public void removeUser(){
		
		System.out.println("Enter a user to remove.");
		System.out.println("First name: ");
		String fn = scan.nextLine().toLowerCase();
		System.out.println("Last name: ");
		String ln = scan.nextLine().toLowerCase();
		String name = fn + " " + ln;
		
		if (!cache.containsKey(name)){
			System.out.println(name + " is not in the netork!");
		}
		Iterator it = cache.entrySet().iterator();
		while (it.hasNext()){
			Map.Entry pairs = (Map.Entry)it.next();
			UserProfile user = cache.get(pairs.getKey());
			if (user.friends.contains(name)){
				user.friends.remove(name);
			}
			//it.remove();
		}
		cache.remove(name);
		System.out.println("Pale Death with impartial tread beats at the poor man's cottage door and at the palaces of kings.");
		System.out.println(name + " has been removed from the network.");
	}
	
	public UserProfile findUser(String name){
		if (cache.containsKey(name)){
			System.out.println("User found.");
			return cache.get(name);
		}
		else {
			System.out.println("User not found.  ");
			return null;
		}
	}
	
	public void addFriend(){
		
		System.out.println("Enter two users to make friends.");
		System.out.println("User1 first name: ");
		String fn = scan.nextLine().toLowerCase();
		System.out.println("User1 last name: ");
		String ln = scan.nextLine().toLowerCase();
		String name = fn + " " + ln;
		System.out.println("User2 first name: ");
		fn = scan.nextLine().toLowerCase();
		System.out.println("User2 last name: ");
		ln = scan.nextLine().toLowerCase();
		String name2 = fn + " " + ln;
		
		if (cache.containsKey(name) && cache.containsKey(name2)){
			UserProfile one = cache.get(name);
			UserProfile two = cache.get(name2);
			
			if (one.friends.contains(name2) || two.friends.contains(name)){
				System.out.println("These users are already friends.");
				return;
			}
			
			one.friends.add(name2);
			two.friends.add(name);
			
			System.out.println(name + " and " + name2 + " are now friends.");
		}
		
		else {
			System.out.println("One of the persons is not in the network.");
		}					
	}
	
	public void removeFriend(){
		
		System.out.println("Enter two users to defriend.");
		System.out.println("User1 first name: ");
		String fn = scan.nextLine().toLowerCase();
		System.out.println("User1 last name: ");
		String ln = scan.nextLine().toLowerCase();
		String name = fn + " " + ln;
		System.out.println("User2 first name: ");
		fn = scan.nextLine().toLowerCase();
		System.out.println("User2 last name: ");
		ln = scan.nextLine().toLowerCase();
		String name2 = fn + " " + ln;
		
		if (cache.containsKey(name) && cache.containsKey(name2)){
			UserProfile one = cache.get(name);
			UserProfile two = cache.get(name2);
			
			one.friends.remove(name2);
			two.friends.remove(name);
			
			System.out.println(name + " and " + name2 + " are no longer friends.");
		}
		
		else {
			
			if (!cache.containsKey(name)){
				System.out.println(name + " is not in the network.");
			}
			else {
				System.out.println(name2 + " is not in the network.");
			}
		}					
	}
	
	public void degOfSep(){
		
		System.out.println("Enter two users to see their degree of separation.");
		System.out.println("User1 first name: ");
		String fn = scan.nextLine().toLowerCase();
		System.out.println("User1 last name: ");
		String ln = scan.nextLine().toLowerCase();
		String name = fn + " " + ln;
		System.out.println("User2 first name: ");
		fn = scan.nextLine().toLowerCase();
		System.out.println("User2 last name: ");
		ln = scan.nextLine().toLowerCase();
		String name2 = fn + " " + ln;
		
		if (name.equals(name2)){
			System.out.println("Please enter two different users!");
		}
		if (!cache.containsKey(name)){
			System.out.println(name + " is not in the network.");
		}
		if (!cache.containsKey(name2)){
			System.out.println(name2 + " is not in the network.");
		}
		
		ArrayList<UserProfile> checked = new ArrayList<UserProfile>();
		ArrayDeque<UserProfile> toCheck = new ArrayDeque<UserProfile>();
		
		int i=1;
		int originalSize;
		UserProfile person = cache.get(name);
		toCheck.add(person);
		UserProfile oPerson;
		
		do {
			originalSize = toCheck.size();
						
			for (int k = 0; k <= toCheck.size(); k++){
				if (k == originalSize){
					i++;
					break;
				}
				
				person = toCheck.removeFirst();
				
				if (person.friends.contains(name2)){
					toCheck.clear();
					System.out.println("Degree of separation is " + i);
				}
				
				else {
					checked.add(person);
					for (int w = 0; w < person.friends.size(); w++){
						oPerson = cache.get(person.friends.get(w));
						if (!checked.contains(oPerson)){
							toCheck.addLast(oPerson);
						}
					}
				}
			}
			
		} while(!toCheck.isEmpty());
		
		toCheck.clear();
		System.out.println("No connection!");
		
	}
	
	public void listOfUsers(){
		System.out.println("All users: ");
		if (cache.isEmpty()){
			System.out.println("Network empty!");
			return;
		}
		for (String name: cache.keySet()){
			//String key = name.toString();
			System.out.println(name);
		}
	}
	
	public void showProfile(String name){
		
		UserProfile profile = findUser(name);
		System.out.println("Name: " + profile.fullName);
		System.out.println("Age: " + profile.age);
		System.out.println("Location: " + profile.city + ", " + profile.state + ", " + profile.country);
		System.out.println("Education: " + profile.education);
		System.out.println("Employment: " + profile.employment);
		System.out.println("Religion: " + profile.religion);
		System.out.println("Anything else: " + profile.anything);
		if (!profile.friends.isEmpty()){
			for (int k = 0; k < profile.friends.size(); k++){
				System.out.println(profile.friends.get(k));
			}
		}
	}
	public void showProfile(){
		
		System.out.println("User to show. First name: ");
		String fn = scan.nextLine().toLowerCase();
		System.out.println("Last name: ");
		String ln = scan.nextLine().toLowerCase();
		String name = fn + " " + ln;
		
		UserProfile profile = findUser(name);
		System.out.println("Name: " + profile.fullName);
		System.out.println("Age: " + profile.age);
		System.out.println("Location: " + profile.city + ", " + profile.state + ", " + profile.country);
		System.out.println("Education: " + profile.education);
		System.out.println("Employment: " + profile.employment);
		System.out.println("Religion: " + profile.religion);
		System.out.println("Anything else: " + profile.anything);
		System.out.print("friends: ");
		if (!profile.friends.isEmpty()){
			for (int k = 0; k < profile.friends.size(); k++){
				System.out.println(profile.friends.get(k));
			}
		}
	}

}
