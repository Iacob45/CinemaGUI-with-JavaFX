package appproiect;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import java.sql.Date;
import java.sql.Time;


public class Movie {

    private final IntegerProperty id_movie;
    private final StringProperty name;
    private final ObjectProperty<Time> length;
    private final StringProperty director;
    private final StringProperty rating;
    private final StringProperty genre;
    private final ObjectProperty<Date> launch_date;

    public Movie(Integer id_movie, String name, Time length,String director,  String rating, String genre, Date launch_date) {
        this.id_movie = new SimpleIntegerProperty(id_movie);
        this.name = new SimpleStringProperty(name);
        this.length = new SimpleObjectProperty<Time>(length);
        this.director = new SimpleStringProperty(director);
        this.rating = new SimpleStringProperty(rating);
        this.genre = new SimpleStringProperty(genre);
        this.launch_date = new SimpleObjectProperty<Date>(launch_date);
    }

    public Integer getIdMovie() {
        return id_movie.get();
    }

    public String getName() {
        return name.get();
    }

    public Time getLength() {
        return length.get();
    }
    
    public String getDirector() {
        return director.get();
    }

    public String getRating() {
        return rating.get();
    }
    
    public String getGenre() {
        return genre.get();
    }

    public Date getLaunchDate() {
        return launch_date.get();
    }


    public void setIdMovie(Integer valoare) {
        id_movie.set(valoare);
    }

    public void setName(String valoare) {
        name.set(valoare);
    }

    public void setLength(Time valoare) {
        length.set(valoare);
    }
    
    public void setDirector(String valoare) {
        director.set(valoare);
    }

    public void setRating(String valoare) {
        rating.set(valoare);
    }
    
    public void setGenre(String valoare) {
        genre.set(valoare);
    }
    
    public void setLaunchDate(Date valoare) {
        launch_date.set(valoare);
    }

    public IntegerProperty id_movieProperty() {
        return id_movie;
    }

    public StringProperty nameProperty() {
        return name;
    }

    public ObjectProperty<Time> lengthProperty() {
        return length;
    }
    
    public StringProperty directorProperty() {
        return director;
    }

    public StringProperty ratingProperty() {
        return rating;
    }
    
    public StringProperty genreProperty() {
        return genre;
    }
    
    public ObjectProperty<Date> launch_dataProperty() {
        return launch_date;
    }
}