import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j1052 {
    public static void main(String[] args) throws IOException{
        //N은 물병의 수
        //K는 만들어야 하는 최종 물병의 수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());
        ///단순하게 생각하자
        //2의 n승이니까, 2n-1 n은 2n 사이
        //k가 1로만 생각한다면, n - 2n-1 ,, 2n -n 사이에서 가장 작은거를
        // k가 근데 1이상이면 이제 어떻게 해야하나...
        // 단, n <= k 일때 0
        // n이 n의2승일 때 0

        //k가 1이상일때
        int start =0;
        int stop =0;
        boolean pow = false;
        if(n<=k){
            pow= true;
        }

        /*
        for(int i=0 ; i<100; i++){
            if(Math.pow(2, i) == n) pow = true;
            if(n >Math.pow(2, i)) {stop = i; break;}
        }
         */
        int i=0;
        int bottle=0;
         while(true){
            double a = Math.pow(2, i);

           if(Math.pow(2, i)== n) {pow = true; break;}
           if(Math.pow(2, i) > n ){
            if(bottle == k-1){
                break;
               }else{
                n= n - (int)Math.pow(2, i-1);
                bottle++;
                i=0;
               }
              
           }else{
            i++;
           }
         }
         //사야할 물병의 수
         int answer =0;
         if(pow){

         }else{
                answer = (int)Math.pow(2, i) - n;
         }
         System.out.println(answer);
    }
}
