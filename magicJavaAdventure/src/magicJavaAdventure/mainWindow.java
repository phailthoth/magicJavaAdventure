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
	private static JFrame frame;
	static Toolkit t = Toolkit.getDefaultToolkit();
	static Image img = t.getImage("magicJavaAdventure/resources/treetrail.jpg");
	//static Image img = ImageIO.read("magicJavaAdventure/resources/treetrail.jpg");
	//static ImageIcon image = new ImageIcon("/magicJavaAdventure/resources/treetrail.jpg");
	static JLabel background = new JLabel();
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
					panel.add(new JLabel( new ImageIcon("path/magicJavaAdventure/resources/treetrail.jpg")));
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
