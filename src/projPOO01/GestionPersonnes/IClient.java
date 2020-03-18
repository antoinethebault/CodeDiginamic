package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.GestionAchat.Achat;

/**
 * @author antoinethebault
 *IClient
 */
public interface IClient {
	public void achete(List<Achat> listachat);
	public boolean paie();
	public boolean isClient();
}
