package chat.model;

import java.util.ArrayList;
/**
 * 
 * @author Phuoc Tran
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
	 * Creates an instance of the Chatbot with the supplied username.
	 * @param userName The username for the chatbot.
	 */
	public Chatbot(String userName)
	{
		memesList = new ArrayList<String>();
		politicalTopicList = new ArrayList<String>();
		this.userName = new String(userName);
		this.content = "content";
//		buildMemesList();
//		buildPoliticalTopicsList();

		
		
	
		
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
		boolean htmlChecker = false;
		
		int open = currentInput.indexOf("<");
		int close = currentInput.indexOf(">");
		if (open == -1 || close == -1)
		{
			return htmlChecker;
		}
		String tag = currentInput.substring(open +1, close);
		int hasTag = currentInput.indexOf("<"+tag+">");
		int secondOpen = currentInput.indexOf("</");
		int secondClose = currentInput.indexOf(">", secondOpen);
		String tag2 = currentInput.substring(secondOpen +2, secondClose);
		int hasTag2 = currentInput.indexOf("</"+tag2+">");
		
		int hrefTag = currentInput.indexOf("=\"");
		int closeHREFTag= currentInput.indexOf("\"", hrefTag);
		
		if (open == -1 && close == -1)
		{
			htmlChecker = false;
		}
	
		else if (currentInput.contains("< >") || currentInput.contains("<>"))
		{
			htmlChecker = false;
		}
		
		else if (currentInput.equals("<P>"))
		{
			htmlChecker = true;
		}
		
		else if (hasTag2 == -1)
		{
			htmlChecker = false;
		}
		
		else if (tag.equalsIgnoreCase(tag2))
		{
			htmlChecker = true;
		}
		
		else if (hrefTag != -1 && currentInput.substring(open +1, hrefTag ).equals("A HREF") && closeHREFTag != -1 )
		{
			htmlChecker = true;
		}
		
		
		return htmlChecker;
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
	
	public boolean twitterChecker(String currentInput)
	{
		boolean twitterChecker = false;
		int hashtagIndex = -99;
		int userIndex = -99;
		
		hashtagIndex = currentInput.indexOf("#");
		userIndex = currentInput.indexOf("@");
		
		if (userIndex == -1 && hashtagIndex == -1)
		{
			twitterChecker = false;
		}
		else
		{
			if (!currentInput.substring(hashtagIndex +1, hashtagIndex +2).equals(" ") || !currentInput.substring(userIndex +1, userIndex +2).equals(" "))
			{
				twitterChecker = true;
			}
		}
	
		
		return twitterChecker;
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
