import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
      
        Queue<Integer> q = new LinkedList<>();
         int b=0;
        for(int i = 0 ; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
           
            switch(s){
                case "push":
                    int param = Integer.parseInt(st.nextToken());
                    q.add(param);
                    b = param;
                    break;
                case "pop":
                    if(q.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(q.remove());
                    break;
                case "size":
                     System.out.println(q.size());
                    break;
                     case "empty":
                    if(q.isEmpty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;
               
                case "front":
                      if(q.isEmpty())
                        System.out.println(-1);
                    else
                       System.out.println(q.peek());
                    break;
                case "back":
                    if(q.size() ==0)
                        System.out.println(-1);
                    else
                        System.out.println(b);
                    break;
              
               
            }
            
        }
    }
}