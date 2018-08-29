
public class VaultRunner {
public static void main(String[] args) {
	Vault v = new Vault();
	JamesBond bond = new JamesBond();
	int findCode = bond.findCode(v);	
	
	if(findCode == -1) {
		System.out.println("That code didn't work.");
	}
	else {
		System.out.println("The code is " + findCode);
	}
}
}
