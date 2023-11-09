import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("１人目の体重を入力してください。");
        System.out.print("体重：");
        double weight = Integer.parseInt(sc.nextLine());

        System.out.println("２人目の体重を入力してください。");
        System.out.print("体重：");
        double weight2 = Integer.parseInt(sc.nextLine());

        System.out.println("１人目の身長を入力してください。");
        System.out.print("身長：");
        double height = Integer.parseInt(sc.nextLine());

        System.out.println("２人目の身長を入力してください。");
        System.out.print("身長：");
        double height2 = Integer.parseInt(sc.nextLine());

        double bmi = weight / (height * height);
        double bmi2 = weight2 / (height2 * height2);

        System.out.print("１人目のBMIは、");
        System.out.print(String.format("%.2f", bmi));
        System.out.println("です。");
        System.out.println();
        System.out.print("２人目のBMIは、");
        System.out.print(String.format("%.2f", bmi2));
        System.out.println("です。");
    }
}
