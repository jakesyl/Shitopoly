package mainGame;

// lol u dense motherfcuckerakr
// maximum lel

//more comments

import boundaryToMatador.GUI;

public class AccountClass {

	protected short blueOwned, pinkOwned, greenOwned, grayOwned, redOwned, whiteOwned, yellowOwned, purpleOwned;
	protected short breweriesOwned, fleetsOwned;
	private int amountOfDuplicates;
	protected short housesOwned, hotelsOwned;
	protected int balance;
	protected int assets;
	protected int[] ownedAreas;
	
AccountClass()
{
	blueOwned = 0;pinkOwned = 0;greenOwned = 0; grayOwned = 0; redOwned = 0; whiteOwned = 0; yellowOwned = 0; purpleOwned=0;
	breweriesOwned=0; fleetsOwned = 0;
	this.amountOfDuplicates = 0;
	this.housesOwned = 0; this.hotelsOwned = 0;
	this.balance = 30000;
}
public void addBalance(int newBalance, String pName, boolean _ASSET)
{
	balance += newBalance;
	if(balance < 0)
	{
		balance = 0;
	}
	if(_ASSET) // hvis pengene går til et hus eller grund, skal der tælles op i assets....
	{
		this.assets -= newBalance;
	}
	
	GUI.setBalance(pName, balance);
}

public int getBalance()
{
	return this.balance;
}

public void addTypeOwned(String type)
{
//	switch(type)
//	{
//		case "blue":
//			blueOwned++;
//			break;
//		case "pink":
//			pinkOwned++;
//			break;
//		case "green":
//			greenOwned++;
//			break;
//		case "gray":
//			grayOwned++;
//			break;
//		case "red":
//			redOwned++;
//			break;
//		case "white":
//			whiteOwned++;
//			break;
//		case "yellow":
//			yellowOwned++;
//			break;
//		case "purple":
//			purpleOwned++;
//			break;
//		case "brewery": // add breweries to breweries owned
//			this.breweriesOwned++;
//			break;
//		case "fleet": // add fleets to fleetowned
//			this.fleetsOwned++;
//			break;
//		case "houses":
//			this.housesOwned++;
//			break;
//		case "hotels":
//			this.hotelsOwned++;
//			break;
//		default:
//			break;
//	}
	if(type == "blue")
	{ }
	else if(type == "pink")
	{
		pinkOwned++;
	}
	else if(type == "green")
	{
		greenOwned++;
	}
	else if(type == "gray")
	{
		grayOwned++;
	}
	else if(type == "red")
	{
		redOwned++;
	}
	else if(type == "white")
	{
		whiteOwned++;
	}
	else if(type == "yellow")
	{
		yellowOwned++;
	}
	else if(type == "purple")
	{
		purpleOwned++;
	}
	else if(type == "brewery")
	{
		this.breweriesOwned++;
	}
	else if(type == "fleet")
	{
		this.fleetsOwned++;
	}
	else if(type == "houses")
	{
		this.housesOwned++;
	}
	else if(type == "hotels")
	{
		this.hotelsOwned++;
	}
}

public short getTypeOwned(String name)
{
//	switch(name)
//	{
//		case "blue":
//			return this.blueOwned;
//		case "pink":
//			return this.pinkOwned;
//		case "green":
//			return this.greenOwned;
//		case "gray":
//			return this.grayOwned;
//		case "red":
//			return this.redOwned;
//		case "white":
//			return this.whiteOwned;
//		case "yellow":
//			return this.yellowOwned;
//		case "purple":
//			return this.purpleOwned;
//		case "brewery":
//			return this.breweriesOwned;
//		case "fleet":
//			return this.fleetsOwned;
//		case "houses":
//			return this.housesOwned;
//		case "hotels":
//			return this.hotelsOwned;
//		default:
//			return 0;
//	}
	
	if(name == "blue")
	{
		return this.blueOwned;
	}
	else if(name == "pink")
	{
		return this.pinkOwned;
	}
	else if(name == "green")
	{
		return this.greenOwned;
	}
	else if(name == "gray")
	{
		return this.grayOwned;
	}
	else if(name == "red")
	{
		return this.redOwned;
	}
	else if(name == "white")
	{
		return this.whiteOwned;
	}
	else if(name == "yellow")
	{
		return this.yellowOwned;
	}
	else if(name == "purple")
	{
		return this.purpleOwned;
	}
	else if(name == "brewery")
	{
		return this.breweriesOwned;
	}
	else if(name == "fleet")
	{
		return this.fleetsOwned;
	}
	else if(name == "houses")
	{
		return this.housesOwned;
	}
	else if(name == "hotels")
	{
		return this.hotelsOwned;
	}
	else{
		return 0;
	}
}

public void addDuplicates()
{
	this.amountOfDuplicates++;
}
public void resetDuplicates()
{
	this.amountOfDuplicates = 0;
}

public int getTotalValue()
{ 
	return (int) ((this.assets+this.balance));
}


}
