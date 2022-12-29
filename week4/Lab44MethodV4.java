import java.util.Scanner;


public class Lab44MethodV4 { 

    public static int findMax(int[] find) {
        int max = find[0];
        for(int i = 0; i<find.length;i++){
            if(find[i]>max){
                max = find[i];
        }   
    } return max;
}  
    public static void main(String[] args) {
        int n,i;
        Scanner scn = new Scanner(System.in);
        System.out.print("Please input n : ");
        n = scn.nextInt();
        int[] find = new int[n];
        for(i=0;i<n;i++){
            System.out.printf("Input {%d} = ",i+1);
             find[i] = scn.nextInt();     
        }
        System.out.printf("Max is %d",findMax(find));
    }
}
