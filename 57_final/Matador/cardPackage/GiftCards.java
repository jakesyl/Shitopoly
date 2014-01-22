package cardPackage;

import mainGame.PlayerClass;
import mainGame.PlayerController;

public class GiftCards extends SuperCard {
	private PlayerClass[] players;

	
	private int x;
	
public GiftCards(int p) {
		super();
		this.x = p;
}

public void drawCard(PlayerClass pPlayer)
{
	pPlayer.cout.printGiftCards(x);
		for(int i = 0; i < this.players.length;  i++)   //
		{
			if(this.players[i].stillPlaying && this.players[i] != pPlayer)
			{
				this.players[i].transaction(pPlayer, x);
			}
		}
		
}

public void initialize(PlayerClass[] players)
{
	this.players = players;
}

}
