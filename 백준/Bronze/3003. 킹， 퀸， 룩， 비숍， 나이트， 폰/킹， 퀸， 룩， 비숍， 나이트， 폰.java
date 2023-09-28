import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
       int[] arr = {1,1,2,2,2,8};
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] compareArr = new int[6];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < 6; i++) {
			compareArr[i] = Integer.parseInt(st.nextToken());
		}
        int[] answer = new int[6];
        for(int j = 0 ; j < 6;j++){
            answer[j] = arr[j] - compareArr[j];
  
        }
       for(int x:answer){
           System.out.print(x+" ");
           
       }
        
    }
}