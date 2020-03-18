package projPOO01.GestionAchat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author antoinethebault
 *commande : definit une commande definie par un intitule, une date precise et une quantite
 */
public class commande {
	private Date date;
	private String intitule;
	private int quantite;
	private String pattern = "dd-MM-yyyy";
	private SimpleDateFormat sd = new SimpleDateFormat(pattern);
	
	public commande(Date d, String i, int q) {
		// TODO Auto-generated constructor stub
		this.date = d;
		this.intitule = i;
		this.quantite = q;
	}

	@Override
	public String toString() {
		return intitule + "[date=" +sd.format(date) + ", quantite=" + quantite + "]";
	}
	
	

}
