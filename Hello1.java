public class Hello1{
	public static void main(String[] args){
		System.out.println("Hello World");
		
		try(Scanner sc=new Scanner(System.in)){
			System.out.print("A : ");
			int a=sc.nextInt();
			System.out.println("Hello : "+a);
		}
	}
}