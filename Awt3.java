import java.awt.*;
import java.awt.event.*;

public class Awt3 extends Frame implements ItemListener{
	
	private CheckboxGroup checkboxgroup;
	private Label label;
	
	Awt3(){
		Panel panel = new Panel();
		label = new Label();
		label.setBackground(Color.red);
		
		checkboxgroup = new CheckboxGroup();
		setLayout(new GridLayout(4,1));
		Checkbox c1 = new Checkbox("Java",checkboxgroup,false);
		Checkbox c2 = new Checkbox("C++",checkboxgroup,false);
		Checkbox c3 = new Checkbox("Python",checkboxgroup,false);
		
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);

		add(c1);
		add(c2);
		add(c3);
		panel.add(label);
		add(panel,BorderLayout.SOUTH);

		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	public void itemStateChanged(ItemEvent e){
		label.setText(checkboxgroup.getSelectedCheckbox().getLabel());
		System.out.println(checkboxgroup.getSelectedCheckbox().getLabel());
	}
	
	public static void main(String[] args){
		
		Awt3 awt = new Awt3();
		awt.setBounds(50,50,300,300);
		awt.setVisible(true);
		
	}
}