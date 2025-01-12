package entity.herbivores;

import entity.Animal;

public class Duck extends Animal implements Herbivore {
    private String image="\uD83E\uDD86";


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
