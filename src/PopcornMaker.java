
public class PopcornMaker {
	public static void main(String[] args) {
		Popcorn bag = new Popcorn("bag");
		Microwave w = new Microwave();
		w.putInMicrowave(bag);
		w.setTime(2);
		w.startMicrowave();
		bag.eat();
	}
	/* Your mission and you have to accept it:
	 * Create a PopcornMaker class and add a main method to it that creates a bag of Popcorn and cooks it in the microwave.
	 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
	 *  Don't change the existing methods.
	 */
}
