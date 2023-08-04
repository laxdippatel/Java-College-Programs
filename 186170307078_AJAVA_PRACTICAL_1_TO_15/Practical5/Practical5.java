import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
	<applet code="Practical5" width=600 height=600>
	</applet> 
*/

public class Practical5 extends Applet implements MouseMotionListener {
	String msg="";
	int x,y,xx,yy;
	public void init() {
		addMouseMotionListener(this);
	}

	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x,y,20,20);
		g.setFont(new Font("Times New Roman",Font.PLAIN,25));
		g.drawString(msg,0,19);
	}
	
	public void mouseDragged(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		repaint();
	}
	
	public void mouseMoved(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		repaint();
		msg="Mouse Position is : x :"+x+",y :"+y;
	}
}