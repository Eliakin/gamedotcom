public class SimpleDotComGame{


 public static void main (String[] args) {
 
	int numOfGuesses = 0;


	GameHelper helper = new GameHelper();

	SimpleDotCom theDotCom = new SimpleDotCom ();

	int randomNum = (int) (Math.random () * 5);

	int [] locations = {randomNum, randomNum+1, randomNum+2};

	theDotCom.setLocationCells (locations);
	
	boolean isAlive = true;

	while (isAlive == true) {

		String guess = helper.getUserInput ("Insira um numero");

		String result = theDotCom.checkYourself (guess);

		numOfGuesses++;
			System.out.println ("       ");
			
		if (result.equals ("Kill")) {
			isAlive = false;


		System.out.println ("Voce usou" + numOfGuesses + "Palpites");
			
		}//encerra a instrução if
	}//encerra while
 }//encerra main
}
