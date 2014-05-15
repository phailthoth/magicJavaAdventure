package magicJavaAdventure;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class mainWindow {
	private int backgroundNum = 0;
	private static JFrame frame;
	static JLabel background = new JLabel(new ImageIcon());
	static Panel panel = new Panel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow window = new mainWindow();
					window.frame.setVisible(true);
					frame.add(panel);
					panel.add(background);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		// we're doing 800x600
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	ImageIcon icon = new ImageIcon("/magicJavaAdventureresources/treetrail.jpg");

}
