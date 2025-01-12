package entity.herbivores;

import entity.Animal;

public class Sheep extends Animal implements Herbivore {
    private String image="\uD83D\uDC11";



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
