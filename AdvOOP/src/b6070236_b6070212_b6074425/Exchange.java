package b6070236_b6070212_b6074425;

import java.awt.EventQueue;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
@SuppressWarnings("serial")
public class Exchange extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	/**
	 * Launch the application.
	 * 
	 */
	public static void main(String[] args){	
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Exchange frame = new Exchange();
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
	public Exchange() {	
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 265, 497);		
		getContentPane().setLayout(null);
		
		JLabel lblBtc = new JLabel("BTC");
		lblBtc.setBounds(12, 109, 56, 16);
		getContentPane().add(lblBtc);
		
		JLabel lblEth = new JLabel("ETH");
		lblEth.setBounds(12, 155, 56, 16);
		getContentPane().add(lblEth);
		
		JLabel lblXrp = new JLabel("XRP");
		lblXrp.setBounds(12, 198, 56, 16);
		getContentPane().add(lblXrp);
		
		textField = new JTextField();
		textField.setBounds(62, 61, 116, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblThb = new JLabel("THB");
		lblThb.setBounds(12, 64, 38, 16);
		getContentPane().add(lblThb);
		
		JLabel label = new JLabel("\u0E01\u0E23\u0E38\u0E13\u0E32\u0E43\u0E2A\u0E48\u0E40\u0E07\u0E34\u0E19\u0E1A\u0E32\u0E17\u0E43\u0E19\u0E0A\u0E48\u0E2D\u0E07\u0E27\u0E48\u0E32\u0E07");
		label.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label.setBounds(12, 13, 210, 35);
		getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(62, 106, 116, 22);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(62, 152, 116, 22);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(62, 195, 116, 22);
		getContentPane().add(textField_3);
		JTextPane textPane = new JTextPane();
		textPane.setBounds(12, 321, 210, 116);
		getContentPane().add(textPane);
		JButton button = new JButton("\u0E04\u0E33\u0E19\u0E27\u0E13");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double [] CyPrice = new double[4];
				double THB = Double.parseDouble(textField.getText());
				CyPrice[0] = THB/249324.74 ;
				String s = String.format("%.2f",CyPrice[0]);				
				CyPrice[0] = Double.parseDouble(s);				
				textField_1.setText(s);
				
				CyPrice[1] = THB/5429 ;
				s = String.format("%.2f",CyPrice[1]);				
				CyPrice[1] = Double.parseDouble(s);				
				textField_2.setText(s);
				
				CyPrice[2] = THB/7.49 ;
				s = String.format("%.2f",CyPrice[2]);				
				CyPrice[2] = Double.parseDouble(s);				
				textField_3.setText(s);
				CyPrice[3] = THB;
				
				int n = CyPrice.length; 
		        for (int i = 0; i < n-1; i++) 
		            for (int j = 0; j < n-i-1; j++) 
		                if (CyPrice[j] > CyPrice[j+1]) 
		                { 
		                double temp = CyPrice[j]; 
		                CyPrice[j] = CyPrice[j+1]; 
		                CyPrice[j+1] = temp; 
	                } 
		        textPane.setText(Double.toString(CyPrice[0])+"\n"+Double.toString(CyPrice[1])+"\n"+Double.toString(CyPrice[2])+"\n"+Double.toString(CyPrice[3])+"\n");
	    } 
			
		});
		button.setBounds(62, 242, 97, 25);
		getContentPane().add(button);
		
		JLabel label_1 = new JLabel("\u0E40\u0E23\u0E35\u0E22\u0E07\u0E08\u0E33\u0E19\u0E27\u0E19\u0E40\u0E07\u0E34\u0E19\u0E08\u0E32\u0E01\u0E19\u0E49\u0E2D\u0E22\u0E44\u0E1B\u0E21\u0E32\u0E01");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(12, 273, 210, 35);
		getContentPane().add(label_1);
		
		
	
	}
}
