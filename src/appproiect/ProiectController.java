package appproiect;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat; 

/**
 *
 * @author vali
 */
public class ProiectController implements Initializable {
    
    @FXML
    private TableView<Movie> tabela_Movies;
    @FXML
    private Tab tab_Movies;
    @FXML
    private Button buton_IncarcareMovies;
    @FXML
    private TableColumn<Movie, Integer> atribut_id_movie;
    @FXML
    private TableColumn<Movie, Integer> atribut_id_movie2;
    @FXML
    private TableColumn<Movie, String> atribut_name_movie;
    @FXML
    private TableColumn<Movie, Time> atribut_length;
    @FXML
    private TableColumn<Movie, String> atribut_director;
    @FXML
    private TableColumn<Movie, String> atribut_rating;
    @FXML
    private TableColumn<Movie, String> atribut_genre;
    @FXML
    private TableColumn<Movie, Date> atribut_launch_date;
    @FXML
    private TableView<Location> tabela_Locations;
    @FXML
    private Tab tab_Locations;
    @FXML
    private Button buton_IncarcareLocations;
    @FXML
    private TableColumn<Location, Integer> atribut_id_location;
    @FXML
    private TableColumn<Location, Integer> atribut_id_location2;
    @FXML
    private TableColumn<Location, String> atribut_name_location;
    @FXML
    private TableColumn<Location, String> atribut_phone_number;
    @FXML
    private TableColumn<Location, String> atribut_city;
    @FXML
    private TableColumn<Location, String> atribut_adress;
    @FXML
    private TableView<Screening> tabela_Screenings;
    @FXML
    private Tab tab_Screenings;
    @FXML
    private Button buton_IncarcareScreenings;
    @FXML
    private TableColumn<Screening, Integer> atribut_id_screening;
    @FXML
    private TableColumn<Screening, String> atribut_start_time;
    @FXML
    private TableColumn<Screening, Double> atribut_ticket_price;
    @FXML
    private TableColumn<Screening, Integer> atribut_id_movieS;
    @FXML
    private TableColumn<Screening, Integer> atribut_id_LocationS;
    
    private ObservableList<Movie> dateMovies;
    private ObservableList<Location> dateLocations;
    private ObservableList<Screening> dateScreenings;
    private DBOperations jb;
    
    @FXML
    private Tab tab_AdaugareLocations;
    @FXML
    private Button buton_AdaugareLocations;
    @FXML
    private TextField controllernamelocation;
    @FXML
    private TextField controllerphonenumber;
    @FXML
    private TextField controllercity;
    @FXML
    private TextField controlleradress;
    
    @FXML
    private Tab tab_AdaugareMovies;
    @FXML
    private Button buton_AdaugareMovies;
    @FXML
    private TextField controllernamemovie;
    @FXML
    private TextField controllerlength;
    @FXML
    private TextField controllerdirector;
    @FXML
    private TextField controllerrating;
    @FXML
    private TextField controllergenre;
    @FXML
    private TextField controllerlaunchdate;
    
    @FXML
    private Tab tab_AdaugareScreening;
    @FXML
    private Button buton_AdaugareScreening;
    @FXML
    private TextField controllerstarttime;
    @FXML
    private TextField controllerticketprice;
    @FXML
    private TextField controlleridmovie;
    @FXML
    private TextField controlleridlocation;
    
    @FXML
    private Tab tab_StergereTabela;
    @FXML
    private Button buton_StergereTabela;
    @FXML
    private TextField controllerTb1;
    @FXML
    private TextField controllerPK1;
    @FXML
    private TextField controllerID1;
    
