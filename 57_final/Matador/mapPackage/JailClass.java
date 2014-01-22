package mapPackage;

import mainGame.PlayerClass;

public class JailClass extends SuperField {
	public void landingOn(PlayerClass pPlayer){
		pPlayer.cout.printArrested();
		pPlayer.arrested();
	}
}
