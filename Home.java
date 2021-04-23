package version1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Cursor;
import java.awt.Toolkit;


public class Home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name_field;
	private JTextField user_field;
	private JTextField address_field;
	private JTextField memo_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home("Nuhin");
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
	public Home(String user_name) {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/version1/logomaker.png")));
		setTitle("Home");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 200, 850, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 0, 102));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Fatema Silk House");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
		label.setBounds(5, 5, 829, 50);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Md.Nuruzzaman \u00A92021");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial", Font.PLAIN, 10));
		label_1.setBounds(5, 427, 829, 23);
		contentPane.add(label_1);
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Buy frame = new Buy(user_name);
					frame.setVisible(true);
					
		            dispose();
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnBuy.setBounds(15, 66, 150, 39);
		contentPane.add(btnBuy);
		btnBuy.setForeground(new Color(255, 255, 255));
		btnBuy.setBackground(new Color(0, 153, 153));
		btnBuy.setBorder(null);
		btnBuy.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		
		JButton btnStock = new JButton("Stock");
		btnStock.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Stock frame = new Stock(user_name);
					frame.setVisible(true);

					dispose();
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}	
			}
		});
		btnStock.setForeground(Color.WHITE);
		btnStock.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		btnStock.setBorder(null);
		btnStock.setBackground(new Color(0, 153, 153));
		btnStock.setBounds(15, 166, 150, 39);
		contentPane.add(btnStock);
		
		JButton btnOpen = new JButton("Calculator");
		btnOpen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Runtime runtime = Runtime.getRuntime();
				try
				{
					runtime.exec("calc");
				}
				catch (Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnOpen.setForeground(Color.WHITE);
		btnOpen.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		btnOpen.setBorder(null);
		btnOpen.setBackground(new Color(51, 204, 204));
		btnOpen.setBounds(15, 216, 150, 39);
		contentPane.add(btnOpen);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Help frame = new Help(user_name);
					frame.setVisible(true);
					
					dispose();
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnHelp.setForeground(Color.WHITE);
		btnHelp.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		btnHelp.setBorder(null);
		btnHelp.setBackground(new Color(0, 153, 153));
		btnHelp.setBounds(15, 264, 150, 39);
		contentPane.add(btnHelp);
		
		JButton btnSell = new JButton("Sell");
		btnSell.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Sell frame = new Sell(user_name);
					frame.setVisible(true);
					
					dispose();
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}	
			}
		});
		btnSell.setForeground(Color.WHITE);
		btnSell.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		btnSell.setBorder(null);
		btnSell.setBackground(new Color(0, 204, 204));
		btnSell.setBounds(15, 116, 150, 39);
		contentPane.add(btnSell);
		
		name_field = new JTextField();
		name_field.setBorder(null);
		name_field.setHorizontalAlignment(SwingConstants.CENTER);
		name_field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		name_field.setBounds(205, 373, 222, 30);
		contentPane.add(name_field);
		name_field.setColumns(10);
		
		user_field = new JTextField();
		user_field.setText(user_name);
		user_field.setForeground(Color.WHITE);
		user_field.setHorizontalAlignment(SwingConstants.LEFT);
		user_field.setBorder(null);
		user_field.setBackground(new Color(51, 0, 102));
		user_field.setEditable(false);
		user_field.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		user_field.setBounds(625, 66, 209, 30);
		contentPane.add(user_field);
		user_field.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Hi !");
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(563, 66, 42, 30);
		contentPane.add(lblNewLabel);
		
		JButton btnBuy_return = new JButton("Buy Return");
		btnBuy_return.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Buy_Return frame = new Buy_Return(user_name);
					frame.setVisible(true);
					
					dispose();
				}
				catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnBuy_return.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBuy_return.setForeground(Color.WHITE);
		btnBuy_return.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		btnBuy_return.setBorder(null);
		btnBuy_return.setBackground(new Color(0, 153, 153));
		btnBuy_return.setBounds(15, 364, 150, 39);
		contentPane.add(btnBuy_return);
		
		JButton btnSell_return = new JButton("Sell Return");
		btnSell_return.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Sell_Return frame = new Sell_Return(user_name);
					frame.setVisible(true);
					
					dispose();
					
				} 
				catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnSell_return.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSell_return.setForeground(Color.WHITE);
		btnSell_return.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		btnSell_return.setBorder(null);
		btnSell_return.setBackground(new Color(0, 204, 204));
		btnSell_return.setBounds(15, 314, 150, 39);
		contentPane.add(btnSell_return);
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Arial", Font.PLAIN, 15));
		lblName.setBounds(205, 345, 222, 30);
		contentPane.add(lblName);
		
		address_field = new JTextField();
		address_field.setHorizontalAlignment(SwingConstants.CENTER);
		address_field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		address_field.setColumns(10);
		address_field.setBorder(null);
		address_field.setBounds(437, 373, 120, 30);
		contentPane.add(address_field);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Arial", Font.PLAIN, 15));
		lblAddress.setBounds(437, 345, 120, 30);
		contentPane.add(lblAddress);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(264, 53, 315, 2);
		contentPane.add(separator);
		
		memo_field = new JTextField();
		memo_field.setHorizontalAlignment(SwingConstants.CENTER);
		memo_field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		memo_field.setColumns(10);
		memo_field.setBorder(null);
		memo_field.setBounds(567, 373, 111, 30);
		contentPane.add(memo_field);
		
		JLabel lblMemo = new JLabel("Memo");
		lblMemo.setHorizontalAlignment(SwingConstants.LEFT);
		lblMemo.setForeground(Color.WHITE);
		lblMemo.setFont(new Font("Arial", Font.PLAIN, 15));
		lblMemo.setBounds(567, 345, 111, 30);
		contentPane.add(lblMemo);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String url = "jdbc:ucanaccess://H://Fatema Silk House.accdb";
					Connection con=DriverManager.getConnection(url);
					Statement stmt=con.createStatement();
					
					String name = name_field.getText();
					String address = address_field.getText();
					String memo = memo_field.getText();
					
					if(!name.equals("") && !address.equals("") && !memo.equals("")) {
						try {
							ResultSet rs=stmt.executeQuery("SELECT `name`, `address` FROM `sell_item_all` WHERE name = '"+name+"' AND address = '"+address+"' AND memo = '"+memo+"'");
							if(rs.next()) {
								Confirm ob = new Confirm(name, address, memo, user_name);
								ob.setVisible(true);
								dispose();
							}
							else {
								JOptionPane.showMessageDialog(null, "Not Found");
							}
						} 
						catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1);
						}
					}
					else if(!name.equals("") && !address.equals("")) {
						try {
							ResultSet rs=stmt.executeQuery("SELECT `name`, `address`, `memo` FROM `sell_item_all` WHERE name = '"+name+"' AND address = '"+address+"'");
							if(rs.next()) {
								Confirm ob = new Confirm(name, address, rs.getString(3), user_name);
								ob.setVisible(true);
								dispose();
							}
							else {
								JOptionPane.showMessageDialog(null, "Not Found");
							}
						} 
						catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1);
						}
					}
					else if(!memo.equals("")) {
						ResultSet rs1=stmt.executeQuery("SELECT `name`, `address` FROM `sell_item_all` WHERE memo = '"+memo+"'");
						if(rs1.next()) {
							Confirm ob = new Confirm(rs1.getString(1), rs1.getString(2), memo, user_name);
							ob.setVisible(true);
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null, "Not Found");
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Name, Address or Memo are Empty!");
					}
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		btnSearch.setBorder(null);
		btnSearch.setBackground(new Color(0, 102, 204));
		btnSearch.setBounds(688, 373, 136, 30);
		contentPane.add(btnSearch);
	}
}