package com.company.billing.main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class IntroScreen extends JFrame {

	private static final long serialVersionUID = 4555923535542320691L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		IntroScreen frame = new IntroScreen();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public IntroScreen() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(5000, 5000, 450, 300);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		this.setContentPane(contentPane);
		
		JLabel lblBgImage = new JLabel("");
		lblBgImage.setBounds(0, 0, 450, 278);
		lblBgImage.setIcon(new ImageIcon( IntroScreen.class.getResource("/com/company/billing/main/introbg.jpg") ));
		contentPane.add(lblBgImage);
	}
}
