package lab_3;
import java.util.Scanner;

public class Mirror {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		
		str = getImage(str);
		System.out.println(str);
}

	private static String getImage(String str) {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer(str);
		
		sb.reverse();
		str = str.concat("|");
		
		
		return str + sb.toString();
	}
}
