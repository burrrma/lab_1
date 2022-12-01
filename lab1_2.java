import java.util.Scanner;

public class lab1_2 {
  
  public static void main(String[] args) {
    
    Scanner numbers = new Scanner(System.in);
    System.out.println("Введите месяц: ");
    int month = numbers.nextInt();
    
    System.out.println("Введите день: ");
    int day = numbers.nextInt();

    if ((day > 30) && (month != 1) && (month != 3) && (month != 5) && (month != 7) && (month != 8) && (month != 10) && (month != 12)){
        System.out.print("В этом месяце не может быть данное количество дней");
       }
      
    if (day > 31 || day < 0 || month > 12 || month < 1){
           System.out.print("Неверно заданные значения");
         }
     
  else {
    if  ((month <= 5) && (month >= 3)){
      System.out.println(" Весна ");
    }

      if ((month >= 6) && (month <= 8)){
       System.out.println(" Лето ");
      }

       if ((month >= 9) && (month <= 11)){
         System.out.println(" Осень ");
       }

         if (month == 12 || month == 1 || month == 2){ 
         System.out.println(" Зима ");
         }
    }
      
  }
}
