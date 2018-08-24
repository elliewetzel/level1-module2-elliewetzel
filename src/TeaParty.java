public class TeaParty {

public TeaParty(Object object, boolean b, boolean c) {
		// TODO Auto-generated constructor stub
	}

public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if(isWoman && isKnighted) {
			 return"Hello Lady " + name;
		  }
		  else if(isWoman) {
			  return"Hello Ms." +  name;
		  }
		  else if(isKnighted) {
			return"Hello Sir " + name;
		  }
		  else {
			  return"Hello Mr." + name;
		  }

	}

}
