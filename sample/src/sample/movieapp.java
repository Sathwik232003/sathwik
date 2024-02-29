package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movieapp {

	private JFrame frame;
	private JTextField user1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieapp window = new movieapp();
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
	public movieapp() {
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
		
		JLabel lblNewLabel_1 = new JLabel("MOVIES APP");
		lblNewLabel_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 16));
		lblNewLabel_1.setBounds(196, 34, 111, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User Name");
		lblNewLabel_2.setFont(new Font("Segoe Script", Font.BOLD, 14));
		lblNewLabel_2.setBounds(95, 112, 111, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		user1 = new JTextField();
		user1.setBounds(264, 110, 137, 20);
		frame.getContentPane().add(user1);
		user1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Select Your Movie");
		lblNewLabel_3.setFont(new Font("Segoe Script", Font.BOLD, 14));
		lblNewLabel_3.setBounds(74, 162, 151, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 12));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select Movie", "OG", "PUSHPA - 2", "DEVAARA", "KALKI - 2198 AD", "JAI HANUMAN", "KGF - 3"}));
		c1.setBounds(264, 157, 137, 22);
		frame.getContentPane().add(c1);
		
		JLabel lblNewLabel_4 = new JLabel("Select No.of Tickets");
		lblNewLabel_4.setFont(new Font("Segoe Script", Font.BOLD, 14));
		lblNewLabel_4.setBounds(52, 242, 174, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox c3 = new JComboBox();
		c3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 12));
		c3.setModel(new DefaultComboBoxModel(new String[] {"Select tickets", "1", "2", "3", "4", "5", "6", "7", "8"}));
		c3.setBounds(264, 237, 138, 22);
		frame.getContentPane().add(c3);
		
		JLabel lblNewLabel_5 = new JLabel("Select Theatre");
		lblNewLabel_5.setFont(new Font("Segoe Script", Font.BOLD, 14));
		lblNewLabel_5.setBounds(95, 202, 124, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JComboBox c2 = new JComboBox();
		c2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 12));
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select Theatre", "AMB MALL - S2", "PVR MALL - S3", "PRASAD IMAX - S2", "SUDARSHAN 70MM", "DEVI 75MM", "ASIAN CINE PLANET"}));
		c2.setBounds(264, 198, 137, 22);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("BOOK TICKET");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = user1.getText();
				String movie = (String) c1.getSelectedItem();
				String theatre = (String) c2.getSelectedItem();
				String no = (String) c3.getSelectedItem();
				int bill = 0;
				int n = Integer.parseInt(no);
				if(theatre.equals("AMB MALL - S2") || theatre.equals("PRASAD IMAX - S2")){
					if(movie.equals("OG")) {
						bill = n*250;
					}
					if(movie.equals("PUSHPA - 2")) {
						bill = n*250;
					}
					if(movie.equals("DEVAARA")) {
						bill = n*250;
					}
					if(movie.equals("KALKI - 2198 AD")) {
						bill = n*250;
					}
					if(movie.equals("JAI HANUMAN")) {
						bill = n*250;
					}
					if(movie.equals("KGF - 3")) {
						bill = n*250;
					}
				}
				if(theatre.equals("PVR MALL - S3") || theatre.equals("ASAIN CINE PLANET")){
					if(movie.equals("OG")) {
						bill = n*200;
					}
					if(movie.equals("PUSHPA - 2")) {
						bill = n*200;
					}
					if(movie.equals("DEVAARA")) {
						bill = n*200;
					}
					if(movie.equals("KALKI - 2198 AD")) {
						bill = n*200;
					}
					if(movie.equals("JAI HANUMAN")) {
						bill = n*200;
					}
					if(movie.equals("KGF - 3")) {
						bill = n*200;
					}
				}
				if(theatre.equals("SUDARSHAN 70MM") || theatre.equals("DEVI 75MM")){
					if(movie.equals("OG")) {
						bill = n*150;
					}
					if(movie.equals("PUSHPA - 2")) {
						bill = n*150;
					}
					if(movie.equals("DEVAARA")) {
						bill = n*150;
					}
					if(movie.equals("KALKI - 2198 AD")) {
						bill = n*150;
					}
					if(movie.equals("JAI HANUMAN")) {
						bill = n*150;
					}
					if(movie.equals("KGF - 3")) {
						bill = n*150;
					}
				}
				int res=0;
				res = JOptionPane.showConfirmDialog(btnNewButton, "\nName : "+user.toUpperCase()+ "\nTheatre Name : "+theatre.toUpperCase()+"\nMovie : "+movie.toUpperCase()+"\nTotal Bill : "+bill);
				if(res == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(btnNewButton, "BOOKING CONFIRMED\n\t\tManchiga Movie Chudu Broo Enjoy Pandgaoo....!!");
					user1.setText("");

				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "BOOKING CANCELLED\n\t\tM Kadhu Broo Feel Kaku Malla Book Chesuko...!!");
					user1.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		btnNewButton.setBounds(174, 290, 111, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\hh.jpg"));
		lblNewLabel.setBounds(0, 0, 454, 341);
		frame.getContentPane().add(lblNewLabel);
	}
}
