import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String s = br.readLine();
            if(s.equals(".")) break; 
            Stack<String> stack = new Stack<String>();
            String[] digits = s.split("");
            
             for (String str : digits) {
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