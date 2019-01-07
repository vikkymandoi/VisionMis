package com.uni.app.main.panel;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.uni.app.main.utility.IConstants;

public class HeaderPanel extends JPanel {
	private static final long serialVersionUID = -7383459562156321350L;

	public HeaderPanel() {
		setLayout(null);
		setSize(IConstants.HEADER_PANEL_WIDTH, IConstants.HEADER_PANEL_HEIGHT);
		
		Image closeImg = new ImageIcon(this.getClass().getClassLoader().getResource("img/close.png")).getImage();
		JButton closeButton = new JButton("");
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you wish to close?", "Warning" ,JOptionPane.YES_NO_OPTION);
				if(dialogResult == JOptionPane.YES_OPTION){
					System.exit(0);
				}
			}
		});
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
