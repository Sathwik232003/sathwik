package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecommerce {

	private JFrame frame;
	int items =0;
	int bill = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecommerce window = new ecommerce();
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
	public ecommerce() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(101, 160, 167));
		frame.setBounds(100, 100, 500, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("E-COMMERCE WEBSITE");
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		lblNewLabel.setBounds(143, 27, 238, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lb1 = new JLabel("CART : 0");
		lb1.setFont(new Font("Segoe UI Variable", Font.BOLD, 12));
		lb1.setBounds(354, 81, 63, 14);
		frame.getContentPane().add(lb1);
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items = items+1;
				bill = bill+520;
				lb1.setText("CART : "+items);
			}
		});
		b1.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\rich_dad (1).jpg"));
		b1.setBounds(63, 120, 99, 127);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items = items+1;
				bill=bill+625;
				lb1.setText("CART : "+items);
			}
		});
		b2.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\stp.jpg"));
		b2.setBounds(195, 120, 99, 127);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items = items+1;
				bill = bill+525;
				lb1.setText("CART : "+items);
			}
		});
		b3.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\nelson.jpg"));
		b3.setBounds(318, 120, 99, 127);
		frame.getContentPane().add(b3);
		
		JLabel lb2 = new JLabel("Rs.520/-");
		lb2.setFont(new Font("Segoe UI Variable", Font.BOLD, 11));
		lb2.setBounds(89, 258, 46, 14);
		frame.getContentPane().add(lb2);
		
		JLabel lb3 = new JLabel("Rs.625/-");
		lb3.setFont(new Font("Segoe UI Variable", Font.BOLD, 11));
		lb3.setBounds(226, 258, 46, 14);
		frame.getContentPane().add(lb3);
		
		JLabel lb4 = new JLabel("Rs.525/-");
		lb4.setFont(new Font("Segoe UI Variable", Font.BOLD, 11));
		lb4.setBounds(344, 259, 46, 14);
		frame.getContentPane().add(lb4);
		
		JButton btn1 = new JButton("BUY NOW");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btn1, "No.of Books : "+items+"\nTotal Bill : "+bill);
				items=0;
				bill=0;
				lb1.setText("CART : 0");
			}
		});
		btn1.setBackground(new Color(192, 192, 192));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btn1.setBounds(328, 306, 89, 23);
		frame.getContentPane().add(btn1);
	}

}
