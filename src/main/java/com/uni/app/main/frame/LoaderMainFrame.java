package com.uni.app.main.frame;

import javax.swing.JFrame;

import com.uni.app.main.panel.HeaderPanel;
import com.uni.app.main.utility.IConstants;

public class LoaderMainFrame extends JFrame {
	private static final long serialVersionUID = 7809067656900483819L;
	public LoaderMainFrame() {
		setLayout(null);
		setSize(IConstants.FRAME_WIDTH, IConstants.FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		HeaderPanel headerPanel = new HeaderPanel();
		add(headerPanel);
	}
}
