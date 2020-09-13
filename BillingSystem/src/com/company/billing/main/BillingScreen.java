package com.company.billing.main;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.company.billing.model.Product;
import com.company.billing.model.ProductDAO;

public class BillingScreen extends JFrame {
	
	private static final long serialVersionUID = 9215555796699495501L;
	private JPanel contentPane;
	JComboBox<String> comboBox = new JComboBox<>();
	JLabel lblPrice = new JLabel("");
	JLabel lblImage = new JLabel("");

	public static void main(String[] args) {
		BillingScreen frame = new BillingScreen();
		frame.setVisible(true);
	}

	public BillingScreen() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		fillCombo();
		
		comboBox.setFont(new Font("Kokonor", Font.PLAIN, 20));
		comboBox.setBounds(50, 50, 500, 25);
		contentPane.add(comboBox);
		
		JButton buttonSearch = new JButton("Search");
		buttonSearch.setBounds(600, 50, 117, 29);
		contentPane.add(buttonSearch);
		buttonSearch.addActionListener((e)->{
			search();
		});
		
		lblPrice.setBounds(50, 100, 100, 30);
		comboBox.setFont(new Font("Kokonor", Font.PLAIN, 20));
		contentPane.add(lblPrice);
		
		lblImage.setBounds(50, 150, 800, 600);
		contentPane.add(lblImage);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				askForClose();
			}
		});
	}
	
	private void askForClose() {
		int choice = JOptionPane.showConfirmDialog(this, "Do you want to leave this window?", "Company Name", JOptionPane.YES_NO_OPTION);
		if(choice == JOptionPane.YES_OPTION) {
			this.dispose();
		}
	}
	
	private void fillCombo() {
		comboBox.addItem("Select Item");
		try {
			for(String productName : ProductDAO.getProductNames()) {
				comboBox.addItem(productName);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void search() {
		String selectedProduct = (String) comboBox.getSelectedItem();
		System.out.println("Selected product is " + selectedProduct);
		try {
			Product product = ProductDAO.getProductByName(selectedProduct);
			lblPrice.setText( String.valueOf(product.getPrice()) );
			String images[] = product.getPath().split("\"");
			System.out.println(images[1]);
			URL url = new URL(images[1]);
			Image image = ImageIO.read(url);
			image = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
			lblImage.setIcon(new ImageIcon(image));
		} 
		catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}
}
