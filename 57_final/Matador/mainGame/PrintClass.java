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
	GUI.showMessage(name + " landede på ");
}
public String printNewGame()
{
	return GUI.getUserButtonPressed("Hvis du vil spille et nyt spil må du genstarte, er det modtaget?", "Ja");
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
	return GUI.getUserButtonPressed("Vælg mængden af spillere:","2","3","4","5","6");
}
public void printLosses(String name, int amount)
{
	GUI.showMessage(name + " has mistet " + amount + ".");
}
public boolean buyBrewery(int price)
{
	return GUI.getUserLeftButtonPressed("Vil du købe dette bryggeri for "+ price +"?", "Ja", "Nej");
}
public boolean buyFleet()
{
	return GUI.getUserLeftButtonPressed("Vil du købe denne færge?", "Ja", "Nej");
}
public boolean taxChoice()
{
	return GUI.getUserLeftButtonPressed("Hvilken skat vil du betale?", "4000 kroner", "10% af alle egendele");
}
public boolean buyStreet(int price) //
{
	return GUI.getUserLeftButtonPressed("Vil du købe denne gade for "+price+"?", "Ja", "Nej");
}
public boolean buyHouse(int price) //
{
	return GUI.getUserLeftButtonPressed("Vil du købe huse til denne gade for "+price+"?", "Ja", "Nej");
}
public boolean buyHotel(int price) //
{
	return GUI.getUserLeftButtonPressed("Vil du gerne eje et hotel på denne gade for "+price+"?", "Ja", "Nej");
}
public String buyHouseAmount(int amount) // TURN INTO A STRING and PARSEINT
{
	switch(amount)
	{
	case 3:
		return GUI.getUserButtonPressed("Hvor mange huse vil du købe?", "1");
	case 2:
		return GUI.getUserButtonPressed("Hvor mange huse vil du købe?", "1", "2");
	case 1:
		return GUI.getUserButtonPressed("Hvor mange huse vil du købe?", "1", "2", "3");
	case 0:
		return GUI.getUserButtonPressed("Hvor mange huse vil du købe?", "1", "2", "3", "4");
	}
	return null;
	
}
public void printTransaction(String achiever, String loser, int amount)
{
	GUI.showMessage(achiever + " har fået " + amount + " fra "+ loser + ".");
}

public void printBalanceCard(int money){
	if(money > 0){
		GUI.showMessage("De havde en række med elleve rigtige i tipning. Modtag " + money + " kroner.");
	}
	else{
		GUI.showMessage("De har modtaget deres tandlægeregning. Du mister " + -money + " dollaridoos.");
	}
}
public void printGiftCards(int gift){
	GUI.showMessage("Det er deres fødselsdag. Modtag " + gift + " kroner af hver spiller");
}
public void printLegatCard(){
	GUI.showMessage("De modtager \"Matador legatet for værdigt trængende\" på 40.000 kroner. ved værdigt trængende forstås, at deres formue, dvs. deres kontante penge+skøder+bygninger, ikke overstiger 15.000 kroner.");
}
public void printJailCard(){
	GUI.showMessage("Du er anholdt. Gå i fængsel og ryk direkte til fængslet. selv om de passerer \"Start\", indkasserer de ikke 4000 kroner");
}
public void printFreedomCard(){
	GUI.showMessage("I andledningen af kongens fødslesdag benådes De herved for fængslet. dette kort kan opbevares, indtil de får brug for det, eller de kan sælge det.");
}
public void printMoveCards(int pos){ // udført ændringer af Hayes d. 14-01-2014
	switch(pos)
	{
	case 12:
		GUI.showMessage("Ryk frem til Frederiksberg Allé. hvis de passerer \"start\", indkasser da 4000 kroner.");
		break;
	case 25:
		GUI.showMessage("Ryk frem til Grønningen. hvis de passerer \"start\", indkasser da 4000 kroner.");
		break;
	case 33:
		GUI.showMessage("Ryk frem til Vimmelskaftet. hvis de passerer \"start\", indkasser da 4000 kroner.");
		break;
	default:
		GUI.showMessage("Tag ind på Rådhuspladsen.");
	}

}
public void printFerryClass(boolean dobbelt){
	if(dobbelt){
		GUI.showMessage("Tag med den nærmeste færge. Flyt brikken frem, hvis færgen er ejet af en anden betal dobbelt leje. Hvis de passerer \"start\", indkasser da 4000 kroner.");
	}
	else{
		GUI.showMessage("Tag med den nærmeste færge. Flyt brikken frem, og hvis de passerer \"start\", indkasser da 4000 kroner.");
	}		
}

public boolean printPrisonBreak(){
	return GUI.getUserLeftButtonPressed("Hvordan bryder du ud betaler eller slår med terningerne?", "Betal 1000 kroner", "Slå med Terningerne tre gange");
}
public void printFreedom(){
	GUI.showMessage("De er i anledning af kongens fødselsdag blevet løsladt.");
}
public void printTimeServed(){
	GUI.showMessage("De har siddet din straf, og nu er du fri igen");
}
public void printArrested(){
	GUI.showMessage("De er blevet anholdt");
}
public void printSpeeding(){
	GUI.showMessage("De er blevet anholdt for at køre for 300.000 km/t");
}
public void printHouseIncrease()
{
	GUI.showMessage("Oliepriserne er steget, du betaler hermed 800 kr pr hus du ejer og 2300 pr hotel.");
}
public void printPrisonBreakTry()
{
	GUI.showMessage("Prøv igen.");
}
public void printPrisonBreakSuccess(String name)
{
	GUI.showMessage(name + " har brudt ud af fængslet!");
}
public void printFreedomCardAchieved()
{
	GUI.showMessage("Du har modtaget et frihedskort");
}
public void printNotAbleToTransact(String name)
{
	GUI.showMessage(name+" kan ikke modtage dollaridoos, da han er i fængsel.");
}
}

