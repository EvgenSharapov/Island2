package entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Animal {
        private double weight;
        private double maxEat;
        private boolean isEat;
        private boolean isReproduction;
        private int age;
        private Direction direction;
        private int speed;


        public abstract void move();

        public abstract void reproduction();


    }
