package main;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Cursor;

public class Hobbies extends JFrame {

	private JPanel mainPanel;
	
	public Hobbies() {
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
		
		JPanel header = new JPanel();
		header.setLocation(0, 0);
		header.setBackground(new Color(0, 0, 0));
		header.setSize(784, 101);
		mainPanel.add(header);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 96, 784, 465);
		mainPanel.add(scrollPane);
		header.setLayout(null);
		
		JLabel infoBtn = new JLabel();
		infoBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		infoBtn.setIcon(new ImageIcon("src/user.png"));
		infoBtn.setHorizontalAlignment(SwingConstants.CENTER);
		infoBtn.setBounds(21, 21, 32, 32);
		header.add(infoBtn);
		
		JLabel skillsBtn = new JLabel();
		skillsBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		skillsBtn.setText("Skills");
		skillsBtn.setForeground(Color.WHITE);
		skillsBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		skillsBtn.setBounds(158, 27, 30, 18);
		header.add(skillsBtn);
		
		JLabel experienceBtn = new JLabel();
		experienceBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		experienceBtn.setText("Experience");
		experienceBtn.setForeground(Color.WHITE);
		experienceBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		experienceBtn.setBounds(210, 27, 66, 18);
		header.add(experienceBtn);
		
		JLabel logoutBtn = new JLabel();
		logoutBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logoutBtn.setIcon(new ImageIcon("src/logout.png"));
		logoutBtn.setHorizontalAlignment(SwingConstants.CENTER);
		logoutBtn.setBounds(740, 24, 24, 24);
		header.add(logoutBtn);
		
		JLabel HobbiesLogo = new JLabel();
		HobbiesLogo.setIcon(new ImageIcon("src/hobbies_logo.png"));
		HobbiesLogo.setText("Skills");
		HobbiesLogo.setForeground(Color.WHITE);
		HobbiesLogo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		HobbiesLogo.setBounds(95, 21, 32, 32);
		header.add(HobbiesLogo);
		
		JLabel Logo = new JLabel();
		Logo.setIcon(new ImageIcon("src/Logo_Home.png"));
		Logo.setText("Skills");
		Logo.setForeground(Color.WHITE);
		Logo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Logo.setBounds(365, 12, 70, 72);
		header.add(Logo);
		
		JLabel Hobbies = new JLabel();
		scrollPane.setViewportView(Hobbies);
		Hobbies.setIcon(new ImageIcon("src/Hobbies.png"));
		Hobbies.setHorizontalAlignment(SwingConstants.CENTER);
		
		infoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				infoBtnmouseClicked(evt);
			}
		});	
		
		skillsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				skillsBtnmouseClicked(evt);
			}
		});
		
		experienceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				experienceBtnmouseClicked(evt);
			}
		});
		
		logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				logoutBtnmouseClicked(evt);
			}
		});
					
		
	}
	
		private void infoBtnmouseClicked(java.awt.event.MouseEvent evt) {
			InfoForm info = new InfoForm();
			info.setVisible(true);
			dispose();
		}
		
		private void experienceBtnmouseClicked(java.awt.event.MouseEvent evt) {
			Experience experience = new Experience();
			experience.setVisible(true);
			dispose();
		}
	
		
		private void skillsBtnmouseClicked(java.awt.event.MouseEvent evt) {
			Skills skills = new Skills();
			skills.setVisible(true);
			dispose();
		}
		
		private void logoutBtnmouseClicked(java.awt.event.MouseEvent evt) {
			MainMenuForm back = new MainMenuForm();
			back.setVisible(true);
			dispose();
		}
		

	public static void main(String[] args) {
		new Hobbies().setVisible(true);
	}
}
