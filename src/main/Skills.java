package main;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Cursor;

public class Skills extends JFrame {

	private JPanel mainPanel;
	
	public Skills() {
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

		setContentPane(mainPanel);
		mainPanel.setLayout(null);
		
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
		
		JLabel experienceBtn = new JLabel();
		experienceBtn.setText("Experience");
		experienceBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		experienceBtn.setForeground(Color.WHITE);
		experienceBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		experienceBtn.setBounds(210, 27, 67, 18);
		panel.add(experienceBtn);
		
		JLabel logoutBtn = new JLabel();
		logoutBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logoutBtn.setIcon(new ImageIcon("src/logout.png"));
		logoutBtn.setHorizontalAlignment(SwingConstants.CENTER);
		logoutBtn.setBounds(740, 21, 24, 24);
		panel.add(logoutBtn);
		
		JLabel Skills = new JLabel();
		Skills.setIcon(new ImageIcon("src/Skills.png"));
		Skills.setHorizontalAlignment(SwingConstants.CENTER);
		Skills.setBounds(0, 0, 784, 561);
		panel.add(Skills);
		
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
	
	private void hobbiesBtnmouseClicked(java.awt.event.MouseEvent evt) {
		Hobbies hobbies = new Hobbies();
		hobbies.setVisible(true);
		dispose();
	}
	
	private void experienceBtnmouseClicked(java.awt.event.MouseEvent evt) {
		Experience experience = new Experience();
		experience.setVisible(true);
		dispose();
	}
	
	private void logoutBtnmouseClicked(java.awt.event.MouseEvent evt) {
		MainMenuForm back = new MainMenuForm();
		back.setVisible(true);
		dispose();
	}

	public static void main(String[] args) {
		new Skills().setVisible(true);
	}
}
