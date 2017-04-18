import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JProgressBar;
import javax.swing.JPanel;

public class ElectionGUI {

	private JFrame frmElectionLogin;
	private JTextField tfLogin;
	private JPasswordField passwordField;
	private JButton btnQuit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElectionGUI window = new ElectionGUI();
					window.frmElectionLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ElectionGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the login frame.
	 */
	private void initialize() {
		frmElectionLogin = new JFrame();
		frmElectionLogin.getContentPane().setBackground(new Color(102, 204, 204));
		frmElectionLogin.setFont(new Font("Arial", Font.PLAIN, 24));
		frmElectionLogin.setResizable(false);
		frmElectionLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(ElectionGUI.class.getResource("/images/Deku_Link_Artwork.png")));
		frmElectionLogin.setTitle("Election Login");
		frmElectionLogin.setBounds(100, 100, 683, 539);
		frmElectionLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmElectionLogin.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Arial", Font.BOLD, 24));
		lblLogin.setBounds(140, 76, 106, 49);
		frmElectionLogin.getContentPane().add(lblLogin);
		
		tfLogin = new JTextField();
		tfLogin.setFont(new Font("Arial", Font.PLAIN, 24));
		tfLogin.setBounds(347, 83, 200, 35);
		frmElectionLogin.getContentPane().add(tfLogin);
		tfLogin.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 24));
		lblPassword.setBounds(140, 182, 129, 49);
		frmElectionLogin.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 24));
		passwordField.setBounds(347, 189, 200, 35);
		frmElectionLogin.getContentPane().add(passwordField);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(false);
		progressBar.setToolTipText("");
		progressBar.setForeground(new Color(0, 204, 0));
		progressBar.setFont(new Font("Arial", Font.ITALIC, 20));
		progressBar.setBounds(182, 377, 315, 40);
		frmElectionLogin.getContentPane().add(progressBar);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() 
		{
			SwingWorker loggingIn =  new SwingWorker<Void, Void>()
			{
				    @Override
			        public Void doInBackground() 
				 	{
					 int progress = 0;
					 setProgress(0);
						while(progress < 100)
						{
							try 
							{
			                    Thread.sleep(new Random().nextInt(750));
			                } 
							catch (InterruptedException ignore) 
							{}
							progress += (new Random()).nextInt(10);
							setProgress(Math.min(progress, 100));
							progressBar.setValue(getProgress());
						}
					 return null;
				 	}
				    
				    @Override
				    public void done() 
				    {
			            Toolkit.getDefaultToolkit().beep();
			            btnLogin.setEnabled(true);
			            frmElectionLogin.setVisible(false);
			            mainMenu();
			        }
			};
			
			public void actionPerformed(ActionEvent arg0) 
			{
				btnLogin.setEnabled(false);
				progressBar.setStringPainted(true);
				loggingIn.execute();
			}
		});
		btnLogin.setFont(new Font("Arial", Font.BOLD, 24));
		btnLogin.setBounds(51, 374, 119, 43);
		frmElectionLogin.getContentPane().add(btnLogin);
		
		btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnQuit.setFont(new Font("Arial", Font.BOLD, 24));
		btnQuit.setBounds(509, 374, 119, 43);
		frmElectionLogin.getContentPane().add(btnQuit);
		
	}
	
	public void mainMenu()
	{
		ElectionMain mainMenu = new ElectionMain();
		mainMenu.setVisible(true);
	}
}
