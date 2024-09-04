package pack;

public class AttractionsNear extends Attrections{
    private int distance;

    public AttractionsNear(String name, double rayting, int price, String dayWork, String hourWork, int timeView, int distance){
        super(name, rayting, price, dayWork, hourWork, timeView);
        this.distance = distance;
    }

    public int getDistance(){
        return this.distance;
    }

    @Override
    public String toString() {
        return   getName() + "идти: " + distance + " км.";
    }

}
