public class Ticket {
    public String direction;
    public double price;

    public int id;
    public int seat;

    public Ticket(){
    }
    public Ticket(String direction, double price, int id, int seat){
        this.direction = direction;
        this.price = price;
        this.id = id;
        this.seat = seat;
    }


    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public int getSeat() {
        return seat;
    }


    public String getDirection() {
        return direction;
    }
}
