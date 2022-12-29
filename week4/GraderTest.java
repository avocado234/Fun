import java.util.Scanner;
public class GraderTest {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        for(int m=0;m<=2;m++){
         System.out.print("Enter course name : ");
         Grader name = new Grader(scn.next());
         System.out.print("Enter number of students : ");
         int students = scn.nextInt();
         System.out.println("\n Input scores ");
         for(int i = 0;i<students;i++){
          name.addScore(scn.nextDouble());
         }
         System.out.printf("Meen of %s = %.2f \n",name.getCourseName(),name.meen());
         System.out.println("Below mean = " + name.belowMean());
         System.out.println("Above mean = " + name.aboveMean());
         name.showGrade();
         System.out.println("\n####################\n");
         m++;
     }
    
}
}