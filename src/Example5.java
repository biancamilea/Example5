import java.util.Scanner;
class Example5 {
    public static void main(String[] argv) {

        double r;
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextDouble();

        double largo = (2 * 3.14) * r;
        double area = (3.14 * r) * r;

        System.out.println(largo);
        System.out.println(area);
    }
}
