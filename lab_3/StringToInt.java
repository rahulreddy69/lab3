package lab_3;

public class StringToInt {
	public static void main(String[] args) {
		String str = "65 84 09 34 -23";
		String[] strTonum = str.split(" ");
		int[] num = new int[strTonum.length];
		int i = 0;
		int sum = 0;
		for(String s : strTonum)
		{
			num[i] = Integer.parseInt(s);
			System.out.println(num[i]);
			sum = sum + num[i];
			i++;
		}
		System.out.println(sum);
	}
	
	
}
