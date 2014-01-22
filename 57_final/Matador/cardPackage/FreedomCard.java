package cardPackage;

import mainGame.PlayerClass;

public class FreedomCard extends SuperCard {
	public void drawCard(PlayerClass pPlayer){
		pPlayer.addFreedom();
		pPlayer.cout.printFreedomCardAchieved();
	}
}
