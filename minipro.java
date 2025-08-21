import java.util.*;

public class minipro {
    public static void main(String args[]) {
        double total = 0.0, avg = 0.0, s1, s2, s3, s4, s5;
        int id, c;
        String res = "", name = "", pno = "", e = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name");
        name = sc.next();
        System.out.println("Enter the student id");
        id = sc.nextInt();
        System.out.println("Enter the student phone number");
        pno = sc.next();
        System.out.println("Enter the student email");
        e = sc.next();
        System.out.println("Enter the student marks:");
        System.out.println("Sub1:");
        s1 = sc.nextDouble();
        System.out.println("Sub2:");
        s2 = sc.nextDouble();
        System.out.println("Sub3:");
        s3 = sc.nextDouble();
        System.out.println("Sub4:");
        s4 = sc.nextDouble();
        System.out.println("Sub5");
        s5 = sc.nextDouble();

        total = (s1 + s2 + s3 + s4 + s5);
        System.out.println("Total=" + total);
        avg = total / 5;
        System.out.println("Average=" + avg);
        if ((avg < 35) || (s1 < 35) || (s2 < 35) || (s3 < 35) || (s4 < 35) || (s5 < 35)) {
            res = "Fail";
            System.out.println("Result=" + res);

        } else {
            res = "Pass";
            System.out.println("Result=" + res);
        }
        c = (int) (avg / 10);
        switch (c) {
            case 10:
            case 9:
                System.out.println("Grade = A");
                break;
            case 8:
            case 7:
                System.out.println("Grade = B");
                break;
            case 6:
            case 5:
                System.out.println("Grade = C");
                break;
            case 4:
                System.out.println("Grade = D");
                break;
            case 3:
                if (avg > 35 && avg <= 39)
                    System.out.println("Grade = D");
                break;

            default:
                System.out.println("Grade = F");
        }

    }
}