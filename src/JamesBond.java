

public class JamesBond {
	

public int findCode(Vault v) {
	boolean code = false;
	for(int i = 0; i < 1000000; i++) {
		code = v.tryCode(i);
	if(code == true) {
		return i;
	}
	}
	return -1;
}
}
