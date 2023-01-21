import java.util.ArrayList;

public class Kupe extends Wagon{
    public ArrayList<Passenger> passengers;
    public Kupe(){}

    public Kupe(int seats, int id, double capacity){
        super(seats,id,capacity);
        passengers = new ArrayList<>();

    }
}
