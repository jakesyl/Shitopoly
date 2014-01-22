package mapPackage;


import mainGame.PlayerClass;
import mainGame.PlayerController;
import boundaryToMatador.Field;
import boundaryToMatador.GUI;
import boundaryToMatador.Start;
import boundaryToMatador.Street;
import boundaryToMatador.Tax;
import mainGame.PlayerController;

public class MapController {
	
	SuperField[] field = new SuperField[41];
	StreetClass[] streets = new StreetClass[25];
	BreweryClass[] breweries = new BreweryClass[2];
	ChanceClass chance = new ChanceClass();
	FleetClass[] fleets = new FleetClass[4];
	
public MapController()
{
		TaxClass tax1 = new TaxClass(true); // initialize taxclasses
		
		TaxClass tax2 = new TaxClass(false);// initialize taxclasses
		
		
		JailClass goToJail = new JailClass();
		RefugeClass refuge = new RefugeClass();
		
		
		fleets[0] = new FleetClass();
		fleets[1] = new FleetClass();
		fleets[2] = new FleetClass();
		fleets[3] = new FleetClass();
		
		breweries[0] = new BreweryClass();
		breweries[1] = new BreweryClass();
		
		//Price, rent, colour, colourneeded, housePrice
		// Blå
		streets[0] = new StreetClass(1200,50,"blue", 2,1000);
		streets[1] = new StreetClass(1200,50,"blue", 2,1000);
		
		// Pink colours below
		streets[2] = new StreetClass(2000,100,"pink", 3,1000);
		streets[3] = new StreetClass(2000,100,"pink", 3,1000);
		streets[4] = new StreetClass(2400,150,"pink", 3,1000);
		
		// Green colours below
		streets[5] = new StreetClass(2800,200,"green", 3,2000);
		streets[6] = new StreetClass(2800,200,"green", 3,2000);
		streets[7] = new StreetClass(3200,250,"green", 3,2000);
		
		
		// Gray colours below
		streets[8] = new StreetClass(3600,300,"gray", 3,2000);
		streets[9] = new StreetClass(3600,300,"gray", 3,2000);
		streets[10] = new StreetClass(4000,350,"gray",3,2000);
		
		// Red
		streets[11] = new StreetClass(4400,350,"red", 3,3000);
		streets[12] = new StreetClass(4400,350,"red", 3,3000);
		streets[13] = new StreetClass(4800,400,"red", 3,3000);
		
		// Whitey pig, whitey pig. Does whatever..
		streets[14] = new StreetClass(5200,450,"white", 3,3000);
		streets[15] = new StreetClass(5200,450,"white", 3,3000);
		streets[16] = new StreetClass(5600,500,"white", 3,3000);
		
		// Yallowhead
		streets[17] = new StreetClass(6000,550,"yellow",3,4000);
		streets[18] = new StreetClass(6000,550,"yellow",3,4000);
		streets[19] = new StreetClass(6400,600,"yellow",3,4000);
		
		// Purplehaze of doom and skullz 3000 
		streets[20] = new StreetClass(7000,750,"purple",2,4000);
		streets[21] = new StreetClass(8000,1000,"purple",2,4000);
		
// BELOW, THE ENTIRE FIELD IS CREATED
		field[0] = refuge;
		field[1] = refuge;  
		field[2] = streets[0];
		field[3] = chance; 
		field[4] = streets[1]; 
		field[5] = tax1; // tax
		field[6] = fleets[0]; // FLEET ME PLEASE
		field[7] = streets[2];  
		field[8] = chance; 
		field[9] = streets[3]; 
		field[10] = streets[4];
		field[11] = refuge; 
		field[12] = streets[5]; 
		field[13] = breweries[0]; // brewery
		field[14] = streets[6]; 
		field[15] = streets[7]; 
		field[16] = fleets[1]; // FLEET ME PLEASE
		field[17] = streets[8];
		field[18] = chance;
		field[19] = streets[9]; 
		field[20] = streets[10];
		field[21] = refuge;
		field[22] = streets[11];
		field[23] = chance; 
		field[24] = streets[12]; 
		field[25] = streets[13]; 
		field[26] = fleets[2]; // FLEET ME PLEASE
		field[27] = streets[14]; 
		field[28] = streets[15]; 
		field[29] = breweries[1]; // brewery
		field[30] = streets[16];
		field[31] = goToJail; 
		field[32] = streets[17];
		field[33] = streets[18];
		field[34] = chance; 
		field[35] = streets[19]; 
		field[36] = fleets[3]; // FLEET ME PLEASE
		field[37] = chance;
		field[38] = streets[20];
		field[39] = tax2; //tax
		field[40] = streets[21];
		
}
public void landOnField(PlayerClass pPlayer)
{
	pPlayer.setMoved(true);
	while(pPlayer.getMoved()) // se på mig igen
	{
		pPlayer.setMoved(false);
		field[pPlayer.getPlayerPos()].landingOn(pPlayer);
	
	}
}
public void initializer(PlayerClass[] players)
{
	this.chance.initializer(players);
}
public void removeEverything(PlayerClass pPlayer)
{
	for(int i = 0; i < field.length;i++)
	{
		if(field[i]instanceof StreetClass)
		{
			((Ownable) field[i]).stripOwnership(i, pPlayer);
		}
	}
}

}
