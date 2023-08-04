import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
	<applet code="Practical7" width=600 height=400>
	</applet>
*/

public class Practical7 extends Applet implements MouseListener {
	String msg;
	int x,y;
	
	public void init() {
		addMouseListener(this);	
	}

	public void mousePressed(MouseEvent a) {
		msg="Mouse Pressed at position: "+x+","+y;
		x=a.getX();
		y=a.getY();
		repaint();
	}

	public void mouseEntered(MouseEvent a){
		msg="MouseEnetered!";
		repaint();
	}

	public void mouseExited(MouseEvent a){
		msg="MouseExited!";
		repaint();
	}
		public void mouseClicked(MouseEvent a){
		msg="Mouse clicked at position: "+x+","+y;
		x=a.getX();
		y=a.getY();
		repaint();
	}
	
	public void mouseReleased(MouseEvent a) {
		msg="Mouse Relesed at position: "+x+","+y;
		x=a.getX();
		y=a.getY();
		repaint();	
	}
	public void paint(Graphics g) {
		g.setFont(new Font("Garamond",Font.PLAIN,28));
		g.drawString(msg,20,20);
	}
}