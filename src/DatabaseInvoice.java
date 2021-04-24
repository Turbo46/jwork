import java.util.ArrayList;

public class DatabaseInvoice {
    private static ArrayList<Jobseeker> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getDatabaseInvoice() {
        return INVOICE_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Invoice getInvoiceById(int id) {
        Invoice temp = null;
        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (id == INVOICE_DATABASE.get(i).getId()) {
                temp = INVOICE_DATABASE.get(i);
            }
        }
        return temp;
    }
    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerId) {
            ArrayList<Invoice> temp = new ArrayList<Invoice>();
            for (Invoice invoice : INVOICE_DATABASE) {
                if (jobseekerId == invoice.getJobseeker().getId()) {
                    temp.add(invoice);
                } else {
                    return null;
                }
            }
            return temp;
        }
    }
    public static boolean addInvoice(Invoice invoice) {
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;

        }
    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus)
    {
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getInvoiceStatus() == InvoiceStatus.OnGoing) {
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }
}
