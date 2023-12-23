package application.recipient;

import application.model.Delivery;
import application.system.Controller;
import application.tools.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PackageStatusController extends Controller{
	
	@FXML
    private Button btnConfirm;

    @FXML
    private Button btnHome;

    @FXML
    private Label btnReplyMessage;

    @FXML
    private TextField trackingNumInput;
    
    @FXML
    private Button btnReturn;
    

    @FXML
    void ClickComfirm(ActionEvent event) {
    	String trackNum = trackingNumInput.getText();
    	Delivery delivery = Database.findDelivery(trackNum);
    	if (delivery == null ) {
    		btnReplyMessage.setText("Oops! Cannot find your package, please check tracking number.");	
    	}
    	else {
    		boolean signed = delivery.isSigned();
    		String status = delivery.getStatus();
    		if (signed) {
    			btnReplyMessage.setText("Your package has bees signed! If you have any problem, please click Confirm & Help.");
    		}
    		else {
    			btnReplyMessage.setText("Your package is on the way! Status is : " + status);	
    		}	
    	}
    }
    
    @Override
    @FXML
	public void btnReturnClick(ActionEvent event) throws Exception {
    	launchApp.showRecipientMainView();
    }
}
