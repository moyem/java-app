package version1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Cursor;
import java.awt.Toolkit;

public class Confirm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_9;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_17;
	private JTextField textField_19;
	private JTextField textField_6;
	private JTextField textField_13;
	private JTextField textField_3;
	private JTextField textField_10;
	private JTextField textField_18;
	private JTextField textField_20;
	private JTextField textField_7;
	private JTextField textField_14;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_8;
	private JTextField customer_name;
	private JTextField customer_address;
	private JTextField textField_21;
	private JTextField user_field;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Confirm frame = new Confirm("Nuhin","Address","Memo", "User");
					frame.setVisible(true);

				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Confirm(String name, String address, String memo, String user_name) {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Confirm.class.getResource("/version1/logomaker.png")));
		setTitle("Confirm");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(540, 200, 873, 497);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 0, 102));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Fatema Silk House");
		label.setBounds(0, 0, 857, 50);
		contentPane.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
		
		JLabel lblName = new JLabel("Name :");
		lblName.setBounds(10, 94, 75, 30);
		contentPane.add(lblName);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Baskerville Old Face", Font.BOLD, 17));
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setForeground(Color.WHITE);
		textField_9.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBorder(null);
		textField_9.setBackground(new Color(0, 0, 139));
		textField_9.setBounds(130, 271, 110, 24);
		contentPane.add(textField_9);
		
		JLabel label_12 = new JLabel("Orna");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setForeground(Color.WHITE);
		label_12.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		label_12.setBounds(250, 314, 110, 24);
		contentPane.add(label_12);
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setForeground(Color.WHITE);
		textField_15.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBorder(null);
		textField_15.setBackground(new Color(0, 0, 139));
		textField_15.setBounds(10, 340, 110, 24);
		contentPane.add(textField_15);
		
		JLabel label_13 = new JLabel("Chinigurah Than");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 14));
		label_13.setBounds(250, 244, 110, 24);
		contentPane.add(label_13);
		
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setForeground(Color.WHITE);
		textField_16.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBorder(null);
		textField_16.setBackground(new Color(0, 0, 139));
		textField_16.setBounds(130, 340, 110, 24);
		contentPane.add(textField_16);
		
		JLabel label_17 = new JLabel("Laccha Buta Silk");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setForeground(Color.WHITE);
		label_17.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 13));
		label_17.setBounds(250, 176, 110, 24);
		contentPane.add(label_17);
		
		JButton button_2 = new JButton("Back");
		button_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_2.addActionListener(new ActionListener() {
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
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		button_2.setBorder(null);
		button_2.setBackground(new Color(128, 0, 0));
		button_2.setBounds(730, 387, 110, 24);
		contentPane.add(button_2);
		
		JLabel label_1 = new JLabel("Md.Nuruzzaman \u00A92021");
		label_1.setBounds(0, 422, 857, 23);
		contentPane.add(label_1);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial", Font.PLAIN, 10));
		
		JLabel label_8 = new JLabel("Taitanik Silk");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		label_8.setBounds(491, 176, 109, 24);
		contentPane.add(label_8);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setForeground(Color.WHITE);
		textField_4.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBackground(new Color(0, 0, 139));
		textField_4.setBounds(370, 200, 110, 24);
		contentPane.add(textField_4);
		
		JLabel label_9 = new JLabel("Varaities Than");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		label_9.setBounds(490, 243, 110, 24);
		contentPane.add(label_9);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setForeground(Color.WHITE);
		textField_5.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBorder(null);
		textField_5.setBackground(new Color(0, 0, 139));
		textField_5.setBounds(491, 200, 110, 24);
		contentPane.add(textField_5);
		
		JLabel label_15 = new JLabel("Lot Item");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setForeground(Color.WHITE);
		label_15.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		label_15.setBounds(490, 314, 110, 24);
		contentPane.add(label_15);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setForeground(Color.WHITE);
		textField_11.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBorder(null);
		textField_11.setBackground(new Color(0, 0, 139));
		textField_11.setBounds(370, 271, 110, 24);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setForeground(Color.WHITE);
		textField_12.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBorder(null);
		textField_12.setBackground(new Color(0, 0, 139));
		textField_12.setBounds(491, 271, 110, 24);
		contentPane.add(textField_12);
		
		JLabel label_16 = new JLabel("New Item");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setForeground(Color.WHITE);
		label_16.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		label_16.setBounds(610, 314, 110, 24);
		contentPane.add(label_16);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setForeground(Color.WHITE);
		textField_17.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBorder(null);
		textField_17.setBackground(new Color(0, 0, 139));
		textField_17.setBounds(250, 340, 110, 24);
		contentPane.add(textField_17);
		
		JLabel label_18 = new JLabel("IC Benaroshi Katan");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setForeground(Color.WHITE);
		label_18.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 12));
		label_18.setBounds(610, 245, 110, 24);
		contentPane.add(label_18);
		
		textField_19 = new JTextField();
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setForeground(Color.WHITE);
		textField_19.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBorder(null);
		textField_19.setBackground(new Color(0, 0, 139));
		textField_19.setBounds(491, 340, 110, 24);
		contentPane.add(textField_19);
		
		JLabel label_19 = new JLabel("BT Brocet Katan");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setForeground(Color.WHITE);
		label_19.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 13));
		label_19.setBounds(610, 177, 110, 24);
		contentPane.add(label_19);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setForeground(Color.WHITE);
		textField_6.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBorder(null);
		textField_6.setBackground(new Color(0, 0, 139));
		textField_6.setBounds(610, 200, 110, 24);
		contentPane.add(textField_6);
		
		JLabel label_10 = new JLabel("IC Party Sharee");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 13));
		label_10.setBounds(730, 245, 110, 24);
		contentPane.add(label_10);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setForeground(Color.WHITE);
		textField_13.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBorder(null);
		textField_13.setBackground(new Color(0, 0, 139));
		textField_13.setBounds(611, 271, 110, 24);
		contentPane.add(textField_13);
		
		JLabel label_21 = new JLabel("3Pis Silk");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setForeground(Color.WHITE);
		label_21.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		label_21.setBounds(730, 176, 110, 24);
		contentPane.add(label_21);
		
		JButton btnMemo = new JButton("Memo");
		btnMemo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMemo.setForeground(Color.WHITE);
		btnMemo.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		btnMemo.setBorder(null);
		btnMemo.setBackground(new Color(204, 102, 0));
		btnMemo.setBounds(730, 93, 110, 30);
		contentPane.add(btnMemo);
		
		JLabel label_7 = new JLabel("Plain Body Silk");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 14));
		label_7.setBounds(371, 176, 109, 24);
		contentPane.add(label_7);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(Color.WHITE);
		textField_3.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground(new Color(0, 0, 139));
		textField_3.setBounds(250, 200, 110, 24);
		contentPane.add(textField_3);
		
		JLabel label_14 = new JLabel("Dupyain Than");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		label_14.setBounds(370, 244, 110, 24);
		contentPane.add(label_14);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setForeground(Color.WHITE);
		textField_10.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBorder(null);
		textField_10.setBackground(new Color(0, 0, 139));
		textField_10.setBounds(250, 271, 110, 24);
		contentPane.add(textField_10);
		
		JLabel label_20 = new JLabel("Others Item");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setForeground(Color.WHITE);
		label_20.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		label_20.setBounds(370, 314, 110, 24);
		contentPane.add(label_20);
		
		textField_18 = new JTextField();
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setForeground(Color.WHITE);
		textField_18.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBorder(null);
		textField_18.setBackground(new Color(0, 0, 139));
		textField_18.setBounds(370, 340, 110, 24);
		contentPane.add(textField_18);
		
		JLabel label_2 = new JLabel("Opera Silk");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		label_2.setBounds(10, 176, 110, 24);
		contentPane.add(label_2);
		
		textField_20 = new JTextField();
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setForeground(Color.WHITE);
		textField_20.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBorder(null);
		textField_20.setBackground(new Color(0, 0, 139));
		textField_20.setBounds(610, 340, 110, 24);
		contentPane.add(textField_20);
		
		JLabel label_3 = new JLabel("Jorjet Than");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		label_3.setBounds(10, 244, 110, 24);
		contentPane.add(label_3);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setForeground(Color.WHITE);
		textField_7.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBorder(null);
		textField_7.setBackground(new Color(0, 0, 139));
		textField_7.setBounds(730, 200, 110, 24);
		contentPane.add(textField_7);
		
		JLabel label_4 = new JLabel("IC Pure Katan");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		label_4.setBounds(10, 314, 110, 24);
		contentPane.add(label_4);
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setForeground(Color.WHITE);
		textField_14.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBorder(null);
		textField_14.setBackground(new Color(0, 0, 139));
		textField_14.setBounds(730, 271, 110, 24);
		contentPane.add(textField_14);
		
		JLabel label_5 = new JLabel("Potnoma Silk");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		label_5.setBounds(130, 176, 110, 24);
		contentPane.add(label_5);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(0, 0, 139));
		textField_1.setBounds(10, 201, 110, 24);
		contentPane.add(textField_1);
		
		JLabel label_6 = new JLabel("Net Than");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		label_6.setBounds(130, 245, 110, 24);
		contentPane.add(label_6);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(new Color(0, 0, 139));
		textField_2.setBounds(130, 201, 110, 24);
		contentPane.add(textField_2);
		
		JLabel label_11 = new JLabel("IC Stone Katan");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		label_11.setBounds(130, 315, 110, 24);
		contentPane.add(label_11);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setForeground(Color.WHITE);
		textField_8.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBorder(null);
		textField_8.setBackground(new Color(0, 0, 139));
		textField_8.setBounds(10, 271, 110, 24);
		contentPane.add(textField_8);
		
		customer_name = new JTextField();
		customer_name.setForeground(Color.BLACK);
		customer_name.setBackground(Color.WHITE);
		customer_name.setText(name);
		customer_name.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 20));
		customer_name.setHorizontalAlignment(SwingConstants.CENTER);
		customer_name.setEditable(false);
		customer_name.setBorder(null);
		customer_name.setBounds(90, 93, 230, 30);
		contentPane.add(customer_name);
		customer_name.setColumns(10);
		
		customer_address = new JTextField();
		customer_address.setForeground(Color.BLACK);
		customer_address.setBackground(new Color(255, 255, 255));
		customer_address.setText(address);
		customer_address.setHorizontalAlignment(SwingConstants.CENTER);
		customer_address.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 20));
		customer_address.setEditable(false);
		customer_address.setColumns(10);
		customer_address.setBorder(null);
		customer_address.setBounds(330, 93, 130, 30);
		contentPane.add(customer_address);
		
		JLabel lblNewLabel = new JLabel("Per Piece er Rate show korbe Last deal er");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(250, 387, 350, 20);
		contentPane.add(lblNewLabel);
		
		textField_21 = new JTextField();
		textField_21.setText("<dynamic>");
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setForeground(new Color(0, 0, 0));
		textField_21.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 20));
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBorder(null);
		textField_21.setBackground(new Color(255, 255, 255));
		textField_21.setBounds(470, 93, 130, 30);
		contentPane.add(textField_21);
		
		/*********************Show data from table********************************/
		try {
			//fatema_silk_house stable connection
			Class.forName("com.mysql.jdbc.Driver");  
			String url = "jdbc:ucanaccess://H://Fatema Silk House.accdb";
			Connection con=DriverManager.getConnection(url);
			
		    Statement stmt=con.createStatement();
		    
		    ResultSet rs=stmt.executeQuery("SELECT `opera_silk`, `potnoma_silk`, `laccha_buta_silk`, `plain_body_silk`, `taitanik_silk`, `bt_brocet_katan`, "
					+ "`three_pis_silk`, `jorjet_than`, `net_than`, `chinigurah_than`, `dupyain_than`, `varaities_than`, `ic_benaroshi_katan`, `ic_party_sharee`, "
					+ "`ic_pure_katan`, `ic_stone_katan`, `orna`, `others_item`, `lot_item`, `new_item`, `due` FROM `sell_item_all_tk` WHERE name = '"+name+"' AND address = '"+address+"';");
		    if(rs.next()) {
		    	textField_1.setText(""+rs.getInt(1));
				textField_2.setText(""+rs.getInt(2));
				textField_3.setText(""+rs.getInt(3));
				textField_4.setText(""+rs.getInt(4));
				textField_5.setText(""+rs.getInt(5));
				textField_6.setText(""+rs.getInt(6));
				textField_7.setText(""+rs.getInt(7));
				textField_8.setText(""+rs.getInt(8));
				textField_9.setText(""+rs.getInt(9));
				textField_10.setText(""+rs.getInt(10));
				textField_11.setText(""+rs.getInt(11));
				textField_12.setText(""+rs.getInt(12));
				textField_13.setText(""+rs.getInt(13));
				textField_14.setText(""+rs.getInt(14));
				textField_15.setText(""+rs.getInt(15));
				textField_16.setText(""+rs.getInt(16));
				textField_17.setText(""+rs.getInt(17));
				textField_18.setText(""+rs.getInt(18));
				textField_19.setText(""+rs.getInt(19));
				textField_20.setText(""+rs.getInt(20));
				textField_21.setText(""+rs.getInt(21));
		    }
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
		
		JButton btnNew = new JButton("New");
		btnNew.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String due = textField_21.getText();
					
					Sell ob = new Sell(name, address, due, user_name);
					ob.setVisible(true);
					
					dispose();
				}
				catch(Exception e1) {
					
				}
			}
		});
		btnNew.setForeground(Color.WHITE);
		btnNew.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		btnNew.setBorder(null);
		btnNew.setBackground(new Color(0, 153, 153));
		btnNew.setBounds(610, 93, 110, 30);
		contentPane.add(btnNew);
		
		user_field = new JTextField();
		user_field.setText(user_name);
		user_field.setHorizontalAlignment(SwingConstants.RIGHT);
		user_field.setForeground(Color.WHITE);
		user_field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
		user_field.setEditable(false);
		user_field.setColumns(10);
		user_field.setBorder(null);
		user_field.setBackground(new Color(51, 0, 102));
		user_field.setBounds(642, 48, 215, 24);
		contentPane.add(user_field);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(268, 48, 321, 2);
		contentPane.add(separator);
	}
}
