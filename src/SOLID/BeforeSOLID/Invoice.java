package SOLID.BeforeSOLID;

public class Invoice {
      public Marker mark;
      private int Quantity;

      public Invoice(Marker m,int Q)
      {
          this.mark=m;
          this.Quantity=Q;
      }

        public void saveToDB()
        {
            //To save DB
        }
        public void printInvoice()
        {
            // To Print Invoice
        }
        public int calculateTotal()
        {
            int total = mark.Price + this.Quantity;
            return  total;
        }
}
