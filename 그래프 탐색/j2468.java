import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;



public class j2468 {
    public class Xy  {
        private int [] x= {1, -1, 0, 0};
        private int [] y= {0 , 0, -1 , 1};

    }
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());   
        int [][] map = new int [n][n];
        for(int i=0; i<n; i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //일단 받기는 다 받음.. 이제 뭐하지?
        boolean [][] visited = new boolean[n][n];
    }
    
}
