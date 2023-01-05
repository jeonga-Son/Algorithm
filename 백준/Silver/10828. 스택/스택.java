import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {

    Stack<Integer> s = new Stack<Integer>();
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    for(int i = 0; i < n; i++) {
      String[] ord = br.readLine().split(" ");
      switch(ord[0]) {
        case "push" :
          s.push(Integer.parseInt(ord[1]));
          break;
        case "pop" :
          if(s.empty()) {
            bw.write("-1" + "\n");
          } else {
            bw.write(s.pop() + "\n");
          } 
          break;
        case "size" :
          bw.write(s.size() + "\n");
          break;

        case "empty" :
          if(s.empty()) {
            bw.write("1" + "\n");
          } else {
            bw.write("0" + "\n");
          }
          break;
          
        case "top" :
          if(s.empty()) {
            bw.write("-1" + "\n");
          } else {
            bw.write(s.peek() + "\n");
          }
          break;
      }
    }
    bw.flush();

    bw.close();
  }
}