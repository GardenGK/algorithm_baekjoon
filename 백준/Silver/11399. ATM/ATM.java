import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		
		// 정렬 
		Arrays.sort(arr);
        int sum = 0;
        for(int i = 0; i < N;i++){
            sum += arr[i] * (N-i);
        }
 
 
	
		System.out.println(sum);
	}
}