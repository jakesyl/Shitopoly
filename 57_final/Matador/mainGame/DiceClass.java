package mainGame;
import java.math.*;


public class DiceClass {

	private final int MAXVALUE = 6;
	private int faceValue;					//members
	
	
	public DiceClass()  // constructor to initilialize value of facevalue "METHOD"
	{
		faceValue = 0; 
	}					
	
	
	public int diceRoll()		//METHODS
	{
		faceValue = (int)(Math.random() * MAXVALUE) + 1;
		
		return faceValue;
		
	}
	// Face value mutator, to be called if we want to change the current value of faceValue
	// With access from outside.
	
	public void setFaceValue(int value)
	{
		faceValue = value;
		
	}
	
	public int getFaceValue()
	{
		return faceValue;
	}
	
	public void printString() 
	{
		System.out.println(faceValue);
		System.out.println(" ");
	}	//Print function
	


	
}
