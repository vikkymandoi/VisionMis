package com.uni.app.main.frame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

import com.uni.app.main.panel.ConnectionPanel;
import com.uni.app.main.panel.HeaderPanel;
import com.uni.app.main.utility.IConstants;

public class LoaderMainFrame extends JFrame {
	private static final long serialVersionUID = 7809067656900483819L;
	public LoaderMainFrame() {
		getContentPane().setLayout(null);
		setSize(IConstants.FRAME_WIDTH, IConstants.FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		
		HeaderPanel headerPanel = new HeaderPanel();
		headerPanel.setVisible(true);
		headerPanel.setBounds(10, 10, IConstants.HEADER_PANEL_WIDTH, IConstants.HEADER_PANEL_HEIGHT);
		getContentPane().add(headerPanel);

		ConnectionPanel connectionPanel = new ConnectionPanel();
		connectionPanel.setBounds(10, 123, IConstants.CONNECTION_PANEL_WIDTH, IConstants.CONNECTION_PANEL_HEIGHT);
		connectionPanel.setVisible(true);
		getContentPane().add(connectionPanel);
		
		// Adding Mouse Event Listener for Drag and Drop Option
		this.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e){
				posX=e.getX();
				posY=e.getY();
		    }
		});
		this.addMouseMotionListener(new MouseAdapter() {
		     public void mouseDragged(MouseEvent evt) {
				setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
		     }
		});
		setVisible(true);
	}
	
	private int posX=0,posY=0;
}
