package SOLID.SRP;

import SOLID.BeforeSOLID.Marker;

public class Invoice {
   Marker mark;
    int quantity;

       public Invoice(int q, Marker m)
       {
           this.mark =m;
           this.quantity=q;
       }

         public int CalculateBill()
         {
           return  mark.getPrice()  *this.quantity;
         }


}
