package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatbotViewer;

public class ChatController
{
	private Chatbot stupidBot;
	private ChatbotViewer display;
	
	public ChatController()
	{
		stupidBot = new Chatbot("AI");
		display = new ChatbotViewer();
	}
	
	public void start()
	{
		
		String response = "usera";
		
		while(stupidBot.lengthChecker(response))
		{
			
			response=display.collectResponse("what do you want to talk about???");
		}
	}
	
	private String useChatbotCheckers(String input)
	{
		String checkInput = "";
		if(stupidBot.memeChecker(input))
		{
			checkInput +="\nYou like memes!\n";
		}
		if(stupidBot.contentChecker(input))
		{
			checkInput += "\nYou know my secret topic!\n";
		}
		if(stupidBot.politicalTopicChecker(input))
		{
			checkInput += "\nYou like politics!\n";
		}
		if(checkInput.length() ==0)
		{
			checkInput += "I don't understand what you mean by " + input;
		}
		return checkInput;
	}
}