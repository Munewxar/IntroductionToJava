package task4.tests;

import org.junit.Assert;
import org.junit.Test;
import task4.controller.filework.FileWorker;
import task4.controller.sorter.CarriageSorter;
import task4.model.carriage.PassengerCarriage;
import task4.model.train.PassengerTrain;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CarriageSorterTest {

    @Test
    public void sort() throws IOException {
        PassengerTrain passengerTrain = new FileWorker().
                createTrainFromFile(new File("testTrain.txt"));
        List<PassengerCarriage> expected = new ArrayList<>();
        List<PassengerCarriage> actual;

        expected.add(passengerTrain.getCarriagesList().get(0));
        expected.add(passengerTrain.getCarriagesList().get(2));
        expected.add(passengerTrain.getCarriagesList().get(3));
        expected.add(passengerTrain.getCarriagesList().get(1));

        CarriageSorter.sort(passengerTrain);
        actual = passengerTrain.getCarriagesList();

        Assert.assertEquals(expected.toString(), actual.toString());
    }
}