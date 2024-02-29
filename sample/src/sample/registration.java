package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class registration {

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
					registration window = new registration();
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
	public registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblNewLabel.setBounds(174, 21, 116, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(121, 64, 69, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(121, 97, 69, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		user1 = new JTextField();
		user1.setBounds(254, 59, 131, 20);
		frame.getContentPane().add(user1);
		user1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Branch");
		lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(121, 133, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox branch1 = new JComboBox();
		branch1.setModel(new DefaultComboBoxModel(new String[] {"Select Your Branch", "CSE", "IT", "MECH", "EEE", "ECE"}));
		branch1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		branch1.setBounds(254, 130, 131, 20);
		frame.getContentPane().add(branch1);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(121, 170, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton rd1 = new JRadioButton("MALE");
		rd1.setBounds(249, 164, 58, 23);
		frame.getContentPane().add(rd1);
		
		JRadioButton rd2 = new JRadioButton("FEMALE");
		rd2.setBounds(329, 164, 99, 23);
		frame.getContentPane().add(rd2);
		
		ButtonGroup rb =new ButtonGroup();
		rb.add(rd1);
		rb.add(rd2);
		
		JLabel lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(121, 199, 69, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JTextArea txt1 = new JTextArea();
		txt1.setBounds(254, 194, 170, 30);
		frame.getContentPane().add(txt1);
		
		JButton btn = new JButton("SUBMIT");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = user1.getText();
				String branch = (String) branch1.getSelectedItem();
				String city = txt1.getText();
				String pass = pass1.getText();
				//ButtonGroup rb =new ButtonGroup();
				//rb.add(rd1);
				//rb.add(rd2);
				String gender = " ";
				if(rd1.isSelected()) {
					gender = "Male";
				}
				if(rd2.isSelected()) {
					gender = "Female";
				}
				JOptionPane.showMessageDialog(btn, "User Name : " +user.toUpperCase()+ "\nPassword : "+pass+"\nSelected Branch : "+branch+"\nCity : " +city.substring(0, 1).toUpperCase()+city.substring(1)+"\nGender : "+gender);
			}
		});
		btn.setBackground(new Color(251, 249, 251));
		btn.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn.setBounds(185, 252, 89, 23);
		frame.getContentPane().add(btn);
		
		pass1 = new JPasswordField();
		pass1.setBounds(254, 92, 131, 20);
		frame.getContentPane().add(pass1);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, lblNewLabel_1, lblNewLabel_2, user1, lblNewLabel_3, branch1, lblNewLabel_4, rd1, rd2, lblNewLabel_5, txt1, btn, pass1}));
	}
}
