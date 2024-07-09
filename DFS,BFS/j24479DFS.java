import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class j24479DFS {
    static int count =1;
    public static void main(String [] args) throws IOException{
        //N은 정점의 수 
        //M은 간선의 수
        //시작 정점  start
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        int [] answer = new int [n+1];
        int count =0;
        boolean [] visited = new boolean[n+1];
       //    int [][] arr = new int [n+1][n+1]; 메모리 초과로 인해 List로 구현
       List<List<Integer>> lists = new ArrayList<>();
        for(int i=0 ; i<=n ; i++){
            List<Integer> nlists = new ArrayList<>();
            lists.add(nlists);
        }
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            //arr에 a 와 b를 연결.
            //arr[a][b] =1;
            //arr[b][a]=1;
            lists.get(a).add(b);
            lists.get(b).add(a);
        }

              for (int i = 1; i <= n; i++) {
            Collections.sort(lists.get(i));
        }
       // dfs(visited , arr , start , answer);
       dfs(visited , lists , start , answer);
        for(int i=1; i<=n ; i++){
            System.out.println(answer[i]);
        }

    }
    /*
     public static void dfs(boolean [] visited , int [][] arr, int start , int [] answer){
  

        answer[start] = count;
        count++;
        visited[start] = true;
        for(int i=1; i<visited.length; i++){
            if(arr[start][i] == 1 && !visited[i]){
                    dfs(visited, arr ,i , answer ) ;
            }
        }

    } 
     */
    public static void dfs(boolean [] visited , List<List<Integer>>  arr, int start , int [] answer){
  

        answer[start] = count;
        count++;
        visited[start] = true;
        for(int i=0; i<arr.get(start).size() ; i++){
            if( !visited[arr.get(start).get(i)]){
                    dfs(visited, arr , arr.get(start).get(i) , answer ) ;
            }
        }

    } 
    
}
