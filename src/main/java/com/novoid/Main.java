package com.novoid;

import com.novoid.CarType.ConcreteFactory.OffroadCarFactory;
import com.novoid.CarType.ConcreteFactory.RacingCarFactory;
import com.novoid.CarType.ConcreteFactory.SecretCarFactory;
import com.novoid.CarType.ConcreteFactory.WorkCarFactory;
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
                System.out.println("Today is Sunday");
                CarFactory carFactory = new WorkCarFactory();
                carContext.setCarStrategy(new WorkStrategy());
                carContext.executeStrategy(carFactory);
            }

            case 2 -> {
                System.out.println("Today is Tuesday");
                CarFactory carFactory = new RacingCarFactory();
                carContext.setCarStrategy(new RacingStrategy());
                carContext.executeStrategy(carFactory);
            }

            case 3, 4 -> {
                System.out.println("Today is Wednesday or Thursday");
                CarFactory carFactory = new OffroadCarFactory();
                carContext.setCarStrategy(new OffroadStrategy());
                carContext.executeStrategy(carFactory);
            }
            case 6 -> {
                System.out.println("Today is Friday");
                CarFactory carFactory = new SecretCarFactory();
                carContext.setCarStrategy(new SecretAgencyStrategy());
                carContext.executeStrategy(carFactory);

            }
            default -> System.out.println("Strategy undefined");

        }
    }
}