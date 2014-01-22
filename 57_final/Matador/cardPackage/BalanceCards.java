package cardPackage;

import mainGame.PlayerClass;

public class BalanceCards extends SuperCard {
	private int x;
	
	public BalanceCards(int x) {
		super();
		this.x = x;
	}

	public void drawCard(PlayerClass pPlayer){
		pPlayer.cout.printBalanceCard(x);

	pPlayer.account.addBalance(x, pPlayer.getName(), false);
	}
}
