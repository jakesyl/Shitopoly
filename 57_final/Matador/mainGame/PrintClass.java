package mainGame;
import boundaryToMatador.GUI;

public class PrintClass {

public void printWinner(String name)
{
	GUI.showMessage(name + " vinder spillet!");
}
public void printPlayerTurn(String name)
{
	GUI.showMessage(name + "'s tur!");
}
public void printRollAmount(String name, int val)
{
	GUI.showMessage(name + " har kastet: " + val);
}
public void printPos(String name)
{
	GUI.showMessage(name + " landede p� ");
}
public String printNewGame()
{
	return GUI.getUserButtonPressed("Hvis du vil spille et nyt spil m� du genstarte, er det modtaget?", "Ja");
}
public String printEnterName()
{
	return GUI.getUserString("Skriv dit navn: ");
}
public void printLoser(String name)
{
	GUI.showMessage(name + " tabte spillet.");
}
public String printPlayerAmount()
{
	return GUI.getUserButtonPressed("V�lg m�ngden af spillere:","2","3","4","5","6");
}
public void printLosses(String name, int amount)
{
	GUI.showMessage(name + " has mistet " + amount + ".");
}
public boolean buyBrewery(int price)
{
	return GUI.getUserLeftButtonPressed("Vil du k�be dette bryggeri for "+ price +"?", "Ja", "Nej");
}
public boolean buyFleet()
{
	return GUI.getUserLeftButtonPressed("Vil du k�be denne f�rge?", "Ja", "Nej");
}
public boolean taxChoice()
{
	return GUI.getUserLeftButtonPressed("Hvilken skat vil du betale?", "4000 kroner", "10% af alle egendele");
}
public boolean buyStreet(int price) //
{
	return GUI.getUserLeftButtonPressed("Vil du k�be denne gade for "+price+"?", "Ja", "Nej");
}
public boolean buyHouse(int price) //
{
	return GUI.getUserLeftButtonPressed("Vil du k�be huse til denne gade for "+price+"?", "Ja", "Nej");
}
public boolean buyHotel(int price) //
{
	return GUI.getUserLeftButtonPressed("Vil du gerne eje et hotel p� denne gade for "+price+"?", "Ja", "Nej");
}
public String buyHouseAmount(int amount) // TURN INTO A STRING and PARSEINT
{
	switch(amount)
	{
	case 3:
		return GUI.getUserButtonPressed("Hvor mange huse vil du k�be?", "1");
	case 2:
		return GUI.getUserButtonPressed("Hvor mange huse vil du k�be?", "1", "2");
	case 1:
		return GUI.getUserButtonPressed("Hvor mange huse vil du k�be?", "1", "2", "3");
	case 0:
		return GUI.getUserButtonPressed("Hvor mange huse vil du k�be?", "1", "2", "3", "4");
	}
	return null;
	
}
public void printTransaction(String achiever, String loser, int amount)
{
	GUI.showMessage(achiever + " har f�et " + amount + " fra "+ loser + ".");
}

public void printBalanceCard(int money){
	if(money > 0){
		GUI.showMessage("De havde en r�kke med elleve rigtige i tipning. Modtag " + money + " kroner.");
	}
	else{
		GUI.showMessage("De har modtaget deres tandl�geregning. Du mister " + -money + " dollaridoos.");
	}
}
public void printGiftCards(int gift){
	GUI.showMessage("Det er deres f�dselsdag. Modtag " + gift + " kroner af hver spiller");
}
public void printLegatCard(){
	GUI.showMessage("De modtager \"Matador legatet for v�rdigt tr�ngende\" p� 40.000 kroner. ved v�rdigt tr�ngende forst�s, at deres formue, dvs. deres kontante penge+sk�der+bygninger, ikke overstiger 15.000 kroner.");
}
public void printJailCard(){
	GUI.showMessage("Du er anholdt. G� i f�ngsel og ryk direkte til f�ngslet. selv om de passerer \"Start\", indkasserer de ikke 4000 kroner");
}
public void printFreedomCard(){
	GUI.showMessage("I andledningen af kongens f�dslesdag ben�des De herved for f�ngslet. dette kort kan opbevares, indtil de f�r brug for det, eller de kan s�lge det.");
}
public void printMoveCards(int pos){ // udf�rt �ndringer af Hayes d. 14-01-2014
	switch(pos)
	{
	case 12:
		GUI.showMessage("Ryk frem til Frederiksberg All�. hvis de passerer \"start\", indkasser da 4000 kroner.");
		break;
	case 25:
		GUI.showMessage("Ryk frem til Gr�nningen. hvis de passerer \"start\", indkasser da 4000 kroner.");
		break;
	case 33:
		GUI.showMessage("Ryk frem til Vimmelskaftet. hvis de passerer \"start\", indkasser da 4000 kroner.");
		break;
	default:
		GUI.showMessage("Tag ind p� R�dhuspladsen.");
	}

}
public void printFerryClass(boolean dobbelt){
	if(dobbelt){
		GUI.showMessage("Tag med den n�rmeste f�rge. Flyt brikken frem, hvis f�rgen er ejet af en anden betal dobbelt leje. Hvis de passerer \"start\", indkasser da 4000 kroner.");
	}
	else{
		GUI.showMessage("Tag med den n�rmeste f�rge. Flyt brikken frem, og hvis de passerer \"start\", indkasser da 4000 kroner.");
	}		
}

public boolean printPrisonBreak(){
	return GUI.getUserLeftButtonPressed("Hvordan bryder du ud betaler eller sl�r med terningerne?", "Betal 1000 kroner", "Sl� med Terningerne tre gange");
}
public void printFreedom(){
	GUI.showMessage("De er i anledning af kongens f�dselsdag blevet l�sladt.");
}
public void printTimeServed(){
	GUI.showMessage("De har siddet din straf, og nu er du fri igen");
}
public void printArrested(){
	GUI.showMessage("De er blevet anholdt");
}
public void printSpeeding(){
	GUI.showMessage("De er blevet anholdt for at k�re for 300.000 km/t");
}
public void printHouseIncrease()
{
	GUI.showMessage("Oliepriserne er steget, du betaler hermed 800 kr pr hus du ejer og 2300 pr hotel.");
}
public void printPrisonBreakTry()
{
	GUI.showMessage("Pr�v igen.");
}
public void printPrisonBreakSuccess(String name)
{
	GUI.showMessage(name + " har brudt ud af f�ngslet!");
}
public void printFreedomCardAchieved()
{
	GUI.showMessage("Du har modtaget et frihedskort");
}
public void printNotAbleToTransact(String name)
{
	GUI.showMessage(name+" kan ikke modtage dollaridoos, da han er i f�ngsel.");
}
}

