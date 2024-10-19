package code_alpha;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chatbox {
    private Map<String, String> responses;

    // Initialize the chatbot with some basic responses
    public Chatbox() {
        responses = new HashMap<>();
        responses.put("hello", "Hi there! How can I help you today?");
        responses.put("how are you", "I'm an AI, so I don't have feelings, but thanks for asking! How about you?");
        responses.put("bye", "Goodbye! Have a great day!");
        responses.put("help", "I'm here to assist you. Ask me anything!");
    }

    // Method to get a response based on user input
    public String getResponse(String input) {
        String normalizedInput = input.toLowerCase().trim();
        if (responses.containsKey(normalizedInput)) {
            return responses.get(normalizedInput);
        }
        return "I'm not sure how to respond to that. Can you rephrase?";
    }

    // Main method for running the chatbox
    public static void main(String[] args) {
        Chatbox chatbox = new Chatbox();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hello! Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("Chatbox: " + chatbox.getResponse("bye"));
                break;
            }

            String response = chatbox.getResponse(userInput);
            System.out.println("Chatbox: " + response);
        }

        scanner.close();
    }
}
