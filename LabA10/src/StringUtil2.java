/**
 * 
 * Last name: Prabhdeep
 * First name: Kainth
 * Student ID: 12089162 
 * Period: 4
 *
 */
/** Write a one sentence summary about your class
 */
public class StringUtil2 
{	//Declare instance variables here	
	
	/**
	 * Method reverses a string
	 * @param str string to reverse
	 * @return reversed string
	 */
	public static String reverse(String str)
	{
		//Your code goes here
		if(str.length() == 1) {
			return str;
		}
		
		return reverse(str.substring(1)) + str.charAt(0);
	}
	
	
	
	/**
	 * Method determines if string is a palindrome
	 * @param str string to test
	 * @return true/false whether string is palindrome
	 */
	public static boolean palindrome(String str)
	{
		//Your code goes here
		String pal = palString(str).toLowerCase();
		String reverse = reverse(pal);
		
		return pal.equals(reverse);		
		
	}
	
	
	/**
	 * Method converts string into shorthand
	 * @param s string to be converted
	 * @return shorthand version of string
	 */
	public static String shorthand(String s)
	{
		//Your code goes here
		String postStr = change(s, "AND", "&");
		postStr = change(postStr, "TO", "2");
		postStr = change(postStr, "YOU", "u");
		postStr = change(postStr, "FOR", "4");
		postStr = change(postStr, "a", "");
		postStr = change(postStr, "e", "");
		postStr = change(postStr, "i", "");
		postStr = change(postStr, "o", "");
		postStr = change(postStr, "u", "");
		
		return postStr;
	}
	
	/**
	 * Method eliminates non alpha-numeric characters from string to create input
	 * @param str string to be evaluated
	 * @return cleaned string
	 */
	private static String palString(String str) {
		
		if (str.length() == 0) {
			return str;
		}
		
		String goodStr = str.substring(0, 1);  
		char testGood = str.charAt(0);
		
		if(!((('A' <= testGood) && (testGood <= 'Z')) ||
				(('a' <= testGood) && (testGood <= 'z')) ||
				(('0' <= testGood) && (testGood <= '9')))) {
			goodStr = "";
		}
		
		return goodStr + palString(str.substring(1));
	}
	
	/**
	 * Method changes keywords to shortened versions
	 * @param original original string
	 * @param look word to look
	 * @param change word to change
	 * @return changed string
	 */
	private static String change(String original, String look, String change) {
		
		String capsOrig = original.toUpperCase();
		
		String capsLook = look.toUpperCase();
		int index = capsOrig.indexOf(capsLook);

		if(index < 0) {
			return original;
		}

		String preString = original.substring(0, index);
		String postString = original.substring(index + look.length());
		
		return preString + change + change(postString, look, change);
	}


	  /** 
	  * Converts a string to it piglatin form according to the following rules:
	  * a. If there are no vowels in englishWord, then pigLatinWord is just
	  * englishWord + "ay". (There are ten vowels: 'a', 'e', 'i', 'o',
	  * and 'u', and their uppercase counterparts.)
	  * b. Else, if englishWord begins with a vowel, then pigLatinWord is just
	  * englishWord + "yay".
	  * c. Otherwise (if englishWord has a vowel in it and yet doesn't start
	  * with a vowel), then pigLatinWord is end + start + "ay", where end
	  * and start are defined as follows:
	  * 1. Let start be all of englishWord up to (but not including) its
	  * first vowel.
	  * 2. Let end be all of englishWord from its first vowel on.
	  * 3. But, if englishWord is capitalized, then capitalize end and
	  * "uncapitalize" start.
	  *
	  * @param text text to be converted to piglatin
	  * @return piglatin version of text as a String 
	  */
	  public static String phraseToPigLatin(String text) 
	  {
		  int finalPos = text.length();
		  int spacePos = text.indexOf(" ");
		  int commaPos = text.indexOf(",");
		  int periodPos = text.indexOf(".");
		  int exclamationPos = text.indexOf("!");
		 
		  
		  if(commaPos >= 0) {
			  finalPos = Math.min(finalPos, commaPos);
		  }
		  
		  if(spacePos >= 0) {
			  finalPos = Math.min(finalPos, spacePos);
		  }
		
		  if(periodPos >= 0) {
			  finalPos = Math.min(finalPos, periodPos);
		  }
		  
		  if(exclamationPos >= 0) {
			  finalPos = Math.min(finalPos, exclamationPos);
		  }
		  
		  if (finalPos == text.length() ) {
			  return pigLatinWord(text);
		  }
		  
		
		  
		  String word = text.substring(0, finalPos);
		  String wordAtFinalPos = text.substring(finalPos, finalPos + 1);
		  
		  return pigLatinWord(word) + wordAtFinalPos + phraseToPigLatin(text.substring(finalPos + 1));
		  		  
	  }
	  
	  /**
	   * Method takes individual word and converts to piglatin
	   * @param word word to be converted
	   * @return converted word
	   */
	  private static String pigLatinWord(String word) {
		  if(word.length() == 0) {
			  return word;
		  }
		  int firstVowelPos = firstVowel(word);
		  //System.out.println(firstVowelPos);
		  if(firstVowelPos == -1) {
			  
				  return word + "ay";
			  
		  } else if(firstVowelPos == 0) {
			  return word + "yay";
		  } else {
			 return pigStartEnd(word) + "ay";
		  }
	  }
	  
	  /**
	   * Method returns index of the first vowel
	   * @param word word to evaluate
	   * @return index of the first vowel
	   */
	  private static int firstVowel(String word) {
		  
		  int firstVowel = word.length();
		  
		  
		  firstVowel = firstVowelHelper(word, "a", firstVowel);
		  firstVowel = firstVowelHelper(word, "e", firstVowel);
		  firstVowel = firstVowelHelper(word, "i", firstVowel);
		  firstVowel = firstVowelHelper(word, "o", firstVowel);
		  firstVowel = firstVowelHelper(word, "u", firstVowel);
		  
		  if(firstVowel == word.length()) {
			  return -1;
		  } else {
			  return firstVowel;
		  }
	  }
	  
	  /**
	   * Method finds the index of the given vowel and compares with original index
	   * @param word word to be evaluates
	   * @param vowel vowel to be searched 
	   * @param original original index
	   * @return index of the vowel that occurs first
	   */
	  private static int firstVowelHelper(String word, String vowel, int original) {
		  String temp = word.toLowerCase();
		  int firstVowelTest = temp.indexOf(vowel);
		  if(firstVowelTest >= 0) {
			  return Math.min(original, firstVowelTest);
		  } else {
			  return original;
		  }
		  
	  }
	  
	  /**
	   * Method converts word that does not start with a vowel into a piglatin word
	   * @param word word to be converted
	   * @return piglatin word
	   */
	  private static String pigStartEnd(String word) {
		  int first = firstVowel(word);
		  String start = word.substring(0, first);
		  String end = word.substring(first);
		  char firstLetter = word.charAt(0);
		  
		  if(firstLetter >= 'A' && firstLetter <= 'Z') {
			  start = start.substring(0, 1).toLowerCase() + start.substring(1);
			  end = end.substring(0, 1).toUpperCase() + end.substring(1);
		  }
		  
		  return end + start;
	  }
	  
	  
	  
	
}