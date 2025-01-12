package entity.ancients;

public class Caterpillar implements Ancient{
    private String image= "🐛";
    private static final int MAX_IN_CAGE=400;
    private static final String NAME="Caterpillar";
    private static final double WEIGHT=0.01;
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
