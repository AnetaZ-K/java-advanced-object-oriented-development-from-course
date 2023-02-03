package pl.sda.ticket;

public class TicketPaymentThread extends Thread {

    private TicketMachine ticketMachine;

    private int amount;

    public TicketPaymentThread(TicketMachine ticketMachine, int amount) {
        this.ticketMachine = ticketMachine;
        this.amount = amount;
    }

    @Override
    public void run() {
        ticketMachine.payment(this.amount);
    }
}
