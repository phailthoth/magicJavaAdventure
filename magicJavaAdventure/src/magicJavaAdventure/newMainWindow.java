package magicJavaAdventure;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.imageio.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class newMainWindow extends JPanel implements MouseListener{
	public static JFrame frame;
	public static Panel panel = new Panel();
	public static JLabel speaker = new JLabel();
	public static JLabel text = new JLabel();
	public static int s, t;
	public static Image img;
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
	
	public static void init() throws Exception{
		// sets frame up for initial start up
		frame = new JFrame("clickableRegion");
		frame.setBounds(350, 150, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close it, close it, close it!
		//frame.setResizable(false); // we want it at 800x600, no need to let user change it.
		newMainWindow.frame.setVisible(true);
		frame.setBackground(Color.black);
		frame.add(panel);
		setBackground();
		speaker.setForeground(Color.white);
		text.setForeground(Color.white);
		panel.add(speaker);
		panel.add(text);
		setText();
		position();
		
		
	}
	
	public static void setBackground() throws Exception{
		// attempt at making this more flexible later on. Might do it base on variable value.
		img = ImageIO.read(new File("resources/treetrail.jpg"));
		JLabel background = new JLabel(new ImageIcon(img));
		panel.add(background);
		Dimension size;
		size = background.getPreferredSize();
		background.setBounds(0,0,size.width,size.height);
		refresh();
	}
	
	public static void setText(){
		// text for story later.
		s++; t++;
		speaker.setText("Test, speaker.");
		text.setText("Test, text.");
		// speaker.setText(speak[s]);
		// text.setText(story[t]);
		refresh();
	}
	
	public static void position(){
		// absolute positioning, because we need it on top of the background.
		Dimension size;
		size = speaker.getPreferredSize();
		speaker.setBounds(50, 500, size.width, size.height);
		size = text.getPreferredSize();
		text.setBounds(100, 550, size.width, size.height);
		refresh();
	}
	
	public static void refresh(){
		frame.invalidate();
		frame.validate();
	}
	
	
	// clicky stuff that I still need to do.
	@Override
	public void mouseClicked(MouseEvent arg0) {
		setText();
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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