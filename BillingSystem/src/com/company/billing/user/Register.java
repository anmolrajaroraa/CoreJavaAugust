package com.company.billing.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Register extends JFrame {

	private static final long serialVersionUID = -8756556934627010744L;
	private JPanel contentPane;
	private JTextField txtEmailID;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		Register frame = new Register();
		frame.setVisible(true);
		frame.requestFocusInWindow();
	}

	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Register");
		setResizable(false);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.BLACK);
		setContentPane(contentPane);
		
		JLabel lblLogin = new JLabel("Register");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(Color.CYAN);
		lblLogin.setFont(new Font("Kokonor", Font.BOLD, 24));
		lblLogin.setBounds(175, 25, 100, 30);
		contentPane.add(lblLogin);
		
		JLabel lblEmail = new JLabel("Email ID");
		lblEmail.setForeground(Color.CYAN);
		lblEmail.setFont(new Font("Kokonor", Font.PLAIN, 20));
		lblEmail.setBounds(81, 100, 100, 25);
		contentPane.add(lblEmail);
		
		txtEmailID = new JTextField();
		txtEmailID.setText("Enter email ID here");
		txtEmailID.setBounds(193, 90, 200, 35);
		contentPane.add(txtEmailID);
		txtEmailID.setColumns(10);
		txtEmailID.setForeground(Color.GRAY);
		txtEmailID.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEmailID.getText().equals("")) {
					txtEmailID.setText("Enter email ID here");
					txtEmailID.setForeground(Color.GRAY);
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEmailID.getText().equals("Enter email ID here")) {
					txtEmailID.setText("");
					txtEmailID.setForeground(Color.BLACK);
				}
			}
		});
		
		JCheckBox chckbxShowPassword = new JCheckBox("Show password");
		chckbxShowPassword.setForeground(Color.CYAN);
		chckbxShowPassword.setBounds(193, 171, 200, 23);
		chckbxShowPassword.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				if(chckbxShowPassword.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else{
					passwordField.setEchoChar('●');
					String password = String.valueOf(passwordField.getPassword());
					if(password.equals("Enter password here")) {
						passwordField.setEchoChar((char)0);
					}
				}
			}
		});
		contentPane.add(chckbxShowPassword);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.CYAN);
		lblPassword.setFont(new Font("Kokonor", Font.PLAIN, 20));
		lblPassword.setBounds(81, 145, 100, 25);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField("Enter password here");
		passwordField.setBounds(193, 137, 200, 35);
		passwordField.setEchoChar((char)0);
		passwordField.setForeground(Color.GRAY);
		passwordField.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				String password = String.valueOf(passwordField.getPassword());
				if(password.equals("")) {
					passwordField.setText("Enter password here");
					passwordField.setEchoChar((char)0);
					passwordField.setForeground(Color.GRAY);
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				String password = String.valueOf(passwordField.getPassword());
				if(password.equals("Enter password here")) {
					passwordField.setText("");
					passwordField.setForeground(Color.BLACK);
					passwordField.setEchoChar('●');
					chckbxShowPassword.setSelected(false);
				}
			}
		});
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLogin.setBounds(175, 206, 117, 29);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEmailID.setText("Enter email ID here");
				passwordField.setText("Enter password here");
				txtEmailID.setForeground(Color.GRAY);
				passwordField.setForeground(Color.GRAY);
				passwordField.setEchoChar((char)0);
				chckbxShowPassword.setSelected(false);
			}
		});
		btnReset.setBounds(46, 206, 117, 29);
		contentPane.add(btnReset);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnRegister.setBounds(304, 206, 117, 29);
		contentPane.add(btnRegister);
	}

}
