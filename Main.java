import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("体重を入力してください。");
        System.out.print("体重：");
        double weight = Integer.parseInt(sc.nextLine());

        System.out.println("身長を入力してください。");
        System.out.print("身長：");
        double height = Integer.parseInt(sc.nextLine());

        double bmi = weight / (height * height);

        System.out.print("あなたのBMIは、");
        System.out.print(String.format("%.2f", bmi));
        System.out.println("です。");
    }
}
