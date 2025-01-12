package entity.predators;

import entity.Animal;

public class Bear extends Animal implements Predator {
    private String image="\uD83D\uDC3B";



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
