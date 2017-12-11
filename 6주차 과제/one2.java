import java.util.Scanner;

public class one2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str;
		int i;
		
		System.out.print("문자를 입력하세요: ");
		str = sc.nextLine();
		
		for(i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
			
		}
			
	}

}
