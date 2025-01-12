package entity.herbivores;

import entity.Animal;

public class Mouse extends Animal implements Herbivore {
    private String image="\uD83D\uDC01";
    @Override
    public void eat() {

    }

    @Override
    public String getImage() {
        return image;
    }

    @Override
    public void move() {

    }

    @Override
    public void reproduction() {

    }
}
