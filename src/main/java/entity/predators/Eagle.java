package entity.predators;

import entity.Animal;

public class Eagle extends Animal implements Predator {
    private String image="\uD83E\uDD85";



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
