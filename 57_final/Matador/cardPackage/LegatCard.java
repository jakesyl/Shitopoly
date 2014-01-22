package cardPackage;

import mainGame.PlayerClass;

public class LegatCard extends SuperCard {
	public void drawCard(PlayerClass pPlayer){
		pPlayer.cout.printLegatCard();
		if(pPlayer.account.getTotalValue()<=15000){
			pPlayer.account.addBalance(40000, pPlayer.getName(), false);
		}	
	}
}
