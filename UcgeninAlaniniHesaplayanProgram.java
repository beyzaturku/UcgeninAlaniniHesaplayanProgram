
package ucgeninalaninihesaplayanprogram;
import java.util.*;
public class UcgeninAlaniniHesaplayanProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("1.kenar uzunluğunu giriniz:");
        int kenar1 = input.nextInt();
        
        System.out.println("2.kenar uzunluğunu giriniz:");
        int kenar2 = input.nextInt();
        
        System.out.println("3.kenar uzunluğunu giriniz:");
        int kenar3 = input.nextInt();
        
        int ıslem = (kenar1+kenar2+kenar3) /2;
        
        
        int alan = ıslem * (ıslem-kenar1)*(ıslem-kenar2)*(ıslem-kenar3);
        System.out.println("Üçgenin alanı:" + alan );
        
        
       
        
    }
    
}