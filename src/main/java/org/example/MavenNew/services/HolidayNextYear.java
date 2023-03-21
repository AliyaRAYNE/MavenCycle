package org.example.MavenNew.services;

public class HolidayNextYear {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать в следующим месяце?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3; // сколько осталось денег
            } else {
                money += income - expenses;
            }
        }
        return count;
    }
}
