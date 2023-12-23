package application.recipient;


import application.system.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PreferenceController extends Controller{
	
    @FXML
    private Button btnConfirm;

    @FXML
    private Button btnHome;

    @FXML
    private Label btnMessage;

    @FXML
    private Button btnReturn;
    

    @FXML
    void btnHome(ActionEvent event) throws Exception {
    	launchApp.showMainView();
	}
    
    @Override
    @FXML
    public void btnReturnClick(ActionEvent event) throws Exception {
    	launchApp.showRecipientMainView();
	}

    @FXML
    void btnConfirmClick(ActionEvent event) throws Exception {
    	btnMessage.setText("Set Successfully");
	}
}


