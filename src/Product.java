import java.util.Date;

public abstract class Product implements Item {
    private int serialNumber;
    private String manufacturer;
    private Date manufacturedOn;
    private String name;
    private static int currentProductionNumber;

    public Product(String N){
    name = N;
    serialNumber = currentProductionNumber++;
    manufacturedOn = new Date();
    manufacturer = Item.manufacturer;
    }


    public void setProductionNumber(int P){
        currentProductionNumber = P;
    }

    public void setName(String N) {
        name = N;
    }

    public String getName() {
        return name;
    }

    public Date getManufactureDate() {
        return manufacturedOn;
    }

    public int getSerialNumber(int s) {
        return serialNumber;
    }

    public String toString() {
        return ("Manufacturer  : " + manufacturer + "\n"
                + "Serial Number  : " + serialNumber + "\n"
                + "Date           : " + manufacturedOn + "\n"
                + "Name           : " + name);
    }


}
