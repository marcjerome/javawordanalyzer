package WordAnalyzer;

public class analyzeWord {

StringBuilder output = new StringBuilder();
	
	public analyzeWord(String word, int option) {
		try {
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
			
		}
		
		catch(Exception e) {
			output.append(e.toString());
		}
	}

	private void checkAll(String word) {
		checkPalindrome(word);
		checkHeterogram(word);
		checkIsogram2(word);
	}
	
	private  void checkIsogram2(String word) {
		int count = 0;
		boolean flag = true;
		while (count < word.length()) {
			int index = count;
			long nOfOccurences = word.chars().filter(s -> s == word.charAt(index)).count();
			if (nOfOccurences == 2) {
				count++;
			}
			else {
				flag = false;
				break;
			}
		}
			
		if (flag == false) {
			output.append("Is isogram2: false \n");
		}
		else {
			output.append("Is isogram2: true \n");
		}
	}

	private  void checkHeterogram(String word) {
		int count = 0;
		boolean flag = true;
		while (count < word.length()) {
			int index = count;
			long nOfOccurences = word.chars().filter(s -> s == word.charAt(index)).count();
			if (nOfOccurences != 1) {
				flag = false;
				break;
			}
			else {
				count++;
			}
		}
			
		if (flag == false) {
			output.append("Is Heterogram: false \n");
		}
		else {
			output.append("Is Heterogram: true \n");
		}	
	}

	private void checkPalindrome(String word) {
		StringBuilder word2 = new StringBuilder(word);

		if(word.toString().equals(word2.reverse().toString())) {
			output.append("Palindrome: true \n");
		}
		else {
			output.append("Palindrome: false \n");
		}
		
	}

	public String toString() {
		return output.toString();
	}
	
	
	
}
