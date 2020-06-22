import java.awt.*;
import java.awt.event.*;

public class Awt2 extends Frame implements ActionListener{
	
	private TextArea textarea;
	private TextField textfield;
	private Button button;
	private Panel panel1;
	private Panel panel2;
	
	public Awt2(){
		
		textarea=new TextArea();
		textfield=new TextField();
		button=new Button("Send");
		panel1=new Panel();
		panel2=new Panel();
		
		
		panel2.setLayout(new FlowLayout());
		textfield.addActionListener(this);
		panel2.add(textfield);
		button.addActionListener(this);
		panel2.add(button);
		panel1.add(textarea,BorderLayout.NORTH);
		panel1.add(panel2,BorderLayout.SOUTH);
		this.add(panel1);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
	}
	
	public void actionPerformed(ActionEvent e){
			String s = textfield.getText()+"\n";
			textarea.append(s);
			textfield.setText("");
	}
	
	
	public static void main(String[] args){
		Awt2 awt=new Awt2();
		awt.setBounds(50,50,300,300);
		awt.setVisible(true);
	}
}