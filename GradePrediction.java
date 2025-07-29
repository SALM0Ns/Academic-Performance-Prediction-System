import java.util.Scanner;

public class GradePrediction {
    public static String predict(int ics, int fpc, int foc, int cp, String skips, String submit) {
        if (ics == 2) { // C+ - D
            if (skips.equalsIgnoreCase("yes")) {
                if (foc == 3) return "A - B";
                else if (foc == 2) return "C+ - D";
                else if (foc == 1) return "A - B";
            } else {
                return "A - B";
            }
        } else if (ics == 1) { // A - B
            if (fpc == 2) {
                if (skips.equalsIgnoreCase("yes")) {
                    if (foc == 3) return "A - B";
                    else if (foc == 2) return "C+ - D";
                    else if (foc == 1) return "A - B";
                } else {
                    return "A - B";
                }
            } else if (fpc == 3) {
                return "C+ - D";
            } else if (fpc == 1) {
                if (submit.equalsIgnoreCase("no")) {
                    return "A - B";
                } else {
                    if (foc == 3) return "A - B";
                    else if (foc == 2) {
                        if (cp == 2) return "C+ - D";
                        else if (cp == 1) return "A - B";
                        else return "A - B"; // F,W
                    } else if (foc == 1) return "A - B";
                }
            } else if (fpc == 2) {
                return "C+ - D";
            }
        } else if (ics == 3) { // F , W
            return "C+ - D";
        }

        return "ไม่สามารถทำนายได้";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Introduction to Computer Science (1 = A-B, 2 = C+-D, 3 = W-F): ");
        int ics = sc.nextInt();

        System.out.println("Input Fundamental Programming Concepts (1 = A-B, 2 = C+-D, 3 = W-F): ");
        int fpc = sc.nextInt();

        System.out.println("Input Fundamentals of Computing (1 = A-B, 2 = C+-D, 3 = W-F): ");
        int foc = sc.nextInt();

        System.out.println("Input Computer Programming (1 = A-B, 2 = C+-D, 3 = W-F): ");
        int cp = sc.nextInt();

        sc.nextLine(); 
        System.out.println("Skips ? (yes/no): ");
        String skips = sc.nextLine();

        System.out.println("Work Summit (yes/no): ");
        String submit = sc.nextLine();

        String result = predict(ics, fpc, foc, cp, skips, submit);
        System.out.println("Your Computer Architecture Grade Prediction: " + result);
    }
}
