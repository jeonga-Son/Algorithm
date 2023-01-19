import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            String a = br.readLine();
            if(a.equals(".")) break; 
            String[] input = a.split("");
            Stack<String> stack = new Stack<>();
            
             for (String str : input) {
                if (str.equals("(") || str.equals("[")) stack.push(str); 
                else if (str.equals(")") && !stack.isEmpty() && stack.peek().equals("("))
                    stack.pop();
                else if (str.equals("]") && !stack.isEmpty() && stack.peek().equals("["))
                    stack.pop();
                else if (str.equals(")") || str.equals("]"))
                    stack.push(str);
            }
            
            if (stack.empty()) 
                System.out.println("yes");
            else 
                System.out.println("no");
        }
    }
}