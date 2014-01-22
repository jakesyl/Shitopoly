package cardPackage;

import mainGame.PlayerClass;

public class JailCard extends SuperCard {
	public void drawCard(PlayerClass pPlayer){
		pPlayer.cout.printJailCard();
		pPlayer.arrested();
		
	}
}
