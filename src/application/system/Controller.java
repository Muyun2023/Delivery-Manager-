package application.system;

import application.LaunchAPP;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public abstract class Controller implements PageInterface{
	
	protected LaunchAPP launchApp;

	public LaunchAPP getLaunchApp() {
		return launchApp;
	}

	public void setLaunchApp(LaunchAPP launchApp) {
		this.launchApp = launchApp;
	}
	
	@Override
	@FXML
	public void btnHomeClick(ActionEvent event) throws Exception {
    	launchApp.showMainView();
    }
	
	@Override
	@FXML
	public abstract void btnReturnClick(ActionEvent event) throws Exception;
}
