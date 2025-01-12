package entity.vegetations;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Vegetation {
    private final double WEIGHT;
    private boolean isReproduction;
    public Vegetation(double weight) {
        this.WEIGHT = weight;
    }

    public abstract void reproduction();

}
