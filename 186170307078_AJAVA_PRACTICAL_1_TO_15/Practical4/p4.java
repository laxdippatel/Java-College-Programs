import java.applet.*;
import java.awt.*;

public class p4 extends Applet
{
	public void paint(Graphics g)
	{
		int a= Integer.parseInt(getParameter("a"));
		int b= Integer.parseInt(getParameter("b"));
		int ans=a+b;
		Font f=new Font("Times New Roman",Font.BOLD,20);
		g.setFont(f);
		g.drawString("value of A is:"+a,10,30);
		g.drawString("value of B is:"+b,10,60);
		g.drawString("Sum is:"+ans,10,90);

	}
}

/* 
	<applet code="p4.class" width="500" height="500">
		<param name="a" value="65">
		<param name="b" value="20">
	</applet>
*/