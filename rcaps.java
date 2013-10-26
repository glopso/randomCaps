import java.lang.*;
import java.util.*;

public class rcaps {
	public static void main(String[] args){
		String result = "";
		String orig = args[0];
		Random random = new Random();
		if (args.length == 0)
			return;

		for (int i = 0; i < orig.length(); i++)
			if(random.nextInt(2) == 1)
				if(Character.isLetter(orig.charAt(i))) {
					if(Character.isLowerCase(orig.charAt(i)))
						result += Character.toUpperCase(orig.charAt(i));
					if(Character.isUpperCase(orig.charAt(i)))
						result += Character.toLowerCase(orig.charAt(i));
				}
				else
					result += orig.charAt(i);
			else
				result += orig.charAt(i);
		System.out.println(result);

	}
};
