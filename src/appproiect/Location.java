package appproiect;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Location {

    private final IntegerProperty id_location;
    private final StringProperty name;
    private final StringProperty phone_number;
    private final StringProperty city;
    private final StringProperty adress;

    public Location(Integer id_location, String name, String phone_number,String city,  String adress) {
        this.id_location = new SimpleIntegerProperty(id_location);
        this.name = new SimpleStringProperty(name);
        this.phone_number = new SimpleStringProperty(phone_number);
        this.city = new SimpleStringProperty(city);
        this.adress = new SimpleStringProperty(adress);
    }

    public Integer getIdLocation() {
        return id_location.get();
    }

    public String getName() {
        return name.get();
    }

    public String getPhoneNumber() {
        return phone_number.get();
    }
    
    public String getCity() {
        return city.get();
    }

    public String getAdress() {
        return adress.get();
    }

    public void setIdLocation(Integer valoare) {
        id_location.set(valoare);
    }

    public void setName(String valoare) {
        name.set(valoare);
    }

    public void setPhoneNumber(String valoare) {
        phone_number.set(valoare);
    }
    
    public void setCity(String valoare) {
        city.set(valoare);
    }

    public void setAdress(String valoare) {
        adress.set(valoare);
    }

    public IntegerProperty id_locationProperty() {
        return id_location;
    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty phone_numberProperty() {
        return phone_number;
    }
    
    public StringProperty cityProperty() {
        return city;
    }

    public StringProperty adressProperty() {
        return adress;
    }
}