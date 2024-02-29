package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class login {

	private JFrame frame;
	private JTextField txt1;
	private JPasswordField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(166, 155, 181));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
		lblNewLabel.setBounds(97, 30, 117, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 13));
		lblNewLabel_1.setBounds(97, 82, 75, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txt1 = new JTextField();
		txt1.setBounds(239, 79, 133, 20);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 13));
		lblNewLabel_2.setBounds(97, 124, 75, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		txt2 = new JPasswordField();
		txt2.setToolTipText("");
		txt2.setBounds(237, 121, 135, 20);
		frame.getContentPane().add(txt2);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Segoe UI Black", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = txt1.getText();
				String pass = txt2.getText();
				if(pass.equals("12345")) {
					JOptionPane.showMessageDialog(btnNewButton, "Hello, "+user.toUpperCase() +" Welcome to Java Programming\nYour Password :"+pass);
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "Please Enter Valid Password");
				}
			}
		});
		btnNewButton.setBounds(160, 183, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
