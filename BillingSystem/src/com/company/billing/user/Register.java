package com.company.billing.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private JTextField txtName;
	
	private void register() {
		String name = txtName.getText();
		String email = txtEmailID.getText();
		String password = String.valueOf(passwordField.getPassword());
		
		if(name.equals("Enter name here") || email.equals("Enter email ID here") || 
				password.equals("Enter password here")) {
			JOptionPane.showMessageDialog(this, "Please fill in details correctly");
			return;
		}
		
		UserDAO userDAO = new UserDAO();
		try {
			
			if(userDAO.isUserExists(email)) {
				JOptionPane.showMessageDialog(this, "User already exists");
				return;
			}
			
			boolean isAdded = userDAO.register(name, email, password);
			if(isAdded) {
				this.dispose();
				Login login = new Login();
				login.setVisible(true);
				login.requestFocusInWindow();
				JOptionPane.showMessageDialog(this, "Registration Successful");
			}
			
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

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
		lblEmail.setBounds(81, 120, 100, 25);
		contentPane.add(lblEmail);
		
		txtEmailID = new JTextField();
		txtEmailID.setText("Enter email ID here");
		txtEmailID.setBounds(193, 110, 200, 35);
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
		chckbxShowPassword.setBounds(193, 190, 200, 23);
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
		lblPassword.setBounds(81, 165, 100, 25);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField("Enter password here");
		passwordField.setBounds(193, 155, 200, 35);
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
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register();
			}
		});
		btnRegister.setBounds(175, 225, 117, 29);
		contentPane.add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEmailID.setText("Enter email ID here");
				passwordField.setText("Enter password here");
				txtName.setText("Enter name here");
				txtEmailID.setForeground(Color.GRAY);
				passwordField.setForeground(Color.GRAY);
				txtName.setForeground(Color.GRAY);
				passwordField.setEchoChar((char)0);
				chckbxShowPassword.setSelected(false);
			}
		});
		btnReset.setBounds(46, 225, 117, 29);
		contentPane.add(btnReset);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				login.requestFocusInWindow();
			}
		});
		btnLogin.setBounds(304, 225, 117, 29);
		contentPane.add(btnLogin);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.CYAN);
		lblName.setFont(new Font("Kokonor", Font.PLAIN, 20));
		lblName.setBounds(81, 72, 100, 25);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setText("Enter name here");
		txtName.setForeground(Color.GRAY);
		txtName.setColumns(10);
		txtName.setBounds(193, 63, 200, 35);
		txtName.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				if(txtName.getText().equals("")) {
					txtName.setText("Enter name here");
					txtName.setForeground(Color.GRAY);
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if(txtName.getText().equals("Enter name here")) {
					txtName.setText("");
					txtName.setForeground(Color.BLACK);
				}
			}
		});
		contentPane.add(txtName);
	}
}
