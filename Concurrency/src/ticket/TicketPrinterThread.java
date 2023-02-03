package pl.sda.ticket;

public class TicketPrinterThread extends Thread {

    private TicketMachine ticketMachine;

    public TicketPrinterThread(TicketMachine ticketMachine) {
        this.ticketMachine = ticketMachine;
    }

    @Override
    public void run() {
        ticketMachine.printTicket();
    }
}
