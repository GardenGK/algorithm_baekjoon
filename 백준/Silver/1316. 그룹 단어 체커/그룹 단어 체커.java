//실딲이

import java.io.BufferedReader;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        for(int i = 0 ; i < N;i++){
            String str = sc.next();
            boolean[] arr = new boolean[26];
            arr[(int)(str.charAt(0))-97]=true;

            for(int j = 1; j < str.length();j++){
                if(str.charAt(j) == str.charAt(j-1)){
                    continue;
                }
                else if(arr[(int)(str.charAt(j))-97]){
                    cnt++;
                    break;

                }
                else {
                    arr[(int)(str.charAt(j))-97]=true;
                }
            }
        }
       
        
        System.out.println(N-cnt);
    }

}