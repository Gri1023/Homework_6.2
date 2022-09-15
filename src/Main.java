import static ibio.Helpers.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        boolean RUNNING = true;
        while (RUNNING=true) {
            String operation = inputString("Do you want to add or end? ");
            if (operation.equals("end"))
            {
                RUNNING = false;
                break;
            }
            else
            {
                int a=inputInt("give first integer operand: ");
                int b=inputInt("give second integer operand: ");
                if (operation.equals("add"))
                    System.out.println(a+b);
            }
        }
    }
}