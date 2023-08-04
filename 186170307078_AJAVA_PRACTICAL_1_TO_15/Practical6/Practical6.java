import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
	<applet code="Practical6" width="300" height="300">
	</applet>
*/

public class Practical6 extends Applet implements ActionListener {
	Button b;

	public void init() {
		b=new Button("START");
		add(b);
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String s = b.getLabel();
		if(s.equals("START"))
		{
			b.setLabel("STOP");
		}
		else
		{
			b.setLabel("START");	
		}
	}
}