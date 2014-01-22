package mapPackage;

import mainGame.PlayerClass;

public class TaxClass extends SuperField {
	
	private boolean choice;

public void landingOn(PlayerClass pPlayer)
{
		
	
		if(choice)
		{
			if(cout.taxChoice()) // get his choice
			{
				pPlayer.account.addBalance((-4000), pPlayer.getName(),false);
			}
			else
			{
				pPlayer.account.addBalance((int)(-pPlayer.account.getTotalValue()*0.1), pPlayer.getName(), false);
			}
		}
		else
		{
			pPlayer.account.addBalance((-2000), pPlayer.getName(), false);
			cout.printLosses(pPlayer.getName(), 2000); // Take a look at this motherfucker
		}		
	
}

public TaxClass(boolean choice) 
{
		super();
		this.choice = choice;



}

}
