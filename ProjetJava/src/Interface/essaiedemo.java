package Interface;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.*;

public class essaiedemo extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public essaiedemo(String titre) {
	
	super(titre);

	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	init();

	}

	private void init()
	
	{
	
	JLabel label = new JLabel(new ImageIcon("/home/formation/Bureau/avion_041.gif") );

	this.add(label, BorderLayout.CENTER);

	this.pack();   

	}

	
	
	
	
	
		
		}
		
		
		
	
		

	
	 
	


