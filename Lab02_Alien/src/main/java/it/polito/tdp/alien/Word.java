package it.polito.tdp.alien;

/**
 * Associazione parola aliena e originale 
 * @author HP
 *
 */
public class Word {

	private String alienWord; 
	private String translation;
	
	
	
	
	/** 
	 * @param alienWord parola aliena 
	 * @param translation corrispettiva traduzione in lingua non aliena 
	 */
	public Word(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		this.translation = translation;
	}


	


	public String getAlienWord() {
		return alienWord;
	}





	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}





	public String getTranslation() {
		return translation;
	}





	public void setTranslation(String translation) {
		this.translation = translation;
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
	
	
}
