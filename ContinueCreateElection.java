import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JToggleButton;

public class ContinueCreateElection extends JFrame {

	private JPanel contentPane;
	private JTextField txtElectionname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContinueCreateElection frame = new ContinueCreateElection();
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
	public ContinueCreateElection() {
		setTitle("Create Election Details");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ContinueCreateElection.class.getResource("/images/Deku_Link_Artwork.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Election Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 13, 298, 336);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtElectionname = new JTextField();
		txtElectionname.setEditable(false);
		txtElectionname.setText("ElectionName");
		txtElectionname.setBounds(12, 39, 207, 22);
		panel.add(txtElectionname);
		txtElectionname.setColumns(10);
		
		JLabel lblElectionType = new JLabel("Election Type");
		lblElectionType.setBounds(12, 74, 88, 16);
		panel.add(lblElectionType);
		
		JComboBox comboBoxType = new JComboBox();
		comboBoxType.setModel(new DefaultComboBoxModel(new String[] {"Single Ballot", "Multiple Ballot"}));
		comboBoxType.setBounds(12, 91, 207, 22);
		panel.add(comboBoxType);
		
		JLabel lblWhoCanVote = new JLabel("Who can Vote?");
		lblWhoCanVote.setBounds(12, 126, 88, 16);
		panel.add(lblWhoCanVote);
		
		JComboBox comboBoxVote = new JComboBox();
		comboBoxVote.setModel(new DefaultComboBoxModel(new String[] {"Full Time Students", "All Students", "College Specific", "Class Rank Specific"}));
		comboBoxVote.setBounds(12, 142, 207, 22);
		panel.add(comboBoxVote);
		
		JLabel lblLengthOfElection = new JLabel("Length of the Election (in days)");
		lblLengthOfElection.setBounds(12, 177, 183, 16);
		panel.add(lblLengthOfElection);
		
		JSpinner spinnerDays = new JSpinner();
		spinnerDays.setBounds(12, 194, 42, 22);
		panel.add(spinnerDays);
		
		JLabel lblHours = new JLabel("Hours");
		lblHours.setBounds(12, 221, 42, 16);
		panel.add(lblHours);
		
		JSpinner spinnerHour = new JSpinner();
		spinnerHour.setModel(new SpinnerNumberModel(0, 0, 23, 1));
		spinnerHour.setBounds(12, 240, 42, 22);
		panel.add(spinnerHour);
		
		JLabel lblMinutes = new JLabel("Minutes");
		lblMinutes.setBounds(66, 221, 54, 16);
		panel.add(lblMinutes);
		
		JSpinner spinnerMinutes = new JSpinner();
		spinnerMinutes.setModel(new SpinnerNumberModel(0, 0, 59, 1));
		spinnerMinutes.setBounds(66, 240, 42, 22);
		panel.add(spinnerMinutes);
		
		JLabel lblSeconds = new JLabel("Seconds");
		lblSeconds.setBounds(120, 221, 54, 16);
		panel.add(lblSeconds);
		
		JSpinner spinnerSeconds = new JSpinner();
		spinnerSeconds.setModel(new SpinnerNumberModel(0, 0, 59, 1));
		spinnerSeconds.setBounds(120, 240, 42, 22);
		panel.add(spinnerSeconds);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Election Length", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(322, 13, 268, 336);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnYourElectionWill = new JTextPane();
		txtpnYourElectionWill.setBounds(12, 275, 244, 48);
		panel_1.add(txtpnYourElectionWill);
		txtpnYourElectionWill.setBackground(Color.ORANGE);
		txtpnYourElectionWill.setForeground(Color.BLACK);
		txtpnYourElectionWill.setEditable(false);
		txtpnYourElectionWill.setText("If you create the election now, Your election will end on: , at");
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(12, 24, 137, 25);
		panel_1.add(tglbtnNewToggleButton);
	}
}
