package mainGame;
import java.util.Scanner;
import boundaryToMatador.GUI;

public class PlayerClass{

	private String name;
	private int position;
	public boolean stillPlaying; //overvej protected
	
	private int property;
	private boolean inJail;
	private int freedom;
	private boolean moved; //
	private boolean dobbelt;  //
	private int timeServed;
	private int amountOfDuplicates;

	
	public PrintClass cout = new PrintClass();
	public AccountClass account = new AccountClass();
	
	
PlayerClass()
{
	this.name = " ";
	this.stillPlaying = true;
	this.position = 1;
	    //this is bridge
	this.inJail = false;
	
}

public void setName()
{
	this.name = cout.printEnterName();
}
public String getName()
{
	return this.name;
}
protected void setPlayerPos(int pos, String pname)
{
	
	if(this.position > ((this.position + pos) % 40)) // If you pass start you should get 4k
	{
		account.addBalance(4000, pname, false);
	}
	this.position = this.position + pos;
	this.position = this.position % 40; // fixed
	
	if(this.position == 0)
	{
		this.position = 1;
	}
	
	GUI.setCar(this.position, pname);
}
public int getPlayerPos()
{
	return this.position;
}
public void setPlayerPos(int newPos) //
{
		if(position > newPos)
		{
			account.addBalance(4000, this.name, false);
		}
		
		this.position = newPos;
		moved = true;
		GUI.removeAllCars(name);
		GUI.setCar(position, name);
}

public void addProperty(int value){ 
	property = value + property;
}
public void arrested(){  
	this.position = 11;
	GUI.removeAllCars(this.name);
	GUI.setCar(this.position, this.name);
	inJail = true;
}
public boolean inJail(){ 
	return inJail;
}
public void transaction(PlayerClass pPlayer, int sum) // used for card transactions to other players
{
	if(pPlayer.inJail == false) // a transaction can only be done if the player who is given the money is not in jail
	{
		if(account.balance <= sum) 
		{
			pPlayer.account.addBalance(account.balance, pPlayer.getName(), false);
		}
		else
		{
			pPlayer.account.addBalance(sum, pPlayer.getName(),false);
		}
		
		account.addBalance(-sum, this.name,false);
		
		cout.printTransaction(pPlayer.getName(), this.name, sum);
	}
	else
	{
		cout.printNotAbleToTransact(pPlayer.getName());
	}
}
public void setDobbelt(boolean arg){  
	dobbelt = arg;	
}
public boolean getDobbelt(){   
	if(dobbelt){
		dobbelt = false;
		return true;
	}
	else{
		return dobbelt;
	}
}
public int getFreedom(){
	return freedom;
}
public void addFreedom(){
	freedom++;
}
public void useFreedom(){ // new
	freedom--;
}
public void addDuplicates() // new
{
	this.amountOfDuplicates++;
	if (amountOfDuplicates == 3){
		cout.printSpeeding();
		arrested();
		resetDuplicates();
	}
}
public void resetDuplicates() // new
{
	this.amountOfDuplicates = 0;
}
public boolean addTimeServed(){ // new
	this.timeServed++;
	if(timeServed == 4){
		timeServed = 0;
		return true;
	}
	else{
		return false;
	}
}
public void setFree(){
	inJail = false;
	timeServed = 0;
}
public boolean getMoved()
{
	return this.moved;
}
public void setMoved(boolean pie)
{
	this.moved = pie;
}

}
