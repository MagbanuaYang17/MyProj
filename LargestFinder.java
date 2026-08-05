public class LargestFinder  {
	public static void main(String[] args) {
		
		int a=45, b= 78, c=23;
		int largest;
		
	 if(a>b && b>c){	
	 largest=a;
	 System.out.println();
	} 
	 if (b>a && b>c){
	 	largest=b;
	 System.out.println();
	 }
	 else {
	 largest=c;
	 }
	 System.out.println("The largest number is: " + largest);
	 
	 }
}
