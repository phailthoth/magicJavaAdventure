package magicJavaAdventure;
import package images.background;
import magicJavaAdventure;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class mainWindow {
	private int backgroundNum = 0;
	private JFrame frame;
	private BufferedImage img;
	JLabel background = new JLabel(new ImageIcon(img));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow window = new mainWindow();
					window.frame.setVisible(true);
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
		// we're doing 800x600, right?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	// Background setter starts. 
	
	public void setBackground(){
		if(backgroundNum == 1){
			try {
				img = ImageIO.read(new File("/treetrail.jpg"));
				background = (ImageIcon(img));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		else if(backgroundNum == 2){
			try {
				img = ImageIO.read(new File("/river.jpg"));
				background = (ImageIcon(img));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
	
	// Background setter ends here.

}
