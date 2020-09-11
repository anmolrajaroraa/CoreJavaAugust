package com.company.billing.main;

import java.awt.Color;
import java.awt.Font;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;

import com.company.billing.utils.ConfigReader;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Dashboard extends JFrame implements ConfigReader {

	private static final long serialVersionUID = -4148072398375373160L;
	private JPanel contentPane;

	public static void main(String[] args) {
		Dashboard frame = new Dashboard("Welcome User");
		frame.setVisible(true);
	}

	public Dashboard(String message) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.BLACK);
		setContentPane(contentPane);
		
		JLabel lblWelcome = new JLabel(message);
		lblWelcome.setForeground(Color.CYAN);
		lblWelcome.setFont(new Font("Kokonor", Font.PLAIN, 30));
		lblWelcome.setBounds(625, 100, 300, 30);
		contentPane.add(lblWelcome);
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenu adminMenu = new JMenu("Admin");
		menuBar.add(adminMenu);
		
		JMenuItem uploadMenuItem = new JMenuItem("Upload Products");
		adminMenu.add(uploadMenuItem);
		uploadMenuItem.addActionListener((e)->{
			doUpload();
		});
		
		JMenuItem billingMenuItem = new JMenuItem("Billing");
		adminMenu.add(billingMenuItem);
		billingMenuItem.addActionListener((e)->{
			BillingScreen billing = new BillingScreen();
			billing.setVisible(true);
		});
		
		adminMenu.addSeparator();
		
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		adminMenu.add(exitMenuItem);
		
	}

	private void doUpload() {
		JFileChooser browse = new JFileChooser(CONFIG_BUNDLE.getString(BROWSE_PATH));
		browse.showOpenDialog(this);
		File file = browse.getSelectedFile();
		
	}
}