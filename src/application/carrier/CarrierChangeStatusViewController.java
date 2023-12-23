package application.carrier;

import application.model.*;
import application.system.Controller;
import application.tools.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CarrierChangeStatusViewController extends Controller{
	
	ObservableList<String> choices = FXCollections.observableArrayList("Scan and scen to storage", "Ready to Delivery", "On the way", "Arrived"); 

	@FXML
    private Button btnHome;

    @FXML
    private Button btnReturn;
    
    @FXML
    private Button btnConfirm;

    @FXML
    private ChoiceBox<String> choiceStatus;

    @FXML
    private TextField trackNumInput;
    
    @FXML
    private Label statusInfo;
    
    
    @FXML
    public void initialize() {
    	choiceStatus.setItems(choices);
    }
    
    @Override
    @FXML
    public void btnReturnClick(ActionEvent event) throws Exception {
    	launchApp.showCarrierMainView();
    }
    
    @FXML
    void btnConfirmClick(ActionEvent event) {
    	String trscNum = trackNumInput.getText();
    	Delivery delivery = Database.findDelivery(trscNum);
    	if (delivery == null) {
    		statusInfo.setText("Wrong track number!");
    	}
    	else {
    		String choose = choiceStatus.getSelectionModel().getSelectedItem(); 
        	statusInfo.setText("Your choice is " + choose);
        	delivery.setStatus(choose);
    	}	
    }       
}




