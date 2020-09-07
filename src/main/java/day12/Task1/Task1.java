package day12.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List <String> carModel = new ArrayList<>(Arrays.asList("BMW","Toyota","Mercedes","Renault","Hyundai"));
        System.out.println(carModel);
        carModel.add(3,"Nissan");
        carModel.remove(0);
        System.out.println(carModel);
    }
}
