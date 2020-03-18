package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.List;

public class AlienDictionary {

	private List<Word> dictionary; 
	
	
	public AlienDictionary() {
		this.dictionary= new ArrayList<Word>(); 
	}


    /**
     * Agguinta di parola in lingua aliena con corrispondente traduzione nel dizionario
     * @param alienWord parola in lingua aliena 
     * @param translation corrispettiva traduzione in lingua originale
     */
	public void addWord(String alienWord, String translation) {
		
		Word parola= new Word(alienWord, translation); 
		
		for (Word w : dictionary) {
			if (w.getAlienWord().compareTo(parola.getAlienWord())==0) {
				// parola aliena gia' presente nel dizionario
				w.setTranslation(parola.getTranslation());
				return; 
			}
		}
		
		this.dictionary.add(parola); 
		
	}
	
	/**
	 * Traduzione di parola aliena 
	 * @param alienWord parola aliena che si vuole tradurre
	 * @return traduzione corrispondente 
	 */
	public String translateWord(String alienWord) {
		
		String traduzione=null; 
		
		for (Word w : dictionary) {
			if (w.getAlienWord().compareTo(alienWord)==0) {
				traduzione= w.getTranslation(); 
				
			}
		}
		
		return traduzione; 
	}
}
