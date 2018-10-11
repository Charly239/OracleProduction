

import java.util.Date;

public interface Item {
    String manufacturer = "OracleProduction";
    void setProductionNumber(int P);
    void setName(String N);
    String getName();
    Date getManufactureDate();
    int getSerialNumber(int S);

}
