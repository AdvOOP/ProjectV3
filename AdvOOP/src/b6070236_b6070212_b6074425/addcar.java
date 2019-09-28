package b6070236_b6070212_b6074425;
import java.sql.*;
import java.awt.EventQueue;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class addcar extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox_1;
	Statement st;
	Connection con = null;
	ResultSet rs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addcar frame = new addcar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * 
	 */
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
				comboBox_1.addItem(rs.getString("Brand"));
			}
		}catch(Exception e2){
			e2.printStackTrace();
		}
	}
	public addcar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		fileCombobox();
	}
}
