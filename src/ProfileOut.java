import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;


public class ProfileOut extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterUsername;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileOut frame = new ProfileOut();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProfileOut() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtEnterUsername = new JTextField();
		txtEnterUsername.setText("Enter Username");
		txtEnterUsername.setBounds(163, 49, 86, 20);
		contentPane.add(txtEnterUsername);
		txtEnterUsername.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(163, 74, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
