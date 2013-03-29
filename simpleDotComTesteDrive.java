public class simpleDotComTesteDrive {

public static void main (String [] args) {
	
	SimpleDotCom dot = new SimpleDotCom() ;

	int [] locations = {2,3,4};

	dot.setLocationCells (locations);

	String userGuess = "2";

	String result = dot.checkYourself(userGuess);
	String testResult = "failed";

	if (result.equals("hit") ){
		testResult = "passed";

	}
	System.out.println ("   ");
	System.out.println (testResult);

	Public String checkYourself (String 'stringGuess') {
	
	int guess = integer.parseInt (stringGuess);

	String result = "miss";

	For (int cell : locationCells) {

		int (guess == cell) {


			result = "hit";
			numOfHits++;

			break;
		}//Fim do teste if
	}// fim do loop for

	 if (numOfHits == locationsCells.lenght) {

	 	result = "Kill";

	 }//Fim do teste if


	 System.out.println(result);

	 return result;


	}//fim do metodo

		}

	}

	 



















