package it.polito.tdp.alien;


import java.util.LinkedList;
import java.util.List;


public class AlienDictionary {

	private List<WordEnhanced> dictionary; 
	
	
	public AlienDictionary() {
		this.dictionary= new LinkedList<WordEnhanced>(); 
	}


    /**
     * Agguinta di parola in lingua aliena con corrispondente traduzione nel dizionario
     * @param alienWord parola in lingua aliena 
     * @param translation corrispettiva traduzione in lingua originale
     */
	public void addWord(String alienWord, String translation) {
		
		for (WordEnhanced w: dictionary) {
			if (w.getAlienWord().compareTo(alienWord)==0) {
				// parola aliena gia' presente nel dizionario
				// aggiunge una traduzione per essa
				w.addTraduzione(translation);
				return; 
				}
			}
		
		
		// la parola non e' presente nel dizionario 
		WordEnhanced parola= new WordEnhanced(alienWord); 
		parola.addTraduzione(translation);
		this.dictionary.add(parola); 
		
		
	}
	
	/**
	 * Traduzione di parola aliena 
	 * @param alienWord parola aliena che si vuole tradurre
	 * @return traduzione corrispondente 
	 */
	public String translateWord(String alienWord) {
		
		String traduzione=null; 
		
		for (WordEnhanced w : dictionary) {
			if (w.getAlienWord().compareTo(alienWord)==0) {
				// la parola c'e' ne visualizzo tutte le traduzioni
				traduzione= w.toString(); 
			}
		}
		
		return traduzione; 
	}
}
