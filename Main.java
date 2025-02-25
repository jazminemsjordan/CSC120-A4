import java.util.Random;

public class Main {

    //Attributes
    public Train myTrain;

    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.STEAM, 50, 100, 5, 102);
        Engine myEngine = myTrain.getEngine();
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        myEngine.refuel();
        myEngine.go();
        Car myCar = myTrain.getCar(4);
        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            Passenger p = new Passenger("Louis");
            int car = rand.nextInt(5);
            Car randCar = myTrain.getCar(car);
            p.boardCar(randCar);
        }
        System.out.println(myCar.getCapacity());
        System.out.println(myCar.seatsRemaining());
        System.out.println(myTrain.getMaxCapacity());
        System.out.println(myTrain.seatsRemaining());
        myTrain.printManifest();

    }
}
