package DSA.IfElse;

import java.util.Scanner;

//if cost price and selling price of an item through input through the keyboard, write a progrem to determine the seller has made a profit or incured loss or no profit no loss. Also determine how much profit he made or loss he incured

public class ProfitLoss {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter cost price: ");
            int cp = sc.nextInt();

            System.out.print("Enter selling price: ");
            int sp = sc.nextInt();

            if (sp > cp)
                System.out.println("He has made profit of: " + (sp - cp));
            else if (sp < cp)
                System.out.println("he has made a loss of: " + (cp - sp));
            else
                System.out.println("He has made no profit no loss");
        }
    }
}
