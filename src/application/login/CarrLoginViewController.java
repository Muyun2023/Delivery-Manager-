package application.login;

import application.system.Controller;
import application.tools.*;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;

public class CarrLoginViewController extends Controller{

	@FXML
    private Button btnCarriRegister;

    @FXML
    private Button btnForget;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnReturn;

    @FXML
    private TextField passwdInput;

    @FXML
    private TextField userNameInput;
    
    @FXML
    private Label errorInfoLabel;
    
    @FXML
    void btnCarriRegisterClick(ActionEvent event) throws Exception {
    	launchApp.showRegistView();
    }

    @FXML
    void btnForgetClick(ActionEvent event) throws Exception {
    	launchApp.showForgetView();
    }

    @FXML
    void btnLoginClick(ActionEvent event) throws Exception {
    	String userName = userNameInput.getText();
		String password = passwdInput.getText();
		
		if (Database.checkCarrierValid(userName, password)) {
			DialogAlert.informationDialog("Success Login", "Loading Carrier Main");
			launchApp.showCarrierMainView();
		}
		else {
			errorInfoLabel.setText("Incorrect username or password");
			userNameInput.clear();
			passwdInput.clear();
			FadeTransition ft = new FadeTransition();
			ft.setDuration(Duration.seconds(0.1));
			ft.setNode(launchApp.getScene().getRoot());
			ft.setFromValue(0);
			ft.setToValue(1);
			ft.play();
		}
    }

    @Override
    @FXML
    public void btnReturnClick(ActionEvent event) throws Exception {
    	launchApp.showMainView();
    }
}




