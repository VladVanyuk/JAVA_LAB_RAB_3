package ua.lviv.iot.dishesShop.model;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexWorker {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\w{2}\\w{3,4}\\d{2}");
        Matcher matcher = pattern.matcher("Chito podelat or aa0001aa or BC8845CK");
        while(matcher.find()) {
            String plateNumber = matcher.group();
            System.out.println(plateNumber);
        }
    }
}
}
