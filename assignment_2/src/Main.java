import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Ticket> tickets = new ArrayList<>();
        ArrayList<Passenger> passengers = new ArrayList<>();
        ArrayList<Wagon> wagons = new ArrayList<>();
        System.out.println("Menu: Choose one section below: ");
        System.out.println("1. Buy ticket ");
        System.out.println("2. Sell ticket ");
        System.out.println("3. Add Passenger ");
        System.out.println("4. Add Wagon ");
        System.out.println("0. Exit ");
        int command = sc.nextInt();
        while(command != 0) {
            switch (command) {
                case 1:
                    System.out.println("Select passenger (Name)");
                    String name = sc.next();
                    for (int i = 0; i < passengers.size(); i++) {
                        if (name.equals(passengers.get(i).getFullName())) {
                            System.out.print("Choose wanted wagon");
                            for (int j = 0; j < wagons.size(); j++) {
                                System.out.println(wagons.get(j).getId() + " ");
                            }
                            int waid = sc.nextInt();
                            for (int j = 0; j < wagons.size(); j++) {
                                if (waid == wagons.get(j).getId()) {
                                    Wagon selectedWagon = wagons.get(j);
                                    System.out.print("Choose wanted seat: ");
                                    for (int l = 0; l < selectedWagon.getSeats(); l++) {
                                        System.out.print(l + " ");
                                    }
                                    int seat = sc.nextInt();
                                    for (int l = 0; l < selectedWagon.getSeats(); l++) {
                                        if (seat == l) {
                                            System.out.println("Ticket price: ");
                                            double price = sc.nextDouble();
                                            System.out.print("Ticket date: ");
                                            String date = sc.next();
                                            System.out.print("Ticket ID: ");
                                            int tiid = sc.nextInt();
                                            System.out.println("Select direction: ");
                                            String direction = sc.next();
                                            Ticket ticket = new Ticket(direction, price, tiid, seat);
                                            passengers.get(i).buyTicket(ticket);
                                            passengers.get(i).setTicket(ticket);
                                            tickets.add(ticket);
                                        }
                                    }
                                }
                            }
                        }
                    }

                    break;
                case 2:
                    System.out.println("Are u sure? ");
                    String answer = sc.next();
                    if (answer.equals("yes")) {
                        for (int i = 0; i < passengers.size(); i++) {
                            String name1 = sc.next();
                            if (name1.equals(passengers.get(i).getFullName())) {
                                passengers.get(i).sellTicket(passengers.get(i).getTicket());
                                tickets.remove(passengers.get(i).getTicket());
                            }
                        }
                    }
                    break;

                case 3:
                    Passenger Erlan = new Passenger();
                    System.out.println("Enter Name: ");
                    String Name = sc.next();
                    Erlan.setFullName(Name);
                    System.out.println("Are u student? ");
                    boolean isStud = sc.nextBoolean();
                    Erlan.setStud(isStud);
                    System.out.println("Are u Ret? ");
                    boolean isRet = sc.nextBoolean();
                    Erlan.setRet(isRet);
                    System.out.println("How old are u? ");
                    int age = sc.nextInt();
                    Erlan.setAge(age);
                    System.out.println("How much money u have? ");
                    double balance = sc.nextDouble();
                    Erlan.setBalance(balance);
                    passengers.add(Erlan);
                    break;

                case 4:
                    Wagon wagon;
                    System.out.print("Choose wagon ID: ");
                    int waID = sc.nextInt();
                    System.out.println();
                    System.out.print("Choose max count of seats: ");
                    int seats = sc.nextInt();
                    System.out.println("Choose capacity:");
                    int capacity = sc.nextInt();
                    System.out.println("1. Luxe ");
                    System.out.println("2. Kupe ");
                    System.out.println("3. Platscart ");
                    System.out.println("4. WagonRet ");
                    System.out.println("5. RestourantWagon ");
                    int choice = sc.nextInt();
                    if (choice == 1) {
                        wagon = new Luxe(seats, waID, capacity);
                    }
                    if (choice == 2) {
                        wagon = new Kupe(seats, waID, capacity);
                    }
                    if (choice == 3) {
                        wagon = new Platscart(seats, waID, capacity);
                    }
                    if (choice == 4) {
                        wagon = new WagonRet(seats, waID, capacity);
                    }
                    if (choice == 5) {
                        wagon = new RestourantWagon(seats, waID, capacity);
                    }
                    break;


                default:
                    System.out.println("Error");
        }
            System.out.println("Menu: Choose one section below: ");
            System.out.println("1. Buy ticket ");
            System.out.println("2. Sell ticket ");
            System.out.println("3. Add Passenger ");
            System.out.println("4. Add Wagon ");
            System.out.println("0. Exit ");
            command = sc.nextInt();
        }
    }
    }