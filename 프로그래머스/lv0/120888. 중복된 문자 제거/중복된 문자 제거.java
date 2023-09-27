class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] carr = my_string.toCharArray();
        int[] arr = new int[127];
        for(char x : carr){
            if(arr[x]>=1){
                arr[x]++;
                continue;
            }
            else if(arr[x] ==0){
                arr[x]++;
                answer += x;
                
            }
            
        }
        
        return answer;
    }
}