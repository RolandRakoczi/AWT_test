import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Awt4 extends Frame implements ActionListener{
	Button button;
	Random random;
	
	public Awt4(){
		button=new Button("Push me!");
		Panel panel = new Panel();
		
		button.setSize(10,30);
		random=new Random();
		button.setLocation(50+random.nextInt(200),50+random.nextInt(200));
		button.addActionListener(this);
		panel.add(button);
		add(panel);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	public void actionPerformed(ActionEvent e){
		try{
		new Robot().mouseMove((int)MouseInfo.getPointerInfo().getLocation().getX(),(int)MouseInfo.getPointerInfo().getLocation().getY()-25);
		button.setLocation(50+random.nextInt(200),50+random.nextInt(200));
		} catch (AWTException ex){}
	}
		
	public static void main(String[] args){
		Awt4 awt=new Awt4();
		awt.setBounds(50,50,300,300);
		awt.setVisible(true);
	}
}