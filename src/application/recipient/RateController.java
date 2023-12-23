package application.recipient;

import application.system.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RateController extends Controller {
    @FXML
    private Button btnLoginOut;

    @FXML
    private Button btnReturn;

    @FXML
    private Button btnSubmit;
    
    @FXML
    private Label btnMessage;
    
    @FXML
	protected void btnLoginOutClick(ActionEvent event) throws Exception {
    	launchApp.showMainView();
    }
    
    @Override
    @FXML
    public void btnReturnClick(ActionEvent event) throws Exception {
    	launchApp.showRecipientMainView();
	}
    
    @FXML
    void btnSubmitClick(ActionEvent event) {
    	btnMessage.setText("Thank You !");
	}

}
