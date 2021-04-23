package version1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;
import java.awt.Toolkit;
import javax.swing.JSeparator;

public class Buy extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameField;
	private JTextField takaField7;
	private JTextField takaField6;
	private JTextField takaField5;
	private JTextField takaField4;
	private JTextField takaField3;
	private JTextField takaField2;
	private JTextField takaField1;
	private JTextField pieceField1;
	private JTextField pieceField2;
	private JTextField pieceField3;
	private JTextField pieceField4;
	private JTextField pieceField5;
	private JTextField pieceField6;
	private JTextField pieceField7;
	private JTextField total_taka_Field;
	private JTextField due_taka_Field;
	private JTextField paid_taka_Field;
	private JTextField user_field;
	private JTextField address_Field;
	private JTextField discount_taka_Field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buy frame = new Buy("Nuhin");
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
	public Buy(String user_name) {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Buy.class.getResource("/version1/logomaker.png")));
		setTitle("Buy");
		String item[]={"Select", "Opera Silk", "Potnoma Silk", "Laccha Buta Silk", "Plain Body Silk", "Taitanik Silk", "BT Brocet Katan", "Three Pis Silk", 
				"Jorjet Than", "Net Than", "Chinigurah Than", "Dupyain Than", "Varaities Than", "IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna", "Others Item", "Lot Item"};
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 200, 835, 530);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 0, 102));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Fatema Silk House");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
		label.setBounds(5, 5, 814, 50);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Md.Nuruzzaman \u00A92021");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial", Font.PLAIN, 10));
		label_1.setBounds(5, 457, 814, 23);
		contentPane.add(label_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setBorder(null);
		dateChooser.getCalendarButton().setHorizontalTextPosition(SwingConstants.CENTER);
		dateChooser.getCalendarButton().setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		dateChooser.setBounds(53, 101, 110, 25);
		contentPane.add(dateChooser);
		
		JLabel label_2 = new JLabel("Date");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		label_2.setBounds(53, 76, 110, 25);
		contentPane.add(label_2);
		
		nameField = new JTextField();
		nameField.setHorizontalAlignment(SwingConstants.CENTER);
		nameField.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		nameField.setColumns(10);
		nameField.setBorder(null);
		nameField.setBounds(173, 101, 250, 25);
		contentPane.add(nameField);
		
		JLabel label_3 = new JLabel("Name");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		label_3.setBounds(173, 76, 250, 25);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Item");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		label_4.setBounds(53, 143, 200, 25);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Taka");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		label_5.setBounds(373, 143, 100, 25);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Piece");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		label_6.setBounds(263, 143, 100, 25);
		contentPane.add(label_6);
		
		JComboBox<Object> comboBox_0 = new JComboBox<Object>(item);
		comboBox_0.setForeground(Color.BLACK);
		comboBox_0.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_0.setBorder(null);
		comboBox_0.setBackground(Color.WHITE);
		comboBox_0.setBounds(53, 173, 200, 25);
		contentPane.add(comboBox_0);
		
		JComboBox<Object> comboBox_1 = new JComboBox<Object>();
		comboBox_1.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "Potnoma Silk", "Laccha Buta Silk", "Plain Body Silk", "Taitanik Silk", "BT Brocet Katan", "Three Pis Silk",
				"Jorjet Than", "Net Than", "Chinigurah Than", "Dupyain Than", "Varaities Than", "IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna",
				"Others Item", "Lot Item"}));
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_1.setBorder(null);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(53, 209, 200, 25);
		contentPane.add(comboBox_1);
		
		JComboBox<Object> comboBox_2 = new JComboBox<Object>();
		comboBox_2.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "Laccha Buta Silk", "Plain Body Silk", "Taitanik Silk", "BT Brocet Katan", "Three Pis Silk", "Jorjet Than",
				"Net Than", "Chinigurah Than", "Dupyain Than", "Varaities Than", "IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna", "Others Item", "Lot Item"}));
		comboBox_2.setForeground(Color.BLACK);
		comboBox_2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_2.setBorder(null);
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(53, 245, 200, 25);
		contentPane.add(comboBox_2);
		
		JComboBox<Object> comboBox_3 = new JComboBox<Object>();
		comboBox_3.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "Plain Body Silk", "Taitanik Silk", "BT Brocet Katan", "Three Pis Silk", "Jorjet Than", "Net Than",
				"Chinigurah Than", "Dupyain Than", "Varaities Than", "IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna", "Others Item", "Lot Item"}));
		comboBox_3.setForeground(Color.BLACK);
		comboBox_3.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_3.setBorder(null);
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setBounds(53, 281, 200, 25);
		contentPane.add(comboBox_3);
		
		JComboBox<Object> comboBox_4 = new JComboBox<Object>();
		comboBox_4.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "Taitanik Silk", "BT Brocet Katan", "Three Pis Silk", "Jorjet Than", "Net Than", "Chinigurah Than",
				"Dupyain Than", "Varaities Than", "IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna", "Others Item", "Lot Item"}));
		comboBox_4.setForeground(Color.BLACK);
		comboBox_4.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_4.setBorder(null);
		comboBox_4.setBackground(Color.WHITE);
		comboBox_4.setBounds(53, 317, 200, 25);
		contentPane.add(comboBox_4);
		
		JComboBox<Object> comboBox_5 = new JComboBox<Object>();
		comboBox_5.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "BT Brocet Katan", "Three Pis Silk", "Jorjet Than", "Net Than", "Chinigurah Than", "Dupyain Than", 
				"Varaities Than", "IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna", "Others Item", "Lot Item"}));
		comboBox_5.setForeground(Color.BLACK);
		comboBox_5.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_5.setBorder(null);
		comboBox_5.setBackground(Color.WHITE);
		comboBox_5.setBounds(53, 353, 200, 25);
		contentPane.add(comboBox_5);
		
		JComboBox<Object> comboBox_6 = new JComboBox<Object>();
		comboBox_6.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "Three Pis Silk", "Jorjet Than", "Net Than", "Chinigurah Than", "Dupyain Than", "Varaities Than",
				"IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna", "Others Item", "Lot Item"}));
		comboBox_6.setForeground(Color.BLACK);
		comboBox_6.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_6.setBorder(null);
		comboBox_6.setBackground(Color.WHITE);
		comboBox_6.setBounds(53, 389, 200, 25);
		contentPane.add(comboBox_6);
		
		takaField7 = new JTextField();
		takaField7.setHorizontalAlignment(SwingConstants.CENTER);
		takaField7.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField7.setColumns(10);
		takaField7.setBorder(null);
		takaField7.setBounds(373, 389, 100, 25);
		contentPane.add(takaField7);
		
		takaField6 = new JTextField();
		takaField6.setHorizontalAlignment(SwingConstants.CENTER);
		takaField6.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField6.setColumns(10);
		takaField6.setBorder(null);
		takaField6.setBounds(373, 353, 100, 25);
		contentPane.add(takaField6);
		
		takaField5 = new JTextField();
		takaField5.setHorizontalAlignment(SwingConstants.CENTER);
		takaField5.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField5.setColumns(10);
		takaField5.setBorder(null);
		takaField5.setBounds(373, 317, 100, 25);
		contentPane.add(takaField5);
		
		takaField4 = new JTextField();
		takaField4.setHorizontalAlignment(SwingConstants.CENTER);
		takaField4.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField4.setColumns(10);
		takaField4.setBorder(null);
		takaField4.setBounds(373, 281, 100, 25);
		contentPane.add(takaField4);
		
		takaField3 = new JTextField();
		takaField3.setHorizontalAlignment(SwingConstants.CENTER);
		takaField3.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField3.setColumns(10);
		takaField3.setBorder(null);
		takaField3.setBounds(373, 245, 100, 25);
		contentPane.add(takaField3);
		
		takaField2 = new JTextField();
		takaField2.setHorizontalAlignment(SwingConstants.CENTER);
		takaField2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField2.setColumns(10);
		takaField2.setBorder(null);
		takaField2.setBounds(373, 209, 100, 25);
		contentPane.add(takaField2);
		
		takaField1 = new JTextField();
		takaField1.setHorizontalAlignment(SwingConstants.CENTER);
		takaField1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField1.setColumns(10);
		takaField1.setBorder(null);
		takaField1.setBounds(373, 173, 100, 25);
		contentPane.add(takaField1);
		
		pieceField1 = new JTextField();
		pieceField1.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField1.setColumns(10);
		pieceField1.setBorder(null);
		pieceField1.setBounds(263, 173, 100, 25);
		contentPane.add(pieceField1);
		
		pieceField2 = new JTextField();
		pieceField2.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField2.setColumns(10);
		pieceField2.setBorder(null);
		pieceField2.setBounds(263, 209, 100, 25);
		contentPane.add(pieceField2);
		
		pieceField3 = new JTextField();
		pieceField3.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField3.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField3.setColumns(10);
		pieceField3.setBorder(null);
		pieceField3.setBounds(263, 245, 100, 25);
		contentPane.add(pieceField3);
		
		pieceField4 = new JTextField();
		pieceField4.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField4.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField4.setColumns(10);
		pieceField4.setBorder(null);
		pieceField4.setBounds(263, 281, 100, 25);
		contentPane.add(pieceField4);
		
		pieceField5 = new JTextField();
		pieceField5.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField5.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField5.setColumns(10);
		pieceField5.setBorder(null);
		pieceField5.setBounds(263, 317, 100, 25);
		contentPane.add(pieceField5);
		
		pieceField6 = new JTextField();
		pieceField6.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField6.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField6.setColumns(10);
		pieceField6.setBorder(null);
		pieceField6.setBounds(263, 353, 100, 25);
		contentPane.add(pieceField6);
		
		pieceField7 = new JTextField();
		pieceField7.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField7.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField7.setColumns(10);
		pieceField7.setBorder(null);
		pieceField7.setBounds(263, 389, 100, 25);
		contentPane.add(pieceField7);
		
		JLabel label_7 = new JLabel("Total");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		label_7.setBounds(646, 143, 129, 25);
		contentPane.add(label_7);
		
		total_taka_Field = new JTextField();
		total_taka_Field.setForeground(Color.BLACK);
		total_taka_Field.setBackground(new Color(255, 255, 255));
		total_taka_Field.setHorizontalAlignment(SwingConstants.CENTER);
		total_taka_Field.setFont(new Font("Arial", Font.PLAIN, 15));
		total_taka_Field.setEditable(false);
		total_taka_Field.setColumns(10);
		total_taka_Field.setBorder(null);
		total_taka_Field.setBounds(646, 169, 129, 30);
		contentPane.add(total_taka_Field);
		
		JLabel label_8 = new JLabel("Due");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		label_8.setBounds(648, 209, 127, 25);
		contentPane.add(label_8);
		
		due_taka_Field = new JTextField();
		due_taka_Field.setForeground(Color.BLACK);
		due_taka_Field.setBackground(new Color(255, 255, 255));
		due_taka_Field.setEditable(false);
		due_taka_Field.setHorizontalAlignment(SwingConstants.CENTER);
		due_taka_Field.setFont(new Font("Arial", Font.PLAIN, 15));
		due_taka_Field.setColumns(10);
		due_taka_Field.setBorder(null);
		due_taka_Field.setBounds(648, 234, 127, 30);
		contentPane.add(due_taka_Field);
		
		JLabel label_9 = new JLabel("Paid");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		label_9.setBounds(646, 341, 129, 25);
		contentPane.add(label_9);
		
		paid_taka_Field = new JTextField();
		paid_taka_Field.setForeground(Color.BLACK);
		paid_taka_Field.setBackground(new Color(255, 255, 255));
		paid_taka_Field.setHorizontalAlignment(SwingConstants.CENTER);
		paid_taka_Field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		paid_taka_Field.setColumns(10);
		paid_taka_Field.setBorder(null);
		paid_taka_Field.setBounds(648, 367, 129, 30);
		contentPane.add(paid_taka_Field);
		
		JButton submit = new JButton("Submit");
		submit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
					
					String date = d.format(dateChooser.getDate());
					
					String name = nameField.getText();
					String address = address_Field.getText();
					
					String item0 = comboBox_0.getSelectedItem().toString().toLowerCase().replaceAll(" ", "_");
					String item1 = comboBox_1.getSelectedItem().toString().toLowerCase().replaceAll(" ", "_");
					String item2 = comboBox_2.getSelectedItem().toString().toLowerCase().replaceAll(" ", "_");
					String item3 = comboBox_3.getSelectedItem().toString().toLowerCase().replaceAll(" ", "_");
					String item4 = comboBox_4.getSelectedItem().toString().toLowerCase().replaceAll(" ", "_");
					String item5 = comboBox_5.getSelectedItem().toString().toLowerCase().replaceAll(" ", "_");
					String item6 = comboBox_6.getSelectedItem().toString().toLowerCase().replaceAll(" ", "_");

					String taka1 = takaField1.getText();
					String taka2 = takaField2.getText();
					String taka3 = takaField3.getText();
					String taka4 = takaField4.getText();
					String taka5 = takaField5.getText();
					String taka6 = takaField6.getText();
					String taka7 = takaField7.getText();
					
					String piece1 = pieceField1.getText();
					String piece2 = pieceField2.getText();
					String piece3 = pieceField3.getText();
					String piece4 = pieceField4.getText();
					String piece5 = pieceField5.getText();
					String piece6 = pieceField6.getText();
					String piece7 = pieceField7.getText();
					
					int opera_silk = 0;
					int potnoma_silk = 0;
					int laccha_buta_silk = 0;
					int plain_body_silk = 0;

					int taitanik_silk = 0;
					int bt_brocet_katan = 0;
					int three_pis_silk = 0;
					int jorjet_than = 0;

					int net_than = 0;
					int chinigurah_than = 0;
					int dupyain_than = 0;
					int varaities_than = 0;

					int ic_benaroshi_katan = 0;
					int ic_party_sharee = 0;
					int ic_pure_katan = 0;
					int ic_stone_katan = 0;

					int orna = 0;
					int others_item = 0;
					int lot_item = 0;
					int new_item = 0;
					
					//int buy_total = 0;
					//int sell_total = 0;
					
					int max = 0;
					Date max_date = null;
					
					int due_taka = 0;
					
					if(discount_taka_Field.getText().equals("")) {
						discount_taka_Field.setText(""+0);
					}
					int discount_taka = Integer.parseInt(discount_taka_Field.getText());
					
					String paid_taka = paid_taka_Field.getText();

					if(!name.equals("") && !address.equals("")) {
						//JOptionPane.showMessageDialog(null, "worked.");
						int total_taka = 0;
						//JOptionPane.showMessageDialog(null, "int neowa jabe na");
						if(!takaField1.getText().equals("") && !pieceField1.getText().equals("")) {
							total_taka += Integer.parseInt(takaField1.getText()) * Integer.parseInt(pieceField1.getText());
							
							if(!takaField2.getText().equals("") && !pieceField2.getText().equals("")) {
								total_taka += Integer.parseInt(takaField2.getText()) * Integer.parseInt(pieceField2.getText());
								
								if(!takaField3.getText().equals("") && !pieceField3.getText().equals("")) {
									total_taka += Integer.parseInt(takaField3.getText()) * Integer.parseInt(pieceField3.getText());
									
									if(!takaField4.getText().equals("") && !pieceField4.getText().equals("")) {
										total_taka += Integer.parseInt(takaField4.getText()) * Integer.parseInt(pieceField4.getText());
										
										if(!takaField5.getText().equals("") && !pieceField5.getText().equals("")) {
											total_taka += Integer.parseInt(takaField5.getText()) * Integer.parseInt(pieceField5.getText());
											
											if(!takaField6.getText().equals("") && !pieceField6.getText().equals("")) {
												total_taka += Integer.parseInt(takaField6.getText()) * Integer.parseInt(pieceField6.getText());
												
												if(!takaField7.getText().equals("") && !pieceField7.getText().equals("")) {
													total_taka += Integer.parseInt(takaField7.getText()) * Integer.parseInt(pieceField7.getText());
												}
											}
										}
									}
								}
							}
						}
						
						if(discount_taka_Field.getText().equals("")) {
							total_taka_Field.setText(""+total_taka);
							due_taka_Field.setText(""+total_taka);
						}
						else {
							total_taka -= discount_taka;
							total_taka_Field.setText(""+total_taka);
							due_taka_Field.setText(""+total_taka);
						}
						
						if(paid_taka_Field.getText().equals("")) {
							paid_taka_Field.setText(""+0);
						}
						
						due_taka = total_taka - Integer.parseInt(paid_taka_Field.getText());
						due_taka_Field.setText(""+due_taka);
						
						
						//********************************************Check selected item***********************************************//
						
						if(!item0.equals("select")) {
							if(taka1.equals("") || piece1.equals("")) {
								JOptionPane.showMessageDialog(null, "Selected item can not be empty.");
							}
						}
						else {
							JOptionPane.showMessageDialog(null, "Not Selected.");
						}

						//*****************************************Write into database*****************************************************//
						try {
							//fatema_silk_house stable connection
							Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
							
							String url = "jdbc:ucanaccess://H://Fatema Silk House.accdb";
							Connection con=DriverManager.getConnection(url);

							Statement stmt=con.createStatement();  
							
							//*************************************Write into buy_item_all/tk and buy_stock************************************************//
							
							ResultSet rs0=stmt.executeQuery("SELECT * FROM `buy_stock` WHERE date = '"+date+"'");
							if(!rs0.next()) {//date is not matched so insert
								
								if(!item0.equals("select") && !piece1.equals("") && !taka1.equals("") /*&& !paid_taka.equals("")*/) {
									if(!item1.equals("select") && !piece2.equals("") && !taka2.equals("")) {
										if(!item2.equals("select") && !piece3.equals("") && !taka3.equals("")) {
											if(!item3.equals("select") && !piece4.equals("") && !taka4.equals("")) {
												if(!item4.equals("select") && !piece5.equals("") && !taka5.equals("")) {
													if(!item5.equals("select") && !piece6.equals("") && !taka6.equals("")) {
														if(!item6.equals("select") && !piece7.equals("") && !taka7.equals("")) {
															PreparedStatement ps0 = con.prepareStatement("INSERT INTO `buy_item_all`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `"+item6+"`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																	+ "'"+piece5+"', '"+piece6+"', '"+piece7+"')");
															ps0.executeUpdate();
															
															PreparedStatement ps1 = con.prepareStatement("INSERT INTO `buy_item_all_tk`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `"+item6+"`, `due`, `paid`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"',"
																	+ "'"+taka5+"', '"+taka6+"', '"+taka7+"', '"+due_taka+"', '"+paid_taka+"')");
															ps1.executeUpdate();
															
															PreparedStatement ps2 = con.prepareStatement("INSERT INTO `buy_stock`(`date`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `"+item6+"`) VALUES ('"+date+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																	+ "'"+piece5+"', '"+piece6+"', '"+piece7+"')");
															ps2.executeUpdate();	
														}
														else {
															PreparedStatement ps0 = con.prepareStatement("INSERT INTO `buy_item_all`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																	+ "'"+piece5+"', '"+piece6+"')");
															ps0.executeUpdate();
															
															PreparedStatement ps1 = con.prepareStatement("INSERT INTO `buy_item_all_tk`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `due`, `paid`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"',"
																	+ "'"+taka5+"', '"+taka6+"', '"+due_taka+"', '"+paid_taka+"')");
															ps1.executeUpdate();
															
															PreparedStatement ps2 = con.prepareStatement("INSERT INTO `buy_stock`(`date`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`) VALUES ('"+date+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																	+ "'"+piece5+"', '"+piece6+"')");
															ps2.executeUpdate();
														}
													}
													else {
														PreparedStatement ps0 = con.prepareStatement("INSERT INTO `buy_item_all`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																+ " `"+item4+"`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																+ "'"+piece5+"')");
														ps0.executeUpdate();
														
														PreparedStatement ps1 = con.prepareStatement("INSERT INTO `buy_item_all_tk`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																+ " `"+item4+"`, `due`, `paid`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"',"
																+ "'"+taka5+"', '"+due_taka+"', '"+paid_taka+"')");
														ps1.executeUpdate();
														
														PreparedStatement ps2 = con.prepareStatement("INSERT INTO `buy_stock`(`date`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																+ " `"+item4+"`) VALUES ('"+date+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																+ "'"+piece5+"')");
														ps2.executeUpdate();
													}
												}
												else {
													PreparedStatement ps0 = con.prepareStatement("INSERT INTO `buy_item_all`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`) "
															+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"')");
													ps0.executeUpdate();
													
													PreparedStatement ps1 = con.prepareStatement("INSERT INTO `buy_item_all_tk`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`, `due`, `paid`) "
															+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"', '"+due_taka+"', '"+paid_taka+"')");
													ps1.executeUpdate();
													
													PreparedStatement ps2 = con.prepareStatement("INSERT INTO `buy_stock`(`date`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`) "
															+ "VALUES ('"+date+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"')");
													ps2.executeUpdate();
												}
											}
											else {
												PreparedStatement ps0 = con.prepareStatement("INSERT INTO `buy_item_all`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`) "
														+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+piece1+"', '"+piece2+"', '"+piece3+"')");
												ps0.executeUpdate();
												
												PreparedStatement ps1 = con.prepareStatement("INSERT INTO `buy_item_all_tk`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `due`, `paid`) "
														+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+due_taka+"', '"+paid_taka+"')");
												ps1.executeUpdate();
												
												PreparedStatement ps2 = con.prepareStatement("INSERT INTO `buy_stock`(`date`, `"+item0+"`, `"+item1+"`, `"+item2+"`) "
														+ "VALUES ('"+date+"', '"+piece1+"', '"+piece2+"', '"+piece3+"')");
												ps2.executeUpdate();
											}
										}
										else {
											PreparedStatement ps0 = con.prepareStatement("INSERT INTO `buy_item_all`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`) "
													+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+piece1+"', '"+piece2+"')");
											ps0.executeUpdate();
											
											PreparedStatement ps1 = con.prepareStatement("INSERT INTO `buy_item_all_tk`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `due`, `paid`) "
													+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+taka1+"', '"+taka2+"', '"+due_taka+"', '"+paid_taka+"')");
											ps1.executeUpdate();
											
											PreparedStatement ps2 = con.prepareStatement("INSERT INTO `buy_stock`(`date`, `"+item0+"`, `"+item1+"`) "
													+ "VALUES ('"+date+"', '"+piece1+"', '"+piece2+"')");
											ps2.executeUpdate();
										}
									}
									else {
										PreparedStatement ps0 = con.prepareStatement("INSERT INTO `buy_item_all`(`date`, `name`, `address`, `"+item0+"`) "
												+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+piece1+"')");
										ps0.executeUpdate();
										
										PreparedStatement ps1 = con.prepareStatement("INSERT INTO `buy_item_all_tk`(`date`, `name`, `address`, `"+item0+"`, `due`, `paid`) "
												+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+taka1+"', '"+due_taka+"', '"+paid_taka+"')");
										ps1.executeUpdate();
										
										PreparedStatement ps2 = con.prepareStatement("INSERT INTO `buy_stock`(`date`, `"+item0+"`) "
												+ "VALUES ('"+date+"', '"+piece1+"')");
										ps2.executeUpdate();
									}
								}
							}
							else {//date is matched so update
								
								if(!item0.equals("select") && !piece1.equals("") && !taka1.equals("") /*&& !paid_taka.equals("")*/) {
									if(!item1.equals("select") && !piece2.equals("") && !taka2.equals("")) {
										if(!item2.equals("select") && !piece3.equals("") && !taka3.equals("")) {
											if(!item3.equals("select") && !piece4.equals("") && !taka4.equals("")) {
												if(!item4.equals("select") && !piece5.equals("") && !taka5.equals("")) {
													if(!item5.equals("select") && !piece6.equals("") && !taka6.equals("")) {
														if(!item6.equals("select") && !piece7.equals("") && !taka7.equals("")) {
															PreparedStatement ps0 = con.prepareStatement("INSERT INTO `buy_item_all`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `"+item6+"`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																	+ "'"+piece5+"', '"+piece6+"', '"+piece7+"')");
															ps0.executeUpdate();
															
															PreparedStatement ps1 = con.prepareStatement("INSERT INTO `buy_item_all_tk`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `"+item6+"`, `due`, `paid`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"',"
																	+ "'"+taka5+"', '"+taka6+"', '"+taka7+"', '"+due_taka+"', '"+paid_taka+"')");
															ps1.executeUpdate();
														}
														else {
															PreparedStatement ps0 = con.prepareStatement("INSERT INTO `buy_item_all`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																	+ "'"+piece5+"', '"+piece6+"')");
															ps0.executeUpdate();
															
															PreparedStatement ps1 = con.prepareStatement("INSERT INTO `buy_item_all_tk`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `due`, `paid`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"',"
																	+ "'"+taka5+"', '"+taka6+"', '"+due_taka+"', '"+paid_taka+"')");
															ps1.executeUpdate();
														}
													}
													else {
														PreparedStatement ps0 = con.prepareStatement("INSERT INTO `buy_item_all`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																+ " `"+item4+"`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																+ "'"+piece5+"')");
														ps0.executeUpdate();
														
														PreparedStatement ps1 = con.prepareStatement("INSERT INTO `buy_item_all_tk`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																+ " `"+item4+"`, `due`, `paid`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"',"
																+ "'"+taka5+"', '"+due_taka+"', '"+paid_taka+"')");
														ps1.executeUpdate();
													}
												}
												else {
													PreparedStatement ps0 = con.prepareStatement("INSERT INTO `buy_item_all`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`) "
															+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"')");
													ps0.executeUpdate();
													
													PreparedStatement ps1 = con.prepareStatement("INSERT INTO `buy_item_all_tk`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`, `due`, `paid`) "
															+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"', '"+due_taka+"', '"+paid_taka+"')");
													ps1.executeUpdate();
												}
											}
											else {
												PreparedStatement ps0 = con.prepareStatement("INSERT INTO `buy_item_all`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`) "
														+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+piece1+"', '"+piece2+"', '"+piece3+"')");
												ps0.executeUpdate();
												
												PreparedStatement ps1 = con.prepareStatement("INSERT INTO `buy_item_all_tk`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `due`, `paid`) "
														+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+due_taka+"', '"+paid_taka+"')");
												ps1.executeUpdate();
											}
										}
										else {
											PreparedStatement ps0 = con.prepareStatement("INSERT INTO `buy_item_all`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`) "
													+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+piece1+"', '"+piece2+"')");
											ps0.executeUpdate();
											
											PreparedStatement ps1 = con.prepareStatement("INSERT INTO `buy_item_all_tk`(`date`, `name`, `address`, `"+item0+"`, `"+item1+"`, `due`, `paid`) "
													+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+taka1+"', '"+taka2+"', '"+due_taka+"', '"+paid_taka+"')");
											ps1.executeUpdate();
										}
									}
									else {
										PreparedStatement ps0 = con.prepareStatement("INSERT INTO `buy_item_all`(`date`, `name`, `address`, `"+item0+"`) "
												+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+piece1+"')");
										ps0.executeUpdate();
										
										PreparedStatement ps1 = con.prepareStatement("INSERT INTO `buy_item_all_tk`(`date`, `name`, `address`, `"+item0+"`, `due`, `paid`) "
												+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+taka1+"', '"+due_taka+"', '"+paid_taka+"')");
										ps1.executeUpdate();
									}
								}
								
								//*************************************Update buy_stock**************************************//
								
								ResultSet rs1=stmt.executeQuery("SELECT `date`, `opera_silk`, `potnoma_silk`, `laccha_buta_silk`, `plain_body_silk`, `taitanik_silk`, `bt_brocet_katan`, "
										+ "`three_pis_silk`, `jorjet_than`, `net_than`, `chinigurah_than`, `dupyain_than`, `varaities_than`, `ic_benaroshi_katan`, `ic_party_sharee`, "
										+ "`ic_pure_katan`, `ic_stone_katan`, `orna`, `others_item`, `lot_item`, `new_item` FROM `buy_stock` WHERE date = '"+date+"'");
								if(rs1.next()) {
									opera_silk = rs1.getInt(2);
									potnoma_silk = rs1.getInt(3);
									laccha_buta_silk = rs1.getInt(4);
									plain_body_silk = rs1.getInt(5);

									taitanik_silk = rs1.getInt(6);
									bt_brocet_katan = rs1.getInt(7);
									three_pis_silk = rs1.getInt(8);
									jorjet_than = rs1.getInt(9);

									net_than = rs1.getInt(10);
									chinigurah_than = rs1.getInt(11);
									dupyain_than = rs1.getInt(12);
									varaities_than = rs1.getInt(13);

									ic_benaroshi_katan = rs1.getInt(14);
									ic_party_sharee = rs1.getInt(15);
									ic_pure_katan = rs1.getInt(16);
									ic_stone_katan = rs1.getInt(17);

									orna = rs1.getInt(18);
									others_item = rs1.getInt(19);
									lot_item = rs1.getInt(20);
									new_item = rs1.getInt(21);
									
									ResultSet rs3=stmt.executeQuery("SELECT MAX(ID) FROM `buy_item_all`;");
									if(rs3.next()) {
										max = rs3.getInt(1);
										
										ResultSet rs2=stmt.executeQuery("SELECT `date`,`name`, `address`, `opera_silk`, `potnoma_silk`, `laccha_buta_silk`, `plain_body_silk`, `taitanik_silk`, `bt_brocet_katan`,"
												+ "`three_pis_silk`, `jorjet_than`, `net_than`, `chinigurah_than`, `dupyain_than`, `varaities_than`, `ic_benaroshi_katan`, `ic_party_sharee`,"
												+ "`ic_pure_katan`, `ic_stone_katan`, `orna`, `others_item`, `lot_item`, `new_item` FROM `buy_item_all` WHERE ID = '"+max+"';");
										if(rs2.next()) {
											opera_silk += rs2.getInt(4);
											potnoma_silk += rs2.getInt(5);
											laccha_buta_silk += rs2.getInt(6);
											plain_body_silk += rs2.getInt(7);

											taitanik_silk += rs2.getInt(8);
											bt_brocet_katan += rs2.getInt(9);
											three_pis_silk += rs2.getInt(10);
											jorjet_than += rs2.getInt(11);

											net_than += rs2.getInt(12);
											chinigurah_than += rs2.getInt(13);
											dupyain_than += rs2.getInt(14);
											varaities_than += rs2.getInt(15);

											ic_benaroshi_katan += rs2.getInt(16);
											ic_party_sharee += rs2.getInt(17);
											ic_pure_katan += rs2.getInt(18);
											ic_stone_katan += rs2.getInt(19);

											orna += rs2.getInt(20);
											others_item += rs2.getInt(21);
											lot_item += rs2.getInt(22);
											new_item += rs2.getInt(23);
											
											PreparedStatement ps2 = con.prepareStatement("UPDATE `buy_stock` SET `date`='"+date+"',`opera_silk`='"+opera_silk+"',`potnoma_silk`='"+potnoma_silk+"',`laccha_buta_silk`='"+laccha_buta_silk+"',"
											+ "`plain_body_silk`='"+plain_body_silk+"',`taitanik_silk`='"+taitanik_silk+"', `bt_brocet_katan`='"+bt_brocet_katan+"',`three_pis_silk`='"+three_pis_silk+"',`jorjet_than`='"+jorjet_than+"',"
											+ "`net_than`='"+net_than+"',`chinigurah_than`='"+chinigurah_than+"',`dupyain_than`='"+dupyain_than+"',`varaities_than`='"+varaities_than+"', "
											+ "`ic_benaroshi_katan`='"+ic_benaroshi_katan+"',`ic_party_sharee`='"+ic_party_sharee+"',`ic_pure_katan`='"+ic_pure_katan+"',`ic_stone_katan`='"+ic_stone_katan+"',"
											+ "`orna`='"+orna+"',`others_item`='"+others_item+"',`lot_item`='"+lot_item+"', `new_item`='"+new_item+"' WHERE date = '"+date+"'");
											
											ps2.executeUpdate();
										}	
									}
									
								}	
							}
							
							//***************************************insert and update into stock**********************************************//
							
							ResultSet rs12=stmt.executeQuery("SELECT MAX(ID) FROM `stock`;");
							if(rs12.next()) {
								max = rs12.getInt(1);
								ResultSet rs10=stmt.executeQuery("SELECT date FROM `stock` WHERE ID = '"+max+"';");
								if(rs10.next()) {
									max_date = rs10.getDate(1);
								}
								ResultSet rs11=stmt.executeQuery("SELECT `opera_silk`, `potnoma_silk`, `laccha_buta_silk`, `plain_body_silk`, `taitanik_silk`, `bt_brocet_katan`, "
										+ "`three_pis_silk`, `jorjet_than`, `net_than`, `chinigurah_than`, `dupyain_than`, `varaities_than`, `ic_benaroshi_katan`, `ic_party_sharee`, `ic_pure_katan`, "
										+ "`ic_stone_katan`, `orna`, `others_item`, `lot_item`, `new_item`, `buy_total`, `sell_total` FROM `stock` WHERE ID = '"+max+"';");
								if(rs11.next()) {
									opera_silk = rs11.getInt(1);
									potnoma_silk = rs11.getInt(2);
									laccha_buta_silk = rs11.getInt(3);
									plain_body_silk = rs11.getInt(4);

									taitanik_silk = rs11.getInt(5);
									bt_brocet_katan = rs11.getInt(6);
									three_pis_silk = rs11.getInt(7);
									jorjet_than = rs11.getInt(8);

									net_than = rs11.getInt(9);
									chinigurah_than = rs11.getInt(10);
									dupyain_than = rs11.getInt(11);
									varaities_than = rs11.getInt(12);

									ic_benaroshi_katan = rs11.getInt(13);
									ic_party_sharee = rs11.getInt(14);
									ic_pure_katan = rs11.getInt(15);
									ic_stone_katan = rs11.getInt(16);

									orna = rs11.getInt(17);
									others_item = rs11.getInt(18);
									lot_item = rs11.getInt(19);
									new_item = rs11.getInt(20);
									
									//buy_total = rs11.getInt(21);
									//sell_total = rs11.getInt(22);
									
									
									ResultSet rs22=stmt.executeQuery("SELECT MAX(ID) FROM `buy_item_all`;");
									if(rs22.next()) {
										max = rs22.getInt(1);
										
										ResultSet rs2=stmt.executeQuery("SELECT `date`,`name`, `address`, `opera_silk`, `potnoma_silk`, `laccha_buta_silk`, `plain_body_silk`, `taitanik_silk`, `bt_brocet_katan`," 
												+ "`three_pis_silk`, `jorjet_than`, `net_than`, `chinigurah_than`, `dupyain_than`, `varaities_than`, `ic_benaroshi_katan`, `ic_party_sharee`,"
												+ "`ic_pure_katan`, `ic_stone_katan`, `orna`, `others_item`, `lot_item`, `new_item` FROM `buy_item_all` WHERE ID = '"+max+"';");
										if(rs2.next()) {
											opera_silk += rs2.getInt(4);
											potnoma_silk += rs2.getInt(5);
											laccha_buta_silk += rs2.getInt(6);
											plain_body_silk += rs2.getInt(7);

											taitanik_silk += rs2.getInt(8);
											bt_brocet_katan += rs2.getInt(9);
											three_pis_silk += rs2.getInt(10);
											jorjet_than += rs2.getInt(11);

											net_than += rs2.getInt(12);
											chinigurah_than += rs2.getInt(13);
											dupyain_than += rs2.getInt(14);
											varaities_than += rs2.getInt(15);

											ic_benaroshi_katan += rs2.getInt(16);
											ic_party_sharee += rs2.getInt(17);
											ic_pure_katan += rs2.getInt(18);
											ic_stone_katan += rs2.getInt(19);

											orna += rs2.getInt(20);
											others_item += rs2.getInt(21);
											lot_item += rs2.getInt(22);
											new_item += rs2.getInt(23);
											
											if(dateChooser.getDate().equals(max_date)) {
												PreparedStatement ps2 = con.prepareStatement("UPDATE `stock` SET `opera_silk`='"+opera_silk+"',`potnoma_silk`='"+potnoma_silk+"',`laccha_buta_silk`='"+laccha_buta_silk+"',"
														+ "`plain_body_silk`='"+plain_body_silk+"',`taitanik_silk`='"+taitanik_silk+"', `bt_brocet_katan`='"+bt_brocet_katan+"',`three_pis_silk`='"+three_pis_silk+"',`jorjet_than`='"+jorjet_than+"',"
														+ "`net_than`='"+net_than+"',`chinigurah_than`='"+chinigurah_than+"',`dupyain_than`='"+dupyain_than+"',`varaities_than`='"+varaities_than+"', "
														+ "`ic_benaroshi_katan`='"+ic_benaroshi_katan+"',`ic_party_sharee`='"+ic_party_sharee+"',`ic_pure_katan`='"+ic_pure_katan+"',`ic_stone_katan`='"+ic_stone_katan+"',"
														+ "`orna`='"+orna+"',`others_item`='"+others_item+"',`lot_item`='"+lot_item+"', `new_item`='"+new_item+"' WHERE date = '"+max_date+"'");
														
												ps2.executeUpdate();
											}
											else {
												PreparedStatement ps2 = con.prepareStatement("INSERT INTO `stock` (`date`, `opera_silk`, `potnoma_silk`, `laccha_buta_silk`, `plain_body_silk`, `taitanik_silk`, "
														+ "`bt_brocet_katan`, `three_pis_silk`, `jorjet_than`,`net_than`, `chinigurah_than`, `dupyain_than`, `varaities_than`, `ic_benaroshi_katan`, `ic_party_sharee`, "
														+ "`ic_pure_katan`, `ic_stone_katan`, `orna`, `others_item`, `lot_item`, `new_item`) VALUES ('"+date+"','"+opera_silk+"','"+potnoma_silk+"','"+laccha_buta_silk+"',"
														+ "'"+plain_body_silk+"','"+taitanik_silk+"','"+bt_brocet_katan+"','"+three_pis_silk+"','"+jorjet_than+"', '"+net_than+"','"+chinigurah_than+"',"
														+ "'"+dupyain_than+"','"+varaities_than+"','"+ic_benaroshi_katan+"','"+ic_party_sharee+"','"+ic_pure_katan+"','"+ic_stone_katan+"','"+orna+"','"+others_item+"',"
														+ "'"+lot_item+"','"+new_item+"')");
												ps2.executeUpdate();
											}
										}
									}
								}
							}	
						}
						catch(Exception e1) {
							JOptionPane.showMessageDialog(null, e1);
							e1.printStackTrace();
						}
						
						nameField.setText(null);
						address_Field.setText(null);
						dateChooser.setDate(null);
						comboBox_0.setSelectedIndex(0);
						comboBox_1.setSelectedIndex(0);
						comboBox_2.setSelectedIndex(0);
						comboBox_3.setSelectedIndex(0);
						comboBox_4.setSelectedIndex(0);
						comboBox_5.setSelectedIndex(0);
						comboBox_6.setSelectedIndex(0);

						takaField1.setText(null);
						takaField2.setText(null);
						takaField3.setText(null);
						takaField4.setText(null);
						takaField5.setText(null);
						takaField6.setText(null);
						takaField7.setText(null);
						
						pieceField1.setText(null);
						pieceField2.setText(null);
						pieceField3.setText(null);
						pieceField4.setText(null);
						pieceField5.setText(null);
						pieceField6.setText(null);
						pieceField7.setText(null);
						
						total_taka_Field.setText(null);
						due_taka_Field.setText(null);
						discount_taka_Field.setText(null);
						paid_taka_Field.setText(null);
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Name Or Address Can not be empty.");
					}	
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Date empty");
				}	
			}
		});
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		submit.setBorder(null);
			
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int total_taka = 0;
					int due_taka = 0;
					
					if(discount_taka_Field.getText().equals("")) {
						discount_taka_Field.setText(""+0);
					}
					int discount_taka = Integer.parseInt(discount_taka_Field.getText());
					//JOptionPane.showMessageDialog(null, "int neowa jabe na");
					if(!takaField1.getText().equals("") && !pieceField1.getText().equals("")) {
						total_taka += Integer.parseInt(takaField1.getText()) * Integer.parseInt(pieceField1.getText());
						
						if(!takaField2.getText().equals("") && !pieceField2.getText().equals("")) {
							total_taka += Integer.parseInt(takaField2.getText()) * Integer.parseInt(pieceField2.getText());
							
							if(!takaField3.getText().equals("") && !pieceField3.getText().equals("")) {
								total_taka += Integer.parseInt(takaField3.getText()) * Integer.parseInt(pieceField3.getText());
								
								if(!takaField4.getText().equals("") && !pieceField4.getText().equals("")) {
									total_taka += Integer.parseInt(takaField4.getText()) * Integer.parseInt(pieceField4.getText());
									
									if(!takaField5.getText().equals("") && !pieceField5.getText().equals("")) {
										total_taka += Integer.parseInt(takaField5.getText()) * Integer.parseInt(pieceField5.getText());
										
										if(!takaField6.getText().equals("") && !pieceField6.getText().equals("")) {
											total_taka += Integer.parseInt(takaField6.getText()) * Integer.parseInt(pieceField6.getText());
											
											if(!takaField7.getText().equals("") && !pieceField7.getText().equals("")) {
												total_taka += Integer.parseInt(takaField7.getText()) * Integer.parseInt(pieceField7.getText());
											}
										}
									}
								}
							}
						}
					}
					
					if(discount_taka_Field.getText().equals("")) {
						total_taka_Field.setText(""+total_taka);
						due_taka_Field.setText(""+total_taka);
					}
					else {
						total_taka -= discount_taka;
						total_taka_Field.setText(""+total_taka);
						due_taka_Field.setText(""+total_taka);
					}
					
					if(paid_taka_Field.getText().equals("")) {
						paid_taka_Field.setText(""+0);
					}
					due_taka = total_taka - Integer.parseInt(paid_taka_Field.getText());
					due_taka_Field.setText(""+due_taka);
					
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnCalculate.setForeground(Color.WHITE);
		btnCalculate.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		btnCalculate.setBorder(null);
		btnCalculate.setBackground(new Color(0, 191, 255));
		btnCalculate.setBounds(506, 367, 130, 30);
		contentPane.add(btnCalculate);
		submit.setBackground(new Color(0, 102, 102));
		submit.setBounds(645, 416, 130, 30);
		contentPane.add(submit);
		
		JButton back = new JButton("Back");
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.addActionListener(new ActionListener() {
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
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		back.setBorder(null);
		back.setBackground(new Color(128, 0, 0));
		back.setBounds(506, 416, 130, 30);
		contentPane.add(back);
		
		user_field = new JTextField();
		user_field.setText(user_name);
		user_field.setHorizontalAlignment(SwingConstants.RIGHT);
		user_field.setForeground(Color.WHITE);
		user_field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
		user_field.setEditable(false);
		user_field.setColumns(10);
		user_field.setBorder(null);
		user_field.setBackground(new Color(51, 0, 102));
		user_field.setBounds(594, 54, 215, 24);
		contentPane.add(user_field);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(252, 54, 320, 2);
		contentPane.add(separator);
		
		address_Field = new JTextField();
		address_Field.setHorizontalAlignment(SwingConstants.CENTER);
		address_Field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		address_Field.setColumns(10);
		address_Field.setBorder(null);
		address_Field.setBounds(433, 101, 151, 25);
		contentPane.add(address_Field);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblAddress.setBounds(433, 76, 151, 25);
		contentPane.add(lblAddress);
		
		JLabel lblDiscount = new JLabel("Discount");
		lblDiscount.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiscount.setForeground(Color.WHITE);
		lblDiscount.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblDiscount.setBounds(646, 274, 129, 25);
		contentPane.add(lblDiscount);
		
		discount_taka_Field = new JTextField();
		discount_taka_Field.setForeground(Color.BLACK);
		discount_taka_Field.setBackground(new Color(255, 255, 255));
		discount_taka_Field.setHorizontalAlignment(SwingConstants.CENTER);
		discount_taka_Field.setFont(new Font("Arial", Font.PLAIN, 15));
		discount_taka_Field.setColumns(10);
		discount_taka_Field.setBorder(null);
		discount_taka_Field.setBounds(648, 300, 127, 30);
		contentPane.add(discount_taka_Field);
	}
}
