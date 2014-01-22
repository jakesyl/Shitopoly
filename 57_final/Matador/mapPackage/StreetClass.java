package mapPackage;
import boundaryToMatador.*;
import mainGame.PlayerClass;
import mainGame.PrintClass;
import java.math.*;
public class StreetClass extends Ownable {

	String colour; // we need to be able to pass a colour to see how many of the colour the player owns.
	int housePrice;
	int hotelPrice;
	int houseAmount, totalHouseAmount;
	boolean hotelOwned;
	int colourNeeded; // we make this to see how many colours of the type there are.

StreetClass()
{
	this.owned = false;
	this.currentOwner = null;
	this.buyPrice = 0;
	this.rent = 0;
	this.colour = " ";
	this.victim = null;
}
StreetClass(int price, int rent, String colour, int colourNeeded, int housePrice)
{
	this.buyPrice = price;
	this.baseRent = rent;
	this.rent = rent;
	this.colour = colour;
	this.housePrice = housePrice;
	this.colourNeeded = colourNeeded;
}
protected void landingOn(PlayerClass pPlayer) 
{
	this.victim = pPlayer;
	
	if(this.owned == true && this.currentOwner == pPlayer && ownsAllColours() == true) // If you own your own property, you can upgrade.
	{
		buyMenu();
	
	}
	if(this.owned == false && pPlayer.account.getBalance() >= this.buyPrice) // If not owned, you can buy the property
	{
		buyProperty(this.colour);
	
	}
	if(this.owned == true && this.currentOwner != pPlayer) // if owned and you don't own the place
	{
		enemyTerritory();
	}
	
}
private void buyMenu()
{
	
	if(hotelOwned != true && victim.account.getBalance() >= this.housePrice) // If you dont'have a hotel, you can buy some houses.
	{
		if(cout.buyHouse(this.housePrice) == true)
		{
			houseAmount = Integer.parseInt(cout.buyHouseAmount(this.totalHouseAmount)); // it now parses it.
			
			if(victim.account.getBalance() >= (this.houseAmount*this.housePrice)) // If the player can actually afford it
			{
				this.totalHouseAmount = this.houseAmount + this.totalHouseAmount;
				
				GUI.setHouses(victim.getPlayerPos(), this.totalHouseAmount);
				
				for(int i = 0; i < this.houseAmount; i++) // withdraw correct amount of moolaz
				{
					victim.account.addBalance(-housePrice, victim.getName(), true);
				}
				
				
				for(int i = 0; i < this.houseAmount; i++) // everytime you get a house, multiply the rent
				{
					this.rent = (this.totalHouseAmount+1)*this.baseRent;
					
					this.currentOwner.account.addTypeOwned("houses"); 
				}
			}
			
		}
	}
	
	if(this.totalHouseAmount == 4 && victim.account.getBalance() >= this.housePrice) // If you have 4 houses you can upgrade to a hotel
	{
		
		if(cout.buyHotel(this.housePrice))
		{
			GUI.setHotel(victim.getPlayerPos(), true);
			this.totalHouseAmount = 0; // Reset the house amount
			hotelOwned = true; // You now own a hotel
			this.currentOwner.account.addTypeOwned("hotels");
			victim.account.addBalance(-(this.housePrice), victim.getName(), true);
			this.rent = this.baseRent*5;
		}
		
	}
}
private void enemyTerritory() // Pay rent 
{
	victim.transaction(this.currentOwner, this.rent);	
}
private boolean ownsAllColours()
{	
	if(this.currentOwner.account.getTypeOwned(this.colour) == this.colourNeeded) // if the current owner owns all types of this colour needed, he will be ablebodied
	{
		return true;
	}
	return false;
}

}
