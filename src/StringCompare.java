
public class StringCompare {
	 public static void main(String args[]){
		 String str = "Lorem Ipsum";
		 String anotherString = "lorem ipsum";
		 Object objStr = str;
		 
		 System.out.println(str.compareTo(anotherString));
		 System.out.println(str.compareToIgnoreCase(anotherString));
		 System.out.println(str.compareTo(objStr.toString()));
	 }

}
