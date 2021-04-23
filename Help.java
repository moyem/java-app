package version1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Toolkit;

public class Help extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JButton btnNewButton = new JButton("Home");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help frame = new Help("Nuhin");
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
	public Help(String user_name) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Help.class.getResource("/version1/logomaker.png")));
		setResizable(false);
		setTitle("Nuruzzaman");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(580, 200, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Home frame = new Home(user_name);
					frame.setVisible(true);

					dispose();
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 102));
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
		btnNewButton.setBounds(287, 380, 120, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u00A9 Copyright 2021 All rights reserved. Developed by MD. Nuruzzaman");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 422, 674, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fatema Silk House");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(10, 0, 674, 50);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<html><h1>Author View</html>");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 72, 674, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setText("<html>Hi, I have written and developed this application so that a saree store's(Fatema Silk House's) daily, monthly and yearly stock can maintain easily. "
				+ "This app also help shopkepper to make memo for customer. No one is perfect in this world and nothing is eternally best. But we can try to be better. "
				+ "I hope it will help you a lot.</html>");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 108, 674, 97);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("<html>MD. Nuruzzaman (Developer of this Application).<br>Phone: 01989772623 or 01821659122<br>Email: nuruzzamanmoyem.99@gmail.com<br>Student of CSE at BUBT </html>");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(10, 252, 342, 97);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblcontract = new JLabel("<html><h1>Contract</html>");
		lblcontract.setForeground(Color.WHITE);
		lblcontract.setFont(new Font("Arial", Font.PLAIN, 20));
		lblcontract.setBounds(10, 216, 342, 25);
		contentPane.add(lblcontract);

		JLabel lblNewLabel_5 = new JLabel();
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_5.setIcon(new ImageIcon(Help.class.getResource("/version1/logomaker.png")));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(430, 166, 254, 245);
		contentPane.add(lblNewLabel_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(233, 42, 229, 2);
		contentPane.add(separator);
	}
}
