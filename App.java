import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int n = 0;
		int groups = 1;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int[] magnets = new int [n];
		for(int i = 0; i < magnets.length; i++){
			magnets[i] = in.nextInt();
		}			
		for(int i = 0; i < magnets.length - 1; i++){				
			if(magnets[i] == magnets[i+1]){
				continue;
			} else {
				groups++;
			}
		}		
		System.out.println(groups);
	}
}
