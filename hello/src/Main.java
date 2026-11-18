import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
//        System.out.println("Hello and welcome!");
        System.out.println("Hello and welcome!"); 
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()){
            int a = scan.nextInt();
            System.out.println(a);
        }
        scan.close();
    }
    }

