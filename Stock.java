package version1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Toolkit;
import javax.swing.JSeparator;

public class Stock extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField date_field;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField user_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stock frame = new Stock("Nuhin");
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
	public Stock(String name_field) {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Stock.class.getResource("/version1/logomaker.png")));
		setTitle("Stock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 895, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 0, 102));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Fatema Silk House");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
		label.setBounds(5, 5, 869, 50);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Md.Nuruzzaman \u00A92021");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial", Font.PLAIN, 10));
		label_1.setBounds(5, 437, 869, 23);
		contentPane.add(label_1);
		
		JLabel lblDate = new JLabel("Date :");
		lblDate.setBounds(166, 108, 69, 30);
		contentPane.add(lblDate);
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(235, 108, 110, 30);
		contentPane.add(dateChooser);
		dateChooser.getCalendarButton().setBorder(null);
		dateChooser.getCalendarButton().setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		
		JButton stock = new JButton("Total Stock");
		stock.setBounds(355, 108, 110, 30);
		contentPane.add(stock);
		stock.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		stock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int max;
					
					//*************************************Create Connection with data base*******************************************//
					try {
						//fatema_silk_house stable connection
						Class.forName("com.mysql.jdbc.Driver");  
						//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fatema_silk_house","root","");
						String url = "jdbc:ucanaccess://H://Fatema Silk House.accdb";
						Connection con=DriverManager.getConnection(url);
					    Statement stmt=con.createStatement();
					    
				    	
				    	//*************************************Show Stock by date*******************************************//
					    //JOptionPane.showMessageDialog(null, "f**k date"+dateChooser.getDate());
					    if(dateChooser.getDate() != null) {
					    	SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
					    	String date = d.format(dateChooser.getDate());
					    	
					    	ResultSet rs1=stmt.executeQuery("SELECT `opera_silk`, `potnoma_silk`, `laccha_buta_silk`, `plain_body_silk`, `taitanik_silk`, `bt_brocet_katan`, "
									+ "`three_pis_silk`, `jorjet_than`, `net_than`, `chinigurah_than`, `dupyain_than`, `varaities_than`, `ic_benaroshi_katan`, `ic_party_sharee`, "
									+ "`ic_pure_katan`, `ic_stone_katan`, `orna`, `others_item`, `lot_item`, `new_item`, `buy_total`, `sell_total` FROM `stock` WHERE date = '"+date+"';");
					    	if(rs1.next()) {
					    		textField.setText(""+rs1.getInt(1));
								textField_1.setText(""+rs1.getInt(2));
								textField_2.setText(""+rs1.getInt(3));
								textField_3.setText(""+rs1.getInt(4));
								textField_4.setText(""+rs1.getInt(5));
								textField_5.setText(""+rs1.getInt(6));
								textField_6.setText(""+rs1.getInt(7));
								textField_7.setText(""+rs1.getInt(8));
								textField_8.setText(""+rs1.getInt(9));
								textField_9.setText(""+rs1.getInt(10));
								textField_10.setText(""+rs1.getInt(11));
								textField_11.setText(""+rs1.getInt(12));
								textField_12.setText(""+rs1.getInt(13));
								textField_13.setText(""+rs1.getInt(14));
								textField_15.setText(""+rs1.getInt(15));
								textField_16.setText(""+rs1.getInt(16));
								textField_17.setText(""+rs1.getInt(17));
								textField_18.setText(""+rs1.getInt(18));
								textField_19.setText(""+rs1.getInt(19));
								textField_20.setText(""+rs1.getInt(20));
					    	}
					    	else {
					    		JOptionPane.showMessageDialog(null, "Date Not Matched!.");
					    	}
					    	
					    }
					    //*************************************Show latest Stock*******************************************//
					    else {
					    	ResultSet rs0=stmt.executeQuery("SELECT MAX(ID) FROM `stock`;");
							if(rs0.next()) {
								max = rs0.getInt(1);
								
								ResultSet rs2=stmt.executeQuery("SELECT `opera_silk`, `potnoma_silk`, `laccha_buta_silk`, `plain_body_silk`, `taitanik_silk`, `bt_brocet_katan`, "
										+ "`three_pis_silk`, `jorjet_than`, `net_than`, `chinigurah_than`, `dupyain_than`, `varaities_than`, `ic_benaroshi_katan`, `ic_party_sharee`, "
										+ "`ic_pure_katan`, `ic_stone_katan`, `orna`, `others_item`, `lot_item`, `new_item`, `buy_total`, `sell_total` FROM `stock` WHERE ID = '"+max+"';");
								if(rs2.next()) {
									textField.setText(""+rs2.getInt(1));
									textField_1.setText(""+rs2.getInt(2));
									textField_2.setText(""+rs2.getInt(3));
									textField_3.setText(""+rs2.getInt(4));
									textField_4.setText(""+rs2.getInt(5));
									textField_5.setText(""+rs2.getInt(6));
									textField_6.setText(""+rs2.getInt(7));
									textField_7.setText(""+rs2.getInt(8));
									textField_8.setText(""+rs2.getInt(9));
									textField_9.setText(""+rs2.getInt(10));
									textField_10.setText(""+rs2.getInt(11));
									textField_11.setText(""+rs2.getInt(12));
									textField_12.setText(""+rs2.getInt(13));
									textField_13.setText(""+rs2.getInt(14));
									textField_15.setText(""+rs2.getInt(15));
									textField_16.setText(""+rs2.getInt(16));
									textField_17.setText(""+rs2.getInt(17));
									textField_18.setText(""+rs2.getInt(18));
									textField_19.setText(""+rs2.getInt(19));
									textField_20.setText(""+rs2.getInt(20));
								}
							}
					    }
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Stock Stuck !!.");
					}
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Stock Stuck.");
				}
			}
		});
		stock.setForeground(Color.WHITE);
		stock.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
		stock.setBorder(null);
		stock.setBackground(new Color(0, 102, 0));
		
				JButton buystock = new JButton("Buy Stock");
				buystock.setBounds(475, 108, 110, 30);
				contentPane.add(buystock);
				buystock.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				buystock.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							int max;
							//*************************************Create Connection with data base*******************************************//
							try {
								//fatema_silk_house stable connection
								Class.forName("com.mysql.jdbc.Driver");  
								//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fatema_silk_house","root","");
								String url = "jdbc:ucanaccess://H://Fatema Silk House.accdb";
								Connection con=DriverManager.getConnection(url);
							    Statement stmt=con.createStatement();
							    
						    	
						    	//*************************************Show Buy Stock by date*******************************************//
							    //JOptionPane.showMessageDialog(null, "f**k date"+dateChooser.getDate());
							    if(dateChooser.getDate() != null) {
							    	SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
							    	String date = d.format(dateChooser.getDate());
							    	
							    	ResultSet rs1=stmt.executeQuery("SELECT `opera_silk`, `potnoma_silk`, `laccha_buta_silk`, `plain_body_silk`, `taitanik_silk`, `bt_brocet_katan`, "
							    			+ "`three_pis_silk`, `jorjet_than`, `net_than`, `chinigurah_than`, `dupyain_than`, `varaities_than`, `ic_benaroshi_katan`, `ic_party_sharee`, "
							    			+ "`ic_pure_katan`, `ic_stone_katan`, `orna`, `others_item`, `lot_item`, `new_item` FROM `buy_stock` WHERE date = '"+date+"';");
							    	if(rs1.next()) {
							    		textField.setText(""+rs1.getInt(1));
										textField_1.setText(""+rs1.getInt(2));
										textField_2.setText(""+rs1.getInt(3));
										textField_3.setText(""+rs1.getInt(4));
										textField_4.setText(""+rs1.getInt(5));
										textField_5.setText(""+rs1.getInt(6));
										textField_6.setText(""+rs1.getInt(7));
										textField_7.setText(""+rs1.getInt(8));
										textField_8.setText(""+rs1.getInt(9));
										textField_9.setText(""+rs1.getInt(10));
										textField_10.setText(""+rs1.getInt(11));
										textField_11.setText(""+rs1.getInt(12));
										textField_12.setText(""+rs1.getInt(13));
										textField_13.setText(""+rs1.getInt(14));
										textField_15.setText(""+rs1.getInt(15));
										textField_16.setText(""+rs1.getInt(16));
										textField_17.setText(""+rs1.getInt(17));
										textField_18.setText(""+rs1.getInt(18));
										textField_19.setText(""+rs1.getInt(19));
										textField_20.setText(""+rs1.getInt(20));
							    	}
							    	else {
							    		JOptionPane.showMessageDialog(null, "Date Not Matched!.");
							    	}
							    	
							    }
							    //*************************************Show latest Buy Stock*******************************************//
							    else {
							    	ResultSet rs0=stmt.executeQuery("SELECT MAX(ID) FROM `buy_stock`;");
									if(rs0.next()) {
										max = rs0.getInt(1);
										
										ResultSet rs2=stmt.executeQuery("SELECT `opera_silk`, `potnoma_silk`, `laccha_buta_silk`, `plain_body_silk`, `taitanik_silk`, `bt_brocet_katan`, "
												+ "`three_pis_silk`, `jorjet_than`, `net_than`, `chinigurah_than`, `dupyain_than`, `varaities_than`, `ic_benaroshi_katan`, `ic_party_sharee`, "
												+ "`ic_pure_katan`, `ic_stone_katan`, `orna`, `others_item`, `lot_item`, `new_item` FROM `buy_stock` WHERE ID = '"+max+"';");
										if(rs2.next()) {
											textField.setText(""+rs2.getInt(1));
											textField_1.setText(""+rs2.getInt(2));
											textField_2.setText(""+rs2.getInt(3));
											textField_3.setText(""+rs2.getInt(4));
											textField_4.setText(""+rs2.getInt(5));
											textField_5.setText(""+rs2.getInt(6));
											textField_6.setText(""+rs2.getInt(7));
											textField_7.setText(""+rs2.getInt(8));
											textField_8.setText(""+rs2.getInt(9));
											textField_9.setText(""+rs2.getInt(10));
											textField_10.setText(""+rs2.getInt(11));
											textField_11.setText(""+rs2.getInt(12));
											textField_12.setText(""+rs2.getInt(13));
											textField_13.setText(""+rs2.getInt(14));
											textField_15.setText(""+rs2.getInt(15));
											textField_16.setText(""+rs2.getInt(16));
											textField_17.setText(""+rs2.getInt(17));
											textField_18.setText(""+rs2.getInt(18));
											textField_19.setText(""+rs2.getInt(19));
											textField_20.setText(""+rs2.getInt(20));
										}
									}
							    }
							}
							catch(Exception e1) {
								JOptionPane.showMessageDialog(null, "buy Stock Stuck !.");
							}
						}
						catch(Exception e1) {
							JOptionPane.showMessageDialog(null, "buy Stock Stuck.");
						}
					}
				});
				buystock.setForeground(Color.WHITE);
				buystock.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
				buystock.setBorder(null);
				buystock.setBackground(new Color(0, 153, 51));
				
				JButton sellstock = new JButton("Sell Stock");
				sellstock.setBounds(595, 108, 110, 30);
				contentPane.add(sellstock);
				sellstock.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				sellstock.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							int max;
							//*************************************Create Connection with data base*******************************************//
							try {
								//fatema_silk_house stable connection
								Class.forName("com.mysql.jdbc.Driver");  
								//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fatema_silk_house","root","");
								String url = "jdbc:ucanaccess://H://Fatema Silk House.accdb";
								Connection con=DriverManager.getConnection(url);
							    Statement stmt=con.createStatement();
							    
						    	
						    	//*************************************Show Sell Stock by date*******************************************//
							    //JOptionPane.showMessageDialog(null, "f**k date"+dateChooser.getDate());
							    if(dateChooser.getDate() != null) {
							    	SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
							    	String date = d.format(dateChooser.getDate());
							    	
							    	ResultSet rs1=stmt.executeQuery("SELECT `opera_silk`, `potnoma_silk`, `laccha_buta_silk`, `plain_body_silk`, `taitanik_silk`, `bt_brocet_katan`, "
							    			+ "`three_pis_silk`, `jorjet_than`, `net_than`, `chinigurah_than`, `dupyain_than`, `varaities_than`, `ic_benaroshi_katan`, `ic_party_sharee`, "
							    			+ "`ic_pure_katan`, `ic_stone_katan`, `orna`, `others_item`, `lot_item`, `new_item` FROM `sell_stock` WHERE date = '"+date+"';");
							    	if(rs1.next()) {
							    		textField.setText(""+rs1.getInt(1));
										textField_1.setText(""+rs1.getInt(2));
										textField_2.setText(""+rs1.getInt(3));
										textField_3.setText(""+rs1.getInt(4));
										textField_4.setText(""+rs1.getInt(5));
										textField_5.setText(""+rs1.getInt(6));
										textField_6.setText(""+rs1.getInt(7));
										textField_7.setText(""+rs1.getInt(8));
										textField_8.setText(""+rs1.getInt(9));
										textField_9.setText(""+rs1.getInt(10));
										textField_10.setText(""+rs1.getInt(11));
										textField_11.setText(""+rs1.getInt(12));
										textField_12.setText(""+rs1.getInt(13));
										textField_13.setText(""+rs1.getInt(14));
										textField_15.setText(""+rs1.getInt(15));
										textField_16.setText(""+rs1.getInt(16));
										textField_17.setText(""+rs1.getInt(17));
										textField_18.setText(""+rs1.getInt(18));
										textField_19.setText(""+rs1.getInt(19));
										textField_20.setText(""+rs1.getInt(20));
							    	}
							    	else {
							    		JOptionPane.showMessageDialog(null, "Date Not Matched!.");
							    	}
							    }
							    //*************************************Show latest Sell Stock*******************************************//
							    else {
							    	ResultSet rs0=stmt.executeQuery("SELECT MAX(ID) FROM `sell_stock`;");
									if(rs0.next()) {
										max = rs0.getInt(1);
										
										ResultSet rs2=stmt.executeQuery("SELECT `opera_silk`, `potnoma_silk`, `laccha_buta_silk`, `plain_body_silk`, `taitanik_silk`, `bt_brocet_katan`, "
												+ "`three_pis_silk`, `jorjet_than`, `net_than`, `chinigurah_than`, `dupyain_than`, `varaities_than`, `ic_benaroshi_katan`, `ic_party_sharee`, "
												+ "`ic_pure_katan`, `ic_stone_katan`, `orna`, `others_item`, `lot_item`, `new_item` FROM `sell_stock` WHERE ID = '"+max+"';");
										if(rs2.next()) {
											textField.setText(""+rs2.getInt(1));
											textField_1.setText(""+rs2.getInt(2));
											textField_2.setText(""+rs2.getInt(3));
											textField_3.setText(""+rs2.getInt(4));
											textField_4.setText(""+rs2.getInt(5));
											textField_5.setText(""+rs2.getInt(6));
											textField_6.setText(""+rs2.getInt(7));
											textField_7.setText(""+rs2.getInt(8));
											textField_8.setText(""+rs2.getInt(9));
											textField_9.setText(""+rs2.getInt(10));
											textField_10.setText(""+rs2.getInt(11));
											textField_11.setText(""+rs2.getInt(12));
											textField_12.setText(""+rs2.getInt(13));
											textField_13.setText(""+rs2.getInt(14));
											textField_15.setText(""+rs2.getInt(15));
											textField_16.setText(""+rs2.getInt(16));
											textField_17.setText(""+rs2.getInt(17));
											textField_18.setText(""+rs2.getInt(18));
											textField_19.setText(""+rs2.getInt(19));
											textField_20.setText(""+rs2.getInt(20));
										}
									}
							    }
							}
							catch(Exception e1) {
								JOptionPane.showMessageDialog(null, "Sell Stock Stuck !.");
							}
						}
						catch(Exception e1) {
							JOptionPane.showMessageDialog(null, "Sell Stock Stuck.");
						}
					}
				});
				sellstock.setForeground(Color.WHITE);
				sellstock.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
				sellstock.setBorder(null);
				sellstock.setBackground(new Color(0, 204, 153));
				
				user_field = new JTextField();
				user_field.setBounds(664, 66, 210, 24);
				contentPane.add(user_field);
				user_field.setText(name_field);
				user_field.setHorizontalAlignment(SwingConstants.RIGHT);
				user_field.setForeground(new Color(255, 255, 255));
				user_field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
				user_field.setEditable(false);
				user_field.setColumns(10);
				user_field.setBorder(null);
				user_field.setBackground(new Color(51, 0, 102));
				
				JLabel label_17 = new JLabel("Opera Silk");
				label_17.setBounds(20, 185, 110, 24);
				contentPane.add(label_17);
				label_17.setHorizontalAlignment(SwingConstants.CENTER);
				label_17.setForeground(Color.WHITE);
				label_17.setFont(new Font("Arial", Font.PLAIN, 13));
				
				textField = new JTextField();
				textField.setBounds(20, 211, 110, 24);
				contentPane.add(textField);
				textField.setHorizontalAlignment(SwingConstants.CENTER);
				textField.setForeground(Color.WHITE);
				textField.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField.setEditable(false);
				textField.setColumns(10);
				textField.setBorder(null);
				textField.setBackground(new Color(0, 0, 128));
				
				JLabel label_4 = new JLabel("Jorjet Than");
				label_4.setBounds(20, 255, 110, 24);
				contentPane.add(label_4);
				label_4.setHorizontalAlignment(SwingConstants.CENTER);
				label_4.setForeground(Color.WHITE);
				label_4.setFont(new Font("Arial", Font.PLAIN, 12));
				
				textField_7 = new JTextField();
				textField_7.setBounds(20, 281, 110, 24);
				contentPane.add(textField_7);
				textField_7.setHorizontalAlignment(SwingConstants.CENTER);
				textField_7.setForeground(Color.WHITE);
				textField_7.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_7.setEditable(false);
				textField_7.setColumns(10);
				textField_7.setBorder(null);
				textField_7.setBackground(new Color(0, 0, 128));
				
				JLabel label_11 = new JLabel("IC Pure Katan");
				label_11.setBounds(20, 325, 110, 24);
				contentPane.add(label_11);
				label_11.setHorizontalAlignment(SwingConstants.CENTER);
				label_11.setForeground(Color.WHITE);
				label_11.setFont(new Font("Arial", Font.PLAIN, 12));
				
				textField_15 = new JTextField();
				textField_15.setBounds(20, 350, 110, 24);
				contentPane.add(textField_15);
				textField_15.setHorizontalAlignment(SwingConstants.CENTER);
				textField_15.setForeground(Color.WHITE);
				textField_15.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_15.setEditable(false);
				textField_15.setColumns(10);
				textField_15.setBorder(null);
				textField_15.setBackground(new Color(0, 0, 128));
				
				JButton back = new JButton("Back");
				back.setBounds(20, 393, 110, 24);
				contentPane.add(back);
				back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				back.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							Home frame = new Home(name_field);
							frame.setVisible(true);
							
							dispose();
						}
						catch(Exception e1) {
							e1.printStackTrace();
						}
					}
				});
				back.setForeground(Color.WHITE);
				back.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
				back.setBorder(null);
				back.setBackground(new Color(128, 0, 0));
				
				textField_16 = new JTextField();
				textField_16.setBounds(142, 350, 110, 24);
				contentPane.add(textField_16);
				textField_16.setHorizontalAlignment(SwingConstants.CENTER);
				textField_16.setForeground(Color.WHITE);
				textField_16.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_16.setEditable(false);
				textField_16.setColumns(10);
				textField_16.setBorder(null);
				textField_16.setBackground(new Color(0, 0, 128));
				
				JLabel label_12 = new JLabel("IC Stone Katan");
				label_12.setBounds(142, 326, 110, 24);
				contentPane.add(label_12);
				label_12.setHorizontalAlignment(SwingConstants.CENTER);
				label_12.setForeground(Color.WHITE);
				label_12.setFont(new Font("Arial", Font.PLAIN, 12));
				
				textField_8 = new JTextField();
				textField_8.setBounds(142, 281, 110, 24);
				contentPane.add(textField_8);
				textField_8.setHorizontalAlignment(SwingConstants.CENTER);
				textField_8.setForeground(Color.WHITE);
				textField_8.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_8.setEditable(false);
				textField_8.setColumns(10);
				textField_8.setBorder(null);
				textField_8.setBackground(new Color(0, 0, 128));
				
				JLabel label_5 = new JLabel("Net Than");
				label_5.setBounds(142, 256, 110, 24);
				contentPane.add(label_5);
				label_5.setHorizontalAlignment(SwingConstants.CENTER);
				label_5.setForeground(Color.WHITE);
				label_5.setFont(new Font("Arial", Font.PLAIN, 12));
				
				textField_1 = new JTextField();
				textField_1.setBounds(142, 211, 110, 24);
				contentPane.add(textField_1);
				textField_1.setHorizontalAlignment(SwingConstants.CENTER);
				textField_1.setForeground(Color.WHITE);
				textField_1.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_1.setEditable(false);
				textField_1.setColumns(10);
				textField_1.setBorder(null);
				textField_1.setBackground(new Color(0, 0, 128));
				
				JLabel label_18 = new JLabel("Potnoma Silk");
				label_18.setBounds(142, 185, 110, 24);
				contentPane.add(label_18);
				label_18.setHorizontalAlignment(SwingConstants.CENTER);
				label_18.setForeground(Color.WHITE);
				label_18.setFont(new Font("Arial", Font.PLAIN, 13));
				
				JLabel label_19 = new JLabel("Laccha Buta Silk");
				label_19.setBounds(274, 185, 110, 24);
				contentPane.add(label_19);
				label_19.setHorizontalAlignment(SwingConstants.CENTER);
				label_19.setForeground(Color.WHITE);
				label_19.setFont(new Font("Arial", Font.PLAIN, 13));
				
				textField_2 = new JTextField();
				textField_2.setBounds(274, 211, 110, 24);
				contentPane.add(textField_2);
				textField_2.setHorizontalAlignment(SwingConstants.CENTER);
				textField_2.setForeground(Color.WHITE);
				textField_2.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_2.setEditable(false);
				textField_2.setColumns(10);
				textField_2.setBorder(null);
				textField_2.setBackground(new Color(0, 0, 128));
				
				JLabel label_6 = new JLabel("Chinigurah Than");
				label_6.setBounds(274, 255, 110, 24);
				contentPane.add(label_6);
				label_6.setHorizontalAlignment(SwingConstants.CENTER);
				label_6.setForeground(Color.WHITE);
				label_6.setFont(new Font("Arial", Font.PLAIN, 12));
				
				textField_9 = new JTextField();
				textField_9.setBounds(274, 281, 110, 24);
				contentPane.add(textField_9);
				textField_9.setHorizontalAlignment(SwingConstants.CENTER);
				textField_9.setForeground(Color.WHITE);
				textField_9.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_9.setEditable(false);
				textField_9.setColumns(10);
				textField_9.setBorder(null);
				textField_9.setBackground(new Color(0, 0, 128));
				
				JLabel label_13 = new JLabel("Orna");
				label_13.setBounds(274, 325, 110, 24);
				contentPane.add(label_13);
				label_13.setHorizontalAlignment(SwingConstants.CENTER);
				label_13.setForeground(Color.WHITE);
				label_13.setFont(new Font("Arial", Font.PLAIN, 12));
				
				textField_17 = new JTextField();
				textField_17.setBounds(274, 350, 110, 24);
				contentPane.add(textField_17);
				textField_17.setHorizontalAlignment(SwingConstants.CENTER);
				textField_17.setForeground(Color.WHITE);
				textField_17.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_17.setEditable(false);
				textField_17.setColumns(10);
				textField_17.setBorder(null);
				textField_17.setBackground(new Color(0, 0, 128));
				
				textField_18 = new JTextField();
				textField_18.setBounds(394, 350, 110, 24);
				contentPane.add(textField_18);
				textField_18.setHorizontalAlignment(SwingConstants.CENTER);
				textField_18.setForeground(Color.WHITE);
				textField_18.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_18.setEditable(false);
				textField_18.setColumns(10);
				textField_18.setBorder(null);
				textField_18.setBackground(new Color(0, 0, 128));
				
				date_field = new JTextField();
				DateFormat dateFormat = new SimpleDateFormat("dd / MM / yyyy");
				Date date = new Date();
				date_field.setText("Today: "+dateFormat.format(date));
				date_field.setBounds(354, 393, 174, 24);
				contentPane.add(date_field);
				date_field.setHorizontalAlignment(SwingConstants.CENTER);
				date_field.setForeground(Color.WHITE);
				date_field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
				date_field.setEditable(false);
				date_field.setColumns(10);
				date_field.setBorder(null);
				date_field.setBackground(new Color(51, 0, 102));
				
				textField_10 = new JTextField();
				textField_10.setBounds(394, 281, 110, 24);
				contentPane.add(textField_10);
				textField_10.setHorizontalAlignment(SwingConstants.CENTER);
				textField_10.setForeground(Color.WHITE);
				textField_10.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_10.setEditable(false);
				textField_10.setColumns(10);
				textField_10.setBorder(null);
				textField_10.setBackground(new Color(0, 0, 128));
				
				JLabel label_14 = new JLabel("Others Item");
				label_14.setBounds(394, 325, 110, 24);
				contentPane.add(label_14);
				label_14.setHorizontalAlignment(SwingConstants.CENTER);
				label_14.setForeground(Color.WHITE);
				label_14.setFont(new Font("Arial", Font.PLAIN, 12));
				
				JLabel label_7 = new JLabel("Dupyain Than");
				label_7.setBounds(394, 255, 110, 24);
				contentPane.add(label_7);
				label_7.setHorizontalAlignment(SwingConstants.CENTER);
				label_7.setForeground(Color.WHITE);
				label_7.setFont(new Font("Arial", Font.PLAIN, 12));
				
				JLabel label_20 = new JLabel("Plain Body Silk");
				label_20.setBounds(395, 185, 109, 24);
				contentPane.add(label_20);
				label_20.setHorizontalAlignment(SwingConstants.CENTER);
				label_20.setForeground(Color.WHITE);
				label_20.setFont(new Font("Arial", Font.PLAIN, 13));
				
				textField_3 = new JTextField();
				textField_3.setBounds(394, 211, 110, 24);
				contentPane.add(textField_3);
				textField_3.setHorizontalAlignment(SwingConstants.CENTER);
				textField_3.setForeground(Color.WHITE);
				textField_3.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_3.setEditable(false);
				textField_3.setColumns(10);
				textField_3.setBorder(null);
				textField_3.setBackground(new Color(0, 0, 128));
				
				textField_4 = new JTextField();
				textField_4.setBounds(514, 211, 110, 24);
				contentPane.add(textField_4);
				textField_4.setHorizontalAlignment(SwingConstants.CENTER);
				textField_4.setForeground(Color.WHITE);
				textField_4.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_4.setEditable(false);
				textField_4.setColumns(10);
				textField_4.setBorder(null);
				textField_4.setBackground(new Color(0, 0, 128));
				
				JLabel label_21 = new JLabel("Taitanik Silk");
				label_21.setBounds(515, 186, 109, 24);
				contentPane.add(label_21);
				label_21.setHorizontalAlignment(SwingConstants.CENTER);
				label_21.setForeground(Color.WHITE);
				label_21.setFont(new Font("Arial", Font.PLAIN, 13));
				
				JLabel label_8 = new JLabel("Varaities Than");
				label_8.setBounds(514, 255, 110, 24);
				contentPane.add(label_8);
				label_8.setHorizontalAlignment(SwingConstants.CENTER);
				label_8.setForeground(Color.WHITE);
				label_8.setFont(new Font("Arial", Font.PLAIN, 12));
				
				textField_11 = new JTextField();
				textField_11.setBounds(514, 281, 110, 24);
				contentPane.add(textField_11);
				textField_11.setHorizontalAlignment(SwingConstants.CENTER);
				textField_11.setForeground(Color.WHITE);
				textField_11.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_11.setEditable(false);
				textField_11.setColumns(10);
				textField_11.setBorder(null);
				textField_11.setBackground(new Color(0, 0, 128));
				
				JLabel label_15 = new JLabel("Lot Item");
				label_15.setBounds(514, 325, 110, 24);
				contentPane.add(label_15);
				label_15.setHorizontalAlignment(SwingConstants.CENTER);
				label_15.setForeground(Color.WHITE);
				label_15.setFont(new Font("Arial", Font.PLAIN, 12));
				
				textField_19 = new JTextField();
				textField_19.setBounds(514, 350, 110, 24);
				contentPane.add(textField_19);
				textField_19.setHorizontalAlignment(SwingConstants.CENTER);
				textField_19.setForeground(Color.WHITE);
				textField_19.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_19.setEditable(false);
				textField_19.setColumns(10);
				textField_19.setBorder(null);
				textField_19.setBackground(new Color(0, 0, 128));
				
				textField_20 = new JTextField();
				textField_20.setBounds(634, 350, 110, 24);
				contentPane.add(textField_20);
				textField_20.setHorizontalAlignment(SwingConstants.CENTER);
				textField_20.setForeground(Color.WHITE);
				textField_20.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_20.setEditable(false);
				textField_20.setColumns(10);
				textField_20.setBorder(null);
				textField_20.setBackground(new Color(0, 0, 128));
				
				JLabel label_16 = new JLabel("New Item");
				label_16.setBounds(634, 325, 110, 24);
				contentPane.add(label_16);
				label_16.setHorizontalAlignment(SwingConstants.CENTER);
				label_16.setForeground(Color.WHITE);
				label_16.setFont(new Font("Arial", Font.PLAIN, 12));
				
				textField_12 = new JTextField();
				textField_12.setBounds(634, 281, 110, 24);
				contentPane.add(textField_12);
				textField_12.setHorizontalAlignment(SwingConstants.CENTER);
				textField_12.setForeground(Color.WHITE);
				textField_12.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_12.setEditable(false);
				textField_12.setColumns(10);
				textField_12.setBorder(null);
				textField_12.setBackground(new Color(0, 0, 128));
				
				JLabel label_9 = new JLabel("IC Benaroshi Katan");
				label_9.setBounds(634, 256, 110, 24);
				contentPane.add(label_9);
				label_9.setHorizontalAlignment(SwingConstants.CENTER);
				label_9.setForeground(Color.WHITE);
				label_9.setFont(new Font("Arial", Font.PLAIN, 11));
				
				textField_5 = new JTextField();
				textField_5.setBounds(634, 211, 110, 24);
				contentPane.add(textField_5);
				textField_5.setHorizontalAlignment(SwingConstants.CENTER);
				textField_5.setForeground(Color.WHITE);
				textField_5.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_5.setEditable(false);
				textField_5.setColumns(10);
				textField_5.setBorder(null);
				textField_5.setBackground(new Color(0, 0, 128));
				
				JLabel label_22 = new JLabel("BT Brocet Katan");
				label_22.setBounds(634, 186, 110, 24);
				contentPane.add(label_22);
				label_22.setHorizontalAlignment(SwingConstants.CENTER);
				label_22.setForeground(Color.WHITE);
				label_22.setFont(new Font("Arial", Font.PLAIN, 13));
				
				JLabel label_23 = new JLabel("3Pis Silk");
				label_23.setBounds(754, 185, 110, 24);
				contentPane.add(label_23);
				label_23.setHorizontalAlignment(SwingConstants.CENTER);
				label_23.setForeground(Color.WHITE);
				label_23.setFont(new Font("Arial", Font.PLAIN, 13));
				
				textField_6 = new JTextField();
				textField_6.setBounds(754, 211, 110, 24);
				contentPane.add(textField_6);
				textField_6.setHorizontalAlignment(SwingConstants.CENTER);
				textField_6.setForeground(Color.WHITE);
				textField_6.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_6.setEditable(false);
				textField_6.setColumns(10);
				textField_6.setBorder(null);
				textField_6.setBackground(new Color(0, 0, 128));
				
				JLabel label_10 = new JLabel("IC Party Sharee");
				label_10.setBounds(754, 256, 110, 24);
				contentPane.add(label_10);
				label_10.setHorizontalAlignment(SwingConstants.CENTER);
				label_10.setForeground(Color.WHITE);
				label_10.setFont(new Font("Arial", Font.PLAIN, 12));
				
				textField_13 = new JTextField();
				textField_13.setBounds(754, 281, 110, 24);
				contentPane.add(textField_13);
				textField_13.setHorizontalAlignment(SwingConstants.CENTER);
				textField_13.setForeground(Color.WHITE);
				textField_13.setFont(new Font("Calisto MT", Font.PLAIN, 15));
				textField_13.setEditable(false);
				textField_13.setColumns(10);
				textField_13.setBorder(null);
				textField_13.setBackground(new Color(0, 0, 128));
				
				JButton clear = new JButton("Clear");
				clear.setBounds(763, 393, 101, 24);
				contentPane.add(clear);
				clear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				clear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							dateChooser.setDate(null);

							textField.setText(null);
							textField_1.setText(null);
							textField_2.setText(null);
							textField_3.setText(null);
							textField_4.setText(null);
							textField_5.setText(null);
							textField_6.setText(null);
							textField_7.setText(null);
							textField_8.setText(null);
							textField_9.setText(null);
							textField_10.setText(null);
							textField_11.setText(null);
							textField_12.setText(null);
							textField_13.setText(null);
							textField_15.setText(null);
							textField_16.setText(null);
							textField_17.setText(null);
							textField_18.setText(null);
							textField_19.setText(null);
							textField_20.setText(null);
						}
						catch(Exception e1) {
							JOptionPane.showMessageDialog(null, "Cannot clean."+e1);
						}
					}
				});
				clear.setForeground(Color.WHITE);
				clear.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 15));
				clear.setBorder(null);
				clear.setBackground(new Color(139, 0, 0));
				
				JSeparator separator = new JSeparator();
				separator.setBounds(282, 53, 316, 2);
				contentPane.add(separator);
	}
}
