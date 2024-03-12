import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexclass {

	String mobilenumber = "123456789sd";

	public void findMobilenumber()
	{
		Pattern p =Pattern.compile("[0-9][^a-z|@|.com]");
		Matcher m = p.matcher(mobilenumber);
		System.out.println(m.find());
		if(m.find())
		{
			System.out.println("I found the text "+m.group()+" starting at index "+
					m.start()+" and ending at index "+m.end());
			System.out.println("%%%%%%%%%%%%%");
			System.out.println(mobilenumber.substring(0,5));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Regexclass r = new Regexclass();
		r.findMobilenumber();
	}

}
