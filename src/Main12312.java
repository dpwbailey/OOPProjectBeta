

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main12312 {

  public static void main(String[] args) {

    ArrayList<Product> products = new ArrayList<>();
    products = testCollection(products);
    Collections.sort(products);
       printArray(products);

  }

  // Step 15
  // Complete the header for the testCollection method here

  public static ArrayList testCollection(ArrayList<Product> products) {

    AudioPlayer a1 = new AudioPlayer("iPod Mini","MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman","WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);


    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

    public static void printArray(ArrayList arrayList){
      for (Object o : arrayList) {
        System.out.println(o + "\n");
      }
    }

}
