package cardPackage;

import boundaryToMatador.*;
import mainGame.PlayerClass;
import mainGame.PlayerController;
import java.awt.Color;


public abstract class SuperCard {
		public abstract void drawCard(PlayerClass pPlayer);
		
		public void initialize(PlayerClass[] players){
		}
}
