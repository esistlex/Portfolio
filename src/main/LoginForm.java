package main;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class LoginForm extends JFrame {

	private JPanel mainPanel;
	private TxtfieldRound userTxtfield;
	private PasswordfieldRound passwordTxtfield;

	public LoginForm() {
		setTitle("Portfolio");
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Logo_Home.png"));
		setSize(800, 600);	
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setLocationRelativeTo(null);		
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(0, 0, 0));
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));	
		mainPanel.setLayout(null);
		setContentPane(mainPanel);
		
		PanelRound leftPanel = new main.PanelRound();
		leftPanel.setRoundBottomRight(50);
		leftPanel.setRoundTopRight(50);
		leftPanel.setBounds(0, 243, 207, 114);
		leftPanel.setBackground(new Color(70, 60, 47));
		mainPanel.add(leftPanel);
		leftPanel.setLayout(null);
		
		JLabel loginLabel = new JLabel();
		loginLabel.setForeground(new Color(0, 0, 0));
		loginLabel.setText("Log In");
		loginLabel.setBounds(10, 11, 187, 92);
		loginLabel.setFont(new Font("Hall Fetica", Font.PLAIN, 64));
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		leftPanel.add(loginLabel);
		
		PanelRound userPanel = new main.PanelRound();
		userPanel.setRoundBottomLeft(100);
		userPanel.setRoundBottomRight(100);
		userPanel.setRoundTopRight(100);
		userPanel.setRoundTopLeft(100);
		userPanel.setBounds(273, 28, 459, 510);
		userPanel.setBackground(new Color(70, 60, 47));
		mainPanel.add(userPanel);
		userPanel.setLayout(null);
		
		JLabel LoginLogo = new JLabel();
		LoginLogo.setText(null);
		LoginLogo.setHorizontalAlignment(SwingConstants.CENTER);
		LoginLogo.setIcon(new ImageIcon("src/Logo_Menu.png"));
		LoginLogo.setBounds(0, 11, 459, 147);
		userPanel.add(LoginLogo);
		
		JLabel emailusernameLabel = new JLabel();
		emailusernameLabel.setText("Email/Username");
		emailusernameLabel.setForeground(new Color(255, 255, 255));
		emailusernameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		emailusernameLabel.setBounds(56, 203, 192, 22);
		userPanel.add(emailusernameLabel);
	
		JLabel passwordLabel = new JLabel();
		passwordLabel.setText("Password");
		passwordLabel.setForeground(new Color(255, 255, 255));
		passwordLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		passwordLabel.setBounds(56, 309, 192, 22);
		userPanel.add(passwordLabel);
		
		userTxtfield = new TxtfieldRound();
		userTxtfield.setBorder(null);
		userTxtfield.setBackground(new Color(255, 255, 255));
		userTxtfield.setBounds(44, 236, 371, 50);
		userTxtfield.setRoundBottomLeft(50);
		userTxtfield.setRoundBottomRight(50);
		userTxtfield.setRoundTopRight(50);
		userTxtfield.setRoundTopLeft(50);
		userPanel.add(userTxtfield);
		userTxtfield.setColumns(10);
		
		JLabel loginBtn1 = new JLabel();		
		loginBtn1.setIcon(new ImageIcon("src/log_in.png"));
		loginBtn1.setHorizontalAlignment(SwingConstants.CENTER);
		loginBtn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginBtn1.setBounds(347, 419, 47, 50);
		userPanel.add(loginBtn1);
				
		JLabel loginBtn2 = new JLabel();
		loginBtn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginBtn2.setIcon(new ImageIcon("src/log_in.png"));
		loginBtn2.setHorizontalAlignment(SwingConstants.CENTER);
		loginBtn2.setBounds(317, 419, 42, 50);
		userPanel.add(loginBtn2);
			
		passwordTxtfield = new PasswordfieldRound();
		passwordTxtfield.setBorder(null);
		passwordTxtfield.setBackground(new Color(255, 255, 255));
		passwordTxtfield.setBounds(44, 342, 371, 50);
		passwordTxtfield.setRoundBottomLeft(50);
		passwordTxtfield.setRoundBottomRight(50);
		passwordTxtfield.setRoundTopRight(50);
		passwordTxtfield.setRoundTopLeft(50);
		userPanel.add(passwordTxtfield);
		
		loginBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				loginBtnMouseClicked(evt);
				}
			});
		
		loginBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				loginBtnMouseClicked(evt);
				}
			});	
	}
	
	private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {
		MainMenuForm go = new MainMenuForm();
		String user = userTxtfield.getText();
		String password = new String (passwordTxtfield.getPassword());
		System.out.println(user + " " +password);
		
		if(user.equals("Yangge") && (password.equals("betlog008"))){	
			this.dispose();
			go.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(this.mainPanel, "Incorrect Username/Email or Password entered.", "ERROR", JOptionPane.ERROR_MESSAGE);
			passwordTxtfield.setText(null);
			userTxtfield.setText(null);					
		}
	}
	
	public static void main(String[] args) {
		new LoginForm().setVisible(true);;
	}
}