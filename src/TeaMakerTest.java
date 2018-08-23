
public class TeaMakerTest {
public static void main(String[] args) {
	
	TeaBag bag = new TeaBag("Chamomile");
	bag.getFlavor();
	
	Kettle kettle = new Kettle();
	
	kettle.boil();

	Cup cup = new Cup();
	cup.makeTea(bag, kettle.getWater());
	
}
}
