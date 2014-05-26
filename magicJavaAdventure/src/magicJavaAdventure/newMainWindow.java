package magicJavaAdventure;

//imports
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class newMainWindow extends JFrame{
	private static final long serialVersionUID = 8350489385347005763L;
	// program variables
	public static JFrame frame = new JFrame("Magic Java Adventure Story Thing - Eric is Bad With Titles");
	//public static JFrame choice = new JFrame("Choose a choice");
	public static JPanel click = new JPanel();
	public static JLayeredPane panel = new JLayeredPane();
	public static JLabel speaker = new JLabel();
	public static JLabel text = new JLabel();
	public static JLabel background = new JLabel();
	public static int s, t, p;
	public static String[] story = {
		"<html>[ Fire crackles, burns, and eats up everything around you ]</html>", 
		"<html>Mom? Dad? [ cough ] Where are you?.</html>",
		"<html>[ You run out the door, hoping to find your parents. However, you don't see them. ]</html>",
		"<html>MOM? DAD?</html>",
		"<html>[ You look around frantically, continually looking for them but can't. ]</html>",
		"<html>[ You kneel down, sobbing woefully at your loss. ]</html>",
		"<html>[ Suddenly, you hear a voice calling your name. ]</html>",
		"<html>[ You turn around, and see your mom. ]</html>",
		"<html>JEFFERY ! </html>",
		"<html>Mom !</html>",
		"<html>[ You run towards your mom, back inside of the house. ]</html>",
		"<html>[ Suddenly, a burning pillar breaks from the ceiling, above you, and crushes your mother. ]</html>",
		"<html>MOM ! </html>",
		"<html>Leave me, Jeffery! Live for your own life!</html>",
	};
	public static String[] speak = {
		" ",
		"Jeffery:",
		"",
		"Jeffery",
		"",
		"",
		"",
		"",
		"Mom",
		"Jeffery",
		"",
		"",
		"Jeferry",
		"Mom",
	};
	public static String[] storya = {
		"<html>[ More debris suddenly fall behind you, blocking your way out through the front door.&nbsp;]</html>",
		"<html>[ You decide to run down the hallway.&nbsp;]</html>",
		"<html>[ You see two ways to go out:&nbsp;]</html>"
	};
	public static String[] storyb = {
		"<html>No! I'm not leaving you!</html>",
		"<html>[ You shove your hand below the flaming wood beam.&nbsp;]</html>",
		"<html>[ As you attempt to lift it off your mom's body, the fire begins to creep up your arms&nbsp;]</html>",
		"<html>No! Jeffery, I told you to leave me! Be a good child and leave me!</html>",
		"<html>[ Fire continues to climb up your arm, and reaches towards your neck.&nbsp;]</html>",
		"<html>[ You manage to uncover half of your mother's body&nbsp;]</html>",
		"<html>[ You look down and stare at your mom's body. Burned, crushed. Your eyes move to her face, her eyes looking at your flaming arms, in complete fear.&nbsp;]</html>",
		"<html>Get away! Leave me already! Why can't you be a good child and leave me behind?</html>",
		"<html>No, I refuse to leave you behind!</html>",
		"<html>[ You stare down at your flame covered arms, and quickly bite down into the flames.&nbsp;]</html>",
		"<html>[ After biting off a peice, you begin to eat the flames off of your arms, piece by piece until they're completely gone.&nbsp;]</html>",
		"<html>[ You continue to lift off the pillar of wood off of your mother, until it's completely off her, and toss the pillar to the side.&nbsp;]</html>",
		"<html>[ You look down, and your mom has fainted, her body unable to withstand anymore pain.&nbsp;]</html>",
		"<html>[ You pick up your mother, and quickly take her out of the house from the front door, behind you.&nbsp;]</html>",
		"<html>[ Sigh ] I need to find a place to get mom somewhere. Everyone is so far away!</html>",
		"<html>Why did we have to live in the middle of nowhere?</html>",
		"<html>[ You slam your first against the rock next to you, but as you do, a flame bursts out from your fist and dissipates into the air around you.&nbsp;]</html>",
		"<html>[ You spend a brief moment, staring at your hand amazed at what had happened.&nbsp;]</html>",
		"<html>[ After that moment, you realize that your mother is still hurt, pick her up, and quickly take her to the nearest town for help.&nbsp;]</html>",
		"<html>THE END"
	};
	public static String[] storyc = {
		"<html>( sigh ) I wish it weren't so dark down here. </html>",
		"<html>[ Suddenly, you have an image of yourself holding your hands close together, channeling a ball of light between them.&nbsp;]</html>",
		"<html>[ As your general impulsive self, you decide to do the same, despite the unrealisticness of it.&nbsp;]</html>",
		"<html>[ Just as in the image of your head, you decide to bring your hands together, creating a sphere in the palms of your hand.&nbsp;]</html>",
		"<html>[ As if by magic, a ball of light materalizes in your hand, whisping around.&nbsp;]</html>",
		"<html>[ Using this light, you run out of the basement, through the underground escape, leaving your parents and your house behind.&nbsp;]</html>",
		"<html>THE END</html>"
	};
	public static String[] storyd = {
		
		"<html>[ Suddenly, a flaming pillar, one simlar to the one which had crushed your mom, falls in your way - blocking the door. ]</html>",
		"<html>DANG IT !</html>",
		"<html>[ Out of rage, you punch the pillar. ]</html>",
		"<html>[ However, before your hand hits the pillar, a shimering light erupts from the space inbetween, and a circle suddenly emmits from the space as well. ]</html>",
		"<html>[ Suddenly, an immense force knocks the pillar, and everything behind it, foreward and leaves a whole in your house. ]</html>",
		"<html>[ You stand quietly in amazement, at your hand, before running out, leaving everything behind. ]</html>",
		"<html>THE END</html>",
	};
	public static String[] speaka = {
		" ",
		"",
		""
	};
	public static String[] speakb = {
		"Jeffery",
		"",
		"",
		"Mother",
		"",
		"",
		"",
		"Mother",
		"Jeffery",
		"",
		"",
		"",
		"",
		"",
		"Jeffery",
		"Jeffery",
		"",
		"",
		"",
		"",
		
	};
	public static String[] speakc = {
		"Jeffery",
		"",
		"",
		"",
		"",
		"",
		"",
	};
	public static String[] speakd = {
		"Jeffery",
		"",
		"Jeffery",
		"",
		"",
		"",
		"",
	};
	public static String[] blank = {
			""
	};
	
	//resource variables
	//public static Image img;
	public static ImageIcon img;
	public static void init() throws Exception{
		// just to be sure we can't see it, might not need it
	//	choice.setVisible(false);
	//	choice.setBounds(550,300,600,200);
		frame.setBounds(350, 150, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close it, close it, close it!
		frame.setResizable(false); // we want it at 800x600, no need to let user change it.
		newMainWindow.frame.setVisible(true);
		frame.setBackground(Color.black);
		frame.add(panel);
		checkBackground();
		speaker.setForeground(Color.white);
		text.setForeground(Color.white);
		panel.add(speaker, new Integer(3),0);
		panel.add(text, new Integer(2),0);
		panel.add(click, new Integer(4),0);
		click.setOpaque(false);
		click.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent m) {
				setText();
			}});
		setFont();
		setText();
		position();
	}
	
	public static void checkBackground(){
		if(p == 0 && t == 0){
			background.setIcon(new ImageIcon("resources/house.png"));
			setBackground();
		}
		if(p == 1 && t == 2){
			panel.remove(background);
			background.setIcon(new ImageIcon("resources/hallway.png"));
			setBackground();
		}
		if(p == 2 && t == 14){
			panel.remove(background);
			background.setIcon(new ImageIcon("resources/firebackground.png"));
			setBackground();
		}
		if(p == 3 && t == 1){
			panel.remove(background);
			background.setIcon(new ImageIcon("resources/darkroom.png"));
			setBackground();
		}
		if(p == 3 && t == 5){
			panel.remove(background);
			background.setIcon(new ImageIcon("resources/light.png"));
			setBackground();
		}
		if(p == 4 && t == 1){
			panel.remove(background);
			background.setIcon(new ImageIcon("resources/kitchen.png"));
			setBackground();
		}
	}
	
	public static void setBackground(){
		panel.add(background, new Integer (1),0);
		Dimension size;
		size = background.getPreferredSize();
		background.setBounds(0,0,size.width,size.height);
		refresh();
	}
	
	
	public static void setText(){
		// text for story later.
		if(t < story.length || s < speak.length)
		{
			speaker.setText(speak[s]);
			text.setText(story[t]);
			checkBackground();
			refresh();
			s++; t++;
		}
		else{
			setPath();
		}
	}
	
	public static void setPath(){
		Dimension size;
		final JLabel back = new JLabel(new ImageIcon("resources/blackback.png"));
		size = back.getPreferredSize();
		back.setBounds(0,0,size.width,size.height);
		panel.add(back, new Integer(5),0);
		
		story = blank;
		speak = blank;
		speaker.setText("");
		text.setText("");
		
		if(p == 0){
			// declaring choice buttons
			final JLabel ca = new JLabel(new ImageIcon("resources/choicea/choice_a_default.png")); 
			final JLabel cb = new JLabel(new ImageIcon("resources/choiceb/choice_b_default.png"));
			
			
			size = ca.getPreferredSize();
			ca.setBounds(218,185,size.width,size.height);
			panel.add(ca, new Integer (6),0);
			ca.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent m) {
					p = 1;
					t = s = 0;
					story = storya;
					speak = speaka;
					setText();
					back.setVisible(false);
					ca.setVisible(false);
					cb.setVisible(false);
					panel.remove(back);
					panel.remove(ca);
					panel.remove(cb);
					refresh();
				}
				public void mouseEntered(MouseEvent m){
					ca.setIcon(new ImageIcon("resources/choicea/choice_a_highlighted.png"));
				}
				public void mouseExited(MouseEvent m){
					ca.setIcon(new ImageIcon("resources/choicea/choice_a_default.png"));
				}
				public void mousePressed(MouseEvent m){
					ca.setIcon(new ImageIcon("resources/choicea/choice_a_pressed.png"));
				}
				public void mouseReleased(MouseEvent m){
					ca.setIcon(new ImageIcon("resources/choicea/choice_a_default.png"));
				}
			});
			
			size = cb.getPreferredSize();
			cb.setBounds(218,385,size.width,size.height);
			panel.add(cb, new Integer (6),0);
			cb.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent m) {
					p = 2;
					t = s = 0;
					story = storyb;
					speak = speakb;
					setText();
					back.setVisible(false);
					ca.setVisible(false);
					cb.setVisible(false);
					panel.remove(back);
					panel.remove(ca);
					panel.remove(cb);
					refresh();
				}
				public void mouseEntered(MouseEvent m){
					cb.setIcon(new ImageIcon("resources/choiceb/choice_b_highlighted.png"));
				}
				public void mouseExited(MouseEvent m){
					cb.setIcon(new ImageIcon("resources/choiceb/choice_b_default.png"));
				}
				public void mousePressed(MouseEvent m){
					cb.setIcon(new ImageIcon("resources/choiceb/choice_b_pressed.png"));
				}
				public void mouseReleased(MouseEvent m){
					cb.setIcon(new ImageIcon("resources/choiceb/choice_b_default.png"));
				}
			});
			
			refresh();
		}
		
		if(p == 1){
			// declaring choice buttons
			final JLabel cc = new JLabel(new ImageIcon("resources/choicec/choice_c_default.png")); 
			final JLabel cd = new JLabel(new ImageIcon("resources/choiced/choice_d_default.png"));
			
			
			size = cc.getPreferredSize();
			cc.setBounds(218,185,size.width,size.height);
			panel.add(cc, new Integer (6),0);
			cc.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent m) {
					p = 3;
					t = s = 0;
					story = storyc;
					speak = speakc;
					setText();
					back.setVisible(false);
					cc.setVisible(false);
					cd.setVisible(false);
					panel.remove(back);
					panel.remove(cc);
					panel.remove(cd);
					refresh();
				}
				public void mouseEntered(MouseEvent m){
					cc.setIcon(new ImageIcon("resources/choicec/choice_c_highlighted.png"));
				}
				public void mouseExited(MouseEvent m){
					cc.setIcon(new ImageIcon("resources/choicec/choice_c_default.png"));
				}
				public void mousePressed(MouseEvent m){
					cc.setIcon(new ImageIcon("resources/choicec/choice_c_pressed.png"));
				}
				public void mouseReleased(MouseEvent m){
					cc.setIcon(new ImageIcon("resources/choicec/choice_c_default.png"));
				}
			});
			
			size = cd.getPreferredSize();
			cd.setBounds(218,385,size.width,size.height);
			panel.add(cd, new Integer (6),0);
			cd.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent m) {
					p = 4;
					t = s = 0;
					story = storyd;
					speak = speakd;
					setText();
					back.setVisible(false);
					cc.setVisible(false);
					cd.setVisible(false);
					panel.remove(back);
					panel.remove(cc);
					panel.remove(cd);
					refresh();
				}
				public void mouseEntered(MouseEvent m){
					cd.setIcon(new ImageIcon("resources/choiced/choice_d_highlighted.png"));
				}
				public void mouseExited(MouseEvent m){
					cd.setIcon(new ImageIcon("resources/choiced/choice_d_default.png"));
				}
				public void mousePressed(MouseEvent m){
					cd.setIcon(new ImageIcon("resources/choiced/choice_d_pressed.png"));
				}
				public void mouseReleased(MouseEvent m){
					cd.setIcon(new ImageIcon("resources/choiced/choice_d_default.png"));
				}
			});
			
			refresh();
		}
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
		speaker.setBounds(50, 450, 100, size.height);
		size = text.getPreferredSize();
		text.setBounds(120, 470, 520, 60);
		click.setBounds(0,0,800,600);
		refresh();
	}
	
	public static void refresh(){
		frame.invalidate();
		frame.validate();
	}
	
	public static void main(String[] args) throws Exception{
		try{
			s = t = p = 0;
			init();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
	}
}