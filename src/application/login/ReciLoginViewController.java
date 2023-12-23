package application.login;

import application.system.Controller;
import application.tools.Database;
import application.tools.*;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;

public class ReciLoginViewController extends Controller{

	@FXML
    private Button btnForget;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnRegist;

    @FXML
    private Button btnReturn;

    @FXML
    private Label errorInfoLabel;

    @FXML
    private TextField passwdInput;

    @FXML
    private TextField userNameInput;
    
    @FXML
    void ClickForget(ActionEvent event) throws Exception {
    	launchApp.showForgetView();
    }

    @FXML
    void ClickLogin(ActionEvent event) throws Exception {
    	String userName = userNameInput.getText();
		String password = passwdInput.getText();
		
		if (Database.checkRecipientValid(userName, password)) {
			DialogAlert.informationDialog("Success Login", "Loading Recipient Main");
			launchApp.showRecipientMainView();
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

    @FXML
    void ClickRegist(ActionEvent event) throws Exception {
    	launchApp.showRegistView();
    }

    @FXML
    void ClickHome(ActionEvent event) throws Exception {
    	launchApp.showMainView();
    }
    
    @Override
    @FXML
    public void btnReturnClick(ActionEvent event) throws Exception {
    	launchApp.showMainView();
    }
}




