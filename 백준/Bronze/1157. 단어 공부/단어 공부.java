import java.util.*;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        s = s.toLowerCase();

        int[] arr = new int[26];
        for(int i = 0 ; i <s.length();i++){
            arr[s.charAt(i) - 'a']++;

        }
        int max = -1;
        char ch = '?';

        for(int j = 0 ; j <26; j++){
            if(arr[j]>max){
                max = arr[j];
                ch = (char)(j+65);
            }
            else if(arr[j] ==max){
                ch = '?';
            }
        }
        System.out.println(ch);	
	}

}

      