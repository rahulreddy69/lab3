package lab_3;

import java.util.Scanner;

public class DifferenceOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		DifferenceOfNumbers dc = new DifferenceOfNumbers();
		n = dc.modifyNumber(n);
		System.out.println(n);
		
	}

	
	public int modifyNumber(int n)
	{
		String str = Integer.toString(n);
		StringBuffer sb = new StringBuffer();
		char[] alpha = str.toCharArray();
		for(int i = 0; i < alpha.length-1; i++)
		{
			int j = (int)alpha[i+1]-(int)alpha[i];
			if(j>0)
				sb.append(j);
			else
				sb.append(j*-1);
		}
		sb.append(alpha[str.length()-1]);
		
		
		str = sb.toString();
		return Integer.valueOf(str);
	}
}
