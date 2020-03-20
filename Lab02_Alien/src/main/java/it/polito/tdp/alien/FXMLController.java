package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Model model; 
	
	public void setModel(Model model) {
    	this.model= model; 
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtTesto;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtRisultato;

    @FXML
    private Button btnClear;

    @FXML
    void doReset(ActionEvent event) {
    	
    	txtTesto.clear();
    	txtRisultato.clear();

    }

    @FXML
    void doTranslate(ActionEvent event) {

    	// controllo input 
    	boolean valido= model.valido(txtTesto.getText().replaceAll(" ","")); 
    	if (valido!=true) {
    		// input non valido
    		txtRisultato.appendText("ATTENZIONE Caratteri non ammessi!\n");
    		return; 
    	}
    	
    	
    	
    	// suddivido le parole quando c'e' " " (avendo prima convertito tutto in minuscolo)
    	String[] arrayParola= txtTesto.getText().toLowerCase().trim().split(" "); 
    	
    	if (arrayParola.length==1) {
    		// ho una parola da tradurre 
    		
    	
    		String translation=model.toTranslate(arrayParola[0]); 
    		
    		if (translation!=  null)
    		txtRisultato.appendText(translation+"\n");
    		else txtRisultato.appendText("Parola inesistente nel dizionario\n");
    		
    		}
    	else if(arrayParola.length==2) {
    		// ho una parola con la traduzione 
    		
    		model.addToDictionary(arrayParola[0], arrayParola[1]); 
    		txtRisultato.appendText("Aggiunta al dizionario \n");
    	}
    }

    @FXML
    void initialize() {
        assert txtTesto != null : "fx:id=\"txtTesto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisultato != null : "fx:id=\"txtRisultato\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
