import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Pra15 extends JFrame implements ItemListener{
	
	JPanel panel1;
	JRadioButton rdferrari, rdford, rdjaguar;
	JLabel lblShow;
	Pra15(){
		setLayout(new GridLayout(0,2));
		setResizable(true);
		setTitle("Radio Button Demo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		rdferrari = new JRadioButton("Ferrari");
		rdford = new JRadioButton("Ford");	
		rdjaguar = new JRadioButton("Jaguar");	
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdferrari);bg.add(rdford);bg.add(rdjaguar);
		rdferrari.addItemListener(this);
		rdford.addItemListener(this);
		rdjaguar.addItemListener(this);
		panel1 = new JPanel(new GridLayout(5,0));
		panel1.add(rdferrari);
		panel1.add(rdford);
		panel1.add(rdjaguar);
		lblShow = new JLabel();
		add(panel1);
		add(lblShow);
	}
	public static void main(String[] args) {
		Pra15 ob = new Pra15();
		ob.setVisible(true);
		ob.setBounds(500, 300, 400, 200);
	}
	public void itemStateChanged(ItemEvent ie){
		if(rdferrari.isSelected()){
			lblShow.setIcon(new ImageIcon("C:\\xampp\\htdocs\\lcs\\Add garage\\add-garage-image\\ferrari-logo.png "));	
		}
		else if(rdford.isSelected()){
			lblShow.setIcon(new ImageIcon("C:\\xampp\\htdocs\\lcs\\Add garage\\add-garage-image\\ford-logo.png "));
		}
		else if(rdjaguar.isSelected()){
			lblShow.setIcon(new ImageIcon("C:\\xampp\\htdocs\\lcs\\Add garage\\add-garage-image\\jaguar-logo.png "));
		}
	}
}
