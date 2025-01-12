package myapp.view;

import java.util.Scanner;

public class IslandView {
        private Scanner scanner;

        public IslandView() {
            scanner = new Scanner(System.in);
        }

        public int getInput(String prompt) {
            System.out.print(prompt);
            return scanner.nextInt();
        }

        public void displayResult(int a,int b) {
            System.out.println("Размер острова :" + a);
            System.out.println("Заселённость острова :"+b);
        }

        public void displayError(String message) {
            System.out.println("Ошибка: " + message);
        }

}
