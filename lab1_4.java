import java.util.Scanner;

public class lab1_4 {
  
  public static void main(String[] args) {
    
    
    Scanner numbers = new Scanner(System.in);
    System.out.println("Введите количество точек: ");
    int numb0points = numbers.nextInt();
    System.out.println("Введите длину радиуса окружности: ");
    int radius = numbers.nextInt();
    int i = 0;
    int points_in_circle = 0;
     while (i < numb0points){
        Scanner points = new Scanner(System.in);
        System.out.println("Введите координату X точки: ");
        int X = numbers.nextInt();
        System.out.println("Введите координату Y точки: ");
        int Y = numbers.nextInt();
        
        int hypotenuse = (X^2 + Y^2)^(1/2);
       
          if (hypotenuse < radius){
            points_in_circle = points_in_circle + 1;
          }
        i++;
     }
    System.out.print(points_in_circle + " точек попали в окружность");
    
  }
}