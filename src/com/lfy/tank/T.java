package com.lfy.tank;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T {
	
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("TankWar");
		f.setSize(800,600);
		f.setResizable(false);
		f.setVisible(true);
		//关窗口
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
}
