package b6070236_b6070212_b6074425;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;


public class  Calculatcar extends JFrame {
	private JPanel contentPane;
	protected double month,price,pay,interest;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	
	Statement st;
	Connection con = null;
	ResultSet rs;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextPane textPane2;
	private JTextPane textPane3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatcar frame = new Calculatcar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	});
	}
	
	public void fileCombobox(){
//		Kinematics DB_Kinematics = new Kinematics();
//		con =DB_Kinematics.connectdatabase();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataadv", "root", "");
			String query = "select * from datamotorcycle";
			 st = con.createStatement();
			rs = st.executeQuery(query);
			while(rs.next())
			{
				comboBox.addItem(rs.getString("Brand"));
			}
		}catch(Exception e2){
			e2.printStackTrace();
		}
	}
	
	public void fileCombobox2(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataadv", "root", "");
			String query = "select * from datamotorcycle";
			st = con.createStatement();
			rs = st.executeQuery(query);
			while(rs.next())
			{
				comboBox_1.addItem(rs.getString("Model"));
			}
		}catch(Exception e2){
			e2.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public Calculatcar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 860);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21\u0E04\u0E33\u0E19\u0E27\u0E13\u0E08\u0E33\u0E19\u0E27\u0E19\u0E07\u0E27\u0E14\u0E15\u0E48\u0E2D\u0E40\u0E14\u0E37\u0E2D\u0E19");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(311, 24, 323, 45);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0E22\u0E35\u0E48\u0E2B\u0E49\u0E2D :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataadv", "root", "");
			String query = "select * from datamotorcycle";
			st = con.createStatement();
			rs = st.executeQuery(query);
		}catch(Exception e2){
			
		}
		label_1.setBounds(271, 85, 56, 22);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u0E23\u0E38\u0E48\u0E19 :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_2.setBounds(271, 137, 56, 22);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u0E23\u0E32\u0E04\u0E32 :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_3.setBounds(271, 234, 56, 22);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u0E07\u0E27\u0E14\u0E17\u0E35\u0E48\u0E15\u0E49\u0E2D\u0E07\u0E01\u0E32\u0E23\u0E1C\u0E48\u0E2D\u0E19 :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_4.setBounds(271, 187, 146, 22);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u0E14\u0E32\u0E27\u0E19\u0E4C :");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_5.setBounds(271, 283, 56, 22);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u0E14\u0E2D\u0E01\u0E40\u0E1A\u0E35\u0E49\u0E22 % :");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_6.setBounds(271, 332, 96, 22);
		contentPane.add(label_6);
		
		comboBox = new JComboBox();
//		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Honda", "Yamaha", "Suzuki", "Ducati", "BMW"}));
		comboBox.setBounds(450, 82, 167, 30);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
//		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"CBR1000RR", "R1M", "GSX-R1000", "Panigale1199", "S1000RR"}));
		comboBox_1.setBounds(450, 134, 167, 30);
		contentPane.add(comboBox_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(450, 231, 167, 30);
		contentPane.add(textPane);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"12", "24", "36", "48"}));
		comboBox_2.setBounds(450, 190, 167, 30);
		contentPane.add(comboBox_2);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(450, 280, 167, 30);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(450, 329, 167, 30);
		contentPane.add(textPane_2);
		
		JButton button_2 = new JButton("\u0E40\u0E1E\u0E34\u0E48\u0E21\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25\u0E23\u0E16");
		button_2.setBounds(726, 85, 113, 25);
		contentPane.add(button_2);
		
		
		JButton button = new JButton("\u0E04\u0E33\u0E19\u0E27\u0E13");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				month = Double.parseDouble(comboBox_2.getSelectedItem().toString());
				price = Double.parseDouble(textPane.getText());
				pay = Double.parseDouble(textPane_1.getText());
				interest = Double.parseDouble(textPane_2.getText());
				
				Mom m = new Mom();
				calculate c1 = new calculate();
				claculate3 c3 = new claculate3();
				calculate2 c2 = new calculate2();				
				c3.getFinance();
				c3.calStar(pay,price);
				c1.calInteryear(c3.getFinance(), month,interest);
				c2.calTotal(c3.getFinance(),c1.getInterest());
				c2.calInstallment(month);

				String sum = String.valueOf(c2.getInstallment());
 				
				JOptionPane.showMessageDialog(null,sum);
			}
		});
		button.setBounds(298, 404, 97, 25);
		contentPane.add(button);
		
		
//		JButton button_1 = new JButton("\u0E41\u0E19\u0E30\u0E19\u0E33");
//		button_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				price = Double.parseDouble(textPane.getText());
//				pay = Double.parseDouble(textPane_1.getText());
//				
//				Threadss T = new Threadss();
//				Threds T1 = new Threds(textPane2,textPane3);
//				Threds2 T2 = new Threds2();
//				Threads3 T3 = new Threads3();
//				T3.calStar(price, pay);
//				T3.getFinance();
//				T2.calInteryear12(T3.getFinance(),interest);
//				T2.calInteryear24(T3.getFinance(),interest);
//				T2.calInteryear36(T3.getFinance(),interest);
//				T2.calInteryear48(T3.getFinance(),interest);
//				T1.calTotal(T3.getFinance(),T2.getInterest(),T2.getInterest24(),T2.getInterest36(),T2.getInterest48());
//				T1.start();
//			    
////				T1.calInstallment();
//
////				String sum = String.valueOf(c2.getInstallment());
// 				
////				JOptionPane.showMessageDialog(null,sum);
//			}
//		});
		
		textPane2 = new JTextPane();
		textPane2.setBounds(481, 562, 335, 222);
		contentPane.add(textPane2);
		
		textPane3 = new JTextPane();
		textPane3.setBounds(82, 562, 335, 222);
		contentPane.add(textPane3);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(123, 513, 212, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(362, 513, 206, 35);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(594, 513, 206, 35);
		contentPane.add(textField_2);
		
		JButton Button = new JButton("\u0E41\u0E19\u0E30\u0E19\u0E33");
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price = Double.parseDouble(textPane.getText());
				pay = Double.parseDouble(textPane_1.getText());
				textField.setText(comboBox.getSelectedItem().toString());
				textField_1.setText(comboBox_1.getSelectedItem().toString());
				textField_2.setText(textPane_1.getText());
				Threadss T = new Threadss();
				Threds T1 = new Threds(textPane2,textPane3);
				Threds2 T2 = new Threds2();
				Threads3 T3 = new Threads3();
				T3.calStar(price, pay);
				T3.getFinance();
				T2.calInteryear12(T3.getFinance(),interest);
				T2.calInteryear24(T3.getFinance(),interest);
				T2.calInteryear36(T3.getFinance(),interest);
				T2.calInteryear48(T3.getFinance(),interest);
				T1.calTotal(T3.getFinance(),T2.getInterest(),T2.getInterest24(),T2.getInterest36(),T2.getInterest48());
				T1.calInstallment();
				T1.start();
			}
		});
		Button.setBounds(462, 404, 97, 25);
		contentPane.add(Button);
		
		JLabel lblNewLabel = new JLabel("\u0E04\u0E33\u0E41\u0E19\u0E30\u0E19\u0E33");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(382, 459, 190, 41);
		contentPane.add(lblNewLabel);
		
		fileCombobox2();
		fileCombobox();

	}
}
