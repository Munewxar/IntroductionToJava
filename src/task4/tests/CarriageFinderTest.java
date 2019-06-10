package task4.tests;

import org.junit.Assert;
import org.junit.Test;
import task4.controller.filework.FileWorker;
import task4.controller.finder.CarriageFinder;
import task4.model.carriage.PassengerCarriage;
import task4.model.passenger.Passenger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CarriageFinderTest {

    @Test
    public void findCarriages() throws IOException {
        List<PassengerCarriage> actual = CarriageFinder.findCarriages(0, 5,
                new FileWorker().createTrainFromFile(new File("testTrain.txt")));

        List<PassengerCarriage> expected = new ArrayList<>();
        expected.add(new FileWorker().createTrainFromFile(new File("testTrain.txt")).
                getCarriagesList().get(0));
        expected.add(new FileWorker().createTrainFromFile(new File("testTrain.txt")).
                getCarriagesList().get(2));

        Assert.assertEquals(expected.toString(), actual.toString());
    }
}