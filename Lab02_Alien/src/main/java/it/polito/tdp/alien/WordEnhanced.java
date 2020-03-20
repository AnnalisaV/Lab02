package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

/**
 * Associazione parola aliena e originale 
 * @author HP
 *
 */
public class WordEnhanced {

	private String alienWord; 
	//private String translation;
	
	private List<String> traduzioni;
	
	/*
	/** 
	 * @param alienWord parola aliena 
	 * @param translation corrispettiva traduzione in lingua non aliena 
	 */
	/*public WordEnhanced(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		//this.translation = translation;
		
		this.traduzioni= new LinkedList<String>(); 
	}
*/

	public WordEnhanced(String alienWord) {
		this.alienWord= alienWord; 
		this.traduzioni= new LinkedList<String>(); 
	}



	public String getAlienWord() {
		return alienWord;
	}





	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}





	/*public String getTranslation() {
		return translation;
	}*/





	/*public void setTranslation(String translation) {
		this.translation = translation;
	}*/





	public List<String> getTraduzioni() {
		return traduzioni;
	}


	public void addWord(String s) {
		
		for (String ss : this.traduzioni) {
			// se la stringa di traduzione non e' gia' presente fra le traduzioni, 
			//allora viene aggiunta
			if (ss.compareTo(s) !=0) {
				traduzioni.add(s);
			}
		}
		
	}



	/**
	 * Considerate uguali quando la aprola aliena e' la stessa
	 */
	@Override
	public boolean equals(Object obj) {
		String parola= (String) obj;
		
		if (this.alienWord.compareTo(parola) ==0)
			return true; 
		return false;
	}




   /**
    * Come si presenta questa parola 
    * @return elenco delle traduzioni associate a quella parola
    */
	@Override
	public String toString() {
		String s=""; 
		for (String ss : this.traduzioni) {
			s+=ss+"\n"; 
		}
		return s; 
	} 
	
	
	
}
