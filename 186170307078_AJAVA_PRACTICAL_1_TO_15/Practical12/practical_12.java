import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class practical_12 extends JFrame implements ActionListener{
	JLabel title, lblname, lblMO, lblEnr, lblAddress, lblGender, lblFavSub, lblYear, lblDisplay;
	JTextField txtname, txtMO, txtEnr;
	JRadioButton rdMale, rdFemale;
	JTextArea txtAddress;
	JCheckBox chkaJava, chkppud, chknma, chkmcad;
	JComboBox cmbYear;
	JButton btnSubmit, btnClear;
	Panel panel1, panel2, panel3, panel4;
	static practical_12 ob;
	String name, contact, er_no, address, gender, fav = "Your Favorite subjects are : ", year, space = "          ";
	practical_12(){
		setLayout(new GridLayout(0,2, 100, 20));
		setTitle("Student Registration Form");
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);


		lblname = new JLabel(space + "Enter your name", JLabel.LEFT);
		txtname = new JTextField();
		lblMO = new JLabel(space + "Enter your Contact NO : ", JLabel.LEFT);
		txtMO = new JTextField();
		lblEnr = new JLabel(space + "Enter your Enrollment NO : ", JLabel.LEFT);
		txtEnr = new JTextField();
		lblAddress = new JLabel(space + "Enter your Address : ", JLabel.LEFT);
		txtAddress = new JTextArea(); 	
		lblGender = new JLabel(space + "Select your gender : ", JLabel.LEFT);
		rdMale = new JRadioButton("Male");
		rdFemale = new JRadioButton("Female");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdMale); bg.add(rdFemale);
		lblFavSub = new JLabel(space + "select your favorite subjects : ");
		chkmcad = new JCheckBox("MCAD");
		chkaJava = new JCheckBox("AJAVA");
		chkppud = new JCheckBox("PPUD");
		chknma = new JCheckBox("NMA");
		lblYear = new JLabel(space + "select in which year you are studying : ");
		String year[] = {"","First Year","Second Year","Third Year"};
		cmbYear = new JComboBox(year);
		btnSubmit = new JButton("Submit");
		btnClear = new JButton("Clear");
		add(lblname);
		add(txtname);
		add(lblMO);
		add(txtMO);
		add(lblEnr);
		add(txtEnr);
		add(lblAddress);
		add(txtAddress);
		add(lblGender);
		panel1 = new Panel(new FlowLayout(FlowLayout.CENTER));
		panel1.add(rdMale); panel1.add(rdFemale);	
		panel2 = new Panel(new FlowLayout(FlowLayout.CENTER));
		panel2.add(chknma); panel2.add(chkppud); panel2.add(chkmcad); panel2.add(chkaJava);
		panel3 = new Panel(new FlowLayout(FlowLayout.RIGHT));
		panel4 = new Panel(new FlowLayout(FlowLayout.LEFT));
		add(panel1);
		add(lblFavSub);
		add(panel2);
		add(lblYear);
		add(cmbYear);
		panel3.add(btnSubmit);
		panel4.add(btnClear);
		add(panel3);
		add(panel4);
		btnClear.addActionListener(this);
		btnSubmit.addActionListener(this);
		//add(lblname);
		//add(txtname);
	}
	public static void main(String args[]){
		ob = new practical_12();
		ob.setBounds(300, 90, 700, 600);
	}
	public void actionPerformed(ActionEvent ae){
		String s = ae.getActionCommand();

		if(rdMale.isSelected()){gender = "Your Gender is : " + rdMale.getText();}
		else if(rdFemale.isSelected()){gender = "Your Gender is : " + rdFemale.getText();}

		if(chkmcad.isSelected()){fav = fav + chkmcad.getText() + " ";}
		if(chkppud.isSelected()){fav = fav + chkppud.getText() + " ";}
		if(chknma.isSelected()){fav = fav + chknma.getText() + " ";}
		if(chkaJava.isSelected()){fav = fav + chkaJava.getText() + " ";}

		year = "You are studying in " + cmbYear.getItemAt(cmbYear.getSelectedIndex());

		if(s.equals("Submit")){
			name = "Your Name is : "  + txtname.getText();
			contact = "Your Contact NO is : "  + txtMO.getText();
			er_no = "Your Enrollment NO is : "  + txtEnr.getText();
			address = "Your Address is : "  + txtAddress.getText();

			JFrame jframe = new JFrame();
			jframe.setLayout(new BorderLayout());
			jframe.setTitle("Student Registration Details");
			jframe.setResizable(true);
			jframe.setDefaultCloseOperation(DISPOSE_ON_CLOSE );
			jframe.setVisible(true);			
			jframe.setBounds(270, 70, 500, 400);
			lblDisplay = new JLabel("<html>"+name + "<br>" + contact + "<br>" +
			 er_no + "<br>" + address + "<br>" + 
				gender + "<br>" + fav + "<br>" + year + "<html/>" , JLabel.CENTER);
			jframe.add(lblDisplay, BorderLayout.CENTER);
		}
		else if(s.equals("Clear")){
			ob = new practical_12();
			ob.setBounds(200, 90, 700, 500);
		}
	}
}
