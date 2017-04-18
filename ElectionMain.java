import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.ScrollPane;
import javax.swing.ScrollPaneConstants;

public class ElectionMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application. ****FOR TESTING PURPOSES ONLY!!!!!!
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElectionMain frame = new ElectionMain();
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
	public ElectionMain() {
		setResizable(false);
		setFont(new Font("Arial", Font.PLAIN, 18));
		setIconImage(Toolkit.getDefaultToolkit().getImage(ElectionMain.class.getResource("/images/Deku_Link_Artwork.png")));
		setTitle("Election System 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 975, 782);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(255, 255, 255));
		menuBar.setBackground(new Color(105, 105, 105));
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setForeground(new Color(255, 255, 255));
		mnFile.setBackground(new Color(105, 105, 105));
		mnFile.setFont(new Font("Arial", Font.PLAIN, 18));
		menuBar.add(mnFile);
		
		JMenuItem mntmQuit = new JMenuItem("Quit");
		mntmQuit.setFont(new Font("Arial", Font.PLAIN, 18));
		mnFile.add(mntmQuit);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 0));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student Options", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(12, 565, 635, 131);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnVoteIn = new JButton("Vote In");
		btnVoteIn.setBounds(12, 29, 97, 25);
		panel.add(btnVoteIn);
		
		JButton btnViewStats = new JButton("View Statistics");
		btnViewStats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnViewStats.setBounds(121, 29, 125, 25);
		panel.add(btnViewStats);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 0));
		panel_1.setBorder(new TitledBorder(null, "Administrative Actions", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(667, 565, 278, 131);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		JButton btnStopElection = new JButton("Stop Election");
		btnStopElection.setBounds(140, 30, 126, 25);
		panel_1.add(btnStopElection);
		
		JButton btnStartRecount = new JButton("Start Recount");
		btnStartRecount.setBounds(12, 61, 126, 25);
		panel_1.add(btnStartRecount);
		
		JButton btnDisqualifyAVote = new JButton("Disqualify a vote");
		btnDisqualifyAVote.setBounds(140, 61, 126, 25);
		panel_1.add(btnDisqualifyAVote);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 0));
		panel_2.setBorder(new TitledBorder(null, "Your Account Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(659, 13, 286, 383);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblName = new JLabel("Name: ");
		lblName.setFont(new Font("Arial", Font.PLAIN, 18));
		lblName.setBounds(12, 33, 262, 35);
		panel_2.add(lblName);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Arial", Font.PLAIN, 18));
		lblGender.setBounds(12, 81, 262, 35);
		panel_2.add(lblGender);
		
		JLabel lblMajor = new JLabel("Major:");
		lblMajor.setFont(new Font("Arial", Font.PLAIN, 18));
		lblMajor.setBounds(12, 129, 262, 35);
		panel_2.add(lblMajor);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Arial", Font.PLAIN, 18));
		lblAge.setBounds(12, 177, 262, 35);
		panel_2.add(lblAge);
		
		JLabel lblYear = new JLabel("Year: ");
		lblYear.setFont(new Font("Arial", Font.PLAIN, 18));
		lblYear.setBounds(12, 225, 262, 35);
		panel_2.add(lblYear);
		
		JLabel lblStudentId = new JLabel("Student ID:");
		lblStudentId.setFont(new Font("Arial", Font.PLAIN, 18));
		lblStudentId.setBounds(12, 273, 262, 35);
		panel_2.add(lblStudentId);
		
		JLabel lblAccountType = new JLabel("Account Type:");
		lblAccountType.setFont(new Font("Arial", Font.PLAIN, 18));
		lblAccountType.setBounds(12, 321, 262, 35);
		panel_2.add(lblAccountType);
		
		JLabel lblSystemTime = new JLabel("System Time:");
		lblSystemTime.setFont(new Font("Arial", Font.PLAIN, 18));
		lblSystemTime.setVerticalAlignment(SwingConstants.TOP);
		lblSystemTime.setBounds(659, 424, 264, 42);
		contentPane.add(lblSystemTime);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setSize(620, 520);
		scrollPane.setLocation(12, 13);
		contentPane.add(scrollPane);
		DefaultListModel actList = new DefaultListModel();
		actList.addElement("Election 1");
		JList list = new JList(actList);
		
		
		JButton btnCreateElection = new JButton("Create Election");
		btnCreateElection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateElection crea = new CreateElection();
				crea.setVisible(true);
				crea.getCreateButton().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						for(int i = 0; i < list.getModel().getSize(); i++)
						{
							if(actList.getElementAt(i).toString().toLowerCase().equals(crea.getElectionName().toLowerCase()))
							{
								JOptionPane.showMessageDialog(crea.getOwner(), "This Election Already Exists", "Cannot Create Election", JOptionPane.ERROR_MESSAGE);
								return;
							}
							else if(crea.getElectionName().equals("") || crea.getElectionCommissioner().equals("") || !crea.getElectionCommissioner().matches("[0-9]+"))
							{
								JOptionPane.showMessageDialog(crea.getOwner(), "You Need an Election Name &\nan Election Commissioner ID (is a number)", "Cannot Create Election", JOptionPane.ERROR_MESSAGE);
								return;
							}
						}
						actList.addElement(crea.getElectionName());
						crea.dispose();
					}
				});
			}
		});
		
		btnCreateElection.setBounds(12, 30, 126, 25);
		panel_1.add(btnCreateElection);
		
		JButton btnContinueCreation = new JButton("Continue Creation [EC]");
		btnContinueCreation.setBounds(12, 93, 171, 25);
		panel_1.add(btnContinueCreation);
		
		scrollPane.setViewportView(list);
		Timer time = new Timer(1000, new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();
				lblSystemTime.setText("System Time: " + dateFormat.format(date));
			}
			
		});
		time.start();
		
	}
}
