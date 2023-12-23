package application.carrier;

import application.system.*;
import application.tools.Database;
import application.tools.DialogAlert;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CarrierAddPacViewController extends Controller{
	
	@FXML
    private Button btnConfirm;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnReturn;

    @FXML
    private TextField recipientNameInput;

    @FXML
    private TextField trackNumInput;
    
    @FXML
    void btnConfirmClick(ActionEvent event) throws Exception {
    	System.out.println("Handle Carrier Scan Package Action");
    	String recipientName = recipientNameInput.getText();
		String trackNum = trackNumInput.getText();
		if (recipientName != null && trackNum != null) {
			Database.addDeliveries(trackNum, recipientName);
			boolean isContinue = DialogAlert.confirmDialog("Success Scanned", "Press OK to continue scan, press Cancel to return");
			if(isContinue) {
				launchApp.showCarrierAddPacView();
			}else {
				launchApp.showCarrierMainView();
			}
		}
		else {
			DialogAlert.errorDialog("Fail Scanned", "Please enter all fields");
		}
    }

    @Override
    @FXML
	public void btnReturnClick(ActionEvent event) throws Exception {
    	launchApp.showCarrierMainView();
    }
    
}

