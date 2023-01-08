//N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.
//첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)
//첫째 줄에 구한 0의 개수를 출력한다.

import java.io.*;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int n = Integer.parseInt(br.readLine());
        // n 팩토리얼에서 n
        int count = 0;
        // 0의 갯수를 담을 변수
        
        	while (n >= 5) {
			count += n / 5; //누적합
			n /= 5;
        }
        
        // n 팩토리얼 = 1부터 n까지 곱한 수
        // 팩토리얼에서 0의 갯수를 찾으려면 5가 몇번 나오는지만 확인하면 된다
        
        //n을 소인수분해 했을 때 뒤에 0이 붙을 수 있는 경우는 (2 * 5) 쌍이 나올 때 뿐이다.
        //즉, n을 소인수분해 하여 (2*5) 꼴이 몇 개 나오는지를 알아내면 된다.
        //그런데 2는 짝수가 나올 때마다 하나씩 추가되기 때문에 무조건 5보다 많이 나올 수밖에 없다.
        //따라서 n 안에 5의 배수가 몇 번이나 들어있는지를 구하면 그게 곧 (2 * 5) 쌍의 개수이다.
        // 5의 배수인 수의 갯수는 n을 5로 나누면 알 수 있다.
        //단순히 5로 나눌 것이 아니라 반복문을 통해 5로 나누면서 누적합을 구해주면 된다
        
        bw.write(count+"\n");
        bw.flush();
    }
 
}