package it.polito.tdp.alien.model;

import it.polito.tdp.alien.AlienDictionary;

public class Model {

	private AlienDictionary dizionario= new AlienDictionary(); 
	
	/**
	 * Aggiunta di parola con traduzione nel dizionario Alieno 
	 * @param alienWord parola in lingua aliena 
	 * @param translation traduzione in lingua originale della parola aliena 
	 */
	public void addToDictionary(String alienWord, String translation) {
		
		this.dizionario.addWord(alienWord, translation);
		
	}
	
	/**
	 * Traduzione della parola aliena
	 * @param alienWord parola aliena che si vuole tradurre
	 * @return la corrispettiva traduzione
	 */
	public String toTranslate(String alienWord) {
		
		return this.dizionario.translateWord(alienWord); 
		
	}
	
	/**
	 * Controllo validita' dell'input inserito
	 * ( in qst versione -> solo caratteri alfabetici sia minuscoli che maiuscoli
	 * @param input stringa da controllare 
	 * @return true se l'input e' valido 
	 *         flase se l'input non e' valido 
	 */
	public boolean valido(String input) {
		boolean ok= true; 
		for (int i=0; i<input.length(); i++) {
			if(!Character.isLetter(input.charAt(i))) {
				ok=false; 
				//basta trovarne uno che non sia lettera per uscire
				break; 
			}
			
	}
		return ok; 
	}
	
}
