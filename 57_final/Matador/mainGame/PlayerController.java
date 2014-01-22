package mainGame;

import boundaryToMatador.GUI;

import java.awt.Color;
public class PlayerController extends PlayerClass{

	
	public static int CURRENT_PLAYER_AMOUNT = GameCore.PLAYER_AMOUNT; // this is made to allowed continous play with more than 2
	
	public PlayerClass[] players = new PlayerClass[GameCore.PLAYER_AMOUNT]; // create an array that can hold all instances of PlayerClass
	
	private Color[] col = new Color[6];
	
PlayerController() // We use the constructor as a factory
{
	col[0] = Color.black;
	col[1] = Color.blue;
	col[2] = Color.cyan;
	col[3] = Color.green;
	col[4] = Color.magenta;
	col[5] = Color.white;
	
	for(int i = 0; i < GameCore.PLAYER_AMOUNT; i++)
	{
		players[i] = new PlayerClass();
	}
	
}
public void setPlayers()
{
	
	for(int i = 0; i < GameCore.PLAYER_AMOUNT; i++) // for loop to initialize every instance of 'PlayerClass'
	{
		players[i].setName();
		GUI.addPlayer(players[i].getName(), players[i].account.getBalance(), col[i]);
	}
}
public void playerPosUpdate(String pname, int pos, int index)
{
	GUI.removeAllCars(pname);
	players[index].setPlayerPos(pos, pname);
	
}

public int lastManStanding() //This function exists because of our 2+ player system.
{
	if(CURRENT_PLAYER_AMOUNT == 1)
	{
		for(int i = 0; i < GameCore.PLAYER_AMOUNT;i++)
		{
			if(players[i].stillPlaying == true)
			{
				return i;
			}
		}
	}
	return -1;
}

}