package magicJavaAdventure;

public class button {
	int color, pos, num, text;
	public button(int a, int b, int c, int d){
		color = a;
		num = b;
		pos = c;
		text = d;
	}
	
	public void set(int a, int b, int c, int d){
		color = a;
		num = b;
		pos = c;
		text = d;
	}
	
	public void init(){
		// We need to start rendering here.
	}
}
