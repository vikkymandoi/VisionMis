package com.uni.app.main.panel;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.uni.app.main.utility.IConstants;

import java.awt.Component;
import javax.swing.Box;

public class ConnectionPanel extends JPanel {
	private static final long serialVersionUID = 8056391156258849167L;
	private JTextField hostFieldTxt;
	private JTextField portFieldTxt;
	private JTextField serviceNameTxt;
	private JTextField userNameTxt;
	private JTextField passwordTxt;

	public ConnectionPanel() {
		setLayout(null);
		setSize(IConstants.CONNECTION_PANEL_WIDTH, IConstants.CONNECTION_PANEL_HEIGHT);
		setBackground(Color.YELLOW);
		setBorder(BorderFactory.createTitledBorder("Connection"));
		
		JLabel lblHost = new JLabel("Host:");
		lblHost.setBounds(12, 16, 56, 16);
		add(lblHost);
		
		hostFieldTxt = new JTextField();
		hostFieldTxt.setBounds(12, 35, 250, 25);
		add(hostFieldTxt);
		hostFieldTxt.setColumns(10);
		
		JLabel lblPort = new JLabel("Port:");
		lblPort.setBounds(272, 21, 77, 16);
		add(lblPort);
		
		portFieldTxt = new JTextField();
		portFieldTxt.setBounds(272, 38, 77, 25);
		add(portFieldTxt);
		portFieldTxt.setColumns(10);
		
		JLabel lblServiceName = new JLabel("Service Name:");
		lblServiceName.setBounds(12, 71, 93, 16);
		add(lblServiceName);
		
		serviceNameTxt = new JTextField();
		serviceNameTxt.setColumns(10);
		serviceNameTxt.setBounds(98, 67, 250, 25);
		add(serviceNameTxt);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(0, 112, 360, 3);
		horizontalStrut.setVisible(true);
		horizontalStrut.setBackground(Color.BLACK);
		add(horizontalStrut);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setBounds(12, 129, 93, 16);
		add(lblUserName);
		
		userNameTxt = new JTextField();
		userNameTxt.setColumns(10);
		userNameTxt.setBounds(98, 125, 250, 25);
		add(userNameTxt);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(12, 162, 93, 16);
		add(lblPassword);
		
		passwordTxt = new JTextField();
		passwordTxt.setColumns(10);
		passwordTxt.setBounds(98, 158, 250, 25);
		add(passwordTxt);
		
		JButton connectBtn = new JButton("Connect");
		connectBtn.setBounds(98, 194, 120, 25);
		add(connectBtn);
		
		JButton resetBtn = new JButton("Reset");
		resetBtn.setBounds(228, 194, 120, 25);
		add(resetBtn);
		
		setVisible(true);
	}
}
