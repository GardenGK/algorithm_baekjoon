import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
       String str = sc.next();
        char[] charArr = str.toCharArray();
          int sum = 0;
        
        for(int i = 0 ; i < charArr.length;i++){
            sum += charArr[i] - '0';
        }
        System.out.print(sum);
    }
}