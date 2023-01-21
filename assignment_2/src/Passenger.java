public class Passenger {
    public String FullName;
    public boolean isStud;
    public int age;
    public Ticket ticket;

    public boolean isRet;

    public double balance;


    public Passenger() {
    }

    public Passenger(String FullName, boolean isStud, int age, Ticket ticket, boolean isRet, double balance) {
        this.FullName = FullName;
        this.isStud = isStud;
        this.age = age;
        this.ticket = ticket;
        this.isRet = isRet;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setRet(boolean ret) {
        isRet = ret;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public void setStud(boolean stud) {
        isStud = stud;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsStud(){
        return isStud;

    }
    public double getBalance() {
        return balance;
    }

    public boolean getIsRet() {
        return isRet;
    }

    public String getFullName() {
        return FullName;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void buyTicket(Ticket ticket) {
        double change;
        if (getBalance() >= ticket.price) {
            if(getIsRet() == true){
                change = getBalance() - ticket.price * 0.7;
                setBalance(change);
                setTicket(ticket);
            }
            if(getIsStud() ==  true){
                change = getBalance()- ticket.price*0.8;
                setBalance(change);
                setTicket(ticket);
            }
            if (getAge()<=7){
                change= getBalance()- ticket.price*0.1;
                setTicket(ticket);
                setBalance(change);
            }
            else{
                change = getBalance() - ticket.price;
                setBalance(change);
                setTicket(ticket);
            }
        } else {
            System.out.println("Sorry,You don't have enough money.");

        }

    }
    public void removeTicket(){
        setTicket(null);
    }

    public void sellTicket(Ticket ticket){
        if (ticket==getTicket()){
            setBalance(ticket.price+getBalance());
            removeTicket();
        }
    }

}