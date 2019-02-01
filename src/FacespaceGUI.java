/*
THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
A TUTOR OR CODE WRITTEN BY OTHER STUDENTS.
Jorvon Carter. No team.
*/

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FacespaceGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextArea textArea_1;
	
	FacespaceStuff x = new FacespaceStuff();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacespaceGUI window = new FacespaceGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FacespaceGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1015, 695);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddUser = new JButton("Add User");
		btnAddUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String fn = textField.getText().toLowerCase();
				
				String ln = textField_1.getText().toLowerCase();
				
				String mn = textField_18.getText().toLowerCase();
				
				String age = textField_19.getText().toLowerCase();
				
				String status = textField_20.getText().toLowerCase();
			
				String country = textField_21.getText().toLowerCase();
				
				String state = textField_22.getText().toLowerCase();
				
				String city = textField_23.getText().toLowerCase();
				
				String education = textField_24.getText().toLowerCase();
				
				String employment = textField_25.getText().toLowerCase();
				
				String religion = textField_26.getText().toLowerCase();
				
				String anything = textField_27.getText().toLowerCase();
				
				UserProfile profile = new UserProfile(fn, ln, mn, age, status, country, state, city, education, employment, religion, anything);
				profile.name = fn + " " + ln;
				profile.fullName = fn + " " + mn + " " + ln;
				
				if (x.cache.containsKey(profile.name)){
					System.out.println(profile.name + " already in network. " + profile.name + " has not been added.");
					System.out.println("You can try a different name or update this user instead.");
					textArea_1.setText(profile.name + " already in network. " + profile.name + " has not been added.\nYou can try a different name or update this user instead.");
					return;
				}
				x.addUser(profile);
				x.showProfile(profile.name);
				if (!profile.friends.isEmpty()){
					String names="";
					for (int k = 0; k < profile.friends.size(); k++){
						names = names + "\n " + profile.friends.get(k);
					}
					textArea_1.setText(profile.name + " added. \n" + "Name: " + profile.fullName + "\n"+"Age: " + profile.age + "\n" + "Location: " + profile.city + ", " + profile.state + ", " + profile.country + "\n" + "Education: " + profile.education + "\n" + "Employment: " + profile.employment + "\n" + "Religion: " + profile.religion + "\n" + "Anything else: " + profile.anything + "\n" + "Friends: \n" + names);
				}
				else {
					textArea_1.setText(profile.name + " added. \n" + "Name: " + profile.fullName + "\n"+"Age: " + profile.age + "\n" + "Location: " + profile.city + ", " + profile.state + ", " + profile.country + "\n" + "Education: " + profile.education + "\n" + "Employment: " + profile.employment + "\n" + "Religion: " + profile.religion + "\n" + "Anything else: " + profile.anything + "\n" + "Friends: ");
				}
				
			}
		});
		btnAddUser.setBounds(43, 11, 120, 23);
		frame.getContentPane().add(btnAddUser);
		
		JButton btnRemoveUser = new JButton("Remove User");
		btnRemoveUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String fn = textField_2.getText().toLowerCase();;
				String ln = textField_3.getText().toLowerCase();;
				String name = fn + " " + ln;
				
				if (!x.cache.containsKey(name)){
					System.out.println(name + " is not in the netork!");
					textArea_1.setText(name + " is not in the netork!");
					return;
				}
				Iterator it = x.cache.entrySet().iterator();
				while (it.hasNext()){
					Map.Entry pairs = (Map.Entry)it.next();
					UserProfile user = x.cache.get(pairs.getKey());
					if (user.friends.contains(name)){
						user.friends.remove(name);
					}
				}
				x.cache.remove(name);
				System.out.println("Pale Death with impartial tread beats at the poor man's cottage door and at the palaces of kings.");
				System.out.println(name + " has been removed from the network.");
				textArea_1.setText("Pale Death with impartial tread beats at the poor man's cottage door and at the palaces of kings. \n" + name + " has been removed from the network.");
			}
		});
		btnRemoveUser.setBounds(163, 11, 120, 23);
		frame.getContentPane().add(btnRemoveUser);
		
		JButton btnUpdateUser = new JButton("Update User");
		btnUpdateUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String fn = textField_4.getText().toLowerCase();;
				String ln = textField_5.getText().toLowerCase();;
				String name = fn + " " + ln;
				
				if (!x.cache.containsKey(name)){
					System.out.println(name + " is not in the netowrk.");
					System.out.println("You can try to add this user.");
					textArea_1.setText(name + " is not in the netowrk. \nYou can try to add this user.");
				}
				else {
					UserProfile profile = x.cache.get(name);
					x.cache.remove(name);
					
					String fnNew = textField.getText().toLowerCase();
					if (!fnNew.equals("")){ // if different
						profile.firstName = fnNew;
					}
					
					String lnNew = textField_1.getText().toLowerCase();
					if (!lnNew.equals("")){
						profile.lastName = lnNew;
					}
					
					String mnNew = textField_18.getText().toLowerCase();
					if (!mnNew.equals("")){
						profile.middleName = mnNew;
					}
			
					profile.name = profile.firstName + " " + profile.lastName;
					profile.fullName = profile.firstName + " " + profile.middleName + " " + profile.lastName;
					
					String age = textField_19.getText().toLowerCase();
					if (!age.equals("")){
						profile.age = age;
					}
					
					String status = textField_20.getText().toLowerCase();
					if (!status.equals("")){
						profile.status = status;
					}
					
					String country = textField_21.getText().toLowerCase();
					if (!country.equals("")){
						profile.country = country;
					}
					
					String state = textField_22.getText().toLowerCase();
					if (!state.equals("")){
						profile.state = state;
					}
					
					String city = textField_23.getText().toLowerCase();
					if (!city.equals("")){
						profile.city = city;
					}
					
					String education = textField_24.getText().toLowerCase();
					if (!education.equals("")){
						profile.education = education;
					}
					
					String employment = textField_25.getText().toLowerCase();
					if (!employment.equals("")){
						profile.employment = employment;
					}
					
					String religion = textField_26.getText().toLowerCase();
					if (!religion.equals("")){
						profile.religion = religion;
					}
					
					String anything = textField_27.getText().toLowerCase();
					if (!anything.equals("")){
						profile.anything = anything;
					}
					
					Iterator it = x.cache.entrySet().iterator();
					while (it.hasNext()){
						Map.Entry pairs = (Map.Entry)it.next();
						UserProfile user = x.cache.get(pairs.getKey());
						if (user.friends.contains(name)){
							user.friends.remove(name);
							user.friends.add(profile.name);
						}
					}
					x.addUser(profile);
					System.out.println(profile.name + " updated.");
					textArea_1.setText(profile.name + " updated.");
				}
			}
		});
		btnUpdateUser.setBounds(283, 11, 120, 23);
		frame.getContentPane().add(btnUpdateUser);
		
		JButton btnShowUser = new JButton("Show User");
		btnShowUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String fn = textField_6.getText().toLowerCase();;
				String ln = textField_7.getText().toLowerCase();;
				String name = fn + " " + ln;
				
				UserProfile profile = x.findUser(name);
				if (profile == null){
					System.out.println("User not found.");
					textArea_1.setText("User not found.");
					return;
				}
				System.out.println("Name: " + profile.fullName);				
				System.out.println("Age: " + profile.age);				
				System.out.println("Location: " + profile.city + ", " + profile.state + ", " + profile.country);				
				System.out.println("Education: " + profile.education);				
				System.out.println("Employment: " + profile.employment);				
				System.out.println("Religion: " + profile.religion);				
				System.out.println("Anything else: " + profile.anything);
				System.out.println("Friends: ");
				if (!profile.friends.isEmpty()){
					String names="";
					for (int k = 0; k < profile.friends.size(); k++){
						System.out.println(profile.friends.get(k));
						names = names + "\n " + profile.friends.get(k);
					}
					textArea_1.setText("Name: " + profile.fullName + "\n"+"Age: " + profile.age + "\n" + "Location: " + profile.city + ", " + profile.state + ", " + profile.country + "\n" + "Education: " + profile.education + "\n" + "Employment: " + profile.employment + "\n" + "Religion: " + profile.religion + "\n" + "Anything else: " + profile.anything + "\n" + "Friends: \n" + names);
				}
				else {
					textArea_1.setText("Name: " + profile.fullName + "\n"+"Age: " + profile.age + "\n" + "Location: " + profile.city + ", " + profile.state + ", " + profile.country + "\n" + "Education: " + profile.education + "\n" + "Employment: " + profile.employment + "\n" + "Religion: " + profile.religion + "\n" + "Anything else: " + profile.anything + "\n" + "Friends: ");
				}
			}
		});
		btnShowUser.setBounds(403, 11, 110, 23);
		frame.getContentPane().add(btnShowUser);
		JButton btnShowAllUsers = new JButton("Show All Users");
		btnShowAllUsers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				x.listOfUsers();
				if (x.cache.isEmpty()){
					System.out.println("Network empty!");
					return;
				}
				String names = "";
				for (String name: x.cache.keySet()){
					names = names + name + "\n";
				}
				textArea_1.setText("All users: \n" + names);
			}
		});
		btnShowAllUsers.setBounds(512, 11, 120, 23);
		frame.getContentPane().add(btnShowAllUsers);
		
		JButton btnMakeFriends = new JButton("Make Friends");
		btnMakeFriends.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String fn = textField_8.getText().toLowerCase();
				String ln = textField_9.getText().toLowerCase();
				String name = fn + " " + ln;
				fn = textField_28.getText().toLowerCase();
				ln = textField_29.getText().toLowerCase();
				String name2 = fn + " " + ln;
				
				if (x.cache.containsKey(name) && x.cache.containsKey(name2)){
					UserProfile one = x.cache.get(name);
					UserProfile two = x.cache.get(name2);
					
					if (one.friends.contains(name2) || two.friends.contains(name)){
						System.out.println("These users are already friends.");
						textArea_1.setText("These users are already friends.");
						return;
					}
					
					one.friends.add(name2);
					two.friends.add(name);
					
					System.out.println(name + " and " + name2 + " are now friends.");
					textArea_1.setText(name + " and " + name2 + " are now friends.");
				}
				
				else {
					

					if (!x.cache.containsKey(name)){
						System.out.println(name + " is not in the network.");
						textArea_1.setText(name + " is not in the network.");
					}
					else {
						System.out.println(name2 + " is not in the network.");
						textArea_1.setText(name2 + " is not in the network.");
					}
				}		
			}
		});
		btnMakeFriends.setBounds(631, 11, 120, 23);
		frame.getContentPane().add(btnMakeFriends);
		
		JButton btnDefriend = new JButton("Defriend");
		btnDefriend.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String fn = textField_10.getText().toLowerCase();
				String ln = textField_11.getText().toLowerCase();
				String name = fn + " " + ln;
				fn = textField_12.getText().toLowerCase();
				ln = textField_13.getText().toLowerCase();
				String name2 = fn + " " + ln;
				
				if (x.cache.containsKey(name) && x.cache.containsKey(name2)){
					UserProfile one = x.cache.get(name);
					UserProfile two = x.cache.get(name2);
					
					one.friends.remove(name2);
					two.friends.remove(name);
					
					System.out.println(name + " and " + name2 + " are no longer friends.");
					textArea_1.setText(name + " and " + name2 + " are no longer friends.");
				}
				
				else {
					
					if (!x.cache.containsKey(name)){
						System.out.println(name + " is not in the network.");
						textArea_1.setText(name + " is not in the network.");
					}
					else {
						System.out.println(name2 + " is not in the network.");
						textArea_1.setText(name2 + " is not in the network.");
					}
				}	
			}
		});
		btnDefriend.setBounds(752, 11, 120, 23);
		frame.getContentPane().add(btnDefriend);
		
		JButton btnDegreeOfSep = new JButton("Degree of Sep.");
		btnDegreeOfSep.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String fn = textField_14.getText().toLowerCase();
				String ln = textField_15.getText().toLowerCase();
				String name = fn + " " + ln;
				fn = textField_16.getText().toLowerCase();
				ln = textField_17.getText().toLowerCase();
				String name2 = fn + " " + ln;
				
				if (name.equals(name2)){
					System.out.println("Please enter two different users!");
					textArea_1.setText("Please enter two different users!");
					return;
				}
				if (!x.cache.containsKey(name)){
					System.out.println(name + " is not in the network.");
					textArea_1.setText(name + " is not in the network.");
					return;
				}
				if (!x.cache.containsKey(name2)){
					System.out.println(name2 + " is not in the network.");
					textArea_1.setText(name + " is not in the network.");
					return;
				}
				
				ArrayList<UserProfile> checked = new ArrayList<UserProfile>();
				ArrayDeque<UserProfile> toCheck = new ArrayDeque<UserProfile>();
				
				int i=1;
				int originalSize;
				UserProfile person = x.cache.get(name);
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
							textArea_1.setText("Degree of separation is " + i);
							return;
						}
						
						else {
							checked.add(person);
							for (int w = 0; w < person.friends.size(); w++){
								oPerson = x.cache.get(person.friends.get(w));
								if (!checked.contains(oPerson)){
									toCheck.addLast(oPerson);
								}
							}
						}
					}
					
				} while(!toCheck.isEmpty());
				
				toCheck.clear();
				System.out.println("No connection!");
				textArea_1.setText("No connection!");
			}
		});
		btnDegreeOfSep.setBounds(870, 11, 120, 23);
		frame.getContentPane().add(btnDegreeOfSep);
		
		textField = new JTextField();
		textField.setBounds(43, 62, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(43, 109, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(172, 62, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(172, 109, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Enter the old first and last name in fields beneath the 'Update User' button.");
				System.out.println("But enter the new information under the fields of 'Add User'.");
				System.out.println("When done, click 'Update User'.");
				textArea_1.setText("Enter the old first and last name in field beneath the 'Update User' button.\nBut enter the new information under the fields of 'Add User'.\nWhen done, click 'Update User'.");
			}
		});
		textField_4.setBounds(288, 62, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Enter the old first and last name in fields beneath the 'Update User' button.");
				System.out.println("But enter the new information under the fields of 'Add User'.");
				System.out.println("When done, click 'Update User'.");
				textArea_1.setText("Enter the old first and last name in field beneath the 'Update User' button.\nBut enter the new information under the fields of 'Add User'.\nWhen done, click 'Update User'.");
			}
		});
		textField_5.setBounds(288, 109, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(403, 62, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(403, 109, 86, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(631, 62, 86, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(631, 109, 86, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(756, 62, 86, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(756, 109, 86, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(756, 161, 86, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(756, 213, 86, 20);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(868, 62, 86, 20);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(870, 109, 86, 20);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(868, 161, 86, 20);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(870, 213, 86, 20);
		frame.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(43, 161, 86, 20);
		frame.getContentPane().add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(43, 213, 86, 20);
		frame.getContentPane().add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(43, 265, 86, 20);
		frame.getContentPane().add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(43, 320, 86, 20);
		frame.getContentPane().add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBounds(43, 379, 86, 20);
		frame.getContentPane().add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setBounds(43, 435, 86, 20);
		frame.getContentPane().add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setBounds(43, 483, 86, 20);
		frame.getContentPane().add(textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setBounds(43, 532, 86, 20);
		frame.getContentPane().add(textField_25);
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setBounds(43, 581, 86, 20);
		frame.getContentPane().add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setBounds(43, 631, 925, 20);
		frame.getContentPane().add(textField_27);
		textField_27.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(53, 45, 65, 14);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(53, 93, 66, 14);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblMiddleName = new JLabel("Middle Name");
		lblMiddleName.setBounds(53, 148, 76, 14);
		frame.getContentPane().add(lblMiddleName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(53, 202, 46, 14);
		frame.getContentPane().add(lblAge);
		
		JLabel lblRomanticStatus = new JLabel("Romantic Status");
		lblRomanticStatus.setBounds(43, 251, 86, 14);
		frame.getContentPane().add(lblRomanticStatus);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(53, 307, 46, 14);
		frame.getContentPane().add(lblCountry);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(53, 364, 46, 14);
		frame.getContentPane().add(lblState);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(53, 421, 46, 14);
		frame.getContentPane().add(lblCity);
		
		JLabel lblEducation = new JLabel("Education");
		lblEducation.setBounds(53, 466, 56, 14);
		frame.getContentPane().add(lblEducation);
		
		JLabel lblEmployment = new JLabel("Employment");
		lblEmployment.setBounds(53, 517, 65, 14);
		frame.getContentPane().add(lblEmployment);
		
		JLabel lblReligion = new JLabel("Religion");
		lblReligion.setBounds(43, 563, 46, 14);
		frame.getContentPane().add(lblReligion);
		
		JLabel lblAnythingElseYou = new JLabel("Anything else you want to add.");
		lblAnythingElseYou.setBounds(53, 612, 205, 14);
		frame.getContentPane().add(lblAnythingElseYou);
		
		JLabel lblFirstName_1 = new JLabel("First Name");
		lblFirstName_1.setBounds(185, 45, 65, 14);
		frame.getContentPane().add(lblFirstName_1);
		
		JLabel lblFirstName_2 = new JLabel("First Name");
		lblFirstName_2.setBounds(293, 45, 67, 14);
		frame.getContentPane().add(lblFirstName_2);
		
		JLabel lblLastName_1 = new JLabel("Last Name");
		lblLastName_1.setBounds(298, 93, 62, 14);
		frame.getContentPane().add(lblLastName_1);
		
		JLabel lblLastName_2 = new JLabel("Last Name");
		lblLastName_2.setBounds(182, 93, 65, 14);
		frame.getContentPane().add(lblLastName_2);
		
		JLabel lblFirstName_3 = new JLabel("First Name");
		lblFirstName_3.setBounds(413, 45, 63, 14);
		frame.getContentPane().add(lblFirstName_3);
		
		JLabel lblLastName_3 = new JLabel("Last Name");
		lblLastName_3.setBounds(413, 93, 65, 14);
		frame.getContentPane().add(lblLastName_3);
		
		JLabel lblFirstNameUser = new JLabel("First Name User 1");
		lblFirstNameUser.setBounds(631, 45, 110, 14);
		frame.getContentPane().add(lblFirstNameUser);
		
		textField_28 = new JTextField();
		textField_28.setBounds(631, 161, 86, 20);
		frame.getContentPane().add(textField_28);
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setBounds(631, 213, 86, 20);
		frame.getContentPane().add(textField_29);
		textField_29.setColumns(10);
		
		JLabel lblLastNameUser = new JLabel("Last Name User 1");
		lblLastNameUser.setBounds(629, 93, 99, 14);
		frame.getContentPane().add(lblLastNameUser);
		
		JLabel lblFirstNameUser_1 = new JLabel("First Name User 2");
		lblFirstNameUser_1.setBounds(631, 148, 99, 14);
		frame.getContentPane().add(lblFirstNameUser_1);
		
		JLabel lblLastNameUser_1 = new JLabel("Last Name User 2");
		lblLastNameUser_1.setBounds(631, 202, 86, 14);
		frame.getContentPane().add(lblLastNameUser_1);
		
		JLabel label = new JLabel("First Name User 1");
		label.setBounds(752, 45, 110, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Last Name User 1");
		label_1.setBounds(752, 93, 99, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("First Name User 2");
		label_2.setBounds(752, 148, 99, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Last Name User 2");
		label_3.setBounds(756, 202, 86, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Last Name User 2");
		label_4.setBounds(870, 202, 86, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("First Name User 2");
		label_5.setBounds(870, 148, 99, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Last Name User 1");
		label_6.setBounds(870, 93, 99, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("First Name User 1");
		label_7.setBounds(870, 45, 110, 14);
		frame.getContentPane().add(label_7);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(947, 263, -543, 124);
		frame.getContentPane().add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setBounds(163, 244, 791, 357);
		frame.getContentPane().add(textArea_1);
	}
}
