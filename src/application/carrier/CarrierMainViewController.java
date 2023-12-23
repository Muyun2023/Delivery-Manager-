package application.carrier;

import application.system.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CarrierMainViewController extends Controller{

    @FXML
    private Button btnHome;

    @FXML
    private Button btnPackageArrived;

    @FXML
    private Button btnPackageStatus;

    @FXML
    private Button btnReturn;

    @FXML
    private Button btnScanPackage;

    @FXML
    void btnNotifyReciClick(ActionEvent event) {

    }

    @FXML
    void btnPackageArrivedClick(ActionEvent event) throws Exception {
    	launchApp.showCarrierArrivedView();
    }

    @FXML
    void btnPackageStatusClick(ActionEvent event) throws Exception {
    	launchApp.showCarrierChangeStatusView();
    }

    @Override
    @FXML
    public void btnReturnClick(ActionEvent event) throws Exception {
    	launchApp.showCarrLoginView();
    }

    @FXML
    void btnScanPackageClick(ActionEvent event) throws Exception {
    	launchApp.showCarrierAddPacView();
    }

}





