/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_page;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Pranjal Mathur
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private TextField Username;
    @FXML
    private PasswordField Password;
    
    static int r;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
//        String nameuser = Username.getText().trim();
//        String password = Password.getText().trim();
//
//        Class.forName("java.sql.DriverManager");
//        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project_dbms",
//                "root","");
//        Statement stmt = (Statement) con.createStatement();
//
//        String query = "SELECT Username, Password, Type,ID FROM login WHERE Username='" + nameuser + "';";
//        ResultSet rs = stmt.executeQuery(query);
//        int count = 0;
//        while (rs.next()) {
//            count++;
//            String name = rs.getString("Username");
//
//            String passw = rs.getString("Password");
//            String type = rs.getString("Type");
//            if (passw.equals(Password.getText())) {
//                
//                r=rs.getInt("ID");
//                
//                if (type.equals("Faculty")){ 
//                    Parent home_page_parent = FXMLLoader.load(getClass().getResource("Faculty.fxml"));
//                
//                    Scene home_page_scene = new Scene(home_page_parent);
//                    Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//                    app_stage.hide();
//                    app_stage.setScene(home_page_scene);
//                    app_stage.show();
//                }
//                 else if (type.equals("Student")){ 
                    Parent home_page_parent = FXMLLoader.load(getClass().getResource("Student.fxml"));
                
                    Scene home_page_scene = new Scene(home_page_parent);
                    Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    app_stage.hide();
                    app_stage.setScene(home_page_scene);
                    app_stage.show();
//                }
//                 else if(type.equals("Parent")){ 
//                    Parent home_page_parent = FXMLLoader.load(getClass().getResource("Parents.fxml"));
//                
//                    Scene home_page_scene = new Scene(home_page_parent);
//                    Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//                    app_stage.hide();
//                    app_stage.setScene(home_page_scene);
//                    app_stage.show();
//                }
//                 else{
//                      label.setText("Incorrect Credentials!");
//                      Password.setText("");
//                      Username.setText("");
//                 }
                  
                
           // }
        }

           
//}

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
