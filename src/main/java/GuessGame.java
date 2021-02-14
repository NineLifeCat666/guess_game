import java.util.Scanner;

public class GuessGame {

   public static String invitation = "Угадайте загаданное число от 1 до 100" +
            "\nВведите число в консоль";

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        //рандомизируем загаданное число
        int hiddenNumber = (int) (Math.random() * 100 + 1);
        int guess = 0;

        System.out.println(GuessGame.invitation);
        while(guess != hiddenNumber) {
            //System.out.println(hiddenNumber);
            guess = scanner.nextInt();
            if (guess < hiddenNumber)
                System.out.println("Ваше число " + guess +" загаданное число больше");
            else if(guess > hiddenNumber)
                System.out.println("Ваше число " + guess + " загаданное число меньше");
            else
                System.out.println("Вы угадали!");
        }
    }
}

