package ua.lviv.iot.dishesShop.manager;

import java.io.*;

public class ShopWriter {

    public static void main(String... strings) throws IOException {
        File myFile = new File("happines_from_java");

        try (FileOutputStream fos = new FileOutputStream(myFile);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bufWriter = new BufferedWriter(osw);) {

            bufWriter.write("IM HAPPY");
            bufWriter.newLine();
            bufWriter.write("from c++");
        } finally {


        }
    }
}
