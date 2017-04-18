import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class CreateElection extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldECID;
	private JTextField textFieldElectionName;
	private JButton btnCreate;
	
	/**
	 * Launch the application. ***TESTING ONLY
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateElection frame = new CreateElection();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public CreateElection() {
		setResizable(false);
		setFont(new Font("Arial", Font.PLAIN, 18));
		setIconImage(Toolkit.getDefaultToolkit().getImage(CreateElection.class.getResource("/images/Deku_Link_Artwork.png")));
		setTitle("Create Election");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 332, 282);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Election Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 13, 305, 178);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblElectionName = new JLabel("Election Name:");
		lblElectionName.setBounds(12, 23, 168, 16);
		panel.add(lblElectionName);
		
		JLabel lblElectionCommissioner = new JLabel("Election Commissioner (ID):");
		lblElectionCommissioner.setBounds(12, 98, 168, 16);
		panel.add(lblElectionCommissioner);
		
		textFieldECID = new JTextField();
		textFieldECID.setBounds(12, 127, 168, 22);
		panel.add(textFieldECID);
		textFieldECID.setColumns(10);
		
		textFieldElectionName = new JTextField();
		textFieldElectionName.setColumns(10);
		textFieldElectionName.setBounds(12, 52, 168, 22);
		panel.add(textFieldElectionName);
		
		
		btnCreate = new JButton("Create");
		btnCreate.setBounds(217, 204, 97, 25);
		contentPane.add(btnCreate);
		
		JTextArea txtrnoteTheElection = new JTextArea();
		txtrnoteTheElection.setBackground(Color.RED);
		txtrnoteTheElection.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrnoteTheElection.setEditable(false);
		txtrnoteTheElection.setText("***Note: The election comissioner will have \nto login to continue with the election/\nballot creation process***");
		txtrnoteTheElection.setBounds(0, 194, 210, 53);
		contentPane.add(txtrnoteTheElection);
	}
	public JButton getCreateButton()
	{
		return btnCreate;
	}
	
	public String getElectionName()
	{
		return textFieldElectionName.getText();
	}
	
	public String getElectionCommissioner()
	{
		return textFieldECID.getText();
	}
}
