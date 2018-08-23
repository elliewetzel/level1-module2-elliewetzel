

public class TeaParty {

	  public TeaParty(String name, boolean isWoman, boolean isKnighted)
      {
		  if(isWoman && isKnighted) {
			  System.out.println("Lady " + name);
		  }
		  else if(isWoman) {
			  System.out.println("Ms." +  name);
		  }
		  else if(isKnighted) {
			  System.out.println("Sir" + name);
		  }
		  else {
			  System.out.println("Mr." + name);
		  }
      }

	public TeaParty() {
		// TODO Auto-generated constructor stub
	}

	public String welcome(Object object, boolean b, boolean c) {
		// TODO Auto-generated method stub
		return null;
	}
	  
}
