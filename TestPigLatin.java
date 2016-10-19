import java.util.*;
public class TestPigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String submit = "";
		boolean cont = true;
		Scanner kb = new Scanner(System.in);
		while (cont == true){
			System.out.print("Type the sentence you would like to translate: ");
			submit = kb.nextLine();
			System.out.println("The translation into pig latin is:\n" + PigLatin.translate(submit));
			System.out.print("\nContinue? (Y/N) ");
			String cn = kb.nextLine();
			cont = con(cn);
		}
		System.out.println("Ending Program");
	}
	public static boolean con(String s){
		boolean con = true;
		if (s.equals("N") || s.equals("n")){
			con = false;
		}
		else if (s.equals("Y") || s.equals("y")){
			con = true;
		}
		else {
			System.out.println("Sorry, I don't understand, continuing program");
		}
		return con;
	}

}
