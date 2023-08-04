/*
<applet code="Pra3.class" width="500" height="300"></applet>
*/

import java.awt.Graphics;
import java.awt.Color;
import java.applet.Applet;

public class Pra3 extends Applet{
	Color colors[] = {Color.red,Color.green,Color.blue,Color.yellow,Color.orange,Color.pink,Color.cyan,Color.gray,Color.magenta,Color.black};
	int x,y;

	public void paint(Graphics g){
		x = getWidth();
		y = getHeight();
		for(int i = 0; i<colors.length; i++){
			g.setColor(colors[i]);
			g.fillRect(x/10*i,0,x/10,y);
		}
	}
}
