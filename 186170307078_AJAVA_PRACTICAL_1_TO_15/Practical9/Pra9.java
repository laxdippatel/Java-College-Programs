import java.awt.Checkbox;
import java.applet.Applet;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Canvas;
import java.awt.Color;

/*
<applet code="Pra9" height=400 width=500></applet>
*/

public class Pra9 extends Applet implements ItemListener{
	Checkbox chkRed,chkBlue,chkGreen;
	Canvas canvas;

	public void init(){
		chkRed = new Checkbox("Red");
		chkGreen = new Checkbox("Green");
		chkBlue = new Checkbox("Blue");
		chkRed.addItemListener(this);
		chkGreen.addItemListener(this);
		chkBlue.addItemListener(this);
		add(chkRed);
		add(chkGreen);
		add(chkBlue);
		canvas = new Canvas();
		canvas.setSize(30,30);
		canvas.setBackground(Color.black);
		add(canvas);
	}

	public void itemStateChanged(ItemEvent ie){
		int rgb = 0;
		if(chkRed.getState()){
			rgb = rgb | 0XFF0000;
		}
		if(chkGreen.getState()){
			rgb = rgb | 0X00FF00;	
		}
		if(chkBlue.getState()){
			rgb = rgb | 0X0000FF;
		}
		Color color = new Color(rgb);
		can1.setBackground(color);
	}
}
