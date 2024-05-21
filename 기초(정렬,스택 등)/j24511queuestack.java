import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class j24511queuestack {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
    
       
       int l = Integer.parseInt(st.nextToken());
       int [] arr = new int[l];
    
       Deque<Integer> q = new ArrayDeque<>();

       st = new StringTokenizer(br.readLine());
       for(int i=0 ; i<arr.length ; i++){
        arr[i]= Integer.parseInt(st.nextToken());
       }
       int [] brr = new int [l];

       st = new StringTokenizer(br.readLine());
      
       for(int i=0 ; i<arr.length ; i++){
        brr[i]= Integer.parseInt(st.nextToken());
        if(arr[i]==0){
            q.addFirst(brr[i]);
        }
       }

       int c = Integer.parseInt(br.readLine());
       int [] crr = new int [c];
       st= new StringTokenizer(br.readLine());
       for(int i=0; i<crr.length; i++){
        crr[i]= Integer.parseInt(st.nextToken());
        q.add(crr[i]);
       }
       StringBuffer sb = new StringBuffer();
 
       for(int i=0; i<crr.length; i++){
       sb.append(q.pollFirst()+" ");
       }

       System.out.println(sb.toString());

    }
}