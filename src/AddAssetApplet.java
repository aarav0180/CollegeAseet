import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import models.Asset;

@SuppressWarnings("removal")
public class AddAssetApplet extends Applet {
    private TextField assetIDField, nameField, typeField, locationField, statusField, valueField, purchaseDateField;
    private Button addButton;

    @Override
    public void init() {
        setLayout(new GridLayout(8, 2));

        assetIDField = new TextField();
        nameField = new TextField();
        typeField = new TextField();
        locationField = new TextField();
        statusField = new TextField();
        valueField = new TextField();
        purchaseDateField = new TextField();

        add(new Label("Asset ID:"));
        add(assetIDField);
        add(new Label("Name:"));
        add(nameField);
        add(new Label("Type:"));
        add(typeField);
        add(new Label("Location:"));
        add(locationField);
        add(new Label("Status:"));
        add(statusField);
        add(new Label("Value:"));
        add(valueField);
        add(new Label("Purchase Date:"));
        add(purchaseDateField);

        addButton = new Button("Add Asset");
        addButton.addActionListener(e -> addAsset());

        add(new Label(""));
        add(addButton);
    }

    private void addAsset() {
        String assetID = assetIDField.getText();
        String name = nameField.getText();
        String type = typeField.getText();
        String location = locationField.getText();
        String status = statusField.getText();
        double value = Double.parseDouble(valueField.getText());
        String purchaseDate = purchaseDateField.getText();

        Asset newAsset = new Asset(assetID, name, type, location, status, value, purchaseDate);
        System.out.println("Asset added: " + newAsset);

        // Clear fields
        assetIDField.setText("");
        nameField.setText("");
        typeField.setText("");
        locationField.setText("");
        statusField.setText("");
        valueField.setText("");
        purchaseDateField.setText("");
    }
}
