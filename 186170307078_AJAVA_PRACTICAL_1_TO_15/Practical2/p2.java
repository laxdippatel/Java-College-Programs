import java.applet.*;
import java.awt.*;

public class p2 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		for(int i=1;i<=10;i++)
		{
			g.fillOval(50,i*40,40,40);
		}
	
	}
}

/*
	<applet code="p2" width="500" height="500"> 
	</applet>
*/