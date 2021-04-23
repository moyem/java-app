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
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.Cursor;
import java.awt.Toolkit;

public class Sell extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameField;
	private JTextField memoField;
	private JTextField takaField1;
	private JTextField takaField2;
	private JTextField takaField4;
	private JTextField takaField3;
	private JTextField takaField6;
	private JTextField takaField5;
	private JTextField takaField7;
	private JTextField pieceField1;
	private JTextField pieceField2;
	private JTextField pieceField3;
	private JTextField pieceField4;
	private JTextField pieceField5;
	private JTextField pieceField6;
	private JTextField pieceField7;
	private JTextField total_taka_Field;
	private JTextField paid_taka_Field;
	private JTextField due_taka_Field;
	private JTextField addressField;
	private JTextField user_field;
	private JTextField discount_taka_Field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sell frame = new Sell("Nuhin");
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @wbp.parser.constructor
	 */
	public Sell(String user_name) {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sell.class.getResource("/version1/logomaker.png")));
		setTitle("Sell");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(545, 200, 835, 530);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 0, 102));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		JLabel label = new JLabel("Fatema Silk House");
		label.setBounds(0, 0, 819, 50);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
		
		JLabel label_1 = new JLabel("Md.Nuruzzaman \u00A92021");
		label_1.setBounds(0, 460, 815, 20);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial", Font.PLAIN, 10));
		
		JLabel lblNewLabel = new JLabel("Date");
		lblNewLabel.setBounds(48, 88, 110, 25);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(168, 88, 300, 25);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		
		JLabel lblMemo = new JLabel("Memo");
		lblMemo.setBounds(641, 88, 129, 25);
		lblMemo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemo.setForeground(Color.WHITE);
		lblMemo.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		
		nameField = new JTextField();
		nameField.setBounds(168, 113, 300, 25);
		nameField.setHorizontalAlignment(SwingConstants.CENTER);
		nameField.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		nameField.setBorder(null);
		nameField.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setBorder(null);
		dateChooser.getCalendarButton().setHorizontalTextPosition(SwingConstants.CENTER);
		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dateChooser.getCalendarButton().setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		dateChooser.setBounds(48, 113, 110, 25);
		
		memoField = new JTextField();
		memoField.setBounds(641, 113, 129, 25);
		memoField.setHorizontalAlignment(SwingConstants.CENTER);
		memoField.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		memoField.setColumns(10);
		memoField.setBorder(null);
		contentPane.setLayout(null);
		contentPane.add(label);
		contentPane.add(label_1);
		contentPane.add(lblNewLabel);
		contentPane.add(lblName);
		contentPane.add(lblMemo);
		contentPane.add(nameField);
		contentPane.add(dateChooser);
		contentPane.add(memoField);
		
		JLabel lblItem = new JLabel("Item");
		lblItem.setHorizontalAlignment(SwingConstants.CENTER);
		lblItem.setForeground(Color.WHITE);
		lblItem.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblItem.setBounds(48, 160, 200, 25);
		contentPane.add(lblItem);
		
		JLabel lblTaka = new JLabel("Taka");
		lblTaka.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaka.setForeground(Color.WHITE);
		lblTaka.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblTaka.setBounds(368, 160, 100, 25);
		contentPane.add(lblTaka);
		
		JLabel lblPiece = new JLabel("Piece");
		lblPiece.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiece.setForeground(Color.WHITE);
		lblPiece.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblPiece.setBounds(258, 160, 100, 25);
		contentPane.add(lblPiece);
		
		JComboBox<Object> comboBox_0 = new JComboBox<Object>();
		comboBox_0.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "Opera Silk", "Potnoma Silk", "Laccha Buta Silk", "Plain Body Silk", "Taitanik Silk", "BT Brocet Katan",
				"Three Pis Silk", "Jorjet Than", "Net Than", "Chinigurah Than", "Dupyain Than", "Varaities Than", "IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna",
				"Others Item", "Lot Item"}));
		comboBox_0.setBackground(Color.WHITE);
		comboBox_0.setForeground(Color.BLACK);
		comboBox_0.setBorder(null);
		comboBox_0.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_0.setBounds(48, 185, 200, 25);
		contentPane.add(comboBox_0);
		
		JComboBox<Object> comboBox_1 = new JComboBox<Object>();
		comboBox_1.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "Potnoma Silk", "Laccha Buta Silk", "Plain Body Silk", "Taitanik Silk", "BT Brocet Katan", "Three Pis Silk", 
				"Jorjet Than", "Net Than", "Chinigurah Than", "Dupyain Than", "Varaities Than", "IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna", "Others Item", 
				"Lot Item"}));
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_1.setBorder(null);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(48, 221, 200, 25);
		contentPane.add(comboBox_1);
		
		JComboBox<Object> comboBox_2 = new JComboBox<Object>();
		comboBox_2.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "Laccha Buta Silk", "Plain Body Silk", "Taitanik Silk", "BT Brocet Katan", "Three Pis Silk", "Jorjet Than", 
				"Net Than", "Chinigurah Than", "Dupyain Than", "Varaities Than", "IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna", "Others Item", "Lot Item"}));
		comboBox_2.setForeground(Color.BLACK);
		comboBox_2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_2.setBorder(null);
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(48, 257, 200, 25);
		contentPane.add(comboBox_2);
		
		JComboBox<Object> comboBox_3 = new JComboBox<Object>();
		comboBox_3.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "Plain Body Silk", "Taitanik Silk", "BT Brocet Katan", "Three Pis Silk", "Jorjet Than", "Net Than", "Chinigurah Than",
				"Dupyain Than", "Varaities Than", "IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna", "Others Item", "Lot Item"}));
		comboBox_3.setForeground(Color.BLACK);
		comboBox_3.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_3.setBorder(null);
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setBounds(48, 293, 200, 25);
		contentPane.add(comboBox_3);
		
		JComboBox<Object> comboBox_4 = new JComboBox<Object>();
		comboBox_4.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "Taitanik Silk", "BT Brocet Katan", "Three Pis Silk", "Jorjet Than", "Net Than", "Chinigurah Than", "Dupyain Than",
				"Varaities Than", "IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna", "Others Item", "Lot Item"}));
		comboBox_4.setForeground(Color.BLACK);
		comboBox_4.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_4.setBorder(null);
		comboBox_4.setBackground(Color.WHITE);
		comboBox_4.setBounds(48, 329, 200, 25);
		contentPane.add(comboBox_4);
		
		JComboBox<Object> comboBox_5 = new JComboBox<Object>();
		comboBox_5.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "BT Brocet Katan", "Three Pis Silk", "Jorjet Than", "Net Than", "Chinigurah Than", "Dupyain Than", "Varaities Than",
				"IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna", "Others Item", "Lot Item"}));
		comboBox_5.setForeground(Color.BLACK);
		comboBox_5.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_5.setBorder(null);
		comboBox_5.setBackground(Color.WHITE);
		comboBox_5.setBounds(48, 365, 200, 25);
		contentPane.add(comboBox_5);
		
		JComboBox<Object> comboBox_6 = new JComboBox<Object>();
		comboBox_6.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "Three Pis Silk", "Jorjet Than", "Net Than", "Chinigurah Than", "Dupyain Than", "Varaities Than", "IC Benaroshi Katan",
				"IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna", "Others Item", "Lot Item"}));
		comboBox_6.setForeground(Color.BLACK);
		comboBox_6.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_6.setBorder(null);
		comboBox_6.setBackground(Color.WHITE);
		comboBox_6.setBounds(48, 401, 200, 25);
		contentPane.add(comboBox_6);
		
		takaField1 = new JTextField();
		takaField1.setHorizontalAlignment(SwingConstants.CENTER);
		takaField1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField1.setColumns(10);
		takaField1.setBorder(null);
		takaField1.setBounds(368, 185, 100, 25);
		contentPane.add(takaField1);
		
		takaField2 = new JTextField();
		takaField2.setHorizontalAlignment(SwingConstants.CENTER);
		takaField2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField2.setColumns(10);
		takaField2.setBorder(null);
		takaField2.setBounds(368, 221, 100, 25);
		contentPane.add(takaField2);
		
		takaField4 = new JTextField();
		takaField4.setHorizontalAlignment(SwingConstants.CENTER);
		takaField4.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField4.setColumns(10);
		takaField4.setBorder(null);
		takaField4.setBounds(368, 293, 100, 25);
		contentPane.add(takaField4);
		
		takaField3 = new JTextField();
		takaField3.setHorizontalAlignment(SwingConstants.CENTER);
		takaField3.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField3.setColumns(10);
		takaField3.setBorder(null);
		takaField3.setBounds(368, 257, 100, 25);
		contentPane.add(takaField3);
		
		takaField6 = new JTextField();
		takaField6.setHorizontalAlignment(SwingConstants.CENTER);
		takaField6.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField6.setColumns(10);
		takaField6.setBorder(null);
		takaField6.setBounds(368, 365, 100, 25);
		contentPane.add(takaField6);
		
		takaField5 = new JTextField();
		takaField5.setHorizontalAlignment(SwingConstants.CENTER);
		takaField5.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField5.setColumns(10);
		takaField5.setBorder(null);
		takaField5.setBounds(368, 329, 100, 25);
		contentPane.add(takaField5);
		
		takaField7 = new JTextField();
		takaField7.setHorizontalAlignment(SwingConstants.CENTER);
		takaField7.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField7.setColumns(10);
		takaField7.setBorder(null);
		takaField7.setBounds(368, 401, 100, 25);
		contentPane.add(takaField7);
		
		pieceField1 = new JTextField();
		pieceField1.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField1.setColumns(10);
		pieceField1.setBorder(null);
		pieceField1.setBounds(258, 185, 100, 25);
		contentPane.add(pieceField1);
		
		pieceField2 = new JTextField();
		pieceField2.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField2.setColumns(10);
		pieceField2.setBorder(null);
		pieceField2.setBounds(258, 221, 100, 25);
		contentPane.add(pieceField2);
		
		pieceField3 = new JTextField();
		pieceField3.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField3.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField3.setColumns(10);
		pieceField3.setBorder(null);
		pieceField3.setBounds(258, 257, 100, 25);
		contentPane.add(pieceField3);
		
		pieceField4 = new JTextField();
		pieceField4.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField4.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField4.setColumns(10);
		pieceField4.setBorder(null);
		pieceField4.setBounds(258, 293, 100, 25);
		contentPane.add(pieceField4);
		
		pieceField5 = new JTextField();
		pieceField5.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField5.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField5.setColumns(10);
		pieceField5.setBorder(null);
		pieceField5.setBounds(258, 329, 100, 25);
		contentPane.add(pieceField5);
		
		pieceField6 = new JTextField();
		pieceField6.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField6.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField6.setColumns(10);
		pieceField6.setBorder(null);
		pieceField6.setBounds(258, 365, 100, 25);
		contentPane.add(pieceField6);
		
		pieceField7 = new JTextField();
		pieceField7.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField7.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField7.setColumns(10);
		pieceField7.setBorder(null);
		pieceField7.setBounds(258, 401, 100, 25);
		contentPane.add(pieceField7);
		
		total_taka_Field = new JTextField();
		total_taka_Field.setEditable(false);
		total_taka_Field.setHorizontalAlignment(SwingConstants.CENTER);
		total_taka_Field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		total_taka_Field.setColumns(10);
		total_taka_Field.setBorder(null);
		total_taka_Field.setBounds(641, 185, 129, 30);
		contentPane.add(total_taka_Field);
		
		paid_taka_Field = new JTextField();
		paid_taka_Field.setHorizontalAlignment(SwingConstants.CENTER);
		paid_taka_Field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		paid_taka_Field.setColumns(10);
		paid_taka_Field.setBorder(null);
		paid_taka_Field.setBounds(641, 376, 129, 30);
		contentPane.add(paid_taka_Field);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblTotal.setBounds(641, 160, 129, 25);
		contentPane.add(lblTotal);
		
		JLabel lblPaid = new JLabel("Paid");
		lblPaid.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaid.setForeground(Color.WHITE);
		lblPaid.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblPaid.setBounds(641, 352, 129, 25);
		contentPane.add(lblPaid);
		
		JLabel lblDue = new JLabel("Due");
		lblDue.setHorizontalAlignment(SwingConstants.CENTER);
		lblDue.setForeground(Color.WHITE);
		lblDue.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblDue.setBounds(641, 221, 129, 25);
		contentPane.add(lblDue);
		
		due_taka_Field = new JTextField();
		due_taka_Field.setEditable(false);
		due_taka_Field.setHorizontalAlignment(SwingConstants.CENTER);
		due_taka_Field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		due_taka_Field.setColumns(10);
		due_taka_Field.setBorder(null);
		due_taka_Field.setBounds(641, 246, 129, 30);
		contentPane.add(due_taka_Field);
		
		addressField = new JTextField();
		addressField.setHorizontalAlignment(SwingConstants.CENTER);
		addressField.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		addressField.setColumns(10);
		addressField.setBorder(null);
		addressField.setBounds(478, 113, 153, 25);
		contentPane.add(addressField);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblAddress.setBounds(478, 88, 153, 25);
		contentPane.add(lblAddress);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(251, 48, 318, 2);
		contentPane.add(separator);
		
		user_field = new JTextField();
		user_field.setText(user_name);
		user_field.setHorizontalAlignment(SwingConstants.RIGHT);
		user_field.setForeground(Color.WHITE);
		user_field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
		user_field.setEditable(false);
		user_field.setColumns(10);
		user_field.setBorder(null);
		user_field.setBackground(new Color(51, 0, 102));
		user_field.setBounds(579, 53, 230, 24);
		contentPane.add(user_field);
		
		discount_taka_Field = new JTextField();
		discount_taka_Field.setHorizontalAlignment(SwingConstants.CENTER);
		discount_taka_Field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		discount_taka_Field.setColumns(10);
		discount_taka_Field.setBorder(null);
		discount_taka_Field.setBounds(641, 311, 129, 30);
		contentPane.add(discount_taka_Field);
		
		JLabel lblDiscount = new JLabel("Discount");
		lblDiscount.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiscount.setForeground(Color.WHITE);
		lblDiscount.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblDiscount.setBounds(641, 287, 129, 25);
		contentPane.add(lblDiscount);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
					
					String date = d.format(dateChooser.getDate());
					
					String name = nameField.getText();
					String address = addressField.getText();
					String memo = memoField.getText();
					
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
					
					int max = 0;
					Date max_date = null;
					
					int due_taka = 0;
					
					if(discount_taka_Field.getText().equals("")) {
						discount_taka_Field.setText(""+0);
					}
					int discount_taka = Integer.parseInt(discount_taka_Field.getText());
					
					String paid_taka = paid_taka_Field.getText();
					
					
					if(!name.equals("") && !memo.equals("")) {
						
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
						
						
						//************************************Check selected item*******************************************//
						
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
							//fatema_silk_house
							Class.forName("com.mysql.jdbc.Driver");  
							String url = "jdbc:ucanaccess://H://Fatema Silk House.accdb";
							Connection con=DriverManager.getConnection(url);
							
							//*************************************Write into sell_item_all/tk and sell_stock************************************************//
							Statement stmt=con.createStatement();  
							ResultSet rs0=stmt.executeQuery("SELECT date FROM `sell_stock` WHERE date = '"+date+"'");
							if(!rs0.next()) {//date is not matched so insert
								
								if(!item0.equals("select") && !piece1.equals("") && !taka1.equals("") /*&& !paid_taka.equals("")*/) {
									if(!item1.equals("select") && !piece2.equals("") && !taka2.equals("")) {
										if(!item2.equals("select") && !piece3.equals("") && !taka3.equals("")) {
											if(!item3.equals("select") && !piece4.equals("") && !taka4.equals("")) {
												if(!item4.equals("select") && !piece5.equals("") && !taka5.equals("")) {
													if(!item5.equals("select") && !piece6.equals("") && !taka6.equals("")) {
														if(!item6.equals("select") && !piece7.equals("") && !taka7.equals("")) {
															PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `"+item6+"`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																	+ "'"+piece5+"', '"+piece6+"', '"+piece7+"')");
															ps0.executeUpdate();
															
															PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `"+item6+"`, `due`, `paid`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"',"
																	+ "'"+taka5+"', '"+taka6+"', '"+taka7+"', '"+due_taka+"', '"+paid_taka+"')");
															ps1.executeUpdate();
															
															PreparedStatement ps2 = con.prepareStatement("INSERT INTO `sell_stock`(`date`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `"+item6+"`) VALUES ('"+date+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																	+ "'"+piece5+"', '"+piece6+"', '"+piece7+"')");
															ps2.executeUpdate();
														}
														else {
															PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`) VALUES ('"+date+"' , '"+name+"','"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																	+ "'"+piece5+"', '"+piece6+"')");
															ps0.executeUpdate();
															
															PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `due`, `paid`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"',"
																	+ "'"+taka5+"', '"+taka6+"', '"+due_taka+"', '"+paid_taka+"')");
															ps1.executeUpdate();
															
															PreparedStatement ps2 = con.prepareStatement("INSERT INTO `sell_stock`(`date`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`) VALUES ('"+date+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																	+ "'"+piece5+"', '"+piece6+"')");
															ps2.executeUpdate();
														}
													}
													else {
														PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																+ " `"+item4+"`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																+ "'"+piece5+"')");
														ps0.executeUpdate();
														
														PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																+ " `"+item4+"`, `due`, `paid`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"',"
																+ "'"+taka5+"', '"+due_taka+"', '"+paid_taka+"')");
														ps1.executeUpdate();
														
														PreparedStatement ps2 = con.prepareStatement("INSERT INTO `sell_stock`(`date`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																+ " `"+item4+"`) VALUES ('"+date+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																+ "'"+piece5+"')");
														ps2.executeUpdate();
													}
												}
												else {
													PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`) "
															+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"')");
													ps0.executeUpdate();
													
													PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`, `due`, `paid`) "
															+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"', '"+due_taka+"', '"+paid_taka+"')");
													ps1.executeUpdate();
													
													PreparedStatement ps2 = con.prepareStatement("INSERT INTO `sell_stock`(`date`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`) "
															+ "VALUES ('"+date+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"')");
													ps2.executeUpdate();
												}
											}
											else {
												PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`) "
														+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"')");
												ps0.executeUpdate();
												
												PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `due`, `paid`) "
														+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+due_taka+"', '"+paid_taka+"')");
												ps1.executeUpdate();
												
												PreparedStatement ps2 = con.prepareStatement("INSERT INTO `sell_stock`(`date`, `"+item0+"`, `"+item1+"`, `"+item2+"`) "
														+ "VALUES ('"+date+"', '"+piece1+"', '"+piece2+"', '"+piece3+"')");
												ps2.executeUpdate();
											}
										}
										else {
											PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`) "
													+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"')");
											ps0.executeUpdate();
											
											PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `due`, `paid`) "
													+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+due_taka+"', '"+paid_taka+"')");
											ps1.executeUpdate();
											
											PreparedStatement ps2 = con.prepareStatement("INSERT INTO `sell_stock`(`date`, `"+item0+"`, `"+item1+"`) "
													+ "VALUES ('"+date+"', '"+piece1+"', '"+piece2+"')");
											ps2.executeUpdate();
										}
									}
									else {
										PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`) "
												+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+piece1+"')");
										ps0.executeUpdate();
										
										PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `due`, `paid`) "
												+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+taka1+"', '"+due_taka+"', '"+paid_taka+"')");
										ps1.executeUpdate();
										
										PreparedStatement ps2 = con.prepareStatement("INSERT INTO `sell_stock`(`date`, `"+item0+"`) "
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
															PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `"+item6+"`) VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																	+ "'"+piece5+"', '"+piece6+"', '"+piece7+"')");
															ps0.executeUpdate();
															
															PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `"+item6+"`, `due`, `paid`) VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"',"
																	+ "'"+taka5+"', '"+taka6+"', '"+taka7+"', '"+due_taka+"', '"+paid_taka+"')");
															ps1.executeUpdate();
														}
														else {
															PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`) VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																	+ "'"+piece5+"', '"+piece6+"')");
															ps0.executeUpdate();
															
															PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `due`, `paid`) VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"',"
																	+ "'"+taka5+"', '"+taka6+"', '"+due_taka+"', '"+paid_taka+"')");
															ps1.executeUpdate();
														}
													}
													else {
														PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																+ " `"+item4+"`) VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																+ "'"+piece5+"')");
														ps0.executeUpdate();
														
														PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																+ " `"+item4+"`, `due`, `paid`) VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"',"
																+ "'"+taka5+"', '"+due_taka+"', '"+paid_taka+"')");
														ps1.executeUpdate();
													}
												}
												else {
													PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`) "
															+ "VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"')");
													ps0.executeUpdate();
													
													PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`, `due`, `paid`) "
															+ "VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"', '"+due_taka+"', '"+paid_taka+"')");
													ps1.executeUpdate();
												}
											}
											else {
												PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`) "
														+ "VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"')");
												ps0.executeUpdate();
												
												PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `due`, `paid`) "
														+ "VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+due_taka+"', '"+paid_taka+"')");
												ps1.executeUpdate();
											}
										}
										else {
											PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`) "
													+ "VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"')");
											ps0.executeUpdate();
											
											PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `due`, `paid`) "
													+ "VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+due_taka+"', '"+paid_taka+"')");
											ps1.executeUpdate();
										}
									}
									else {
										PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`) "
												+ "VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+piece1+"')");
										ps0.executeUpdate();
										
										PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `due`, `paid`) "
												+ "VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+taka1+"', '"+due_taka+"', '"+paid_taka+"')");
										ps1.executeUpdate();
									}
								}
								
								//*************************************Update sell_stock**************************************//
								
								ResultSet rs1=stmt.executeQuery("SELECT `date`, `opera_silk`, `potnoma_silk`, `laccha_buta_silk`, `plain_body_silk`, `taitanik_silk`, `bt_brocet_katan`, "
										+ "`three_pis_silk`, `jorjet_than`, `net_than`, `chinigurah_than`, `dupyain_than`, `varaities_than`, `ic_benaroshi_katan`, `ic_party_sharee`, "
										+ "`ic_pure_katan`, `ic_stone_katan`, `orna`, `others_item`, `lot_item`, `new_item` FROM `sell_stock` WHERE date = '"+date+"'");
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
									
									ResultSet rs3=stmt.executeQuery("SELECT MAX(ID) FROM `sell_item_all`;");
									if(rs3.next()) {
										max = rs3.getInt(1);
										
										ResultSet rs2=stmt.executeQuery("SELECT `date`,`name`, `address`, `opera_silk`, `potnoma_silk`, `laccha_buta_silk`, `plain_body_silk`, `taitanik_silk`, `bt_brocet_katan`,"
												+ "`three_pis_silk`, `jorjet_than`, `net_than`, `chinigurah_than`, `dupyain_than`, `varaities_than`, `ic_benaroshi_katan`, `ic_party_sharee`,"
												+ "`ic_pure_katan`, `ic_stone_katan`, `orna`, `others_item`, `lot_item`, `new_item` FROM `sell_item_all` WHERE ID = '"+max+"';");
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
											
											PreparedStatement ps2 = con.prepareStatement("UPDATE `sell_stock` SET `date`='"+date+"',`opera_silk`='"+opera_silk+"',`potnoma_silk`='"+potnoma_silk+"',`laccha_buta_silk`='"+laccha_buta_silk+"',"
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
									
									
									ResultSet rs22=stmt.executeQuery("SELECT MAX(ID) FROM `sell_item_all`;");
									if(rs22.next()) {
										max = rs22.getInt(1);
										
										ResultSet rs2=stmt.executeQuery("SELECT `date`,`name`, `address`, `opera_silk`, `potnoma_silk`, `laccha_buta_silk`, `plain_body_silk`, `taitanik_silk`, `bt_brocet_katan`,"
												+ "`three_pis_silk`, `jorjet_than`, `net_than`, `chinigurah_than`, `dupyain_than`, `varaities_than`, `ic_benaroshi_katan`, `ic_party_sharee`,"
												+ "`ic_pure_katan`, `ic_stone_katan`, `orna`, `others_item`, `lot_item`, `new_item` FROM `sell_item_all` WHERE ID = '"+max+"';");
										if(rs2.next()) {
											opera_silk -= rs2.getInt(4);
											potnoma_silk -= rs2.getInt(5);
											laccha_buta_silk -= rs2.getInt(6);
											plain_body_silk -= rs2.getInt(7);

											taitanik_silk -= rs2.getInt(8);
											bt_brocet_katan -= rs2.getInt(9);
											three_pis_silk -= rs2.getInt(10);
											jorjet_than -= rs2.getInt(11);

											net_than -= rs2.getInt(12);
											chinigurah_than -= rs2.getInt(13);
											dupyain_than -= rs2.getInt(14);
											varaities_than -= rs2.getInt(15);

											ic_benaroshi_katan -= rs2.getInt(16);
											ic_party_sharee -= rs2.getInt(17);
											ic_pure_katan -= rs2.getInt(18);
											ic_stone_katan -= rs2.getInt(19);

											orna -= rs2.getInt(20);
											others_item -= rs2.getInt(21);
											lot_item -= rs2.getInt(22);
											new_item -= rs2.getInt(23);
											
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
							JOptionPane.showMessageDialog(null, "!! write into database !!\n"+e1);
						}
						
						nameField.setText(null);
						dateChooser.setDate(null);
						addressField.setText(null);
						memoField.setText(null);
						
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
						JOptionPane.showMessageDialog(null, "Name or Memo Can not be empty.");
					}
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Date empty");
				}
			}
		});
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setBackground(new Color(0, 102, 102));
		btnSubmit.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		btnSubmit.setBorder(null);
		btnSubmit.setBounds(640, 419, 130, 30);
		contentPane.add(btnSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBack.addActionListener(new ActionListener() {
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
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		btnBack.setBorder(null);
		btnBack.setBackground(new Color(128, 0, 0));
		btnBack.setBounds(503, 419, 130, 30);
		contentPane.add(btnBack);
		
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
		btnCalculate.setBounds(503, 376, 130, 30);
		contentPane.add(btnCalculate);
	}
	
	/**************************************************************Previous account***************************************************************************************/
	
	public Sell(String name, String address, String due, String user_name) {

		setIconImage(Toolkit.getDefaultToolkit().getImage(Sell.class.getResource("/version1/logomaker.png")));
		setTitle("Sell");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(545, 200, 835, 530);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 0, 102));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		JLabel label = new JLabel("Fatema Silk House");
		label.setBounds(0, 0, 819, 50);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
		
		JLabel label_1 = new JLabel("Md.Nuruzzaman@2021");
		label_1.setBounds(0, 460, 815, 20);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial", Font.PLAIN, 10));
		
		JLabel lblNewLabel = new JLabel("Date");
		lblNewLabel.setBounds(48, 88, 110, 25);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(168, 88, 300, 25);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		
		JLabel lblMemo = new JLabel("Memo");
		lblMemo.setBounds(641, 88, 129, 25);
		lblMemo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemo.setForeground(Color.WHITE);
		lblMemo.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		
		nameField = new JTextField();
		nameField.setText(name);
		nameField.setBounds(168, 113, 300, 25);
		nameField.setHorizontalAlignment(SwingConstants.CENTER);
		nameField.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		nameField.setBorder(null);
		nameField.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setBorder(null);
		dateChooser.getCalendarButton().setHorizontalTextPosition(SwingConstants.CENTER);
		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dateChooser.getCalendarButton().setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		dateChooser.setBounds(48, 113, 110, 25);
		
		memoField = new JTextField();
		memoField.setBounds(641, 113, 129, 25);
		memoField.setHorizontalAlignment(SwingConstants.CENTER);
		memoField.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		memoField.setColumns(10);
		memoField.setBorder(null);
		contentPane.setLayout(null);
		contentPane.add(label);
		contentPane.add(label_1);
		contentPane.add(lblNewLabel);
		contentPane.add(lblName);
		contentPane.add(lblMemo);
		contentPane.add(nameField);
		contentPane.add(dateChooser);
		contentPane.add(memoField);
		
		JLabel lblItem = new JLabel("Item");
		lblItem.setHorizontalAlignment(SwingConstants.CENTER);
		lblItem.setForeground(Color.WHITE);
		lblItem.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblItem.setBounds(48, 160, 200, 25);
		contentPane.add(lblItem);
		
		JLabel lblTaka = new JLabel("Taka");
		lblTaka.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaka.setForeground(Color.WHITE);
		lblTaka.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblTaka.setBounds(368, 160, 100, 25);
		contentPane.add(lblTaka);
		
		JLabel lblPiece = new JLabel("Piece");
		lblPiece.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiece.setForeground(Color.WHITE);
		lblPiece.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblPiece.setBounds(258, 160, 100, 25);
		contentPane.add(lblPiece);
		
		JComboBox<Object> comboBox_0 = new JComboBox<Object>();
		comboBox_0.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "Opera Silk", "Potnoma Silk", "Laccha Buta Silk", "Plain Body Silk", "Taitanik Silk", "BT Brocet Katan",
				"Three Pis Silk", "Jorjet Than", "Net Than", "Chinigurah Than", "Dupyain Than", "Varaities Than", "IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna",
				"Others Item", "Lot Item"}));
		comboBox_0.setBackground(Color.WHITE);
		comboBox_0.setForeground(Color.BLACK);
		comboBox_0.setBorder(null);
		comboBox_0.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_0.setBounds(48, 185, 200, 25);
		contentPane.add(comboBox_0);
		
		JComboBox<Object> comboBox_1 = new JComboBox<Object>();
		comboBox_1.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "Potnoma Silk", "Laccha Buta Silk", "Plain Body Silk", "Taitanik Silk", "BT Brocet Katan", "Three Pis Silk", 
				"Jorjet Than", "Net Than", "Chinigurah Than", "Dupyain Than", "Varaities Than", "IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna", "Others Item", 
				"Lot Item"}));
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_1.setBorder(null);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(48, 221, 200, 25);
		contentPane.add(comboBox_1);
		
		JComboBox<Object> comboBox_2 = new JComboBox<Object>();
		comboBox_2.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "Laccha Buta Silk", "Plain Body Silk", "Taitanik Silk", "BT Brocet Katan", "Three Pis Silk", "Jorjet Than", 
				"Net Than", "Chinigurah Than", "Dupyain Than", "Varaities Than", "IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna", "Others Item", "Lot Item"}));
		comboBox_2.setForeground(Color.BLACK);
		comboBox_2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_2.setBorder(null);
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(48, 257, 200, 25);
		contentPane.add(comboBox_2);
		
		JComboBox<Object> comboBox_3 = new JComboBox<Object>();
		comboBox_3.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "Plain Body Silk", "Taitanik Silk", "BT Brocet Katan", "Three Pis Silk", "Jorjet Than", "Net Than", "Chinigurah Than",
				"Dupyain Than", "Varaities Than", "IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna", "Others Item", "Lot Item"}));
		comboBox_3.setForeground(Color.BLACK);
		comboBox_3.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_3.setBorder(null);
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setBounds(48, 293, 200, 25);
		contentPane.add(comboBox_3);
		
		JComboBox<Object> comboBox_4 = new JComboBox<Object>();
		comboBox_4.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "Taitanik Silk", "BT Brocet Katan", "Three Pis Silk", "Jorjet Than", "Net Than", "Chinigurah Than", "Dupyain Than",
				"Varaities Than", "IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna", "Others Item", "Lot Item"}));
		comboBox_4.setForeground(Color.BLACK);
		comboBox_4.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_4.setBorder(null);
		comboBox_4.setBackground(Color.WHITE);
		comboBox_4.setBounds(48, 329, 200, 25);
		contentPane.add(comboBox_4);
		
		JComboBox<Object> comboBox_5 = new JComboBox<Object>();
		comboBox_5.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "BT Brocet Katan", "Three Pis Silk", "Jorjet Than", "Net Than", "Chinigurah Than", "Dupyain Than", "Varaities Than",
				"IC Benaroshi Katan", "IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna", "Others Item", "Lot Item"}));
		comboBox_5.setForeground(Color.BLACK);
		comboBox_5.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_5.setBorder(null);
		comboBox_5.setBackground(Color.WHITE);
		comboBox_5.setBounds(48, 365, 200, 25);
		contentPane.add(comboBox_5);
		
		JComboBox<Object> comboBox_6 = new JComboBox<Object>();
		comboBox_6.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "Three Pis Silk", "Jorjet Than", "Net Than", "Chinigurah Than", "Dupyain Than", "Varaities Than", "IC Benaroshi Katan",
				"IC Party Sharee", "IC Pure Katan", "IC Stone Katan", "Orna", "Others Item", "Lot Item"}));
		comboBox_6.setForeground(Color.BLACK);
		comboBox_6.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		comboBox_6.setBorder(null);
		comboBox_6.setBackground(Color.WHITE);
		comboBox_6.setBounds(48, 401, 200, 25);
		contentPane.add(comboBox_6);
		
		takaField1 = new JTextField();
		takaField1.setHorizontalAlignment(SwingConstants.CENTER);
		takaField1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField1.setColumns(10);
		takaField1.setBorder(null);
		takaField1.setBounds(368, 185, 100, 25);
		contentPane.add(takaField1);
		
		takaField2 = new JTextField();
		takaField2.setHorizontalAlignment(SwingConstants.CENTER);
		takaField2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField2.setColumns(10);
		takaField2.setBorder(null);
		takaField2.setBounds(368, 221, 100, 25);
		contentPane.add(takaField2);
		
		takaField4 = new JTextField();
		takaField4.setHorizontalAlignment(SwingConstants.CENTER);
		takaField4.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField4.setColumns(10);
		takaField4.setBorder(null);
		takaField4.setBounds(368, 293, 100, 25);
		contentPane.add(takaField4);
		
		takaField3 = new JTextField();
		takaField3.setHorizontalAlignment(SwingConstants.CENTER);
		takaField3.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField3.setColumns(10);
		takaField3.setBorder(null);
		takaField3.setBounds(368, 257, 100, 25);
		contentPane.add(takaField3);
		
		takaField6 = new JTextField();
		takaField6.setHorizontalAlignment(SwingConstants.CENTER);
		takaField6.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField6.setColumns(10);
		takaField6.setBorder(null);
		takaField6.setBounds(368, 365, 100, 25);
		contentPane.add(takaField6);
		
		takaField5 = new JTextField();
		takaField5.setHorizontalAlignment(SwingConstants.CENTER);
		takaField5.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField5.setColumns(10);
		takaField5.setBorder(null);
		takaField5.setBounds(368, 329, 100, 25);
		contentPane.add(takaField5);
		
		takaField7 = new JTextField();
		takaField7.setHorizontalAlignment(SwingConstants.CENTER);
		takaField7.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		takaField7.setColumns(10);
		takaField7.setBorder(null);
		takaField7.setBounds(368, 401, 100, 25);
		contentPane.add(takaField7);
		
		pieceField1 = new JTextField();
		pieceField1.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField1.setColumns(10);
		pieceField1.setBorder(null);
		pieceField1.setBounds(258, 185, 100, 25);
		contentPane.add(pieceField1);
		
		pieceField2 = new JTextField();
		pieceField2.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField2.setColumns(10);
		pieceField2.setBorder(null);
		pieceField2.setBounds(258, 221, 100, 25);
		contentPane.add(pieceField2);
		
		pieceField3 = new JTextField();
		pieceField3.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField3.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField3.setColumns(10);
		pieceField3.setBorder(null);
		pieceField3.setBounds(258, 257, 100, 25);
		contentPane.add(pieceField3);
		
		pieceField4 = new JTextField();
		pieceField4.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField4.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField4.setColumns(10);
		pieceField4.setBorder(null);
		pieceField4.setBounds(258, 293, 100, 25);
		contentPane.add(pieceField4);
		
		pieceField5 = new JTextField();
		pieceField5.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField5.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField5.setColumns(10);
		pieceField5.setBorder(null);
		pieceField5.setBounds(258, 329, 100, 25);
		contentPane.add(pieceField5);
		
		pieceField6 = new JTextField();
		pieceField6.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField6.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField6.setColumns(10);
		pieceField6.setBorder(null);
		pieceField6.setBounds(258, 365, 100, 25);
		contentPane.add(pieceField6);
		
		pieceField7 = new JTextField();
		pieceField7.setHorizontalAlignment(SwingConstants.CENTER);
		pieceField7.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pieceField7.setColumns(10);
		pieceField7.setBorder(null);
		pieceField7.setBounds(258, 401, 100, 25);
		contentPane.add(pieceField7);
		
		total_taka_Field = new JTextField();
		total_taka_Field.setEditable(false);
		total_taka_Field.setHorizontalAlignment(SwingConstants.CENTER);
		total_taka_Field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		total_taka_Field.setColumns(10);
		total_taka_Field.setBorder(null);
		total_taka_Field.setBounds(641, 185, 129, 30);
		contentPane.add(total_taka_Field);
		
		paid_taka_Field = new JTextField();
		paid_taka_Field.setHorizontalAlignment(SwingConstants.CENTER);
		paid_taka_Field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		paid_taka_Field.setColumns(10);
		paid_taka_Field.setBorder(null);
		paid_taka_Field.setBounds(641, 376, 129, 30);
		contentPane.add(paid_taka_Field);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblTotal.setBounds(641, 160, 129, 25);
		contentPane.add(lblTotal);
		
		JLabel lblPaid = new JLabel("Paid");
		lblPaid.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaid.setForeground(Color.WHITE);
		lblPaid.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblPaid.setBounds(641, 352, 129, 25);
		contentPane.add(lblPaid);
		
		JLabel lblDue = new JLabel("Due");
		lblDue.setHorizontalAlignment(SwingConstants.CENTER);
		lblDue.setForeground(Color.WHITE);
		lblDue.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblDue.setBounds(641, 221, 129, 25);
		contentPane.add(lblDue);
		
		due_taka_Field = new JTextField();
		due_taka_Field.setText(due);
		due_taka_Field.setEditable(false);
		due_taka_Field.setHorizontalAlignment(SwingConstants.CENTER);
		due_taka_Field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		due_taka_Field.setColumns(10);
		due_taka_Field.setBorder(null);
		due_taka_Field.setBounds(641, 246, 129, 30);
		contentPane.add(due_taka_Field);
		
		discount_taka_Field = new JTextField();
		discount_taka_Field.setHorizontalAlignment(SwingConstants.CENTER);
		discount_taka_Field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		discount_taka_Field.setColumns(10);
		discount_taka_Field.setBorder(null);
		discount_taka_Field.setBounds(641, 311, 129, 30);
		contentPane.add(discount_taka_Field);
		
		JLabel lblDiscount = new JLabel("Discount");
		lblDiscount.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiscount.setForeground(Color.WHITE);
		lblDiscount.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblDiscount.setBounds(641, 287, 129, 25);
		contentPane.add(lblDiscount);
		
		addressField = new JTextField();
		addressField.setText(address);
		addressField.setHorizontalAlignment(SwingConstants.CENTER);
		addressField.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		addressField.setColumns(10);
		addressField.setBorder(null);
		addressField.setBounds(478, 113, 153, 25);
		contentPane.add(addressField);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblAddress.setBounds(478, 88, 153, 25);
		contentPane.add(lblAddress);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(251, 48, 318, 2);
		contentPane.add(separator);
		
		user_field = new JTextField();
		user_field.setText(user_name);
		user_field.setHorizontalAlignment(SwingConstants.RIGHT);
		user_field.setForeground(Color.WHITE);
		user_field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
		user_field.setEditable(false);
		user_field.setColumns(10);
		user_field.setBorder(null);
		user_field.setBackground(new Color(51, 0, 102));
		user_field.setBounds(609, 48, 193, 24);
		contentPane.add(user_field);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
					
					String date = d.format(dateChooser.getDate());
					
					String name = nameField.getText();
					String address = addressField.getText();
					String memo = memoField.getText();
					
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
					
					int max = 0;
					Date max_date = null;
					
					int due_taka = Integer.parseInt(due);
					
					if(discount_taka_Field.getText().equals("")) {
						discount_taka_Field.setText(""+0);
					}
					int discount_taka = Integer.parseInt(discount_taka_Field.getText());
					
					String paid_taka = paid_taka_Field.getText();
					
					
					if(!name.equals("") && !memo.equals("")) {
						
						int total_taka = due_taka;
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
						
						
						//************************************Check selected item*******************************************//
						
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
							//fatema_silk_house
							Class.forName("com.mysql.jdbc.Driver");  
							String url = "jdbc:ucanaccess://H://Fatema Silk House.accdb";
							Connection con=DriverManager.getConnection(url);
							
							//*************************************Write into sell_item_all/tk and sell_stock************************************************//
							Statement stmt=con.createStatement();  
							ResultSet rs0=stmt.executeQuery("SELECT date FROM `sell_stock` WHERE date = '"+date+"'");
							if(!rs0.next()) {//date is not matched so insert
								
								if(!item0.equals("select") && !piece1.equals("") && !taka1.equals("") /*&& !paid_taka.equals("")*/) {
									if(!item1.equals("select") && !piece2.equals("") && !taka2.equals("")) {
										if(!item2.equals("select") && !piece3.equals("") && !taka3.equals("")) {
											if(!item3.equals("select") && !piece4.equals("") && !taka4.equals("")) {
												if(!item4.equals("select") && !piece5.equals("") && !taka5.equals("")) {
													if(!item5.equals("select") && !piece6.equals("") && !taka6.equals("")) {
														if(!item6.equals("select") && !piece7.equals("") && !taka7.equals("")) {
															PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `"+item6+"`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																	+ "'"+piece5+"', '"+piece6+"', '"+piece7+"')");
															ps0.executeUpdate();
															
															PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `"+item6+"`, `due`, `paid`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"',"
																	+ "'"+taka5+"', '"+taka6+"', '"+taka7+"', '"+due_taka+"', '"+paid_taka+"')");
															ps1.executeUpdate();
															
															PreparedStatement ps2 = con.prepareStatement("INSERT INTO `sell_stock`(`date`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `"+item6+"`) VALUES ('"+date+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																	+ "'"+piece5+"', '"+piece6+"', '"+piece7+"')");
															ps2.executeUpdate();
														}
														else {
															PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`) VALUES ('"+date+"' , '"+name+"','"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																	+ "'"+piece5+"', '"+piece6+"')");
															ps0.executeUpdate();
															
															PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `due`, `paid`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"',"
																	+ "'"+taka5+"', '"+taka6+"', '"+due_taka+"', '"+paid_taka+"')");
															ps1.executeUpdate();
															
															PreparedStatement ps2 = con.prepareStatement("INSERT INTO `sell_stock`(`date`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`) VALUES ('"+date+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																	+ "'"+piece5+"', '"+piece6+"')");
															ps2.executeUpdate();
														}
													}
													else {
														PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																+ " `"+item4+"`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																+ "'"+piece5+"')");
														ps0.executeUpdate();
														
														PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																+ " `"+item4+"`, `due`, `paid`) VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"',"
																+ "'"+taka5+"', '"+due_taka+"', '"+paid_taka+"')");
														ps1.executeUpdate();
														
														PreparedStatement ps2 = con.prepareStatement("INSERT INTO `sell_stock`(`date`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																+ " `"+item4+"`) VALUES ('"+date+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																+ "'"+piece5+"')");
														ps2.executeUpdate();
													}
												}
												else {
													PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`) "
															+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"')");
													ps0.executeUpdate();
													
													PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`, `due`, `paid`) "
															+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"', '"+due_taka+"', '"+paid_taka+"')");
													ps1.executeUpdate();
													
													PreparedStatement ps2 = con.prepareStatement("INSERT INTO `sell_stock`(`date`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`) "
															+ "VALUES ('"+date+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"')");
													ps2.executeUpdate();
												}
											}
											else {
												PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`) "
														+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"')");
												ps0.executeUpdate();
												
												PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `due`, `paid`) "
														+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+due_taka+"', '"+paid_taka+"')");
												ps1.executeUpdate();
												
												PreparedStatement ps2 = con.prepareStatement("INSERT INTO `sell_stock`(`date`, `"+item0+"`, `"+item1+"`, `"+item2+"`) "
														+ "VALUES ('"+date+"', '"+piece1+"', '"+piece2+"', '"+piece3+"')");
												ps2.executeUpdate();
											}
										}
										else {
											PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`) "
													+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"')");
											ps0.executeUpdate();
											
											PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `due`, `paid`) "
													+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+due_taka+"', '"+paid_taka+"')");
											ps1.executeUpdate();
											
											PreparedStatement ps2 = con.prepareStatement("INSERT INTO `sell_stock`(`date`, `"+item0+"`, `"+item1+"`) "
													+ "VALUES ('"+date+"', '"+piece1+"', '"+piece2+"')");
											ps2.executeUpdate();
										}
									}
									else {
										PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`) "
												+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+piece1+"')");
										ps0.executeUpdate();
										
										PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `due`, `paid`) "
												+ "VALUES ('"+date+"' , '"+name+"', '"+address+"', '"+memo+"', '"+taka1+"', '"+due_taka+"', '"+paid_taka+"')");
										ps1.executeUpdate();
										
										PreparedStatement ps2 = con.prepareStatement("INSERT INTO `sell_stock`(`date`, `"+item0+"`) "
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
															PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `"+item6+"`) VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																	+ "'"+piece5+"', '"+piece6+"', '"+piece7+"')");
															ps0.executeUpdate();
															
															PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `"+item6+"`, `due`, `paid`) VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"',"
																	+ "'"+taka5+"', '"+taka6+"', '"+taka7+"', '"+due_taka+"', '"+paid_taka+"')");
															ps1.executeUpdate();
														}
														else {
															PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`) VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																	+ "'"+piece5+"', '"+piece6+"')");
															ps0.executeUpdate();
															
															PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																	+ " `"+item4+"`, `"+item5+"`, `due`, `paid`) VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"',"
																	+ "'"+taka5+"', '"+taka6+"', '"+due_taka+"', '"+paid_taka+"')");
															ps1.executeUpdate();
														}
													}
													else {
														PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																+ " `"+item4+"`) VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"',"
																+ "'"+piece5+"')");
														ps0.executeUpdate();
														
														PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`,"
																+ " `"+item4+"`, `due`, `paid`) VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"',"
																+ "'"+taka5+"', '"+due_taka+"', '"+paid_taka+"')");
														ps1.executeUpdate();
													}
												}
												else {
													PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`) "
															+ "VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"', '"+piece4+"')");
													ps0.executeUpdate();
													
													PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `"+item3+"`, `due`, `paid`) "
															+ "VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+taka4+"', '"+due_taka+"', '"+paid_taka+"')");
													ps1.executeUpdate();
												}
											}
											else {
												PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`) "
														+ "VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"', '"+piece3+"')");
												ps0.executeUpdate();
												
												PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `"+item2+"`, `due`, `paid`) "
														+ "VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+taka3+"', '"+due_taka+"', '"+paid_taka+"')");
												ps1.executeUpdate();
											}
										}
										else {
											PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`) "
													+ "VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+piece1+"', '"+piece2+"')");
											ps0.executeUpdate();
											
											PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `"+item1+"`, `due`, `paid`) "
													+ "VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+taka1+"', '"+taka2+"', '"+due_taka+"', '"+paid_taka+"')");
											ps1.executeUpdate();
										}
									}
									else {
										PreparedStatement ps0 = con.prepareStatement("INSERT INTO `sell_item_all`(`date`, `name`, `address`, `memo`, `"+item0+"`) "
												+ "VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+piece1+"')");
										ps0.executeUpdate();
										
										PreparedStatement ps1 = con.prepareStatement("INSERT INTO `sell_item_all_tk`(`date`, `name`, `address`, `memo`, `"+item0+"`, `due`, `paid`) "
												+ "VALUES ('"+date+"' , '"+name+"',  '"+address+"', '"+memo+"', '"+taka1+"', '"+due_taka+"', '"+paid_taka+"')");
										ps1.executeUpdate();
									}
								}
								
								//*************************************Update sell_stock**************************************//
								
								ResultSet rs1=stmt.executeQuery("SELECT `date`, `opera_silk`, `potnoma_silk`, `laccha_buta_silk`, `plain_body_silk`, `taitanik_silk`, `bt_brocet_katan`, "
										+ "`three_pis_silk`, `jorjet_than`, `net_than`, `chinigurah_than`, `dupyain_than`, `varaities_than`, `ic_benaroshi_katan`, `ic_party_sharee`, "
										+ "`ic_pure_katan`, `ic_stone_katan`, `orna`, `others_item`, `lot_item`, `new_item` FROM `sell_stock` WHERE date = '"+date+"'");
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
									
									ResultSet rs3=stmt.executeQuery("SELECT MAX(ID) FROM `sell_item_all`;");
									if(rs3.next()) {
										max = rs3.getInt(1);
										
										ResultSet rs2=stmt.executeQuery("SELECT `date`,`name`, `address`, `opera_silk`, `potnoma_silk`, `laccha_buta_silk`, `plain_body_silk`, `taitanik_silk`, `bt_brocet_katan`,"
												+ "`three_pis_silk`, `jorjet_than`, `net_than`, `chinigurah_than`, `dupyain_than`, `varaities_than`, `ic_benaroshi_katan`, `ic_party_sharee`,"
												+ "`ic_pure_katan`, `ic_stone_katan`, `orna`, `others_item`, `lot_item`, `new_item` FROM `sell_item_all` WHERE ID = '"+max+"';");
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
											
											PreparedStatement ps2 = con.prepareStatement("UPDATE `sell_stock` SET `date`='"+date+"',`opera_silk`='"+opera_silk+"',`potnoma_silk`='"+potnoma_silk+"',`laccha_buta_silk`='"+laccha_buta_silk+"',"
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
									
									
									ResultSet rs22=stmt.executeQuery("SELECT MAX(ID) FROM `sell_item_all`;");
									if(rs22.next()) {
										max = rs22.getInt(1);
										
										ResultSet rs2=stmt.executeQuery("SELECT `date`,`name`, `address`, `opera_silk`, `potnoma_silk`, `laccha_buta_silk`, `plain_body_silk`, `taitanik_silk`, `bt_brocet_katan`,"
												+ "`three_pis_silk`, `jorjet_than`, `net_than`, `chinigurah_than`, `dupyain_than`, `varaities_than`, `ic_benaroshi_katan`, `ic_party_sharee`,"
												+ "`ic_pure_katan`, `ic_stone_katan`, `orna`, `others_item`, `lot_item`, `new_item` FROM `sell_item_all` WHERE ID = '"+max+"';");
										if(rs2.next()) {
											opera_silk -= rs2.getInt(4);
											potnoma_silk -= rs2.getInt(5);
											laccha_buta_silk -= rs2.getInt(6);
											plain_body_silk -= rs2.getInt(7);

											taitanik_silk -= rs2.getInt(8);
											bt_brocet_katan -= rs2.getInt(9);
											three_pis_silk -= rs2.getInt(10);
											jorjet_than -= rs2.getInt(11);

											net_than -= rs2.getInt(12);
											chinigurah_than -= rs2.getInt(13);
											dupyain_than -= rs2.getInt(14);
											varaities_than -= rs2.getInt(15);

											ic_benaroshi_katan -= rs2.getInt(16);
											ic_party_sharee -= rs2.getInt(17);
											ic_pure_katan -= rs2.getInt(18);
											ic_stone_katan -= rs2.getInt(19);

											orna -= rs2.getInt(20);
											others_item -= rs2.getInt(21);
											lot_item -= rs2.getInt(22);
											new_item -= rs2.getInt(23);
											
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
							JOptionPane.showMessageDialog(null, "!! write into database !!\n"+e1);
						}
						
						nameField.setText(null);
						dateChooser.setDate(null);
						addressField.setText(null);
						memoField.setText(null);
						
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
						JOptionPane.showMessageDialog(null, "Name or Memo Can not be empty.");
					}
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Date empty");
				}
			}
		});
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setBackground(new Color(0, 102, 102));
		btnSubmit.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		btnSubmit.setBorder(null);
		btnSubmit.setBounds(640, 419, 130, 30);
		contentPane.add(btnSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBack.addActionListener(new ActionListener() {
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
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		btnBack.setBorder(null);
		btnBack.setBackground(new Color(128, 0, 0));
		btnBack.setBounds(503, 419, 130, 30);
		contentPane.add(btnBack);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int total_taka = Integer.parseInt(due);
					
					if(discount_taka_Field.getText().equals("")) {
						discount_taka_Field.setText(""+0);
					}
					
					int discount_taka = Integer.parseInt(discount_taka_Field.getText());
					int due_taka = Integer.parseInt(due);
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
		btnCalculate.setBounds(503, 376, 130, 30);
		contentPane.add(btnCalculate);	
	}
}
