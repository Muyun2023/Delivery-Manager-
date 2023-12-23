package application.recipient;

import application.system.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class RecipientMainViewController extends Controller{

	@FXML
    private Button btnConfirm;

    @FXML
    private Button btnPreference;

    @FXML
    private Button btnRate;

    @FXML
    private Button btnStatus;
    
    @FXML
    private Button btnHome;
    
    @FXML
    private Button btnReturn;
    
    @FXML
    void btnConfirmClick(ActionEvent event) throws Exception {
    	launchApp.showReply();
    }

    @FXML
    void btnPreferenceClick(ActionEvent event) throws Exception {
    	launchApp.showPreference();
    }

    @FXML
    void btnRateClick(ActionEvent event) throws Exception {
    	launchApp.showRate();
    }

    @FXML
    void btnStatusClick(ActionEvent event) throws Exception {
    	launchApp.showPackageStatus();
    }

	@Override
	public void btnReturnClick(ActionEvent event) throws Exception {
		launchApp.showReciLoginView();
	}

}





