import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private static JTextField nameField;
    private static JTextField streetField;
    private static JTextField cityField;
    private static JTextField stateField;
    private static JTextField zipField;
    private static JSpinner item1Spinner;
    private static JSpinner item2Spinner;
    private static JSpinner item3Spinner;

    //Getters

    public static Object getNameField() {
        return nameField.getText();
    }

    public static Object getStreetField() {
        return streetField.getText();
    }

    public static Object getCityField() {
        return cityField.getText();
    }

    public static Object getStateField() {
        return stateField.getText();
    }

    public static Object getZipField() {
        return zipField.getText();
    }

    public static Object getItem1Spinner() {
        return item1Spinner.getValue();
    }

    public static Object getItem2Spinner() {
        return item2Spinner.getValue();
    }

    public static Object getItem3Spinner() {
        return item3Spinner.getValue();
    }

    public Main() {
        super("Shopping List");

        // Create a panel for the customer info
        JPanel customerPanel = new JPanel(new GridLayout(5, 2));
        JLabel nameLabel = new JLabel("Name:");
        JLabel streetLabel = new JLabel("Street:");
        JLabel cityLabel = new JLabel("City:");
        JLabel stateLabel = new JLabel("State:");
        JLabel zipLabel = new JLabel("Zip:");
        nameField = new JTextField(20);
        streetField = new JTextField(20);
        cityField = new JTextField(20);
        stateField = new JTextField(20);
        zipField = new JTextField(20);
        customerPanel.add(nameLabel);
        customerPanel.add(nameField);
        customerPanel.add(streetLabel);
        customerPanel.add(streetField);
        customerPanel.add(cityLabel);
        customerPanel.add(cityField);
        customerPanel.add(stateLabel);
        customerPanel.add(stateField);
        customerPanel.add(zipLabel);
        customerPanel.add(zipField);

        // Create a panel for the shopping list items
        JPanel itemListPanel = new JPanel(new GridLayout(3, 2));
        JLabel item1Label = new JLabel("Toaster $29.95");
        JLabel item2Label = new JLabel("Hair Dryer $24.95");
        JLabel item3Label = new JLabel("Car Vacuum $19.99");
        item1Spinner = new JSpinner();
        item2Spinner = new JSpinner();
        item3Spinner = new JSpinner();
        itemListPanel.add(item1Label);
        itemListPanel.add(item1Spinner);
        itemListPanel.add(item2Label);
        itemListPanel.add(item2Spinner);
        itemListPanel.add(item3Label);
        itemListPanel.add(item3Spinner);

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton clearButton = new JButton("Clear");
        JButton orderButton = new JButton("Order");
        JButton quitButton = new JButton("Quit");
        buttonPanel.add(clearButton);
        buttonPanel.add(orderButton);
        buttonPanel.add(quitButton);

        // Add action listener to the quit button
        quitButton.addActionListener(e -> System.exit(0));
        orderButton.addActionListener(e -> Invoice.createInvoice(getItem1Spinner(), getItem2Spinner(), getItem3Spinner()));

        // Add the panels to the main frame
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(customerPanel, BorderLayout.NORTH);
        getContentPane().add(itemListPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        // Set the size and location
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Main shoppingListGUI = new Main();
        shoppingListGUI.setVisible(true);
    }
}
