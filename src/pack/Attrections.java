package pack;

public class Attrections {
    private String name;
    private double rayting;
    private int price;
    private String dayWork, hourWork;
    private int timeView;


    //Констрктор
    public Attrections(String name, double rayting, int price, String dayWork, String hourWork, int timeView) {
        this.name = name;
        this.rayting = rayting;
        this.price = price;
        this.dayWork = dayWork;
        this.hourWork = hourWork;
        this.timeView = timeView;
    }

    //Геттеры

    public String getName() {
        return name;
    }

    public double getRayting() {
        return rayting;
    }

    public int getPrice() {
        return price;
    }

    public String getDayWork() {
        return dayWork;
    }

    public String getHourWork() {
        return hourWork;
    }

    public int getTimeView() {
        return timeView;
    }

    @Override
    public String toString() {
        return "название: " + name + ',' + '\n' +
                "рейтинг: " + rayting +
                ", стоиомость: " + price +
                ", рабочие дни: " + dayWork + ',' + '\n' +
                "рабочие часы: " + hourWork  +
                ", время осмотра: " + timeView;
    }
}
