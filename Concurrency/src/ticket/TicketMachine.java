package pl.sda.ticket;

public class TicketMachine {

    private int amount = 0;

    private int ticketPrice;

    public TicketMachine(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public synchronized void printTicket() {

        while (amount < ticketPrice) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Drukuję bilet");

        if (amount > ticketPrice) {
            System.out.println("Reszta do wydania: " + (amount - ticketPrice));
        } else {
            System.out.println("Brak reszty do wydania");
        }

        amount = 0;
    }

    public synchronized void payment(int amount) {
        this.amount = this.amount + amount;

        System.out.println("Wpłacono: " + amount);

        if (ticketPrice > this.amount) {
            System.out.println("Pozostało do zapłaty: " + (ticketPrice - this.amount));
        }

        notify();
    }
}
