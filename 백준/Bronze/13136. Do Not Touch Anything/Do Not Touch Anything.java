import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long x, y;

        if(R % N == 0)
            x = R / N;
        else
            x = R / N + 1;
        if(C % N == 0)
            y = C / N;
        else
            y = C / N + 1;

        System.out.print(x*y);
    }
}