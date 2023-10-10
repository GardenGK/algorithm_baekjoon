import java.util.*;
import java.io.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int k = n;      
        List<Integer> arr =new ArrayList<>();
      
        while(k!=0) {
        	arr.add(k%3);
        	k=k/3;
        }
        
        int cnt=arr.size()-1;
  
        for(int x:arr) {
        	answer+=(int) (x*Math.pow(3,cnt));
            cnt--;
        }   
        return answer;
    }
}