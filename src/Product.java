/**
 * Programmer: Daniel Bailey
 * Description: OOP Project
 * Date: 10/1/2018
 **/


import java.util.Date; //needed to get current time etc

public abstract class Product implements Item, Comparable<Item>{

  private int serialNumber;
  private String manufacturer = "OraclProduction";
  private Date manufacturedOn = new Date();
  private String name = "default name";
  private static int currentProductionNumber = 1;
  private ItemType code;

  public void setProductionNumber(int num) {
    currentProductionNumber = num; //had to write to static field or it just didnt print
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
  }

  public void setName(String name) {

    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getManufactureDate(String date) {
    //    manufacturedOn.getTime();
    return manufacturedOn.toString();
  }

  public int getSerialNumber(int serialNum) {
    return serialNumber;
  }

  //prints info
  public String toString() {
    System.out.println("Manufacturer  : " + manufacturer);
    System.out.println("Serial Number : " + serialNumber);
    System.out.println("Date          : " + manufacturedOn);
    System.out.println("Name          : " + name);
    return "";
  }

  //default constructor
  public Product() {
  }

  //constructor
  public Product(String pName) {
    setName(pName);
    setProductionNumber(currentProductionNumber);
    manufacturedOn.getTime();
    this.toString();

  }
}

