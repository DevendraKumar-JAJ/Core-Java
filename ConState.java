import java.util.Scanner;

 class ConState {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    System.out.println("Age : "+age);
    if (age>18) {
      System.out.println("Able to vote, drive.");
    }else{
      System.out.println("Not consider as an adult.");
    }
    sc.close();
  }
}
