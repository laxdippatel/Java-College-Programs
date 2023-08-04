import java.awt.*;
import java.awt.event.*;

public class practical_10 extends Frame implements ActionListener, ItemListener{
	MenuBar mb;
	Menu menuFile, menuEdit, menuFile_submenu;
	MenuItem menuFile_new, menuFile_open, menuFile_save,menuFile_save_as;
	CheckboxMenuItem chk_bold;
	Label lbl = new Label("You Selected :");

	practical_10(){
		mb = new MenuBar();
		setMenuBar(mb);

		menuFile = new Menu("File");
		mb.add(menuFile);
		menuEdit = new Menu("Text style");
		mb.add(menuEdit);
		menuFile_submenu = new Menu("submenu");

		menuFile_new = new MenuItem("new");
		menuFile_open = new MenuItem("open");
		menuFile_save = new MenuItem("save");
		menuFile_save_as = new MenuItem("save as");
		chk_bold = new CheckboxMenuItem("BOLD");
		

		menuFile.add(menuFile_new);
		menuFile.add(menuFile_open);
		menuFile.add(menuFile_submenu);
		menuFile.add(menuFile_submenu);
		menuFile_submenu.add(menuFile_save);
		menuFile_submenu.add(menuFile_save_as);
		menuEdit.add(chk_bold);

		menuFile_new.setShortcut(new MenuShortcut(KeyEvent.VK_N));
		menuFile_open.setShortcut(new MenuShortcut(KeyEvent.VK_O));

		menuFile_open.addActionListener(this);
		menuFile_new.addActionListener(this);
		menuFile_save.addActionListener(this);
		menuFile_save_as.addActionListener(this);
		chk_bold.addItemListener(this);
		lbl.setAlignment(Label.CENTER);
		lbl.setBounds(250-200, 250-50, 400, 100);
		setLayout(null);
		lbl.setVisible(false);
		add(lbl);
	}

	public static void main(String args[]){
		practical_10 frame = new practical_10();
		frame.setSize(500, 500);
		frame.setTitle("Practical_10");
		frame.setVisible(true);
		frame.setResizable(false);
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent ae){
		String text = ae.getActionCommand();
		if(text.equals("open")){
			lbl.setText("You Selected this _>_>_> Open");
			lbl.setVisible(true);
		}
		else if (text.equals("new")) {
			lbl.setText("You Selected this _>_>_> New");
			lbl.setVisible(true);	
		}
		else if(text.equals("save")){
			lbl.setText("You Selected this _>_>_> Save");
			lbl.setVisible(true);	
		}
		else if(text.equals("save as")){
			lbl.setText("You Selected this _>_>_> Save As");
			lbl.setVisible(true);	
		}
	}

	public void itemStateChanged(ItemEvent ie){
		CheckboxMenuItem chk = (CheckboxMenuItem)ie.getSource();
		String s = chk.getLabel();
		if(s.equals("BOLD")){
			if(chk.getState()){
				lbl.setVisible(true);	
				lbl.setFont(new Font("TimesRoman",Font.BOLD,20));
			}
			else{
				lbl.setFont(new Font("TimesRoman",Font.ITALIC,20));
			}
		}
	}
}
