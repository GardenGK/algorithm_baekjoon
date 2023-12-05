import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = 
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] originArray = new int[N][N];
        for(int i = 0 ; i < N ; i++){
             st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j < N; j++){
                originArray[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] prefixSumArray = new int[N+1][N+1];
        
        for(int i = 1;i<=N;i++){
            for(int j=1;j<=N;j++){
                prefixSumArray[i][j] = 
                    prefixSumArray[i-1][j]+prefixSumArray[i][j-1]
                    -prefixSumArray[i-1][j-1]+originArray[i-1][j-1];
                    
            }
        }
        
        for(int j = 0 ; j < M ; j++){
             st = new StringTokenizer(br.readLine());
            int a =  Integer.parseInt(st.nextToken());
                int b =  Integer.parseInt(st.nextToken());
                int c =  Integer.parseInt(st.nextToken());
                int d =  Integer.parseInt(st.nextToken());
        System.out.println(prefixSumArray[c][d] -prefixSumArray[a-1][d] 
                           -prefixSumArray[c][b-1] + prefixSumArray[a-1][b-1]);
        }
    }
}