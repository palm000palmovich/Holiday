package pack;

public class RestaurantsNear extends Restaurant{
    private int distance;

    public RestaurantsNear(String kitchen, int price, double rayting, String hours, int distance){
        super(kitchen, price, rayting, hours);
        this.distance = distance;
    }

    public int getDistanceRest(){
        return this.distance;
    }

    @Override
    public String toString() {
        return "идти " + distance + " км.";
    }

}
