import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="Practical_11" height=500 width=500></applet>
*/

public class Practical_11 extends Applet implements Runnable{
	int h,w;  //h-height, w-width
	int count=0;
	boolean draw=true;//true = drawRect false = fillRect
	public void run(){
		while(true){
			try{
				count += 10;
				Thread.sleep(100);	
			}catch(InterruptedException e){}
			repaint();
		}
	}
	public void start(){
		Thread t1 = new Thread(this);
		t1.start();
	}
	public void paint(Graphics g){
		int x = getWidth();
		int y = getHeight();
		if(h < 0 || w < 0){
			count = 0;
		}
		h = y - count;
		w = x - count;
		if(draw){g.drawRect(x/2-(w/2), y/2-(h/2), w,h); draw=false;}
		else{g.fillRect(x/2-(w/2)+30, y/2-(h/2)+30, w-60, h-60); draw=true;}
	}
}
