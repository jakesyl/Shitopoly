package cardPackage;

import mainGame.PlayerClass;

public class HouseCard extends SuperCard
{

	public void drawCard(PlayerClass pPlayer) {
			
			//betal 800 dollars pr. hus og 2300 pr Hotel
			
			int totalValue = pPlayer.account.getTypeOwned("houses")*800 + pPlayer.account.getTypeOwned("hotels")*2300;
			pPlayer.cout.printHouseIncrease();
			pPlayer.account.addBalance(-totalValue, pPlayer.getName(), false);
			
	}

}

