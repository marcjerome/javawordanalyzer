package WordAnalyzer;

public class AnalyzeWord {

	static StringBuilder output = new StringBuilder();
	
	public static String analyze(String s, int option) {
		
		output.setLength(0); //a way to reset output. it prevents to continuously append text to iframe
		String word = new String(s.toLowerCase()); //makes sure comparison of strings would be in the same case
		
		if(option == 1) {
			checkPalindrome(word);
		}
		else if (option == 2) {
			checkHeterogram(word);
		}
		else if (option == 3) {
			checkIsogram2(word);
		}
		else if(option == 4) {
			checkAll(word);
		}

		return output.toString();
	}


	private static void checkAll(String word) {
		checkPalindrome(word);
		checkHeterogram(word);
		checkIsogram2(word);
	}
	
	
	//method that checks if each unique letter appears twice in the word
	private static  void checkIsogram2(String word) {
		int count = 0; //initialize to zero to match the index of character in string
		boolean isIsogram2 = true;
		
		//iterate to every index of word
		while (count < word.length()) {
			
			int index = count;
			//variable to store how many occurrences the character of a certain index appeared in the word
			long nOfOccurences = word.chars().filter(s -> s == word.charAt(index)).count(); 
			
			//check if the occurrence is two then increment count for the checking of next index
			if (nOfOccurences == 2) {
				count++;
			}
			else {
				isIsogram2 = false;
				break;
			}
		}
			
		if (!isIsogram2) {
			output.append("Is isogram2: " + isIsogram2 + "\n");
		}
		else {
			output.append("Is isogram2: " + isIsogram2 + "\n");
		}
	}
	
	//method that checks if each unique letter does not appear more than once
	private static  void checkHeterogram(String word) {
		int count = 0; //initialize to zero to match the index of character in string
		boolean isHeterogram = true;
		
		//iterate to every index of word
		while (count < word.length()) {
			
			int index = count;
			//variable to store how many occurrences the character of a certain index appeared in the word
			long nOfOccurences = word.chars().filter(s -> s == word.charAt(index)).count();
			
			//check the number of occurrences of the character
			//if number of occurrences is equal to one, it increments count for the checking of next index
			
			if (nOfOccurences != 1) {
				isHeterogram = false;
				break;
			}
			else {
				count++;
			}
		}
			
		if (!isHeterogram) {
			output.append("Is Heterogram: " + isHeterogram + "\n");
		}
		else {
			output.append("Is Heterogram: " + isHeterogram + "\n");
		}	
	}

	//method to check if the word is still the same when it's reversed
	private static void checkPalindrome(String word) {
		StringBuilder word2 = new StringBuilder(word);

		if(word.toString().equals(word2.reverse().toString())) {
			output.append("Palindrome: true \n");
		}
		else {
			output.append("Palindrome: false \n");
		}
		
	}

	
}
