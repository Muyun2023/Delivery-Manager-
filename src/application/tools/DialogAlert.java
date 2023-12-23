package application.tools;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert.AlertType;

public class DialogAlert {
	
	public static boolean confirmDialog(String header, String content) {
		boolean[] isClickedOk = new boolean[] {false};
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setGraphic(new ImageView(new Image("file:images/confirm.png")));
		alert.setTitle("Confirmed");
		alert.setHeaderText(header);
		alert.setContentText(content);
		alert.showAndWait().filter(response->response==ButtonType.OK)
		.ifPresent(response->isClickedOk[0] = true);
		return isClickedOk[0];
	}
	
	public static void informationDialog(String header, String content) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setGraphic(new ImageView(new Image("file:images/message.png")));
		alert.setTitle("Message");
		alert.setHeaderText(header);
		alert.setContentText(content);
		alert.showAndWait();
	}
	
	public static void warningDialog(String header, String content) {
		Alert alert = new Alert(AlertType.WARNING);
		alert.setGraphic(new ImageView(new Image("file:images/warn.png")));
		alert.setTitle("WARNING");
		alert.setHeaderText(header);
		alert.setContentText(content);
		alert.showAndWait();
	}
	
	public static void errorDialog(String header, String content) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setGraphic(new ImageView(new Image("file:images/error.png")));
		alert.setTitle("ERROR");
		alert.setHeaderText(header);
		alert.setContentText(content);
		alert.showAndWait();
	}	
}
