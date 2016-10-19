
public class PigLatin {
	private PigLatin(){}
	public static String translate(String s){
		String []sp;
		s = s.toLowerCase();
		String translation = "";
		sp = s.split("\\s+");
		for (int n = 0; n < sp.length; n++){
			translation += translateWord(sp[n]) + " ";
		}
		return translation;
	}
	private static String translateWord(String s){
		if (PigLatin.findFirstVowel(s) <= 0){
			s += "yay";
		}
		else {
			s = s.substring(PigLatin.findFirstVowel(s)) + s.substring(0, PigLatin.findFirstVowel(s)) + "ay";
		}
		return s;
	}
	private static int findFirstVowel(String s){
		for (int n = 0; n < s.length(); n++){
			if (s.charAt(n) == 'a' || s.charAt(n) == 'e' || s.charAt(n) == 'i' || s.charAt(n) == 'o' || s.charAt(n) == 'u'){
				return n;
			}
		}
		return -1;
		
	}
}
