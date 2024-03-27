package appproiect;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;



public class Screening {
	
	private final IntegerProperty id_screening;
    private final StringProperty start_time;
    private final DoubleProperty ticket_price;
    private final IntegerProperty id_movie;
    private final IntegerProperty id_location;
    
    public Screening(Integer id_screening, String start_time, Double ticket_price, Integer id_movie, Integer id_location) {
        this.id_screening = new SimpleIntegerProperty(id_screening);
        this.start_time = new SimpleStringProperty(start_time);
        this.ticket_price = new SimpleDoubleProperty(ticket_price);
        this.id_movie = new SimpleIntegerProperty(id_movie);
        this.id_location = new SimpleIntegerProperty(id_location);
    }
    
    public Integer getIdScreening() {
        return id_screening.get();
    }

    public String getStartTime() {
        return start_time.get();
    }

    public Double getTicketPrice() {
        return ticket_price.get();
    }

    public Integer getIdMovie() {
        return id_movie.get();
    }
    
    public Integer getIdLocation() {
        return id_location.get();
    }
    
    public void setIdScreening(Integer valoare) {
        id_screening.set(valoare);
    }

    public void setStartTime(String valoare) {
        start_time.set(valoare);
    }

    public void setTicketPrice(Double valoare) {
        ticket_price.set(valoare);
    }

    public void setIdMovie(Integer valoare) {
    	id_movie.set(valoare);
    }
    
    public void setIdLocation(Integer valoare) {
    	id_location.set(valoare);
    }
    
    public IntegerProperty id_screeningProperty() {
        return id_screening;
    }
    public StringProperty start_timeProperty() {
        return start_time;
    }

    public DoubleProperty ticket_priceProperty() {
        return ticket_price;
    }

    public IntegerProperty id_movieProperty() {
        return id_movie;
    }
    
    public IntegerProperty id_locationProperty() {
        return id_location;
    }
}
    

