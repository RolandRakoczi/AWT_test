import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt1 extends Frame implements MouseListener, MouseMotionListener {
	
	private Label label;
	
	public Awt1(){
		Panel panel = new Panel();
		label = new Label();
		
		panel.setBackground(Color.yellow);
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		this.add(label,BorderLayout.SOUTH);
		this.add(panel,BorderLayout.CENTER);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});

	}
	
	public void mouseClicked(MouseEvent ex){
		label.setText(ex.getX()+ " "+ex.getY()+ "   clicked"); 
	}
	
	public void mouseDragged(MouseEvent ex){
		label.setText(ex.getX()+ " "+ex.getY()+ "   dragged");
	}
	
	public void mouseMoved(MouseEvent ex){
		label.setText(ex.getX()+ " "+ex.getY()+ "   moved");
	}
	
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	
	public static void main(String[] args){
		Awt1 awt = new Awt1();
		awt.setBounds(50,50,300,300);
		awt.setVisible(true);
	}
}