import java.util.ArrayList;

public class JDBC {

    public static void main(String []args){
        Airport airport = new Airport(6,"Vilniaus oro uostas", "Naujininkai", "Vilnius");
        AirportDAO.create(airport);
        //ArrayList<Airport> airports = AirportDAO.searchByName("Kauno oro uostas");
        //System.out.println(airports);
        //AirportDAO.updateById(airport);
        //AirportDAO.deleteById(7);
        AirportDAO.pullOutAllList();
        //AirportDAO.dropTable();
        //AirportDAO.createTable();
    }
}
