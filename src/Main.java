import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number ");
        int number = scanner.nextInt();

        for(int i = 0; i < number; i++){
            System.out.println("I can count to "+ (i+1));
        }

    }
}
