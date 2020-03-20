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
	private List<String> translations; //lista di traduzione per la alien word
	
	
	
	/** 
	 * @param alienWord parola aliena 
	 */
	public WordEnhanced(String alienWord) {
		super();
		this.alienWord = alienWord;
       this.translations = new LinkedList<String>();
	
	}



	public String getAlienWord() {
		return alienWord;
	}

    public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

    public List getTranslations() {
		return translations;
	}

    /**
     * inserimento di nuova traduzione per la parola aliena 
     */
    public void addTraduzione(String translation) {
    	int uguali=0; // quante parole sono come quella passata 
    	for (String s : translations) {
    		if(s.compareTo(translation)==0) {
    			uguali++; // vi e' gia' quella traduzione quindi incremento il conto
    			}
    		}
    	// solo se quella traduzione non e' ancora presente, al aggiungo alla lista
    	if (uguali ==0)
    		translations.add(translation); 
    }


    



	@Override
	public String toString() {
		String ss=""; 
		for (String s : translations) {
			ss+=s+"\n"; 
		}
		return ss; 
	}



	/**
	 * Considerate uguali quando la parola aliena e' la stessa
	 */
	@Override
	public boolean equals(Object obj) {
		String parola= (String) obj;
		
		if (this.alienWord.compareTo(parola) ==0)
			return true; 
		return false;
	}


	
	
}
