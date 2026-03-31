package clases.clase25032026;

public class DemoMinibus {
    static void main() {
        Minibus minibus=new Minibus(" AJ4536",24);
        Minibus minibus2=new Minibus("GZ9812",20);
        System.out.println("Patente:"+minibus.getLicensePlate()+" Número de asientos ocupados: "+minibus.getOccupiedSeatsNumber()+" Estado: "+minibus.getState());
        System.out.println("Patente:"+minibus2.getLicensePlate()+" Número de asientos ocupados: "+minibus2.getOccupiedSeatsNumber()+" Estado: "+minibus2.getState());
        System.out.println("Valor ticket:"+Minibus.getTicketValue());
        System.out.println("SUBIMOS 10 PASAJER0S AL BUS DE PATENTE:"+minibus.getLicensePlate());
        minibus.takeState(10);
        Minibus.setTicketValue(480);
        System.out.println("CAMBIAMOS EL VALOR DEL TICKET A $"+Minibus.getTicketValue());
        minibus2.takeState(5);
        System.out.println("SUBIMOS 5 PASAJEROS AL BUS DE PATENTE:"+minibus2.getLicensePlate());
        System.out.println("NUMERO DE PASAJEROS DEL BUS DE PATENTE"+minibus2.getOccupiedSeatsNumber()+" : "+minibus2.getOccupiedSeatsNumber());
        System.out.println("BAJAN 3 PASAJEROS EN EL BUS DE PATENTE:"+minibus.getLicensePlate());
        minibus.releaseSeats(3);
        System.out.println("Asientos ocupados del bus "+minibus2.getLicensePlate()+":"+minibus2.getOccupiedSeatsNumber());
        System.out.println("CAMBIAMOS EL ESTADO DEL BUS:"+minibus2.getLicensePlate());
        minibus2.setState(State.DECOMMISSIONED);
        System.out.println("Patente:"+minibus.getLicensePlate()+" Asientos Ocupados:"+minibus.getOccupiedSeatsNumber()+" Estado: "+minibus.getState()+" ASIENTOS DESOCUPADOS:"+minibus.getSeatsNumber());
        System.out.println("Patente:"+minibus2.getLicensePlate()+" Asientos Ocupados:"+minibus2.getOccupiedSeatsNumber()+" Estado: "+minibus2.getState()+" ASIENTOS DESOCUPADOS:"+minibus2.getSeatsNumber());
        System.out.println("Valor del pasaje:$ "+Minibus.getTicketValue());
    }
}
