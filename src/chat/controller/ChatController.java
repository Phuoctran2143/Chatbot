package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatFrame;
import chat.view.ChatbotViewer;

public class ChatController
{
	private Chatbot stupidBot;
	private ChatbotViewer display;
	private ChatFrame baseFrame; 
	private String randomTopicGenerator;
	
	public ChatController()
	{
		stupidBot = new Chatbot("AI");
		display = new ChatbotViewer();
		baseFrame = new ChatFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private String useChatbotCheckers(String input)
	{
		String checkInput = "";
		if(!stupidBot.quitChecker(input))
		{
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
			checkInput += "\nWhat do you think about politics!\n";
		}
		if(checkInput.length() ==0)
		{
			checkInput += "I don't understand what you mean by " + input;
		}
		if(stupidBot.keyboardMashChecker(input))
		{
			checkInput +="\nStop keyboard mashing!\n";
		}
		if(stupidBot.inputHTMLChecker(input))
		{
			checkInput +="\nWe cannot do that!\n";
		}
		if(stupidBot.quitChecker(input))
		{
			checkInput += "\n";
		}
		
		int canBeRandom = (int) (Math.random() * 2);
		if (canBeRandom % 2 == 0)
		{
			checkInput += randomTopicGenerator();
		}

		}
		else
		{
			display.displaymessage(("thanks for Chatting! talk toyou soon"));
			System.exit(0);
		}
			return checkInput;
	}
	
	public ChatFrame getBaseFrame()
	{
		return baseFrame;
	}
	
	public Chatbot getChatbot()
	{
		return stupidBot;
	}
	
	private String randomTopicGenerator()
	{
		String randomTopic = "";
		int random = (int) (Math.random() * 7);
		
		switch (random)
		{
		case 0:
			randomTopic = "howdy";
			break;
		case 1:
			randomTopic = "YOYO";
			break;
		case 2:
			randomTopic = "sports";
			break;
		case 3: 
			randomTopic = "life";
			break;
		case 4:
			randomTopic = "climate change";
			break;
		case 5: 
			randomTopic = "asdfghjk";
			break;
		}
	return randomTopicGenerator;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
