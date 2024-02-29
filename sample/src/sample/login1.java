package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class login1 {

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
					login1 window = new login1();
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
	public login1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(212, 212, 212));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN DETAILS WITH DB CONNECTION");
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 16));
		lblNewLabel.setBounds(67, 30, 300, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(105, 85, 74, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		user1 = new JTextField();
		user1.setBounds(245, 82, 122, 20);
		frame.getContentPane().add(user1);
		user1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(105, 135, 74, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		pass1 = new JPasswordField();
		pass1.setBounds(245, 132, 122, 20);
		frame.getContentPane().add(pass1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UserName =user1.getText();
				String Password=pass1.getText();
				try
				{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/satwik","root","mrec");
					PreparedStatement p = con.prepareStatement("select UserName,Password from users where UserName = ? and Password = ?");
					p.setString(1, UserName);
					p.setString(2, Password);
					ResultSet rs = p.executeQuery();
					if(rs.next()) {
						JOptionPane.showMessageDialog(btnNewButton, "Valid User");
					}
					else {
						JOptionPane.showMessageDialog(btnNewButton, "In-Valid User");
					}
				}
				catch(SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Variable", Font.BOLD, 12));
		btnNewButton.setBounds(167, 201, 122, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
