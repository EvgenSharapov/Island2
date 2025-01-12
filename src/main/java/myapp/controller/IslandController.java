package myapp.controller;

import lombok.Getter;
import myapp.model.IslandModel;
import myapp.view.IslandView;

import java.util.Scanner;
@Getter
public class IslandController {

    private IslandModel model;
    private IslandView view;
    private boolean isMenu = true;
    private int a;

    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }

    private int b;

    public IslandController(IslandModel model, IslandView view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        while (isMenu) {
            a = view.getInput("Введите размер острова(от 2 до 100): ");
            b = view.getInput("Введите начальное заселение острова(от 1 до 100): ");
            System.out.print("Введите start для запуска симуляции острова или restart для перезапуска параметров.");
            Scanner scanner = new Scanner(System.in);
            String operation = scanner.next();

            try {
                switch (operation) {
                    case "start":
                        isMenu=false;
                        view.displayResult(a, b);
                        model.startIsland();
                        break;
                    case "restart":
                        return;
                    default:
                        view.displayError("Неизвестная операция");
                }
            } catch (Exception e) {
                view.displayError(e.getMessage());
            }
        }
    }

}
