import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class j1889 {

    public static List<List<Integer>> lists = new ArrayList<>();
    public static int [][] arr;
    public static  int [] answers;

    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        arr = new int [size+1][2];
        answers = new int [size +1];
        for(int i=0; i<=size ; i++){
            lists.add(new ArrayList<>());
            answers[i] = 1;
        }

        for(int i =1; i<=size; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a =Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            lists.get(a).add(i);
            lists.get(b).add(i);
            arr[i][0] = a;
            arr[i][1] = b;
        }

        for(int i=1; i<=size ; i++){
            minus(i);
        }
        StringBuffer buffer = new StringBuffer();
       boolean has = false;
       int index =0;
        for(int i=1; i<=size ; i++){
            if(answers[i] == 1){
                buffer.append(i +" ");
                has = true;
                index ++;
            }
            
        }
        if(!has){
            System.out.println(0);
            System.exit(0);
        } else{
            System.out.println(index);
            System.out.println(buffer.toString());
        }

        
    }
    public static void minus(int i){
        
        if(lists.get(i).size() <2){
            if(answers[i] == 1){
                int a = arr[i][0] ;
                int b = arr [i][1] ;
                lists.get(a).remove(Integer.valueOf(i));
                lists.get(b).remove(Integer.valueOf(i));
                answers[i] = 0;
                if(lists.get(a).size() <2){
                    minus(a);
                }
                if(lists.get(b).size() <2){
                    minus(b);
                }

            } 
         

        }
    }
}