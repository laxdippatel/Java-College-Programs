
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/* 
<applet code="Prac8" width=700 height=500></applet>
*/
public class Prac8 extends Frame implements WindowListener,ActionListener{
	Button btn1;
	int i=1;

	Prac8(){
		FlowLayout ft = new FlowLayout();
		setLayout(ft);
		btn1 = new Button("Change Color");	
		add(btn1);
		//tn1.setBounds(20,40,100,150);
		btn1.addActionListener(this);
		addWindowListener(this);
	}

	public static void main(String args[]){
		Prac8 obj = new Prac8();
		obj.setSize(400,400);
		obj.setTitle("Frame Button Cycle");
		obj.setVisible(true);
	}

	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we){}
	public void windowActivated(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowClosed(WindowEvent we){}
	public void windowOpened(WindowEvent we){}

	public void actionPerformed(ActionEvent ae){
		String s = ae.getActionCommand();
		if(s.equals("Change Color")){
			switch(i){
				case 1 : 
				setBackground(Color.red);
				i=2;
				break;
				case 2 : 
				setBackground(Color.green);
				i=3;
				break;
				case 3:
				setBackground(Color.blue);
				i=1;
				break;
			}
			
		}
	}
}
