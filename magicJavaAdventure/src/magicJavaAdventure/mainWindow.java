package magicJavaAdventure;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class mainWindow implements ActionListener
{
	private static JFrame frame;
	static Image img = null;
	static Button btn;
	private boolean isButtonPressed = false;
	static Panel panel = new Panel();
	static TextField text = new TextField(40);
	static JLabel t = new JLabel();
	static Color lightBlue = new Color(159, 179, 219);
	
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
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					initializeImage();
					initialize();
					mainWindow.frame.setVisible(true);
					JLabel background = new JLabel(new ImageIcon(img));
					frame.add(panel);
					//panel.add(background);
					mainWindow.addButton("ENTER");
					panel.add(t);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
		);
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
		frame.getContentPane().setBackground(lightBlue);
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
		/*
		if(text.getText().equals("hello"))
		{
			t.setText("hello back at ya!");
		}
		else if(text.getText().equals("hi"))
		{
			t.setText("hi there!");
		}
		else if(text.getText().equals("how are you?"))
		{
			t.setText("im great thx");
		}
		else if(text.getText().equals("what is 1 + 1?"))
		{
			t.setText("29");
		}
		else
		{
			t.setText("you typed something that I do not recognize");
		}
		*/
	}
}
