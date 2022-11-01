import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knigth = 2;
        int pawn = 8;
    
        king = king - scan.nextInt();
        queen = queen - scan.nextInt();
        rook = rook - scan.nextInt();
        bishop = bishop - scan.nextInt();
        knigth = knigth - scan.nextInt();
        pawn = pawn - scan.nextInt();
    
        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(rook + " ");
        System.out.print(bishop + " ");
        System.out.print(knigth + " ");
        System.out.print(pawn);
    }
}