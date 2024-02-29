package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class student {

	private JFrame frame;
	private JTextField name1;
	private JTextField id1;
	private JTextField address1;
	private JTextField marks1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student window = new student();
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
	public student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT DETAILS");
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		lblNewLabel.setBounds(144, 29, 179, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student Name");
		lblNewLabel_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(92, 98, 113, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Student ID");
		lblNewLabel_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(92, 149, 79, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Address");
		lblNewLabel_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(92, 197, 79, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Marks\r\n");
		lblNewLabel_4.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(92, 238, 58, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = name1.getText();
				String id = id1.getText();
				String address = address1.getText();
				String marks = marks1.getText();
				int m = Integer.parseInt(marks);
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/satwik","root","mrec");
					String q = "insert into student_details values ('"+name+"','"+id+"','"+address+"','"+m+"')";
					Statement sta = con.createStatement();
					sta.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton, "Succesfully Recorded");
				}
				catch(SQLException e1){
					e1.printStackTrace();
					
				}
			
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Variable", Font.BOLD, 11));
		btnNewButton.setBounds(163, 283, 139, 23);
		frame.getContentPane().add(btnNewButton);
		
		name1 = new JTextField();
		name1.setBounds(227, 96, 133, 20);
		frame.getContentPane().add(name1);
		name1.setColumns(10);
		
		id1 = new JTextField();
		id1.setBounds(227, 148, 133, 20);
		frame.getContentPane().add(id1);
		id1.setColumns(10);
		
		address1 = new JTextField();
		address1.setBounds(227, 194, 133, 20);
		frame.getContentPane().add(address1);
		address1.setColumns(10);
		
		marks1 = new JTextField();
		marks1.setBounds(227, 235, 133, 20);
		frame.getContentPane().add(marks1);
		marks1.setColumns(10);
	}
}
