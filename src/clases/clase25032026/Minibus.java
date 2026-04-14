package clases.clase25032026;

public class Minibus {
    private String licensePlate;
    private int seatsNumber;
    private int occupiedSeatsNumber;
    private State state;
    private  static int ticketValue=500;
    public Minibus(String licensePlate, int seatsNumber) {
        this.licensePlate = licensePlate;
        this.seatsNumber = seatsNumber;
        occupiedSeatsNumber=0;
        this.state=State.IN_SERVICE;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getOccupiedSeatsNumber() {
        return occupiedSeatsNumber;
    }

    public State getState() {
        return state;
    }
    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setState(State state) {
       if(state==State.IN_MAINTENANCE|| state==State.DECOMMISSIONED){
           occupiedSeatsNumber=0;
       }
       this.state = state;
    }
    public boolean takeState(int seats) {
        if (state==State.IN_SERVICE) {
            if(occupiedSeatsNumber<=seats && occupiedSeatsNumber<=seatsNumber) {
                occupiedSeatsNumber+=seats;
                seatsNumber-=seats;
                return true;
            }
        }
        return false;
    }
    public boolean releaseSeats(int seats) {
        if (state==State.IN_SERVICE) {
            if(occupiedSeatsNumber>=seats) {
                occupiedSeatsNumber-=seats;
                seatsNumber+=seats;
                return true;
            }
        }
        return false;
    }
    public static int getTicketValue() {
        return ticketValue;
    }
    public static void setTicketValue(int ticketValue) {
    }
}