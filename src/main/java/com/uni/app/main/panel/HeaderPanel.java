package com.uni.app.main.panel;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HeaderPanel extends JPanel {
	private static final long serialVersionUID = -7383459562156321350L;

	public HeaderPanel() {
		setLayout(null);
		setBounds(10, 10, 980, 100);
		
		Image closeImg = new ImageIcon(this.getClass().getClassLoader().getResource("img/close.png")).getImage();
		JButton closeButton = new JButton("");
		closeButton.setIcon(new ImageIcon(closeImg.getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
		closeButton.setVisible(true);
		closeButton.setBounds(945, 0, 35, 35);
		add(closeButton);
		
		Image logoImage = new ImageIcon(this.getClass().getClassLoader().getResource("img/logo.png")).getImage();
		JLabel logoLabel = new JLabel("");
		logoLabel.setIcon(new ImageIcon(logoImage));
		logoLabel.setBounds(0, 0, 391, 100);
		add(logoLabel);
		logoLabel.setVisible(true);
	}
}
