public class LineItem {



    public static String getLineItem1() {
        String lineItem1 = "\nToaster \t\t\t ";
        lineItem1 +=  Main.getItem1Spinner() +"\t " + " $29.95\t " + "$" + Double.parseDouble(Main.getItem1Spinner().toString()) * 29.95;
        return lineItem1;
    }

    public static String getLineItem2() {
        String lineItem2 = "\nHair Dryer \t\t\t ";
        lineItem2 +=  Main.getItem2Spinner() +"\t " + " $24.95\t " + "$" + Double.parseDouble(Main.getItem2Spinner().toString()) * 24.95;
        return lineItem2;
    }

    public static String getLineItem3() {
        String lineItem3 = "\nCar Vacuum \t\t\t ";
        lineItem3 +=  Main.getItem3Spinner() +"\t " + " $19.99\t " + "$" + Double.parseDouble(Main.getItem3Spinner().toString()) * 19.99;
        return lineItem3;
    }

    public static double getLineItemTotal() {
        return (Double.parseDouble(Main.getItem1Spinner().toString()) * 29.95) + (Double.parseDouble(Main.getItem2Spinner().toString()) * 24.95) + (Double.parseDouble(Main.getItem3Spinner().toString()) * 19.99);
    }


}
