package com.company.billing.user;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Login extends JFrame {

	private static final long serialVersionUID = 6706224596870863180L;
	private JPanel contentPane;

	public static void main(String[] args) {
		Login frame = new Login();
		frame.setVisible(true);
	}
	
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
	}

}
