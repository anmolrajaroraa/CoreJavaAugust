package com.company.billing.main;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Timer;

import com.company.billing.user.Login;

public class IntroScreen extends JFrame {

	private static final long serialVersionUID = 4555923535542320691L;
	private JPanel contentPane;
	JProgressBar progressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		IntroScreen frame = new IntroScreen();
		frame.setVisible(true);
		frame.doProgress();
	}

	/**
	 * Create the frame.
	 */
	public IntroScreen() {
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(5000, 5000, 620, 320);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(18, 77, 153));
		this.setContentPane(contentPane);
		
		JLabel lblImageBg = new JLabel("");
		lblImageBg.setBounds(0, 0, 620, 278);
		lblImageBg.setIcon(new ImageIcon( IntroScreen.class.getResource("/com/company/billing/main/introbg.jpg") ));
		contentPane.add(lblImageBg);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(0, 278, 620, 20);
		progressBar.setStringPainted(true);
		contentPane.add(progressBar);
		
//		Class -> cons private -> no object creation possible
//		Our class already has an object of Class class
	}
	
	int count = 0;   // inside IntroScreen class - it doesn't die until timer stops
	Timer timer;   // it will retain the reference to timer object until window is disposed
	// so we have got access to timer, so we can easily stop the timer
	
	private void doProgress() {
		long startTime = System.currentTimeMillis();
		System.out.println("Progress started...");
//		int count = 0;  // effectively final
		timer = new Timer(50, (e) -> {
				System.out.println("Timer completed...");
				count++;
				progressBar.setValue(count);
				if(count >= 100) {
					long endTime = System.currentTimeMillis();
					System.out.println("Total time taken by progess bar - " + (endTime - startTime));
					timer.stop();
					this.dispose();
					Login login = new Login();
					login.setVisible(true);
				}
			});
		timer.start();
		System.out.println("Progress ended...");
	}
}

// "/com/company/billing/main/introbg.jpg"
