import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class tee {

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
	
	FacespaceStuff x = new FacespaceStuff();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tee window = new tee();
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
	public tee() {
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
				/*
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
				*/
			}
		});
		btnAddUser.setBounds(43, 11, 120, 23);
		frame.getContentPane().add(btnAddUser);
		
		JButton btnRemoveUser = new JButton("Remove User");
		btnRemoveUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnRemoveUser.setBounds(163, 11, 120, 23);
		frame.getContentPane().add(btnRemoveUser);
		
		JButton btnUpdateUser = new JButton("Update User");
		btnUpdateUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnUpdateUser.setBounds(283, 11, 120, 23);
		frame.getContentPane().add(btnUpdateUser);
		
		JButton btnShowUser = new JButton("Show User");
		btnShowUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnShowUser.setBounds(403, 11, 110, 23);
		frame.getContentPane().add(btnShowUser);
		
		JButton btnShowAllUsers = new JButton("Show All Users");
		btnShowAllUsers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnShowAllUsers.setBounds(512, 11, 120, 23);
		frame.getContentPane().add(btnShowAllUsers);
		
		JButton btnMakeFriends = new JButton("Make Friends");
		btnMakeFriends.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnMakeFriends.setBounds(631, 11, 120, 23);
		frame.getContentPane().add(btnMakeFriends);
		
		JButton btnDefriend = new JButton("Defriend");
		btnDefriend.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnDefriend.setBounds(752, 11, 120, 23);
		frame.getContentPane().add(btnDefriend);
		
		JButton btnDegreeOfSep = new JButton("Degree of Sep.");
		btnDegreeOfSep.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
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
		textField_4.setBounds(288, 62, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
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
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(163, 244, 791, 357);
		frame.getContentPane().add(textArea_1);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
