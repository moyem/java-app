package version1;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Buy_Return extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField user_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buy_Return frame = new Buy_Return("Nuruzzaman");
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
	public Buy_Return(String user_name) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Buy_Return.class.getResource("/version1/logomaker.png")));
		setTitle("Buy Return");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(545, 200, 835, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("Fatema Silk House");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
		
		JSeparator separator = new JSeparator();
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(204, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
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
		
		JLabel label_1 = new JLabel("Not Developed");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial", Font.PLAIN, 10));
		
		JLabel label_2 = new JLabel("Md.Nuruzzaman \u00A92021");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Arial", Font.PLAIN, 10));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Buy_Return.class.getResource("/version1/logomaker.png")));
		
		user_field = new JTextField();
		user_field.setText(user_name);
		user_field.setHorizontalAlignment(SwingConstants.RIGHT);
		user_field.setForeground(Color.WHITE);
		user_field.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
		user_field.setEditable(false);
		user_field.setColumns(10);
		user_field.setBorder(null);
		user_field.setBackground(new Color(51, 0, 102));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(240)
					.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
					.addGap(28)
					.addComponent(user_field, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(240)
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
					.addGap(243))
				.addComponent(label, GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(240)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
					.addGap(243))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(45)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
				.addComponent(label_2, GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(51)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(38)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(user_field, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
					.addGap(8)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(6))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
