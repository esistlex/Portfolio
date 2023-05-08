package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class InfoForm extends JFrame {

	private JPanel mainPanel;
	
	public InfoForm() {
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
		
		JLabel logoutBtn = new JLabel();
		logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				logoutBtnmouseClicked(evt);
			}
		});
		logoutBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logoutBtn.setIcon(new ImageIcon("src/logout.png"));
		logoutBtn.setBounds(750, 526, 24, 24);
		mainPanel.add(logoutBtn);
		
		JLabel basicInfo = new JLabel();
		basicInfo.setIcon(new ImageIcon("src/basicInfo.png"));
		basicInfo.setBounds(0, 0, 784, 561);
		mainPanel.add(basicInfo);
		
	}
	
	private void logoutBtnmouseClicked(java.awt.event.MouseEvent evt) {
		dispose();
		MainMenuForm back = new MainMenuForm();
		back.setVisible(true);
	}
	
	public static void main(String[] args) {
		new InfoForm().setVisible(true);;
	}
}