package magicJavaAdventure;

//imports
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.io.File;
import javax.swing.*;

@SuppressWarnings("serial")
public class newMainWindow extends JFrame{
	// program variables
	public static JFrame frame = new JFrame();
	public static JPanel click = new JPanel();
	public static JLayeredPane panel = new JLayeredPane();
	public static JLabel speaker = new JLabel();
	public static JLabel text = new JLabel();
	public static JLabel background = new JLabel();
	public static int s, t;
	public static String[] story = {
		"[ Fire crackles, burns, and eats up everything around you ]", 
		"Mom? Dad? [ cough ] Where are you?",
		"[ You run out the door, hoping to find your parents. However, you don't see them. ]",
		"MOM? DAD?",
	};
	public static String[] speak = {
		"",
		"Jeffery:",
		"",
		"Jeffery",
	};
	
	//resource variables
	//public static Image img;
	public static ImageIcon img;
	public static void init() throws Exception{
		// sets frame up for initial start up
		frame = new JFrame("Magic Java Adventure Story Thing - Eric is Bad With Titles");
		frame.setBounds(350, 150, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close it, close it, close it!
		frame.setResizable(false); // we want it at 800x600, no need to let user change it.
		newMainWindow.frame.setVisible(true);
		frame.setBackground(Color.black);
		frame.add(panel);
		setBackground();
		speaker.setForeground(Color.white);
		text.setForeground(Color.white);
		panel.add(speaker, new Integer(3),0);
		panel.add(text, new Integer(2),0);
		panel.add(click, new Integer(4),0);
		click.setOpaque(false);
		click.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent m) {
				setText();
			}
		}
		);
		setFont();
		setText();
		position();
	}
	
	public static void setBackground() throws Exception{
		// attempt at making this more flexible later on. Might do it base on variable value.
		ImageIcon img = new ImageIcon("resources/treetrail.jpg");
		background.setIcon(img);
		panel.add(background, new Integer (1),0);
		Dimension size;
		size = background.getPreferredSize();
		background.setBounds(0,0,size.width,size.height);
		refresh();
	}
	
	public static void setText(){
		// text for story later.
		s++; t++;
		speaker.setText(speak[s]);
		text.setText(story[t]);
		refresh();
	}
	
	public static void setFont(){
		try {
			// loads fonts
			Font cali = Font.createFont(Font.TRUETYPE_FONT, new File("resources/Calligraffitti-Regular.ttf"));
			Font meta = Font.createFont(Font.TRUETYPE_FONT, new File("resources/Metamorphous-Regular.ttf"));
		    // creates environment to add fonts
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		    // adds fonts
		    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("resources/Calligraffitti-Regular.ttf")));
		    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("resources/Metamorphous-Regular.ttf")));
		    cali = cali.deriveFont(25.0f); // sets font size
		    meta = meta.deriveFont(15.0f);
		    speaker.setFont(cali); // setting fonts
		    text.setFont(meta);
		} 
		catch (IOException i) {
			i.printStackTrace();
		}
		catch(FontFormatException e){
			e.printStackTrace();
		}
	}
	
	public static void position(){
		// absolute positioning, because we need it on top of the background.
		Dimension size;
		size = speaker.getPreferredSize();
		speaker.setBounds(50, 450, size.width, size.height);
		size = text.getPreferredSize();
		text.setBounds(120, 500, 520, size.height);
		click.setBounds(0,0,800,600);
		refresh();
	}
	
	public static void refresh(){
		frame.invalidate();
		frame.validate();
	}
	
	public static void main(String[] args) throws Exception{
		try{
			init();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
}