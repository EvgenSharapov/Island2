package entity.ancients;

import lombok.Getter;

@Getter
public class Bug implements Ancient {
    private String image="\uD83D\uDC1C";
    private static final int MAX_IN_CAGE=400;
    private static final String NAME="Bug";
    private static final double WEIGHT=0.02;
    private static final int MAX_SPEED=1;
    private static final double MAX_EAT=0;
    @Override
    public void eat() {

    }

    @Override
    public String getImage() {
        return image;
    }
}
