
import java.util.Random;

public class one {
	public static void main(String args[]) {
		Random rand = new Random(System.currentTimeMillis());
		int a[] = new int[45];
		int i;
		int j;
		int b;
		for(i=0;i<6;i++) {
			a[i] = rand.nextInt(45)+1;
			for(j=0;j<i;j++) {
				if(a[i] == a[j]) {
					i--;
				}
			}
			
		}
		for(b=0;b<6;b++) {
			System.out.println(a[b]);
		}
		
	}
}