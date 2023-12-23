package application.carrier;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import application.system.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;

public class CarrierArrivedViewController extends Controller {
	
	@FXML
    private Button btnHome;

    @FXML
    private Button btnReturn;
    
    @FXML
    private Button btnNotify;

    @FXML
    private ImageView imageView;
    
    @FXML
    private Label notiInfo;

    @Override
    @FXML
    public void btnReturnClick(ActionEvent event) throws Exception {
    	launchApp.showCarrierMainView();
    }

    @FXML
    void handleDragOver(DragEvent event) {
    	if (event.getDragboard().hasFiles()) {
            event.acceptTransferModes(TransferMode.ANY); 
         }
         event.consume();
    }
    
    @FXML
    void handleDrop(DragEvent event) throws FileNotFoundException {
    	List<File> files = event.getDragboard().getFiles();
    	imageView.setImage(new Image(new FileInputStream(files.get(0))));	
    }
    
    @FXML
    void btnNotifyClick(ActionEvent event) {
    	notiInfo.setText("Notification has been sent to Recipient!");
    }

}
