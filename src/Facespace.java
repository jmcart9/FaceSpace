/*
THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
A TUTOR OR CODE WRITTEN BY OTHER STUDENTS.
Jorvon Carter. No team.
*/

import java.util.Scanner;

public class Facespace {
	public static void main(String[] args){
		FacespaceStuff x = new FacespaceStuff();
		UserProfile profile;
		Scanner scan = new Scanner(System.in);
		String command = "";
		String fn = "";
		String ln = "";
		String name = fn + " " + ln;
		
		System.out.println("");
		System.out.println("----------------------");
		System.out.println("Welcome to Facespace! ");
		System.out.println("----------------------");
		System.out.println("");
		System.out.println("Add - adds a user to the network");
		System.out.println("Remove - removes a user from the network");
		System.out.println("Update - updates an existing user");
		System.out.println("Find - show a user's profile");
		System.out.println("FindAll - show a list of all users");
		System.out.println("AddF - make a frienship connection");
		System.out.println("RemoveF - sever a friendship connection");
		System.out.println("Deg - show degree of separation bewteen two users");
		System.out.println("Help - show commands");
		System.out.println("Exit - terminate the program");
		
		do{
		System.out.println("");
		System.out.println("Enter 'exit' to close.");
		System.out.println("Enter 'help' to see more commands.");
		System.out.println("Enter a command, case insensitive: ");
		command = scan.nextLine().toLowerCase();
		
		switch (command){
			case "add":
				profile = x.buildProfile();
				if (x.cache.containsKey(profile.name)){
					System.out.println(name + " already in network. Returning to main menu.");
					System.out.println("You can try a different name or update this user instead.");
					break;
				}
				x.addUser(profile);
				x.showProfile(profile.name);
				break;
			case "remove":
				x.removeUser();
				break;
			case "update":
				x.updateUser();
				break;
			case "find":
				x.showProfile();
				break;
			case "findall":
				x.listOfUsers();
				break;
			case "addf":
				x.addFriend();
				break;
			case "removef":
				x.removeFriend();
				break;
			case "deg":
				x.degOfSep();
				break;
			case "help":
				System.out.println("Commands.");
				System.out.println("");
				System.out.println("Add - adds a user to the network");
				System.out.println("Remove - removes a user from the network");
				System.out.println("Update - updates an existing user");
				System.out.println("Find - show a user's profile");
				System.out.println("FindAll - show a list of all users");
				System.out.println("AddF - make a frienship connection");
				System.out.println("RemoveF - sever a friendship connection");
				System.out.println("Deg - show degree of separation bewteen two users");
				System.out.println("Help - show commands");
				System.out.println("Exit - terminate the program");
			break;
			case "exit":
				System.exit(0);
			default:
				System.out.println("Please enter a valid command! ");
		}
		
		} while(!command.equalsIgnoreCase("exit"));
		
	}

}
