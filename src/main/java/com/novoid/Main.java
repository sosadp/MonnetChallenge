package com.novoid;

import com.novoid.strategy.OffroadStrategy;
import com.novoid.strategy.RacingStrategy;
import com.novoid.strategy.SecretAgencyStrategy;
import com.novoid.strategy.WorkStrategy;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        CarContext carContext = new CarContext();

        Calendar calendar = Calendar.getInstance();

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);


        switch (dayOfWeek) {
            case 1 -> {
                System.out.println("Sunday");
                carContext.setCarStrategy(new WorkStrategy());
                carContext.executeStrategy();
            }

            case 2 -> {
                System.out.println("Tuesday");
                carContext.setCarStrategy(new RacingStrategy());
                carContext.executeStrategy();
            }

            case 3, 4 -> {
                System.out.println("Wednesday");
                carContext.setCarStrategy(new OffroadStrategy());
                carContext.executeStrategy();
            }
            case 6 -> {
                System.out.println("Wednesday");
                carContext.setCarStrategy(new SecretAgencyStrategy());
                carContext.executeStrategy();

            }
            default -> System.out.println("Strategy undefined");

        }
    }
}