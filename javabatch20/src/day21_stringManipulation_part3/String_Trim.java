package day21_stringManipulation_part3;

public class String_Trim {

	public static void main(String[] args) {
		
		String str = " 342 ";  //|342| olarak yazdır
		
		System.out.println("|"+str.trim()+"|");
		System.out.println(str.replace(" ", "|"));
		System.out.println("java"+1+2);
		str+=" two";
		System.out.println(str.length());
		String str2= "";
		int k = m1(str2.length());
		k+=3 + ++k;
		System.out.println(k);
				
	}

	public static int m1(int i) {
		// TODO Auto-generated method stub
		return ++i;
	}

}
