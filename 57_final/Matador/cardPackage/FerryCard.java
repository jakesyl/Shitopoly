package cardPackage;

import mainGame.PlayerClass;

public class FerryCard extends SuperCard {
	private boolean dobbelt;

	public FerryCard(boolean dobbelt) {
		super();
		this.dobbelt = dobbelt;
	}
	public void drawCard(PlayerClass pPlayer){
		pPlayer.cout.printFerryClass(dobbelt);
		
		if(pPlayer.getPlayerPos() == 37 || pPlayer.getPlayerPos() == 3){
			pPlayer.setPlayerPos(6);
		}
		else if(pPlayer.getPlayerPos() == 8){
			pPlayer.setPlayerPos(16);
		}
		else if(pPlayer.getPlayerPos() == 18 || pPlayer.getPlayerPos() == 23){
			pPlayer.setPlayerPos(26);
		}
		else if(pPlayer.getPlayerPos() == 34){
			pPlayer.setPlayerPos(36);
		}
		if(dobbelt){
			pPlayer.setDobbelt(true);
		}
	}
}
