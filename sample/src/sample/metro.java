package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class metro {

	private JFrame frame;
	private JTextField user1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro window = new metro();
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
	public metro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 470, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("METRO TICKET BOOKING");
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(107, 43, 204, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User Name");
		lblNewLabel_2.setBackground(new Color(192, 192, 192));
		lblNewLabel_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(192, 192, 192));
		lblNewLabel_2.setBounds(81, 112, 98, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		user1 = new JTextField();
		user1.setBounds(217, 112, 146, 20);
		frame.getContentPane().add(user1);
		user1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Source");
		lblNewLabel_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_3.setForeground(new Color(192, 192, 192));
		lblNewLabel_3.setBackground(new Color(192, 192, 192));
		lblNewLabel_3.setBounds(88, 157, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI Variable", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Source Station", "SECUNDRABAD EAST", "METTUGDA", "TARNAKA", "STADIUM", "UPPAL"}));
		comboBox.setBounds(217, 148, 146, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Destination");
		lblNewLabel_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_4.setForeground(new Color(192, 192, 192));
		lblNewLabel_4.setBounds(68, 194, 91, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(217, 192, 146, 22);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\ghg.jpg"));
		lblNewLabel.setBounds(0, 0, 454, 341);
		frame.getContentPane().add(lblNewLabel);
	}

}
