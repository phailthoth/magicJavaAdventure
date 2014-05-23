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
	private static JFrame buttonFrame;
	static Image img = null;
	static JButton btn;
	static Panel panel = new Panel();
	//static TextField text = new TextField(40);
	static JLabel t = new JLabel();
	static String name = "Jeffery";
	static Color lightBlue = new Color(159, 179, 219);
	static boolean isPath1 = false;
	static boolean isPath2 = false;
	static boolean isPath3 = false;
	static String[] story = 
	{
		"[ Fire crackles, burns, and eats up everything around you ]", 
		"Speaker: "+name+" - Mom? Dad? [ cough ] Where are you?",
		"[ You run out the door, hoping to find your parents. However, you don't see them. ]",
		"Speaker: "+name+" - MOM? DAD?",
	};
	static String[] path1 = {};
	static String[] path2 = {};
	static String[] path3 = {};
	static int lineNum;
	
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
					//text.setText("Add your character's name here");
					initializeImage();
					initialize();
					mainWindow.frame.setVisible(true);
					JLabel background = new JLabel(new ImageIcon(img));
					frame.add(panel);
					panel.add(background);
					mainWindow.addButton("NEXT");
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
	/**
	 * Initialize the contents of the frame.
	 */
	private static void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 700);
		// we're doing 800x600
		frame.getContentPane().setBackground(lightBlue);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//makes the jframe actually terminate after pressing "X"
	}
	
	public static void addButton(String title)
	{
		btn = new JButton(title);
		btn.addActionListener(new NextLine());
		//panel.add(text);
		panel.add(btn);
	}
	public static void addLine(int x)
	{
		t.setText(story[x]);
	}
	static class NextLine implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		
			/*
			if(!(text.getText().equals(" ")) && !(text.getText().equals("Add your character's name here")))
			{
				name = text.getText();
				text.setText(" ");
				text.setVisible(false);
				t.setText("Your name is now " + name + " ... Click NEXT");
			*/
			//else if(!(text.getText().equals("Add your character's name here")))
			{
				addLine(lineNum);
				if(lineNum < story.length - 1)
				{
					lineNum ++;
				}
				else
				{
					askPaths();
				}
			}
		}
		static class Path1 implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				isPath1 = true;
			}
			
		}
		public static void askPaths()
		{
			JButton p1 = new JButton("Path1");
			p1.addActionListener(new Path1());
			//buttonFrame.setVisible(true);
			buttonFrame.setBounds(100, 100, 600, 700);
			buttonFrame.add(p1);
		}
	}
}
