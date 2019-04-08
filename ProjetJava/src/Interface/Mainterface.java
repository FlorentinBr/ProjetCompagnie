package Interface;
/**
 * https://www.jmdoudoux.fr/java/dej/chap-swing.htm
 */

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URL;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;




public class Mainterface {
	public static void main(String [] args){
		/**
		JFrame f = new JFrame("Sex XXX");
		f.setSize(500,100);
		JPanel pannel = new JPanel();
		JButton bouton1 = new JButton("Elle va t'adorer");
		bouton1.addActionListener( new ActionListener() {
		public void actionPerformed(ActionEvent e) {
	
			 String url = "https://i.ytimg.com/vi/nk2jT2gH18g/maxresdefault.jpg";
			 
			 try {
				 
				 URI uri= new URI(url);
				 
				 java.awt.Desktop.getDesktop().browse(uri);
				 System.out.println("Web page opened in browser");
				 
				 } 
			 catch (Exception ex) {
				 
				 ex.printStackTrace();
				 }
		}
		}
		);	
		pannel.add(bouton1);
	
		f.getContentPane().add(pannel);
		
		
		*/
		
		
		/*
		JFrame f = new JFrame("Choix de l'avion");
		
		f.setSize(400,100);
		
		JPanel pannel = new JPanel();
	
		JButton bouton1 = new JButton("Nimbus 2000");
		
		bouton1.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				 String url = "http://66.media.tumblr.com/1f1e1c8bca573d1da8c4ce4bb46cbd1a/tumblr_mixz3imIMY1r8omrho3_250.gif";
				 
				 try {
					 
					 URI uri= new URI(url);
					 
					 java.awt.Desktop.getDesktop().browse(uri);
					 System.out.println("Web page opened in browser");
					 
					 } 
				 catch (Exception ex) {
					 
					 ex.printStackTrace();
					 }
			}
		});
		
		pannel.add(bouton1);
	
		JButton bouton2 = new JButton("Cargo");
		
		bouton2.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				 String url = "https://resize-elle.ladmedia.fr/r/625,,forcex/crop/625,804,center-middle,forcex,ffffff/img/var/plain_site/storage/images/societe/news/une-americaine-se-reve-en-femme-la-plus-grosse-du-monde-1190164/14037219-1-fre-FR/Une-Americaine-se-reve-en-femme-la-plus-grosse-du-monde.jpg";
				 try {
					 
					 URI uri= new URI(url);
					 
					 java.awt.Desktop.getDesktop().browse(uri);
					 System.out.println("Web page opened in browser");
					 
					 } 
				 catch (Exception ex) {
					 
					 ex.printStackTrace();
					 }
			}
		});
		
	
		pannel.add(bouton2);
		
		JButton bouton3 = new JButton("Avion de chasse");
		
		bouton3.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				 String url = "https://images-na.ssl-images-amazon.com/images/I/411W5JO-t-L._SX358_BO1,204,203,200_.jpg";
				 
				 try {
					 
					 URI uri= new URI(url);
					 
					 java.awt.Desktop.getDesktop().browse(uri);
					 System.out.println("Web page opened in browser");
					 
					 } 
				 catch (Exception ex) {
					 
					 ex.printStackTrace();
					 }
			}
		});
		
	
		pannel.add(bouton3);
	
		f.getContentPane().add(pannel);
	
		f.getRootPane().setDefaultButton(bouton3);
		
		*/
		
		
		JFrame f = new JFrame("Test JTabbedPane");

		f.setSize(500, 500);
	
		JPanel pannel = new JPanel();

		JTabbedPane onglets = new JTabbedPane(SwingConstants.TOP);

		JPanel onglet1 = new JPanel();
	
		JLabel titreOnglet1 = new JLabel("Votre espace voyageur");
	
		onglet1.add(titreOnglet1);
	
		onglet1.setPreferredSize(new Dimension(490, 480));
		
		// bouton et son action
		 
		JButton bouton1 = new JButton("Elle va t'adorer");
		bouton1.addActionListener( new ActionListener() {
		public void actionPerformed(ActionEvent e) {
	
			 String url = "https://i.ytimg.com/vi/nk2jT2gH18g/maxresdefault.jpg";
			 
			 try {
				 
				 URI uri= new URI(url);
				 
				 java.awt.Desktop.getDesktop().browse(uri);
				 System.out.println("Web page opened in browser");
				 
				 } 
			 catch (Exception ex) {
				 
				 ex.printStackTrace();
				 }
		}
		}
		);	
		
		onglets.addTab("Voyageur", onglet1);
		onglet1.add(bouton1);
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		JPanel onglet2 = new JPanel();
	
		JLabel titreOnglet2 = new JLabel("votre espace compagnie");
	
		onglet2.add(titreOnglet2);
	
		onglets.addTab("Compagnie", onglet2);

		onglets.setOpaque(true);

		pannel.add(onglets);
		f.getContentPane().add(pannel);
		f.getContentPane().add(pannel);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		f.setLocation(dim.width/2 - f.getWidth()/2, dim.height/2 - f.getHeight()/2);
		f.setVisible(true);
		
		
      
        

		}
		}
	
	



