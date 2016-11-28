package chat.model;

import java.util.ArrayList;

/**
 * Base version of the 2015 Chatbot class. Only stub methods are provided. Students will complete methods as part
 * of the project.
 * @author Cody Henrichsen
 * @version 1.0 10/14/15
 */
public class Chatbot
{
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private ArrayList<String> keyboardMashChecker;
	private ArrayList<String> inputHTMLChecker;
	private ArrayList<String> quitChecker;
	private String userName;
	private String content;
	
	
	
	/**
	 * Creates an instance of the Chatbot with the supplied username.
	 * @param userName The username for the chatbot.
	 */
	public Chatbot(String userName)
	{
		memesList = new ArrayList<String>();
		politicalTopicList = new ArrayList<String>();
		this.userName = new String(userName);
		this.content = "content";
		buildMemesList();
		buildPoliticalTopicsList();
		keyboardMashChecker();
		quitChecker();
		
		
	
		
	}
	
	private void buildMemesList()
	{
		memesList.add("doge");
		memesList.add("cute animals");
		memesList.add("grumpy cat");
		memesList.add("dat boi");
		memesList.add("willy wonka");
		memesList.add("haramble");
		memesList.add("john cena");
		memesList.add("yolo");
		memesList.add("fat cats");
		memesList.add("michael jordan");
		memesList.add("monkey");
		memesList.add("Dog");
		memesList.add("monster");
		memesList.add("nice car");
		memesList.add("plane");
		memesList.add("waterfall");
		memesList.add("basketball");
	}
	
	private void buildPoliticalTopicsList()
	{
		politicalTopicList.add("Demrocrat");
		politicalTopicList.add("Republican");
		politicalTopicList.add("11/8/16");
		politicalTopicList.add("conservative");
		politicalTopicList.add("Clinton");
		politicalTopicList.add("Trump");
		politicalTopicList.add("Kaine");
		politicalTopicList.add("Pence");
		politicalTopicList.add("Stein");
		politicalTopicList.add("Johnson");
		politicalTopicList.add("election");
		politicalTopicList.add("elephant");
		politicalTopicList.add("donkey");
		politicalTopicList.add("America");
		politicalTopicList.add("Capitalism");
		politicalTopicList.add("Democarcy");
		politicalTopicList.add("consitution");
		politicalTopicList.add("law enforcement");
	}
	
	private void keyboardMashChecker()
	{
		keyboardMashChecker.add("sdf");
		keyboardMashChecker.add("dfg");
		keyboardMashChecker.add("cvb");
		keyboardMashChecker.add(",./");
	}
	
	private void inputHTMLChecker()
	{
		inputHTMLChecker.add("<B> </B>");
		inputHTMLChecker.add("<I> </i>");
		inputHTMLChecker.add("<p>");
		inputHTMLChecker.add("> </a>");
	}
	
	private void quitChecker()
	{
		quitChecker.add("quit");
	}
	
	/**
	 * Checks the length of the supplied string. Returns false if the supplied String is empty or null,
	 * otherwise returns true. 
	 * @param currentInput
	 * @return A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLenght = false;
		
		if(currentInput != null && !currentInput.equals(""))
		{
			hasLenght = true;
		}
		
		return hasLenght;
	}
	
	/**
	 * Checks if the supplied String matches the content area for this Chatbot instance.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether it matches the content area.
	 */
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;
		String tempInput = currentInput.toLowerCase();
		if(tempInput.contains(content.toLowerCase()))
		{
			hasContent = true;
		}
		
		return hasContent;
	}
	
	/**
	 * Checks if supplied String matches ANY of the topics in the politicalTopicsList. Returns
	 * true if it does find a match and false if it does not match.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the String is contained in the ArrayList.
	 */
	public boolean politicalTopicChecker(String currentInput)
	{
		boolean isPolitical = false;
		for(String checkPolitical : politicalTopicList)
		{
			
		if(currentInput.equals(checkPolitical))
			{
				isPolitical = true;
			}
			
			
		}
		return isPolitical;
	}
	
	
	public boolean keyboardMashChecker(String currentInput)
	{
		boolean isKeyBoard = false;
		for(String keyboardMashChecker : keyboardMashChecker)
		{
			if(currentInput.equals(keyboardMashChecker))
			{
				isKeyBoard = true;
			}
			
		}
		return isKeyBoard;
	}
	
	public boolean inputHTMLChecker(String currentInput)
	{
		boolean hasHTML = false;
		for(String checkHTML : inputHTMLChecker)
		{
			if(currentInput.equals(checkHTML))
			{ 
				hasHTML = true;
			}
		}
		return hasHTML;
	}
	
	public boolean quitChecker(String currentInput)
	{
		boolean quitCheck = false;
		String quit = "quit";
		
		if  (currentInput.equals(quit))
		{
			quitCheck = true;
		}
		else
		{
			quitCheck = false;
		}
		return quitCheck;
	}
	
		
	
	
	/**
	 * Checks to see that the supplied String value is in the current memesList variable.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean isMemes = false;
		for(String checkMemes : memesList)
		{
			
		if(currentInput.equals(checkMemes))
			{
				isMemes = true;
			}
			
			
		}
		return isMemes;
	}
	
	/**
	 * Returns the username of this Chatbot instance.
	 * @return The username of the Chatbot.
	 */
	public String getUserName()
	{
		return userName;
	}
	
	/**
	 * Returns the content area for this Chatbot instance.
	 * @return The content area for this Chatbot instance.
	 */
	public String getContent()
	{
		
		
		return content;
	}
	
	/**
	 * Getter method for the memesList object.
	 * @return The reference to the meme list.
	 */
	public ArrayList<String> getMemesList()
	{
		return memesList;
	}
	
	/**
	 * Getter method for the politicalTopicList object.
	 * @return The reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList()
	{
		return memesList;
	}
	
	public ArrayList<String> getKeyboardMashChecker()
	{
		return keyboardMashChecker;
	}
	
	/**
	 * Updates the content area for this Chatbot instance.
	 * @param content The updated value for the content area.
	 */
	public void setContent(String content)
	{
		this.content = content;
	}
}
