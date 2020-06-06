package _00_Text_Funkifier;

public class FirstLetters extends SpecialString{

	public FirstLetters(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		String first = "";
		for (int i = 0; i < s.length(); i++) {
			if(i==0) {
				first = first + s.charAt(i);
			}
			if(s.charAt(i)==' ') {
				first = first + s.charAt(i+1);
			}
		}
		System.out.println(first);
		return first;
	}

}
