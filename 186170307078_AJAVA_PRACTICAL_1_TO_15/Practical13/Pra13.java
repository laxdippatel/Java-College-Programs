import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pra13 extends JFrame implements ActionListener{
	JTextField tf1,tf2;
	JButton sub;
	JLabel t,fn,sn;
	Pra13(){
		setSize(1370,769);
		setLayout(null);

		fn=new JLabel("Enter Number:");
		fn.setBounds((getWidth()/2)-125,20,150,50);
		
		tf1=new JTextField();
		tf1.setBounds(getWidth()/2,30,100,30);
		
		t=new JLabel("-");
		t.setBounds((getWidth()/2)+40,80,100,50);
		
		sn=new JLabel("Enter Number:");
		sn.setBounds((getWidth()/2)-125,130,150,50);
		
		tf2=new JTextField();
		tf2.setBounds(getWidth()/2,140,100,30);
		
		sub=new JButton("SUBTRACTION");
		sub.setBounds((getWidth()/2),210,100,30);
		sub.addActionListener(this);

		add(fn);
		add(tf1);
		add(t);
		add(sn);
		add(tf2);
		add(sub);

		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		int x = Integer.parseInt(tf1.getText());
		int y = Integer.parseInt(tf2.getText());
		int ans = x-y;
		JOptionPane.showMessageDialog(this,"Answer is: " + ans);
	}
	public static void main(String arg[]){
		new Pra13();
	}
}