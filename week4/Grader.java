import java.util.ArrayList;
import java.util.Scanner;

public class Grader {
    private String Course;
    ArrayList<Double> arrayList = new ArrayList<Double>();
  
    public  Grader(String name) {
       this.Course = name;
    }
    public void addScore(double score) {
        arrayList.add(score);
    }
    public double countStudents(){
      return arrayList.size();
    }
    public double meen() {
        int num = 0;
        for(double meen : arrayList){
            num += meen;
        }return num/countStudents();
    }
    public int belowMean() {
        int below = 0;
        for(double a:arrayList ){
            if(a<meen()){
                below++;
            }
        }
        return below; 
    }
    public int aboveMean() {
        int above = 0;
        for(double b:arrayList ){
            if(b>meen()){
                above++;
            }
        }
        return above; 
    }
    public  void showGrade() {
        int A =0,Bp=0,B =0,Cp = 0,C=0,Dp=0,D=0,F=0;
        for(double countGrade :arrayList ){
          if(countGrade>=80){
            A++;
          }else if(countGrade>=75){
            Bp++;
          }else if(countGrade>=70){
            B++;
          }else if(countGrade>=65){
            Cp++;
          }else if(countGrade>=60){
            C++;
          }else if(countGrade>=55){
           Dp++;
          }else if(countGrade>=50){
            D++;
          }else{
            F++;
          }
        }
        System.out.printf("Grade : A %d, B+ %d, B %d, C+ %d, C %d, D+ %d, D %d, F %d ",A,Bp,B,Cp,C,Dp,D,F);
    }
    public String  getCourseName(){
      return this.Course;
    }


}
