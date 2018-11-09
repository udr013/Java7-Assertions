package asserts;

import java.util.ArrayList;

public class ThrowAssertionError {

	private static String doStuff(int nbr) {
		return " your number is: " + nbr;
	}
	private static void returnNothing(){

	}

	//asserts need to be enabled using -ea as argument, example java -ea asserts.ThrowAssertionError or as VM argument in your ide
	public static void main(String[] args) {
		int nbr = 10;
		assert true : "this is true"; // true will never be printed
		assert false : "test failed";  // code will hold here and throw AssertionError, below won't be evaluated anymore
		assert (nbr == 10) : "not 10";
		assert (nbr <= 7) : new NumberFormatException("invalid number");
		assert ((nbr == 7)) : doStuff(nbr);
		assert ((nbr == 7)) : returnNothing(); //can't be void returntype
		assert ((nbr == 7)) :new ArrayList<>();
		assert ((nbr == 7)) :new ArrayList<>().clear(); //can't be void returntype
	}
}

