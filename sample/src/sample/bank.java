package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bank {

	private JFrame frame;
	private JTextField user1;
	private JPasswordField pass1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bank window = new bank();
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
	public bank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.setBounds(100, 100, 470, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BANKING PORTAL");
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		lblNewLabel.setBounds(129, 34, 180, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User ID");
		lblNewLabel_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(92, 105, 74, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(92, 151, 74, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		user1 = new JTextField();
		user1.setBounds(210, 104, 117, 20);
		frame.getContentPane().add(user1);
		user1.setColumns(10);
		
		pass1 = new JPasswordField();
		pass1.setBounds(210, 150, 117, 20);
		frame.getContentPane().add(pass1);
			
		homepage h1 = new homepage();
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = user1.getText();
				String pass = pass1.getText();
				if(user.equals("sathwik") && pass.equals("1234")) {
					h1.setVisible(true);
					frame.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "INVALID USER");
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Variable", Font.BOLD, 11));
		btnNewButton.setBounds(158, 202, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
