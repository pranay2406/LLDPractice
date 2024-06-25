package SOLID.OCP;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InvoicePrinter
{
       InvoiceBill ib;

       public void printInvoice()
       {
           System.out.println("Bill Amount is :"+ ib.invoiceAmount());
       }

}
