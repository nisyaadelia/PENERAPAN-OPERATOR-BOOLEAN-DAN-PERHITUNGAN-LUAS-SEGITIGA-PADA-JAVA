package Pertemuan2;

import java.util.Scanner;
public class tugassnomor1 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("\nProgram Operator Logika Matematika");
       System.out.println("Masukkan Variabel");
       System.out.print("Variabel a: ");
       int a = sc.nextInt();
       System.out.print("Variabel b: ");
       int b = sc.nextInt();
         
       //Operator Boolean Kiri
        boolean andOp  = ( a > b) && (b > a);
        boolean notOp  = !(a < b);
        boolean orOp   = (( a > b) && (b > a)) || (!(a<b));
        
        //Operator Boolean Kanan
        boolean orOp2   = (( a == b) || (b > a));
        boolean notOp2  = !(( a == b) || (b > a));
        
        // Operator Boolean Seluruh 
        boolean andOp3 = (( a > b) && (b > a)) || (!(a<b)) && (!(( a == b) || (b > a)));
        
        // Output Boolean 
        System.out.println("\nOperator Boolean Kiri");
        System.out.println("(a > b) && (b > a) = " + andOp);
        System.out.println("!(a < b) = " + notOp);
        System.out.println("((a > b) && (b > a)) || (!(a < b)) = " + orOp);
        
        System.out.println("\nOperator Boolean Kanan");
        System.out.println("(( a == b) || (b > a)) = " + orOp2);
        System.out.println("!(( a == b) || (b > a))= " + notOp2);
        
        System.out.println("\nOperator Boolean Seluruh");
        System.out.println("(( a > b) && (b > a)) || (!(a < b)) && (!(( a == b) || (b > a))) = " + andOp3);
    }
    
}
