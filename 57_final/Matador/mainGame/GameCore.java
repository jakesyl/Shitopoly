package mainGame;
import mapPackage.*;
import boundaryToMatador.GUI;

public class GameCore {
	
	private PrintClass cout; // instantiate a printClass
	public static int PLAYER_AMOUNT; // this int is changed, depending in how many players that are needed.
	
	public static DiceClass dice01; //instantiate dice one and two
	public static DiceClass dice02;
	private MapController field; // instantiate a playing field.
	
	boolean gameHasBeenWon = false;
	private PlayerController playerControl;
	
public GameCore()
{
	field = new MapController();
	dice01 = new DiceClass();
	dice02 = new DiceClass();
	cout = new PrintClass();
	PLAYER_AMOUNT = Integer.parseInt(cout.printPlayerAmount()); // We get the amount of players who'd like to play.
	playerControl = new PlayerController();
	field.initializer(playerControl.players);
}
public void gameRun() //gameRun is the true core of the game, this method is called in Main.
{

	boolean gameQuit = false;
//	player initialization process, below.
	
	
	playerControl.setPlayers(); //Ask for player names

//----------------------------------------------

//	Main game loop below.
	while(gameQuit != true)
	{
		if(playerTurns()) // if player turns return true, ask for a new game.
		{	
			if(cout.printNewGame() == "Ja") // if printNewGame returns "No" then quit the game.
			{
				gameQuit = true; // set gameQuit to true, so it'll quit.
			}
		playerControl.CURRENT_PLAYER_AMOUNT = PLAYER_AMOUNT; // to reset and ensure that the previous winner won't instantly win again.
				
		}// end of if(playerTurns())

//----------------------------------------------
		
	}
//-------------------END OF MAIN GAME LOOP -------------
}
private boolean playerTurns()
{
	
	while(gameHasBeenWon != true) // this while loop calls 'gameWon()' everytime it runs. If gameWon() returns true, the game has been won, and this loop will quit.
	{
		for(int i = 0; i < PLAYER_AMOUNT;i++)
		{
			if(playerControl.players[i].stillPlaying)
			{
				if(playerControl.players[i].inJail()){
					inJail(playerControl.players[i]);
				}
				if(playerControl.players[i].inJail() == false){
					
				
				uniqueTurn(i); 		// run the unique turn for a player
				gameHasBeenWon = gameWon();
					while(dice01.getFaceValue() == dice02.getFaceValue() && playerControl.players[i].stillPlaying && playerControl.players[i].inJail() == false) // see if a player should get more rolls
					{
						uniqueTurn(i);
						playerControl.players[i].addDuplicates(); // add duplicates if a player is constantly getting duplicates                  //
					}
				playerControl.players[i].resetDuplicates(); // reset the duplicates after he has had his go.                                  //
			
				}
				
			}
			
		}
		return false;
	}

	return true;
}
private void uniqueTurn(int playerRegister) //a turn for any player ever.
{
	int pos = 0;
	
	cout.printPlayerTurn(playerControl.players[playerRegister].getName()); // this should print whose turn it is.	
	
	pos = dice01.diceRoll() + dice02.diceRoll();  // we set a new position here.
	
	GUI.setDice(dice01.getFaceValue(), dice02.getFaceValue()); // print dice values to GUI
	
	playerControl.playerPosUpdate(playerControl.players[playerRegister].getName(), pos, playerRegister);
	
	field.landOnField(playerControl.players[playerRegister]);
	// we pass a 'new balance' and a position and a register.
	
}
private boolean gameWon()
{
	for(int i = 0; i < PLAYER_AMOUNT;i++) // This for-loop controls if someone has won the game by reaching 3000
	{
		if(playerControl.lastManStanding() > -1) // call lastManStanding to see if the player is the last man standing. The reason for -1, is because 0 is a playerindex
		{
			cout.printWinner(playerControl.players[playerControl.lastManStanding()].getName()); //pass the name of whoever was the last man standing
			return true; 	// tell GameWon that the game has been won.
		}
	}
	
	
	for(int i = 0; i < PLAYER_AMOUNT;i++)	//This function ensures that when someone has lost, they will no longer participate in the game..
	{
		if(playerControl.players[i].account.getBalance() <= 0)
		{
			if(playerControl.players[i].stillPlaying == true)
			{
				cout.printLoser(playerControl.players[i].getName());
				playerControl.players[i].stillPlaying = false;
				
				field.removeEverything(playerControl.players[i]);
				playerControl.CURRENT_PLAYER_AMOUNT--;
			}
			
		}
	}
	return false;
}
private void inJail(PlayerClass pPlayer){
	if(pPlayer.addTimeServed()){
		pPlayer.setFree();
		pPlayer.cout.printTimeServed();
	}
	else if(pPlayer.getFreedom() > 0){
		pPlayer.cout.printFreedom();
		pPlayer.setFree();
		pPlayer.useFreedom();
	}
	else{
		if(pPlayer.cout.printPrisonBreak()){
			pPlayer.account.addBalance(-1000, pPlayer.getName(), false);
			pPlayer.setFree();
		}
		else{
			for(int x = 3; x > 0; x--){
				int t1 = dice01.diceRoll();
				int t2 = dice02.diceRoll();
				GUI.setDice(t1, t2);
				if(t1 == t2){
					cout.printPrisonBreakSuccess(pPlayer.getName());
					pPlayer.setFree();
					x = 0;
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

}
