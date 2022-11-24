import java.util.Scanner;

 public class lab1_1 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.print ("Введите год своего рождения: ");
    int year = in.nextInt();
    System.out.print ("Введите месяц своего рождения(числом): ");
    int month = in.nextInt();
    System.out.print ("Введите число своего рождения: ");
    int day = in.nextInt();
    in.close();
    
    if (year > 2022 || year < 0){
      System.out.print("Неверно введённый год");
     }
    if (month > 12 || month < 1){
      System.out.print("Неверно введённый месяц");
     }
    if (day > 31){
      System.out.print("Неверно введённый день");
     }
    
      
    int day0user = (year*365 + month*12 + day)%30;

    int year0user;
      if (month == 12) {
        year0user = 2021 - year;
      }
        if ((month == 11) && (day > 17)) {
          year0user = 2021 - year;
        }
          else {
            year0user = 2022 - year;
          }
    
      int month0user = ((2022 - year)*12 + 11 - month)%12;
    
      
        
    System.out.println(year0user + " лет " + month0user + " месяцев " + day0user + " дней ");
  }
}