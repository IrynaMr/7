import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1
        int randomNumber = (int)(Math.random()*41)-20;
        System.out.println("Випадкове число:"+ randomNumber);
        //2
        double a = 3;
        double b = 4;
        double c = Math.sqrt(a*a + b*b);
        double P = a=b+c;
        double S = (a*b)/2;
        System.out.println("Периметр прямокутного трикутника" + P);
        System.out.println("Площа прямокутного трикутника" + S);
        //3
        Random random = new Random();
        int RandomN = random.nextInt(101);
        int k = String.valueOf(RandomN).length();
        System.out.println("Випадкове число:"+ RandomN);
        System.out.println("Кількість цифр:"+ k);
    }
}