package lab_3;
import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		Replace rc = new Replace();
		str = rc.modifyConsonants(str);	
		System.out.println(str);
	}
	
	public String modifyConsonants(String str)
	{
		StringBuffer sb = new StringBuffer();
		char[] alpha = str.toCharArray();
		for(int i = 0;i < alpha.length; i++)
		{
			if(!(alpha[i] == 'A'||alpha[i] == 'E'||alpha[i] == 'I'||alpha[i] == 'O'||alpha[i] == 'U'||alpha[i] == 'a'||alpha[i] == 'e'||alpha[i] == 'i'||alpha[i] == 'o'||alpha[i] == 'u'))
			{
				if(alpha[i]=='Z')
				{
					alpha[i] = 'A';
				}
				else if(alpha[i] == 'z')
				{
					alpha[i] = 'a';
				}
				else
				{
					alpha[i] = (char) (alpha[i] + 1);
				}
			}
		}
		
		for(int i=0;i < alpha.length;i++)
			sb.append(alpha[i]);
		
		return sb.toString();
	}

}
