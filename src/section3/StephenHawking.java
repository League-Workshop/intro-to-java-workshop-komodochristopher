package section3;

public class StephenHawking {

	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {

		// 4. Use a for loop to repeat steps #2 and #3, a lot of times

		// 2. ask the user for a sentence

		// 3. call the speak method below and send it the sentence
		speak("that's all folks");
	}

	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
