package day22_stringManipulation_Lab;

public class String_StartsEndsWith {

	public static void main(String[] args) {
String word1 = "xeclipse";
		

if(!word1.startsWith("x")||!word1.startsWith("X")|| !word1.endsWith("x")||!word1.endsWith("x")){
    System.out.println(word1);
  }else if(word1.startsWith("x")||word1.startsWith("X")){
	  word1=word1.substring(1);
    System.out.println(word1);
  }else if(word1.endsWith("X")){
	  word1=word1.substring(0,word1.length()-1);
    System.out.println(word1);
  }
//		System.out.println(word1.startsWith("e"));
//		System.out.println(word1.startsWith("ec"));
//		System.out.println(word1.startsWith("ex"));
//		
//		System.out.println(word1.endsWith("e"));
//		System.out.println(word1.endsWith("ipse"));
//		System.out.println(word1.endsWith("xe"));
//		
		
		//Mr. = > married man
		//Mrs. = > married woman
		//Ms. = > Some woman
		//Dr. = > Doctor man or woman
		//No title  = > Unknown status
		
//		String name = "Dr. Jackson";
//		
//		if(name.startsWith("Mr.")) {
//			System.out.println("married man");
//		}else if(name.startsWith("Mrs.")) {
//			System.out.println("Married woman");
//		}else if(name.startsWith("Ms.")) {
//			System.out.println("Some woman");
//		}else if(name.startsWith("Dr.")) {
//			System.out.println("Doctor man or woman");
//		}else {
//			System.out.println("Unknow status");
//		}

	}

}
