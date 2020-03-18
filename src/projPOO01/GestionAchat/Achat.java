package projPOO01.GestionAchat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author antoinethebault
 *Achat represente un achat avec un intitule et effectue a une date precise pour une quantite definie
 */
public class Achat {
	private Date date;
	private String intitule;
	private int quantite;
	private String pattern = "dd-MM-yyyy";
	private SimpleDateFormat sd = new SimpleDateFormat(pattern);
	
	
	public Achat(Date d, String i, int q) {
		// TODO Auto-generated constructor stub
		this.date =d;
		
		this.intitule =i;
		this.quantite =q;
	}

	@Override
	public String toString() {
			return intitule + "[date=" +sd.format(date) + ", quantite=" + quantite + "]";
		
		}
	
	
	

}
