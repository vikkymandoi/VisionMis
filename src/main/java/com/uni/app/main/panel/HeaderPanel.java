package com.uni.app.main.panel;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.uni.app.main.utility.IConstants;

public class HeaderPanel extends JPanel {
	private static final long serialVersionUID = -7383459562156321350L;

	public HeaderPanel() {
		setLayout(null);
		setSize(IConstants.FRAME_WIDTH, IConstants.HEADER_PANEL_HEIGHT);
		setBackground(Color.WHITE);
		
		Image closeImg = new ImageIcon(this.getClass().getClassLoader().getResource("img/close.png")).getImage();
		JLabel closeButton = new JLabel("");
		closeButton.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) { }
			@Override
			public void mousePressed(MouseEvent e) { }
			@Override
			public void mouseExited(MouseEvent e) { }
			@Override
			public void mouseEntered(MouseEvent e) { }
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you wish to close?", "Warning" ,JOptionPane.YES_NO_OPTION);
				if(dialogResult == JOptionPane.YES_OPTION){
					System.exit(0);
				}
			}
		});
		closeButton.setIcon(new ImageIcon(closeImg.getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
		closeButton.setBounds(IConstants.FRAME_WIDTH-35, 0, 35, 35);
		add(closeButton);
		closeButton.setVisible(true);
		
		
		Image logoImage = new ImageIcon(this.getClass().getClassLoader().getResource("img/logo.png")).getImage();
		JLabel logoLabel = new JLabel("");
		logoLabel.setIcon(new ImageIcon(logoImage));
		logoLabel.setBounds((IConstants.FRAME_WIDTH/2)-160, 0, 320, 100);
		add(logoLabel);
		logoLabel.setVisible(true);
	}
}
