/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.evenement;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author manaa
 */
public class QRcodeController implements Initializable {

    @FXML
    private ImageView qrimage;
    public static int x;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       Image img = null ;
       File image = new File ("/home/ahmed/PiDev/E-lMadrsa-Web/public/uploads/images/");
        
               img = new Image(image.toURI().toString()+"eve"+x+".jpg");
                qrimage.setImage(img);
        
// TODO
    }    

    public void  setQR(int id) {
      this.x=id;
    }
    
}