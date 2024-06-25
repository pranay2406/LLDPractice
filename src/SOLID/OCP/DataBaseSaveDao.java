package SOLID.OCP;

public class DataBaseSaveDao implements InvoiceDAO {
    @Override
    public void save(InvoiceBill ib) {
        System.out.println("Save to DB");
    }
}
