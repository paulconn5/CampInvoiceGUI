import java.util.Objects;

public class Invoice {
    public static void createInvoice(Object q1, Object q2, Object q3) {
        String rString = "\n\n\n\n------------------------------------------\n" + "\t\t\t\tINVOICE\n\n" + Customer.getCustomer() + "\n\n" +
        "Item \t\t\t Qty\t Price\t Total\n";

        rString += "------------------------------------------";

        if (!Objects.equals(q1.toString(), "0")) {
            rString += LineItem.getLineItem1();
        }

        if (!Objects.equals(q2.toString(), "0")) {
            rString += LineItem.getLineItem2();
        }

        if (!Objects.equals(q3.toString(), "0")) {
            rString += LineItem.getLineItem3();
        }

        rString += "\n------------------------------------------";
        rString += "\nAMOUNT DUE: $" + (LineItem.getLineItemTotal()*1000)/1000;

        System.out.println(rString);

    }
}