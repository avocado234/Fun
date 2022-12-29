/**
 * Lab48RefReadTwoNumber
 */
import java.util.Scanner;
public class Lab48RefReadTwoNumber {
    public static void readTwoInput(AddInt a ,AddInt b) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter number#1 : ");
         a.value = scan.nextInt();
        System.out.printf("Enter number#2 : ");
         b.value = scan.nextInt();

        
        
    }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            AddInt num1 = new AddInt(); // ประกาศตัวแปร ชื่อ num1 และสร้าง Object AddInt
            AddInt num2 = new AddInt(); // ประกาศตัวแปร ชื่อ num2 และสร้าง Object AddInt
            readTwoInput(num1,num2);
            System.out.printf("Two numbers are {%d} and {%d}",num1.value,num2.value);
        }
    
}