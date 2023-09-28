package creationalPatterns.builderPattern;

import creationalPatterns.builderPattern.builder.CarBuilder;
import creationalPatterns.builderPattern.builder.CarManualBuilder;
import creationalPatterns.builderPattern.cars.Car;
import creationalPatterns.builderPattern.cars.CarType;
import creationalPatterns.builderPattern.cars.Manual;
import creationalPatterns.builderPattern.components.Engine;
import creationalPatterns.builderPattern.components.GPSNavigator;
import creationalPatterns.builderPattern.components.Transmission;
import creationalPatterns.builderPattern.components.TripComputer;
import creationalPatterns.builderPattern.director.Director;

import static creationalPatterns.builderPattern.cars.CarType.*;

public class BuilderPatternDemo {


    /**
     * Builder es un patrón de diseño creacional para construir objetos complejos paso a paso.
     * Permite producir distintos tipos y representaciones de un objeto reutilizando el codigo de construccion
     */
    public static void main(String[] args) {


        /**
         * Necesito crear un coche, un objeto complejo
         */

        /**
         * Forma poco optima
         * Tenemos que crear los objetos hijos previamente por cada coche
         */
        CarType carType = SPORTS_CAR;
        int seats = 2;

        Engine engine = new Engine(1, 1);

        Transmission transmission;

        TripComputer tripComputer;

        GPSNavigator gpsNavigator;

        //Car myFirstCar = new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);

        // Siguiendo el patron de diseño Builder
        Director director = new Director();


        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

    }
}