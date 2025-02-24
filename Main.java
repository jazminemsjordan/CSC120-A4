import java.util.Random;

public class Main {

    //Attributes
    public Train myTrain;

    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.STEAM, 50, 100, 5, 102);
        Car myCar = myTrain.getCar(4);
        Car myOtherCar = myTrain.getCar(1);
        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            Passenger p = new Passenger("Louis");
            int car = rand.nextInt(5);
            Car randCar = myTrain.getCar(car);
            p.boardCar(randCar);
        }
        System.out.println(myCar.getCapacity());
        System.out.println(myOtherCar.getCapacity());
        System.out.println(myCar.seatsRemaining());
        myCar.printManifest();
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        myTrain.printManifest();

    }
}
