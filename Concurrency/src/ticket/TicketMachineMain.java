package pl.sda.ticket;

public class TicketMachineMain {

    public static void main(String[] args) {

        TicketMachine ticketMachine = new TicketMachine(4);

        TicketPrinterThread ticketPrinter = new TicketPrinterThread(ticketMachine);
        ticketPrinter.start();

        TicketPaymentThread ticketPayment1 = new TicketPaymentThread(ticketMachine, 1);


        TicketPaymentThread ticketPayment2 = new TicketPaymentThread(ticketMachine, 1);


        TicketPaymentThread ticketPayment3 = new TicketPaymentThread(ticketMachine, 3);


        ticketPayment1.start();
        ticketPayment2.start();
        ticketPayment3.start();


    }

}
