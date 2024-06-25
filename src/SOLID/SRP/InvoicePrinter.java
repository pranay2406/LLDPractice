package SOLID.SRP;

public class InvoicePrinter {
      Invoice invoice;

         InvoicePrinter(Invoice i)
         {
             this.invoice=i;
         }

        public void printInvoice()
         {
             System.out.println("Invoice of Marker is: "+ invoice.quantity);
         }
}
