package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class MainMenuForm extends JFrame {

	private JPanel mainPanel;
	public JLabel nameLabel = new JLabel();
	
	public MainMenuForm() {
		setTitle("Portfolio");
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Logo_Home.png"));
		setSize(922, 600);	
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setLocationRelativeTo(null);
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(0, 0, 0));
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));	
		mainPanel.setLayout(null);
		setContentPane(mainPanel);
		
		PanelRound GetToKnowMePanel = new main.PanelRound();
		GetToKnowMePanel.setBounds(0, 169, 466, 83);
		mainPanel.add(GetToKnowMePanel);
		GetToKnowMePanel.setRoundBottomRight(50);
		GetToKnowMePanel.setRoundTopRight(50);
		GetToKnowMePanel.setOpaque(false);
		GetToKnowMePanel.setBackground(new Color(70, 60, 47, 150));
		GetToKnowMePanel.setLayout(null);
		
		JLabel GetToKnowMeLabel = new JLabel();
		GetToKnowMeLabel.setText("Get To Know Me");
		GetToKnowMeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 54));
		GetToKnowMeLabel.setForeground(new Color(255, 255, 255));
		GetToKnowMeLabel.setBounds(27, 11, 399, 61);
		GetToKnowMePanel.add(GetToKnowMeLabel);
		
		JPanel TopPanel = new JPanel();
		TopPanel.setBackground(new Color(0, 0, 0));
		TopPanel.setBounds(0, 0, 784, 83);
		mainPanel.add(TopPanel);
		TopPanel.setLayout(null);
		
		JLabel Logo = new JLabel();
		Logo.setHorizontalAlignment(SwingConstants.CENTER);
		Logo.setIcon(new ImageIcon("src/Logo_Home.png"));
		Logo.setBounds(342, 0, 100, 83);
		TopPanel.add(Logo);
		
		JLabel infoBtn = new JLabel();	
		infoBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		infoBtn.setIcon(new ImageIcon("src/user.png"));
		infoBtn.setHorizontalAlignment(SwingConstants.CENTER);
		infoBtn.setBounds(37, 19, 32, 32);
		TopPanel.add(infoBtn);
		
		JLabel HobbiesBtn = new JLabel();
		HobbiesBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		HobbiesBtn.setText("Hobbies");
		HobbiesBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		HobbiesBtn.setForeground(new Color(255, 255, 255));
		HobbiesBtn.setBounds(100, 27, 53, 18);
		TopPanel.add(HobbiesBtn);
		
		JLabel SkillsBtn = new JLabel();
		SkillsBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SkillsBtn.setText("Skills");
		SkillsBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		SkillsBtn.setForeground(Color.WHITE);
		SkillsBtn.setBounds(173, 27, 32, 18);
		TopPanel.add(SkillsBtn);
		
		JLabel ExperienceBtn = new JLabel();
		ExperienceBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ExperienceBtn.setText("Experience");
		ExperienceBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		ExperienceBtn.setForeground(Color.WHITE);
		ExperienceBtn.setBounds(225, 27, 70, 18);
		TopPanel.add(ExperienceBtn);
		
		JLabel logoutBtn = new JLabel();
		logoutBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logoutBtn.setIcon(new ImageIcon("src/logout.png"));
		logoutBtn.setForeground(Color.WHITE);
		logoutBtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		logoutBtn.setBounds(740, 27, 24, 24);
		TopPanel.add(logoutBtn);
		
		JLabel ProfileImage = new JLabel();
		ProfileImage.setHorizontalAlignment(SwingConstants.CENTER);
		ProfileImage.setIcon(new ImageIcon("src/home_profile.png"));
		ProfileImage.setBounds(250, 152, 299, 373);
		mainPanel.add(ProfileImage);
		
		JLabel BiyotLabel = new JLabel("<HTML>This portfolio will be passed to Dr. Angelique Lacasandile.</HTML>");
		BiyotLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		BiyotLabel.setForeground(new Color(255, 255, 255));
		BiyotLabel.setBounds(74, 386, 140, 139);
		mainPanel.add(BiyotLabel);
		
		JLabel BiyotLabel2 = new JLabel("<HTML>My portfolio is composed of information about myself. It was made with a sense of minimalist and elegant design.</HTML>");
		BiyotLabel2.setForeground(Color.WHITE);
		BiyotLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		BiyotLabel2.setBounds(612, 156, 154, 256);
		mainPanel.add(BiyotLabel2);
		
		JLabel FacebookLogo = new JLabel();
		FacebookLogo.setHorizontalAlignment(SwingConstants.CENTER);
		FacebookLogo.setIcon(new ImageIcon("src/facebook.png"));
		FacebookLogo.setBounds(656, 488, 32, 41);
		mainPanel.add(FacebookLogo);
		
		JLabel InstagramLogo = new JLabel();
		InstagramLogo.setIcon(new ImageIcon("src/instagram.png"));
		InstagramLogo.setHorizontalAlignment(SwingConstants.CENTER);
		InstagramLogo.setBounds(607, 488, 32, 41);
		mainPanel.add(InstagramLogo);
		
		JLabel GithubLogo = new JLabel();
		GithubLogo.setIcon(new ImageIcon("src/github.png"));
		GithubLogo.setHorizontalAlignment(SwingConstants.CENTER);
		GithubLogo.setBounds(705, 488, 32, 41);
		mainPanel.add(GithubLogo);
		
		infoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				infoBtnmouseClicked(evt);
			}
		});
		
		logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				logoutBtnmouseClicked(evt);
			}
		});
		
		HobbiesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				HobbiesBtnmouseClicked(evt);
			}
		});
		
		SkillsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				SkillsBtnmouseClicked(evt);
			}
		});
		
		ExperienceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				ExperienceBtnmouseClicked(evt);
			}
		});
	}
	
	private void infoBtnmouseClicked(java.awt.event.MouseEvent evt) {
		InfoForm info = new InfoForm();
		info.setVisible(true);
		dispose();
	}
	

	private void logoutBtnmouseClicked(java.awt.event.MouseEvent evt) {
		LoginForm logout = new LoginForm();
		logout.setVisible(true);
		dispose();
	}
	
	private void HobbiesBtnmouseClicked(java.awt.event.MouseEvent evt) {
		 Hobbies hobbies = new Hobbies();
		 hobbies.setVisible(true);
		 dispose();
	}
	
	private void SkillsBtnmouseClicked(java.awt.event.MouseEvent evt) {
		Skills skills = new Skills();
		skills.setVisible(true);
		dispose();
	}
	
	private void ExperienceBtnmouseClicked(java.awt.event.MouseEvent evt) {
		Experience experience = new Experience();
		experience.setVisible(true);
		dispose();
	}
	
	public static void main(String[] args) {
		new MainMenuForm().setVisible(true);;
	}
}
