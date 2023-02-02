public class Main {
    public static int d(int num){
        int sum = num;
        
        while (num != 0){
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }
    
    public static void main(String[] args){
        boolean[] check = new boolean[10001];
        
        for(int i = 1;i <= 10000;i++){
            int n = d(i);
            
            if (n < 10001){
                check[n] = true;
            }
        }
        
        for (int i = 1; i<=10000; i++){
            if (!check[i]){
                System.out.println(i);
            }
        }
    }
}
