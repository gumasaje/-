import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            System.out.println("You get "+(c/v)+" piece(s) and your dad gets "+(c%v)+" piece(s).");
        }
    }
}