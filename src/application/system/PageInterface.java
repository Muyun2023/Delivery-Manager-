package application.system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public interface PageInterface {
	
	@FXML
	void btnReturnClick(ActionEvent event) throws Exception;

	@FXML
	void btnHomeClick(ActionEvent event) throws Exception;

}
