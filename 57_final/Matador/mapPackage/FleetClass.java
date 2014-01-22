package mapPackage;

import mainGame.PlayerClass;
import boundaryToMatador.GUI;

public class FleetClass extends Ownable {

FleetClass()
{
		this.buyPrice = 4000;
		this.rent = 250;
		this.owned = false;
		this.currentOwner = null;
}
	
protected void landingOn(PlayerClass pPlayer) 
{
	
	if(this.owned == false && pPlayer.account.getBalance() >= this.buyPrice)
	{
		if(cout.buyFleet() == true)
		{
				pPlayer.account.addBalance(-this.buyPrice, pPlayer.getName(), false);
				GUI.setOwner(pPlayer.getPlayerPos(), pPlayer.getName());
				this.currentOwner = pPlayer;
				this.currentOwner.account.addTypeOwned("fleet");
				this.owned = true;
		}
	}
	
	if(this.owned == true && this.currentOwner != pPlayer)
	{	
		this.rent = 250;
		for(int i = 0; i < this.currentOwner.account.getTypeOwned("fleet"); i++){ this.rent = this.rent*2; }
		
		if(pPlayer.getDobbelt())
		{	
			pPlayer.transaction(this.currentOwner, this.rent*2);
		}
		else 
		{
			pPlayer.transaction(this.currentOwner, this.rent);
		}
		
		// transact moolaz to the current owner and give him his amount of fleets owned *2
	}

	
}

	
}
