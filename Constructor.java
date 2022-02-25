
public class Constructor {
	String language;
	
	  Constructor() {
	    this.language = "Java";
	  }

	  Constructor(String language) {
	    this.language = language;
	  }

	  public void getName() {
	    System.out.println("Programming Langauage: " + this.language);
	  }

	  public static void main(String[] args) {

	    Constructor obj1 = new Constructor();

	    Constructor obj2 = new Constructor("Python");

	    obj1.getName();
	    obj2.getName();
	  }
}
