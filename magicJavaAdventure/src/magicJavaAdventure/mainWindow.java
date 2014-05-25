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
	//static JOptionPane frame2 = new JOptionPane("Choose:");
	static JFrame frame2 = new JFrame("Choose:");
	static Image img = null;
	static JButton btn;
	static JButton p1 = new JButton("Path1");
	static JButton p2 = new JButton("Path2");
	static JButton p3 = new JButton("Path3");
	static Panel panel = new Panel();
	static Panel panel2 = new Panel();
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
	static String[] path1 = {"noodles", "and cake"};
	static String[] path2 = {"stuff", "kewl"};
	static String[] path3 = {"other stuff", "points"};
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
		frame.setBounds(0,0, 800, 700);
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
			{
				addLine(lineNum);
				if(lineNum < story.length - 1)
				{
					lineNum ++;
				}
				else if(isPath1 == false && isPath2 == false && isPath3 == false)
				{
					askPaths();
					btn.setVisible(false);
					lineNum = 0;
				}
			}
		}
		static class Path1 implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				isPath1 = true;
				p1.setVisible(false);
				p2.setVisible(false);
				p3.setVisible(false);
				btn.setVisible(true);
				story = path1;
				addLine(0);
				lineNum++;
				frame2.dispose();
			}
		}
		static class Path2 implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				isPath2 = true;
				p1.setVisible(false);
				p2.setVisible(false);
				p3.setVisible(false);
				btn.setVisible(true);
				story = path2;
				addLine(0);
				lineNum++;
				frame2.dispose();
			}
		}
		static class Path3 implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				isPath3 = true;
				p1.setVisible(false);
				p2.setVisible(false);
				p3.setVisible(false);
				btn.setVisible(true);
				story = path3;
				addLine(0);
				lineNum++;
				frame2.dispose();
			}
		}
		public static void askPaths()
		{
			frame2.setVisible(true);
			frame2.setBounds(100, 100, 600, 100);
			p1.addActionListener(new Path1());
			p2.addActionListener(new Path2());
			p3.addActionListener(new Path3());
			p1.setVisible(true);
			p2.setVisible(true);
			p3.setVisible(true);
			frame2.add(panel2);
			panel2.add(p1);
			panel2.add(p2);
			panel2.add(p3);
		}
	}
}
