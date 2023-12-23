package application.login;

import application.model.*;
import application.system.Controller;
import application.tools.DialogAlert;
import application.tools.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ForgetViewController extends Controller{
	@FXML
    private Button btnHome;

    @FXML
    private Button btnReturn;

    @FXML
    private Label txtPasswd;

    @FXML
    private TextField userNameInput;
    
    @FXML
    private Button btnFind;
    
    @FXML
    private Button btnReset;

    @Override
    @FXML
    public void btnReturnClick(ActionEvent event) throws Exception {
    	launchApp.showReciLoginView();
    }
    
    @FXML
    void btnFindClick(ActionEvent event) {
    	String userName = userNameInput.getText();
		if(userName == null) {
			DialogAlert.warningDialog("No username input", "Please enter your name");
		}else {
			Recipient recipient = Database.findRecipient(userName);
			Carrier carrier = Database.findCarrier(userName);
			if(recipient == null && carrier == null) {
				DialogAlert.warningDialog("No this user", "Please enter your name correctly");
			}else {
				String passwd = (recipient != null)? Database.getRecipientPasswd(recipient) : Database.getCarrierPasswd(carrier);
				txtPasswd.setText("Your password is " + passwd);
			}			
		}
    }
    
    @FXML
    void btnResetClick(ActionEvent event) {
    	
    }
}




