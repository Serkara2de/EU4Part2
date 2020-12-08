package day34_Contructors;

public class AppleTest {

	public static void main(String[] args) {
		
		Apple a1 = new Apple();
		
		
		changeApple(a1);
		
		//object
		methodObject().color="Brown";	// hold  whatever returning from method 
		
		methodObject().mA();
	}
	
	
	public static void changeApple(Apple a2) {
		
		a2.color = "blue";
		a2.mA();
		
	}
	
	public static Apple methodObject() {
		Apple a1 = new Apple();
		
		return a1;
	}

}
