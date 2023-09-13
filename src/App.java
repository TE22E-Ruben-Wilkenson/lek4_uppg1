import java.util.Scanner;


public class App {
    String tal_1;
    String tal_2;

    public static void main(String[] args) throws Exception {
        App var = new App();

        Scanner tan = new Scanner(System.in);

        System.out.print("Ange tal:     ");
        var.tal_1 = tan.nextLine();

        System.out.print("Ange tal:     ");
        var.tal_2 = tan.nextLine();

        System.out.println(Double.parseDouble(var.tal_1) / Double.parseDouble(var.tal_2));

        

    }
}
