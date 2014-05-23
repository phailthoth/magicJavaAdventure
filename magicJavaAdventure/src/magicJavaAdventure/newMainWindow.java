package magicJavaAdventure;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.imageio.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class newMainWindow extends JPanel implements MouseListener{
	public static JFrame frame;
	public static JPanel panel;
	public static JLabel speaker, text;
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
		frame = new JFrame("clickableRegion");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newMainWindow.frame.setVisible(true);
		frame.add(panel);
		setBackground();
		panel.add(speaker);
		panel.add(text);
		position(frame.getContentPane());
		setText();
		
	}
	
	public static void setBackground() throws Exception{
		img = ImageIO.read(new File("resources/treetrail.jpg"));
		JLabel background = new JLabel(new ImageIcon(img));
		panel.add(background);
	}
	
	public static void setText(){
		s = t = s++;
		speaker.setText(speak[s]);
		text.setText(story[t]);
	}
	
	public static void position(Container pane){
		pane.setLayout(null);
		Insets insets = pane.getInsets();
		Dimension size = speaker.getPreferredSize();
		speaker.setBounds(50 + insets.left, 500 + insets.top, size.width, size.height);
		text.setBounds(100 + insets.left, 550 + insets.top, size.width, size.height);
	}
	
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