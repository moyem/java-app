package version1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import java.awt.Cursor;
import java.awt.Toolkit;


public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/version1/logomaker.png")));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(735, 200, 450, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 0, 102));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Fatema Silk House");
		lblNewLabel.setBounds(0, 5, 444, 50);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBounds(61, 74, 320, 330);
		panel.setBackground(new Color(0, 204, 204));
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(10, 11, 294, 35);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setBounds(49, 68, 220, 25);
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
		
		nameField = new JTextField();
		nameField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		nameField.setBounds(49, 95, 220, 35);
		nameField.setBackground(new Color(51, 0, 102));
		nameField.setBorder(null);
		nameField.setForeground(new Color(255, 255, 255));
		nameField.setFont(new Font("Arial", Font.PLAIN, 20));
		nameField.setHorizontalAlignment(SwingConstants.CENTER);
		nameField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(49, 153, 220, 25);
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setBounds(49, 177, 220, 35);
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setEchoChar('*');
		passwordField.setBackground(new Color(51, 0, 102));
		passwordField.setFont(new Font("Arial", Font.PLAIN, 20));
		passwordField.setBorder(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setBounds(49, 223, 220, 35);
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLogin.setBackground(new Color(20, 104, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnLogin.setBackground(new Color(25, 25, 112));
			}
		});
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				@SuppressWarnings("deprecation")
				String password = passwordField.getText();
				
				try {
					Class.forName("com.mysql.jdbc.Driver");  
					String url = "jdbc:ucanaccess://H://Fatema Silk House.accdb";
					Connection con=DriverManager.getConnection(url);
					
					Statement stmt=con.createStatement();

					ResultSet rs1 = stmt.executeQuery("SELECT * FROM `login` WHERE name = 'nuruzzaman'");
					if(rs1.next()) {
						ResultSet rs = stmt.executeQuery("SELECT * FROM `login` WHERE name = '"+name+"' AND password = '"+password+"'");  
						if(rs.next()) {
							Home ob = new Home(name.toUpperCase());
							ob.setVisible(true);
							
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null, "Incorrect Name Or Password!");
						}
					}
					else {
						PreparedStatement ps1 = con.prepareStatement("INSERT INTO `login` (`name`, `password`) VALUES ('nuruzzaman', 'pass');");
						ps1.executeUpdate();
					}
					
				} 
				catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnLogin.setBackground(new Color(25, 25, 112));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBorder(null);
		btnLogin.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		
		JButton btnChangePassword = new JButton("Change password");
		btnChangePassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnChangePassword.setBounds(49, 269, 220, 35);
		btnChangePassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnChangePassword.setBackground(new Color(20, 104, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnChangePassword.setBackground(new Color(128, 0, 0));
			}
		});
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f = new JFrame();
				String name = JOptionPane.showInputDialog(f,"Enter Your Name");
			    String password = JOptionPane.showInputDialog(f,"Enter Old Password");
			    String password2 = null;
			    try {
			    	String url = "jdbc:ucanaccess://H://Fatema Silk House.accdb";
					Connection con=DriverManager.getConnection(url);
					
					Statement stmt = con.createStatement();
					ResultSet rs=stmt.executeQuery("SELECT `name`, `password` FROM `login` WHERE password = '"+password+"' AND name = '"+name+"'");  
					
					if(rs.next()) {
						password2 = JOptionPane.showInputDialog(f,"Enter New Password");
						PreparedStatement ps1 = con.prepareStatement("UPDATE `login` SET `name`='"+name+"',`password`= '"+password2+"' WHERE name = '"+name+"'");
						ps1.executeUpdate();
						JOptionPane.showMessageDialog(null, "Password Updated.\nLogin");
					}
					else {
						JOptionPane.showMessageDialog(null, "Your are fake!");
					}

				} 
			    catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnChangePassword.setForeground(Color.WHITE);
		btnChangePassword.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		btnChangePassword.setBorder(null);
		btnChangePassword.setBackground(new Color(128, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Md.Nuruzzaman \u00A92021");
		lblNewLabel_1.setBounds(0, 426, 444, 23);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.setLayout(null);
		panel.add(lblNewLabel_2);
		panel.add(lblNewLabel_3);
		panel.add(nameField);
		panel.add(lblPassword);
		panel.add(passwordField);
		panel.add(btnLogin);
		panel.add(btnChangePassword);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(61, 46, 320, 2);
		contentPane.add(separator);
		contentPane.add(lblNewLabel);
		contentPane.add(panel);
		contentPane.add(lblNewLabel_1);
	}
}