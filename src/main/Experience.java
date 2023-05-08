package main;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Cursor;

public class Experience extends JFrame {

	private JPanel mainPanel;
	
	public Experience() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 561);
		mainPanel.add(panel);
		panel.setLayout(null);
		
		JLabel infoBtn = new JLabel();
		infoBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		infoBtn.setHorizontalAlignment(SwingConstants.CENTER);
		infoBtn.setIcon(new ImageIcon("src/user.png"));
		infoBtn.setBounds(21, 21, 32, 32);
		panel.add(infoBtn);
		
		JLabel hobbiesBtn = new JLabel();
		hobbiesBtn.setText("Hobbies");
		hobbiesBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hobbiesBtn.setForeground(new Color(255, 255, 255));
		hobbiesBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		hobbiesBtn.setBounds(85, 27, 53, 18);
		panel.add(hobbiesBtn);
		
		JLabel skillsBtn = new JLabel();
		skillsBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		skillsBtn.setText("Skills");
		skillsBtn.setForeground(Color.WHITE);
		skillsBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		skillsBtn.setBounds(158, 27, 53, 18);
		panel.add(skillsBtn);
		
		JLabel logoutBtn = new JLabel();
		logoutBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logoutBtn.setIcon(new ImageIcon("src/logout.png"));
		logoutBtn.setHorizontalAlignment(SwingConstants.CENTER);
		logoutBtn.setBounds(740, 21, 24, 24);
		panel.add(logoutBtn);
		
		JLabel Experience = new JLabel();
		Experience.setIcon(new ImageIcon("src/Experience.png"));
		Experience.setHorizontalAlignment(SwingConstants.CENTER);
		Experience.setBounds(0, 0, 784, 561);
		panel.add(Experience);
		
		infoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				infoBtnmouseClicked(evt);
			}
		});
		
		hobbiesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				hobbiesBtnmouseClicked(evt);
			}
		});
		
		skillsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				skillsBtnmouseClicked(evt);
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
	
	private void hobbiesBtnmouseClicked(java.awt.event.MouseEvent evt) {
		Hobbies hobbies = new Hobbies();
		hobbies.setVisible(true);
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
		new Experience().setVisible(true);
	}
}
