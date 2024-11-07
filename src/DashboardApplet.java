import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

@SuppressWarnings("removal")
public class DashboardApplet extends Applet {
    @Override
    public void init() {
        setLayout(new GridLayout(2, 2, 10, 10));

        Button addAssetButton = new Button("Add Asset");
        Button requestAssetButton = new Button("Request Asset");
        Button approveRequestButton = new Button("Approve Requests");
        Button maintenanceButton = new Button("Maintenance");

        addAssetButton.addActionListener(e -> openApplet(new AddAssetApplet()));
        //requestAssetButton.addActionListener(e -> openApplet(new RequestAssetApplet()));
        //approveRequestButton.addActionListener(e -> openApplet(new ApproveRequestApplet()));
        //maintenanceButton.addActionListener(e -> openApplet(new MaintenanceApplet()));

        add(addAssetButton);
        add(requestAssetButton);
        add(approveRequestButton);
        add(maintenanceButton);
    }

    private void openApplet(Applet applet) {
        removeAll();
        add(applet);
        validate();
        applet.init();
    }
}

