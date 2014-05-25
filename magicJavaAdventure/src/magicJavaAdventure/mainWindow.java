package magicJavaAdventure;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class mainWindow
{
	private static JFrame frame;
	//static JOptionPane frame2 = new JOptionPane("Choose:");
	static JFrame frame2 = new JFrame("Choose:");
	static Image img = null;
	static JButton btn;
	static JButton p1 = new JButton("[ You accept your mother's choice, and leave her behind. ]");
	static JButton p2 = new JButton("[ You try to help your mother out of the burning debris that is crushing her. ]");
	static JButton p11 = new JButton("[ Go down the basement, run through, and exit through the underground escape route. ]");
	static JButton p12 = new JButton("[ Go to the Kitchen, and go out through the backdoor ]");
	static Panel panel = new Panel();
	static Panel panel2 = new Panel();
	//static TextField text = new TextField(40);
	static JLabel t = new JLabel();
	static String name = "Jeffery";
	static Color lightBlue = new Color(159, 179, 219);
	static boolean isPath1 = false;
	static boolean isPath2 = false;
	static boolean isPath11 = false;
	static boolean isPath12 = false;
	static String[] story = 
	{
		"[ Fire crackles, burns, and eats up everything around you ]", 
		"Mom? Dad? [ cough ] Where are you?",
		"[ You run out the door, hoping to find your parents. However, you don't see them. ]",
		"MOM? DAD?",
		"[ You look around frantically, continually looking for them but can't. ]",
		"[ You kneel down, sobbing woefully at your loss. ]",
		"[ Suddenly, you hear a voice calling your name. ]",
		"[ You turn around, and see your mom. ]",
		"JEFFERY ! ",
		"Mom !",
		"[ You run towards your mom, back inside of the house. ]",
		"[ Suddenly, a burning pillar breaks from the ceiling, above you, and crushes your mother. ]",
		"MOM ! ",
		"Leave me, Jeffery! Live for your own life!",
	};
	static String[] path1 = 
	{
		"[ More debris suddenly fall behind you, blocking your way out through the front door. ]",
		"[ You decide to run down the hallway. ]",
		"[ You see two ways to go out: ]"
	};
	static String[] path2 = 
	{
		"No! I'm not leaving you!",
		"[ You shove your hand below the flaming wood beam. ]",
		"[ As you attempt to lift it off your mom's body, the fire begins to creep up your arms ]",
		"No! [Player Name], I told you to leave me! Be a good child and leave me!",
		"[ Fire continues to climb up your arm, and reaches towards your neck. ]",
		"[ You manage to uncover half of your mother's body ]",
		"[ You look down and stare at your mom's body. Burned, crushed. Your eyes move to her face, her eyes looking at your flaming arms, in complete fear. ]",
		"Get away! Leave me already! Why can't you be a good child and leave me behind?",
		"No, I refuse to leave you behind!",
		"[ You stare down at your flame covered arms, and quickly bite down into the flames. ]",
		"[ After biting off a peice, you begin to eat the flames off of your arms, piece by piece until they're completely gone. ]",
		"[ You continue to lift off the pillar of wood off of your mother, until it's completely off her, and toss the pillar to the side. ]",
		"[ You look down, and your mom has fainted, her body unable to withstand anymore pain. ]",
		"[ You pick up your mother, and quickly take her out of the house from the front door, behind you. ]",
		"[ Sigh ] I need to find a place to get mom somewhere. Everyone is so far away!",
		"Why did we have to live in the middle of nowhere?",
		"[ You slam your first against the rock next to you, but as you do, a flame bursts out from your fist and dissipates into the air around you. ]",
		"[ You spend a brief moment, staring at your hand amazed at what had happened. ]",
		"[ After that moment, you realize that your mother is still hurt, pick her up, and quickly take her to the nearest town for help. ]",
		"THE END"
	};
	static String[] path11 = 
	{
		"( sigh ) I wish it weren't so dark down here. ",
		"[ Suddenly, you have an image of yourself holding your hands close together, channeling a ball of light between them. ]",
		"[ As your general impulsive self, you decide to do the same, despite the unrealisticness of it. ]",
		"[ Just as in the image of your head, you decide to bring your hands together, creating a sphere in the palms of your hand. ]",
		"[ As if by magic, a ball of light materalizes in your hand, whisping around. ]",
		"[ Using this light, you run out of the basement, through the underground escape, leaving your parents and your house behind. ]",
		"THE END"
	};
	static String[] path12 = 
	{
		"Phew, I'm almost out of here.",
		"[ Suddenly, a flaming pillar, one simlar to the one which had crushed your mom, falls in your way - blocking the door. ]",
		"DANG IT !",
		"[ Out of rage, you punch the pillar. ]",
		"[ However, before your hand hits the pillar, a shimering light erupts from the space inbetween, and a circle suddenly emmits from the space as well. ]",
		"[ Suddenly, an immense force knocks the pillar, and everything behind it, foreward and leaves a whole in your house. ]",
		"[ You stand quietly in amazement, at your hand, before running out, leaving everything behind. ]",
		"THE END",
	};
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
				else //if(isPath1 == false && isPath2 == false)
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
				mainWindow.isPath1 = true;
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
				mainWindow.isPath2 = true;
				btn.setVisible(true);
				story = path2;
				addLine(0);
				lineNum++;
				frame2.dispose();
			}
		}
		static class Path11 implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{	
				mainWindow.isPath11 = true;
				btn.setVisible(true);
				story = path11;
				addLine(0);
				lineNum++;
				frame2.dispose();
			}
		}
		static class Path12 implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{	
				mainWindow.isPath12 = true;
				btn.setVisible(true);
				story = path12;
				addLine(0);
				lineNum++;
				frame2.dispose();
			}
		}
		public static void askPaths()
		{
			
			if(isPath1 == false && isPath2 == false)
			{
				frame2.setVisible(true);
				frame2.setBounds(100, 100, 600, 100);
				p1.addActionListener(new Path1());
				p2.addActionListener(new Path2());
				p1.setVisible(true);
				p2.setVisible(true);
				frame2.add(panel2);
				panel2.add(p1);
				panel2.add(p2);
			}
			else if(isPath11 == false && isPath12 == false)
			{
				panel2.remove(p1);
				panel2.remove(p2);
				
				frame2.setBounds(100, 100, 600, 100);
				p11.addActionListener(new Path11());
				p12.addActionListener(new Path12());
				p11.setVisible(true);
				p12.setVisible(true);
				frame2.add(panel2);
				panel2.add(p11);
				panel2.add(p12);
				frame2.setVisible(true);
				
			}
		}
	}
}