    @FXML
    private Tab tab_ModificareTabela;
    @FXML
    private Button buton_ModificareTabela;
    @FXML
    private TextField controllerTb2;
    @FXML
    private TextField controllerPK2;
    @FXML
    private TextField controllerID2;
    @FXML
    private TextField controllerC1;
    @FXML
    private TextField controllerC2;
    @FXML
    private TextField controllerC3;
    @FXML
    private TextField controllerC4;
    @FXML
    private TextField controllerV1;
    @FXML
    private TextField controllerV2;
    @FXML
    private TextField controllerV3;
    @FXML
    private TextField controllerV4;
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        jb = new DBOperations();
    }    

    @FXML
    private void incarcaMovies(ActionEvent event) throws SQLException, Exception {
        jb.connect();
        dateMovies = FXCollections.observableArrayList();

        ResultSet rs = jb.vedeTabel("movies");
        while (rs.next()) {
            dateMovies.add(new Movie(rs.getInt("id_movie"), rs.getString("name"), rs.getTime("length"), rs.getString("director"),  rs.getString("rating"), rs.getString("genre"), rs.getDate("launch_date")));
        }

        atribut_id_movie.setCellValueFactory(new PropertyValueFactory<>("id_movie"));
        atribut_name_movie.setCellValueFactory(new PropertyValueFactory<>("name"));
        atribut_length.setCellValueFactory(new PropertyValueFactory<>("length"));
        atribut_director.setCellValueFactory(new PropertyValueFactory<>("director"));
        atribut_rating.setCellValueFactory(new PropertyValueFactory<>("rating"));
        atribut_genre.setCellValueFactory(new PropertyValueFactory<>("genre"));
        atribut_launch_date.setCellValueFactory(new PropertyValueFactory<>("launch_date"));
        
        tabela_Movies.setItems(null);
        tabela_Movies.setItems(dateMovies);
        jb.disconnect();
    }

    @FXML
    private void incarcaLocations(ActionEvent event) throws SQLException, Exception {
        jb.connect();
        dateLocations = FXCollections.observableArrayList();

        ResultSet rs = jb.vedeTabel("locations");
        while (rs.next()) {
            dateLocations.add(new Location(rs.getInt("id_location"), rs.getString("name"), rs.getString("phone_number"), rs.getString("city"), rs.getString("adress")));
        }

        atribut_id_location.setCellValueFactory(new PropertyValueFactory<>("id_location"));
        atribut_name_location.setCellValueFactory(new PropertyValueFactory<>("name"));
        atribut_phone_number.setCellValueFactory(new PropertyValueFactory<>("phone_number"));
        atribut_city.setCellValueFactory(new PropertyValueFactory<>("city"));
        atribut_adress.setCellValueFactory(new PropertyValueFactory<>("adress"));
        
        tabela_Locations.setItems(null);
        tabela_Locations.setItems(dateLocations);
        jb.disconnect();
    }
    @FXML
    private void incarcaScreenings(ActionEvent event) throws SQLException, Exception {
        jb.connect();
        dateScreenings = FXCollections.observableArrayList();

        ResultSet rs = jb.vedeTabel("screenings");
        while (rs.next()) {
            dateScreenings.add(new Screening(rs.getInt("id_screening"), rs.getString("start_time"), rs.getDouble("ticket_price"), rs.getInt("id_movie"), rs.getInt("id_location")));
        }
        
        atribut_id_screening.setCellValueFactory(new PropertyValueFactory<>("id_screening"));
        atribut_start_time.setCellValueFactory(new PropertyValueFactory<>("start_time"));
        atribut_ticket_price.setCellValueFactory(new PropertyValueFactory<>("ticket_price"));
        atribut_id_movie2.setCellValueFactory(new PropertyValueFactory<>("id_movie"));
        atribut_id_location2.setCellValueFactory(new PropertyValueFactory<>("id_location"));
        
        tabela_Screenings.setItems(null);
        tabela_Screenings.setItems(dateScreenings);
        jb.disconnect();
    }
    @FXML
    private void adaugaLocation(ActionEvent event)throws SQLException, Exception{
    	jb.connect();
    	
    	CharSequence nl=controllernamelocation.getCharacters();
    	CharSequence pn=controllerphonenumber.getCharacters();
    	CharSequence c=controllercity.getCharacters();
    	CharSequence a=controlleradress.getCharacters();
    	String nls=nl.toString();
    	String pns=pn.toString();
    	String cs=c.toString();
    	String as=a.toString();
    	
    	jb.adaugaLocation(nls, pns, cs, as);
    	jb.disconnect();
    }
    @FXML
    private void adaugaMovie(ActionEvent event)throws SQLException, Exception{
    	jb.connect();
    	
    	CharSequence nm=controllernamemovie.getCharacters();
    	CharSequence l=controllerlength.getCharacters();
    	CharSequence d=controllerdirector.getCharacters();
    	CharSequence r=controllerrating.getCharacters();
    	CharSequence g=controllergenre.getCharacters();
    	CharSequence ld=controllerlaunchdate.getCharacters();
    	String nms=nm.toString();
    	String ls=l.toString();
    	String ds=d.toString();
    	String rs=r.toString();
    	String gs=g.toString();
    	String lds=ld.toString();
    	Time lt =Time.valueOf(ls);
    	Date ldd =Date.valueOf(lds);


    	
    	jb.adaugaMovie(nms, lt, ds, rs, gs, ldd);
    	jb.disconnect();
    }
    @FXML
    private void adaugaScreening(ActionEvent event)throws SQLException, Exception{
    	jb.connect();
    	
    	CharSequence st=controllerstarttime.getCharacters();
    	CharSequence tp=controllerticketprice.getCharacters();
    	CharSequence im=controlleridmovie.getCharacters();
    	CharSequence il=controlleridlocation.getCharacters();
    	String sts=st.toString();
    	String tps=tp.toString();
    	String ims=im.toString();
    	String ils=il.toString();
    	int imi=Integer.parseInt(ims);
    	int ili=Integer.parseInt(ils);
    	Double tpd = Double.parseDouble(tps);
    	
    	jb.adaugaScreening(sts, tpd, imi, ili);
    	jb.disconnect();
    }
    @FXML
    private void stergereTabela(ActionEvent event)throws SQLException, Exception{
    	jb.connect();
    	
    	CharSequence tb=controllerTb1.getCharacters();
    	CharSequence pk=controllerPK1.getCharacters();
    	CharSequence id=controllerID1.getCharacters();
    	String tbs=tb.toString();
    	String pks=pk.toString();
    	String ids=id.toString();
    	int idi=Integer.parseInt(ids);

    	
    	jb.stergeTabela(tbs, pks, idi);
    	jb.disconnect();
    }

}