import java.io.IOException;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<Integer>();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        
        for (int s : stack) {
            sum += s;
        }
        
        System.out.println(sum);
    }
}