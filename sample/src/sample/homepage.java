package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class homepage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage window = new homepage();
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
	public homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 470, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME USER");
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		lblNewLabel.setBounds(162, 36, 161, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Balance  :");
		lblNewLabel_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(66, 101, 65, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Deposit  :");
		lblNewLabel_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(66, 135, 65, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Withdraw  :");
		lblNewLabel_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(53, 175, 78, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(191, 134, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(191, 174, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("DEPOSIT");
		btnNewButton.setFont(new Font("Segoe UI Variable", Font.PLAIN, 11));
		btnNewButton.setBounds(322, 134, 104, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("WITHDRAW");
		btnNewButton_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 11));
		btnNewButton_1.setBounds(322, 174, 104, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("BALANCE");
		btnNewButton_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 11));
		btnNewButton_2.setBounds(191, 98, 235, 23);
		frame.getContentPane().add(btnNewButton_2);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}

}
