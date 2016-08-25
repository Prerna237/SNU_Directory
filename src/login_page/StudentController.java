/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_page;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
//import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;

/**
 * FXML Controller class
 *
 * @author Pranjal Mathur
 */
public class StudentController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Label name;
    @FXML
    private Label snu_id;
    @FXML
    private Label dob;
    @FXML
    private Label branch;
    @FXML
    private Label address;
    @FXML
    private Label cgpa;
    @FXML
    private Tab yourinfo;
     @FXML
    private Label phn;
    
   

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        try {
            Class.forName("java.sql.DriverManager");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project_dbms",
                    "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Statement stmt = null;

        try {
            stmt = (Statement) con.createStatement();

        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        int count = 0;
        int r = FXMLDocumentController.r;
        String query = "SELECT students.SNU_ID, students.NAME, students.DOB, students.HOSTEL,students.BRANCH,students.ADDRESS, students.CGPA FROM students WHERE SNU_ID='" + r + "';";

        ResultSet rs = null;

        try {
            rs = stmt.executeQuery(query);

        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            while (rs.next()) {

                count++;
                String nam = rs.getString("NAME");
                int ids = rs.getInt("SNU_ID");
                String hos = rs.getString("HOSTEL");
                String dat = rs.getString("DOB");
                String bra = rs.getString("BRANCH");
                String add = rs.getString("ADDRESS");
                int cgp = rs.getInt("CGPA");
                String m = Integer.toString(ids);
                snu_id.setText(m);
                name.setText(nam);
                dob.setText(dat);
                branch.setText(bra);
                address.setText(add);
                cgpa.setText(Integer.toString(cgp));

            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Class.forName("java.sql.DriverManager");

            Connection con1 = null;

            con1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project_dbms",
                    "root", "");

            Statement stmt1 = null;

            stmt1 = (Statement) con1.createStatement();

        
        int count1 = 0;

        String query1 = "SELECT PH_NUMBER FROM student_phone WHERE SNU_ID='" + r + "';";

        ResultSet rs1 = null;

       
            rs1 = stmt1.executeQuery(query1);

        

            while (rs1.next()) {

                count1++;
                //BigDecimal q=rs1.getBigDecimal("ph_number");
                String q = rs1.getString("ph_number");
               
               phn.setText(phn.getText()+" "+q);

            }
        }
         catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
