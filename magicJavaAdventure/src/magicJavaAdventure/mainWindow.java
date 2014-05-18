package magicJavaAdventure;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class mainWindow
{
	private static JFrame frame;
	static Image img = null;
	
	public static void initializeImage() throws Exception
	{
		img = ImageIO.read(new File("resources/treetrail.jpg"));
	}
			
	//static Image img = ImageIO.read("magicJavaAdventure/resources/treetrail.jpg");
	//static ImageIcon image = new ImageIcon("/magicJavaAdventure/resources/treetrail.jpg");
	static Panel panel = new Panel();
	/**
	 * Launch the application.
	 * @throws Exception 
	 */
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initializeImage();
					mainWindow window = new mainWindow();
					window.frame.setVisible(true);
					JLabel background = new JLabel(new ImageIcon(img));
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
}
