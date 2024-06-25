package SOLID.OCP;



public class FileSaveDao implements InvoiceDAO{

    @Override
    public void save(InvoiceBill ib) {
        System.out.println("Save to file");
    }
}
