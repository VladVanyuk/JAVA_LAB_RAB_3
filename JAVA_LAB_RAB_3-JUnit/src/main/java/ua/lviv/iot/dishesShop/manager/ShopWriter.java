package ua.lviv.iot.dishesShop.manager;

import ua.lviv.iot.dishesShop.model.Dishes;

import java.io.*;
import java.util.List;
import java.nio.file.Files;


public class ShopWriter {

    public static void writeToFile(List<Dishes> dishes)
            throws FileNotFoundException, IOException {
        File myFile = new File("out.csv");
        try (FileOutputStream fos = new FileOutputStream(myFile);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bufWriter = new BufferedWriter(osw);) {
            for (Dishes dish:dishes) {
                bufWriter.write(
                        dish.getHeaders() + "\n"
                                + dish.toCSV() + "\n"
                );
            }
        } finally {
            System.out.println();
        }
    }
}
