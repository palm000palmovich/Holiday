package pack;

import java.util.Arrays;

public class Plan {

    private int countDays;
    private String[] daysForHoliday;
    private int budget;

    //конструктор
    public Plan(int countDays, String[] daysForHoliday, int budget){
        this.countDays = countDays;
        this.daysForHoliday = daysForHoliday;
        this.budget = budget;
    }


    //Геттеры

    public String[] getDaysForHoliday(){
        return this.daysForHoliday;
    }
    public int getBudget(){
        return this.budget;
    }

    //Метод для заполнения массива с днями отдыха
    public String[] arrayDays(int countDays){
        for (int i = 0; i <= countDays; i++){

        }
    }

    @Override
    public String toString() {
        return "Дни отдыха: " + Arrays.toString(daysForHoliday) +
                ", бюджет: " + budget;
    }
}
