package mapPackage;
import boundaryToMatador.GUI;
import mainGame.PlayerClass;
import mainGame.GameCore;

public class BreweryClass extends Ownable {

	
BreweryClass()
{
	this.buyPrice = 3000;
	this.rent = 100;
}

protected void landingOn(PlayerClass pPlayer) 
{
		//If you land on it, 100*die*breweries owned
		
		if(this.owned == false) // if not owned
		{
			if(cout.buyBrewery(this.buyPrice) == true) // prompt the player
			{
				pPlayer.account.addBalance(-this.buyPrice, pPlayer.getName(), true);
				pPlayer.account.addTypeOwned("brewery"); // ensure player knows how many breweries he owns.
				this.owned = true;
				this.currentOwner = pPlayer; 
				GUI.setOwner(pPlayer.getPlayerPos(), pPlayer.getName());
			}
		}
		
		
		if(this.owned == true && this.currentOwner != pPlayer) // In case the player doesn't own the property, and someone else does
		{
			pPlayer.transaction(this.currentOwner, (this.rent*currentOwner.account.getTypeOwned("brewery")*(GameCore.dice01.diceRoll()+GameCore.dice02.diceRoll())));
			// OPTIMIZED, YOU SHITTER
		}
		
}
	
}