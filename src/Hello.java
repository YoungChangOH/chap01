
public class Hello {

	public static void main(String[] args){

		System .out.println("\033[2J");
		System .out.println("\033[31m");
		System .out.println("\033[44m");

		System .out.print("\033[10;20H");
		System .out.println("Hello Java!");

		System .out.println("\033[34m");
		System .out.println("\033[41m");

		System .out.print("\033[5;10H");
		System .out.println("Hello JavaScript!");

		System .out.println("\033[32m");
		System .out.println("\033[442m");

		System .out.print("\033[20;20H");
		System .out.println("Hello HTML!");

		System .out.println("\033[30m");
		System .out.println("\033[48m");

		System .out.print("\033[15;30H");
		System .out.println("Hello SQL!");

		System .out.println("\033[0m");
	}

}
