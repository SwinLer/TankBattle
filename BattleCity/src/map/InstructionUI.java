package map;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class InstructionUI extends MapUI{
	Container ct;
	BackgroundPanel bgp;
	public InstructionUI() {}
	
	public void addElement() {
		ct=this.getContentPane();
		bgp=new BackgroundPanel((new ImageIcon("./src/img/GameShows.jpg")).getImage());
		bgp.setBounds(0,25,785, 550);
		ct.add(bgp);
		
	}
}

class BackgroundPanel extends JPanel{	
	Image im;	
	public BackgroundPanel(Image im){		
		this.im=im;		
		this.setOpaque(true);	
	}	
	public void paintComponent(Graphics g){		
		super.paintComponents(g);		
		g.drawImage(im,0,0,this.getWidth(),this.getHeight(),this);			
	}
}


