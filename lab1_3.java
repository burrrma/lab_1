import java.util.Scanner;

public class lab1_3 {
  
  public static void main(String[] args) {
    
    Scanner numbers = new Scanner(System.in);
    System.out.println("Введите основание степени: ");
    int X = numbers.nextInt();
    System.out.println("Введите показатель степени от -15 до 15: ");
    int N = numbers.nextInt();

    if (N > 0){
    for (int i = 0; i <= N; i++){
      int P = X*X;
   System.out.println("Результат: " + P); 
    }
    }
  
  
      if (N == 0){
        System.out.print("Результат: 1");
      }
    
        if (N < 0){
        for (int i = 0; i <= N; i++){
          float P = 1/(X^X);
          System.out.println("Результат: " + P); 
       }
      }
    
  
       
       
  }
}