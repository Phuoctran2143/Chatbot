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
		
		String response = "words";
		
		while(stupidBot.lengthChecker(response))
		{
			
			response=display.collectResponse("what do you want to talk about???");
		}
	}
}