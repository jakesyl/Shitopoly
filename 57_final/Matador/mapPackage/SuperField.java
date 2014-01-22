package mapPackage;
import boundaryToMatador.*;
import mainGame.PlayerClass;
import mainGame.PlayerController;
import java.awt.Color;

import mainGame.PrintClass;


public abstract class SuperField {
	// if you wish to change the values of the fields you can write here.
	
	PrintClass cout = new PrintClass();

	protected abstract void landingOn(PlayerClass pPlayer);


	
}

