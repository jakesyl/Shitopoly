package mapPackage;

import mainGame.PlayerClass;
import boundaryToMatador.GUI;


public abstract class Ownable extends SuperField{
	
	protected int baseRent, rent, buyPrice; // consider removing amountOwned
	protected boolean owned;
	
	protected PlayerClass currentOwner, victim;
	
protected void buyProperty(String colour)
{
	if(cout.buyStreet(this.buyPrice) == true)
	{
		this.owned = true;
		victim.account.addBalance(-this.buyPrice, victim.getName(), true);
		GUI.setOwner(victim.getPlayerPos(), victim.getName());
		this.currentOwner = victim;
		currentOwner.account.addTypeOwned(colour);
	}
}
Ownable()
{
		this.baseRent = 0;
		this.rent = 0;
		this.buyPrice = 0;
		this.owned = false;
}

public void stripOwnership(int fieldNumber, PlayerClass owner)
{
	if(this.currentOwner == owner)
	{
		this.owned = false;
		this.currentOwner = null;
		this.victim = null;
		GUI.setHotel(fieldNumber, false);
		GUI.setHouses(fieldNumber, 0); // this is bridge
		GUI.removeOwner(fieldNumber);
		this.rent = this.baseRent;
	}
		
}


}