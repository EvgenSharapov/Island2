package org.example;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Island extends Game {
    public static final int WIDTH = 5;
    public static final int HEIGHT = 5;
    private static final List<String>animal = new ArrayList<>();


    @Override
    public void initialize() {

        animal.add("\uD83D\uDC3A");
        animal.add("\uD83D\uDC3B");
        animal.add("\uD83D\uDC0E");
        animal.add("\uD83E\uDD8C");
        animal.add("\uD83D\uDC17");
        animal.add("\uD83D\uDC11");
        animal.add("\uD83D\uDC10");
        animal.add("\uD83D\uDC03");
        animal.add("\uD83D\uDC0D");
        animal.add("\uD83E\uDD8A");
        animal.add("\uD83E\uDD8A");
        animal.add("\uD83D\uDC07");
        animal.add("\uD83E\uDD86");
        animal.add("\uD83D\uDC01");
        animal.add("\uD83D\uDC1C");

        showGrid(true);
        setScreenSize(WIDTH, HEIGHT);
        createGame();


    }



    private void createGame() {
        drawScene();
        setTurnTimer(40);
    }

    private void drawScene() {
        drawField();

    }

    private void drawField() {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                setCellColor(x, y, Color.AZURE);
                int randomIndex = ThreadLocalRandom.current().nextInt(animal.size());
                String name=animal.get(randomIndex);
                setCellValue(x,y,name);
            }
        }
    }




    @Override
    public void setCellColor(int x, int y, Color color) {
        if (x > WIDTH - 1 || x < 0 || y < 0 || y > HEIGHT - 1) {
            return;
        }
        super.setCellColor(x, y, color);
    }


}