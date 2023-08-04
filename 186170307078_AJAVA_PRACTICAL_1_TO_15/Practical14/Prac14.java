import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Prac14 extends JFrame implements ItemListener{
	JComboBox cmbSetImage;
	JLabel lblImg;
	String items [] = {"", "Audi", "BMW", "Bugatti"};
	Prac14(){
		setLayout(new BorderLayout());
		setResizable(true);
		setBounds(100, 200, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		cmbSetImage = new JComboBox(items);
		lblImg = new JLabel();
		lblImg.setHorizontalAlignment(JLabel.CENTER);
		add(cmbSetImage, BorderLayout.NORTH);
		add(lblImg, BorderLayout.CENTER);
		cmbSetImage.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie){
		if(cmbSetImage.getSelectedItem().equals(items[1])){
			lblImg.setIcon(new ImageIcon("C:\\xampp\\htdocs\\lcs\\Add garage\\add-garage-image\\audi-logo.png"));
		}
		else if(cmbSetImage.getSelectedItem().equals(items[2])){
			lblImg.setIcon(new ImageIcon("C:\\xampp\\htdocs\\lcs\\Add garage\\add-garage-image\\bmw-logo.png"));
		}
		else if(cmbSetImage.getSelectedItem().equals(items[3])){
			lblImg.setIcon(new ImageIcon("C:\\xampp\\htdocs\\lcs\\Add garage\\add-garage-image\\bugatti-logo.png"));
		}	
	}
	public static void main(String[] args) {
		new Prac14().setVisible(true);
	}
}
