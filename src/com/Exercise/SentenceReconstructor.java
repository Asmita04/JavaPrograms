package com.Exercise;
public class SentenceReconstructor {

    public static String reconstructSentence(String s) {
        // Split the shuffled sentence into individual words
        String[] words = s.split(" ");

        // Create an array to store the words based on their positions
        String[] originalWords = new String[words.length];

        // Extract the word position and word from each shuffled word
        for (String word : words) {
            int wordPosition = Integer.parseInt(word.substring(word.length() - 1));
            String wordText = word.substring(0, word.length() - 1);
            originalWords[wordPosition - 1] = wordText;
        }

        // Reconstruct the original sentence
        StringBuilder originalSentence = new StringBuilder();
        for (String word : originalWords) {
            originalSentence.append(word).append(" ");
        }

        return originalSentence.toString().trim();
    }

    public static void main(String[] args) {
        // Example usage:
        String shuffledSentence = "sentence4 a3 is2 This1";
        String originalSentence = reconstructSentence(shuffledSentence);
        System.out.println(originalSentence); // Output: "This is a sentence"
    }
}
