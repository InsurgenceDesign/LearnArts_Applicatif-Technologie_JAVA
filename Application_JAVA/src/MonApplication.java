import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;



import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;

public class MonApplication {

  public static void main(String[] args) {
	//Cr�ation de l'objet
    MaFenetre f = new MaFenetre();
    //Fonction qui affiche la fen�tre
    f.afficher();
  }
}

class MaFenetre {
  // Element JFrame mis � nul
  JFrame mainFrame = null;
  // Import Image
  Image im = Toolkit.getDefaultToolkit().getImage("icon.png");
  public MaFenetre() {
	
  // Affecter une nouvelle fen�tre
    mainFrame = new JFrame();
  // Titre sur l'application
    mainFrame.setTitle("Learn art's - La cr�ativit� n'attend pas");
    // Action D'ecoute de l'utilisateur
    mainFrame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent ev) {
        System.exit(0);
      }
    });
 // Taille de la fenetre
    mainFrame.setSize(650, 450);
 // Mise a null la valeur de deplacement Local (Centrage)
    mainFrame.setLocationRelativeTo(null);
 // Icon Image
    mainFrame.setIconImage(im);
    
 }
  // Affiche la fen�tre
  public void afficher() {
    mainFrame.setVisible(true);
  }
}