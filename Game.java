
import java.util.Random;

public class Game {

	static int dieValue[] = new int[5];
	
	static int numbersToKeep[];
	
	static int numberOfNums[] = new int[6];
	
	public static void rollDice() {

		for (int i = 0; i < dieValue.length; i++) {
			dieValue[i] = (int) Math.ceil(Math.random() * 6);
		}
		
		for(int i = 0; i < dieValue.length; i++){
			System.out.println("Tärnings värde: " + dieValue[i]);
		}
		System.out.println();
	}
	
	public static void reRoll(int numberToKeep[]){
		for(int i = 0; i < dieValue.length; i++){
			
		}
	}
	
	public static void analyzeHand(int dieValues[]){
		for(int i = 0; i < dieValues.length; i++){
			for(int y = 0; y <= numberOfNums.length; y++){
				if(dieValues[i] == y)numberOfNums[y - 1]++;
			}
		}
		
		for(int o = 0; o < numberOfNums.length; o++){
			System.out.println("Antal " + (o + 1) + ": " +  numberOfNums[o]);
		}
		
	}
	
	public static void main(String args[]) {
		rollDice();
		analyzeHand(dieValue);
		new Interface();
	}
}
