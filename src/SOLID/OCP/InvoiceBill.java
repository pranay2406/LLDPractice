package SOLID.OCP;

import SOLID.BeforeSOLID.Marker;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InvoiceBill
{
     Marker marker;
     int quantity;

       public int invoiceAmount()
        {
            return marker.getPrice() * this.quantity;
        }
}
