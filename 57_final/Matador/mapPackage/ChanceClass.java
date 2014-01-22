package mapPackage;

import boundaryToMatador.GUI;
import cardPackage.FerryCard;
import cardPackage.FreedomCard;
import cardPackage.BalanceCards;
import cardPackage.HouseCard;
import cardPackage.JailCard;
import cardPackage.LegatCard;
import cardPackage.MoveCards;
import cardPackage.SuperCard;
import mainGame.PlayerClass;
import cardPackage.GiftCards;

import java.math.*;
import java.util.Random;

public class ChanceClass extends SuperField {   //
	SuperCard[] deck = new SuperCard[38];
	private int y = 0;    //
	
	Random r = new Random();
	SuperCard kage;
	
	BalanceCards balance1 = new BalanceCards(-3000);
	BalanceCards balance2 = new BalanceCards(-2000);
	BalanceCards balance3 = new BalanceCards(-1000);
	BalanceCards balance4 = new BalanceCards(-1000);
	BalanceCards balance5 = new BalanceCards(-300);
	BalanceCards balance6 = new BalanceCards(-300);
	BalanceCards balance7 = new BalanceCards(-200);
	BalanceCards balance8 = new BalanceCards(-200);
	BalanceCards balance9 = new BalanceCards(200);
	BalanceCards balance10 = new BalanceCards(1000);
	BalanceCards balance11 = new BalanceCards(1000);
	BalanceCards balance12 = new BalanceCards(1000);
	BalanceCards balance13 = new BalanceCards(3000);
	
	MoveCards move1 = new MoveCards(12);
	MoveCards move2 = new MoveCards(25);
	MoveCards move3 = new MoveCards(33);
	MoveCards move4 = new MoveCards(40);
	
	LegatCard legat = new LegatCard();
	
	JailCard jail = new JailCard();
	
	FreedomCard freedom = new FreedomCard();
	
	FerryCard ferry1 = new FerryCard(true);
	FerryCard ferry2 = new FerryCard(false);
	FerryCard ferry3 = new FerryCard(false);

	GiftCards money1 = new GiftCards(200);
	GiftCards money2 = new GiftCards(500);
	GiftCards money3 = new GiftCards(500);
	
	HouseCard house1 = new HouseCard();
	
ChanceClass()
{ 						// Pass player-arrayet der bliver brugt i GameCore, fordi man skal kunne udføre transaktioner.
	
	deck[0]=ferry1;
	deck[1]=balance1;
	deck[2]=balance1;
	deck[3]=balance2;
	deck[4]=balance3;
	deck[5]=balance4;
	deck[6]=balance5;
	deck[7]=balance5;
	deck[8]=balance6;
	deck[9]=balance7;
	deck[10]=balance7;
	deck[11]=balance8;
	deck[12]=balance9;
	deck[13]=balance10;
	deck[14]=balance10;
	deck[15]=balance11;
	deck[16]=balance11;
	deck[17]=balance11;
	deck[18]=balance12;
	deck[19]=balance12;
	deck[20]=balance12;
	deck[21]=balance13;
	deck[22]=move1;
	deck[23]=move2;
	deck[24]=move3;
	deck[25]=move4;
	deck[26]=legat;
	deck[27]=jail;
	deck[28]=jail;
	deck[29]=freedom;
	deck[30]=freedom;
	deck[31]=money1;
	deck[32]=money2;
	deck[33]=money3;
	deck[34]=ferry2;
	deck[35]=ferry3;
	deck[36]=house1;
	deck[37]=house1;
	
}
protected void randomizeDeck(){      //
	
	for(int i = 0; i < deck.length; i++){
		int x = r.nextInt(deck.length);
		kage = deck[i];
		deck[i] = deck[x];
		deck[x] = kage;
	}
	
}
protected void landingOn(PlayerClass pPlayer){   //
	deck[y].drawCard(pPlayer);
	y++;
	
	if(y == deck.length)
	{
		randomizeDeck();
		y = 0;
	}

}
protected void initializer(PlayerClass[] sausages)
{
	((GiftCards) this.deck[31]).initialize(sausages);
	((GiftCards) this.deck[32]).initialize(sausages);
	((GiftCards) this.deck[33]).initialize(sausages);
	randomizeDeck();                                     //
}

}