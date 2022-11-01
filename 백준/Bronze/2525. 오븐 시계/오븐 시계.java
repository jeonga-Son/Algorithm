import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int c = Integer.parseInt(br.readLine());
        
        int min = 60 * a + b;
        min += c;
        
        int hour = (min / 60) % 24;
        int minute = min % 60;
        
        System.out.println(hour + " " + minute);
    }
}