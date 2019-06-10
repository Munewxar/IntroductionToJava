package task4.controller.filework;

import task4.exception.WrongDataException;
import task4.exception.WrongFileException;
import task4.model.carriage.PassengerCarriage;
import task4.model.passenger.Passenger;
import task4.model.train.PassengerTrain;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileWorker {

    public PassengerTrain createTrainFromFile(File file) throws IOException {
        checkFileExtension(file);

        final int TRAIN_ID = 0;
        List<PassengerCarriage> passengerCarriageList = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get(file.getName()), StandardCharsets.UTF_8);
        List<Passenger> passengerList = new ArrayList<>();
        String carriageId = "";

        for (int i = 1; i < lines.size(); i++) {
            if (lines.get(i).contains("Вагон")) {
                if (i > 1) {
                    passengerCarriageList.add(new PassengerCarriage(Integer.valueOf(carriageId), passengerList));
                    passengerList = new ArrayList<>();
                }
                checkInputCarriageId(lines.get(i));
                carriageId = lines.get(i).split(" ")[1];
            } else {
                passengerList.add(new Passenger(lines.get(i)));
                if (i == (lines.size() - 1)) {
                    passengerCarriageList.add(new PassengerCarriage(Integer.valueOf(carriageId), passengerList));
                }
            }
        }

        return new PassengerTrain(lines.get(TRAIN_ID), passengerCarriageList);
    }

    private void checkFileExtension(File file) {
        if (!file.getPath().contains(".txt")) {
            try {
                throw new WrongFileException("File extension must be .txt!");
            } catch (WrongFileException e) {
                System.err.println(e);
            }
        }
    }

    private void checkInputCarriageId(String string) {
        if (string.split(" ").length != 2) {
            try {
                throw new WrongDataException("Wrong carriage Id string!");
            } catch (WrongDataException e) {
                System.err.println(e);
            }
        }

        try {
            Integer.valueOf(string.split(" ")[1]);
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
    }

}
