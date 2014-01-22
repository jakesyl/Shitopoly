package cardPackage;

import mainGame.PlayerClass;

public class MoveCards extends SuperCard {
	private int b;

	public MoveCards(int b) {
		super();
		this.b = b;
	}
	public void drawCard(PlayerClass pPlayer){
		pPlayer.cout.printMoveCards(b);
		
		pPlayer.setPlayerPos(b);	
	}
}
