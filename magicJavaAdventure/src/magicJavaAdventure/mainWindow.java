package magicJavaAdventure;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class mainWindow implements ActionListener,KeyListener
{
	private static JFrame frame;
	static Image img = null;
	static Button btn;
	private boolean isButtonPressed = false;
	static Panel panel = new Panel();
	static TextField text = new TextField(40);
	
	public static void initializeImage() throws Exception
	{
		img = ImageIO.read(new File("resources/treetrail.jpg"));
	}
	
	/**
	 * Launch the application.
	 * @throws Exception 
	 */
	public static void main(String[] args)
	{
		//EventQueue.invokeLater(new Runnable() 
		//{
			//public void run() 
			//{
				try 
				{
					initializeImage();
					initialize();
					mainWindow.frame.setVisible(true);
					JLabel background = new JLabel(new ImageIcon(img));
					frame.add(panel);
					//panel.add(background);
					mainWindow.addButton("ENTER");
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			//}
		//}
		//);
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
	private static void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		// we're doing 800x600
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//makes the jframe actually terminate after pressing "X"
	}
	
	public static void addButton(String title)
	{
		btn = new Button(title);
		btn.addActionListener(new mainWindow());
		panel.add(text);
		panel.add(btn);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		isButtonPressed = true;
		if(text.getText().equals("hello"))
		{
			text.setText("hello back at ya!");
		}
		else if(text.getText().equals("hi"))
		{
			text.setText("hi there!");
		}
		else if(text.getText().equals("how are you?"))
		{
			text.setText("im great thx");
		}
		else if(text.getText().equals("what is 1 + 1?"))
		{
			text.setText("29");
		}
		else
		{
			text.setText("you typed something that I do not recognize");
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		text.setText("YOU PRESSED A KEY");
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		text.setText("YOU RELEASED A KEY");
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		text.setText("YOU TYPED A KEY");
		
	}
}
