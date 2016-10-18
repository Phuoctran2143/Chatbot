package chat.view;

import javax.swing.JOptionPane;

public class ChatbotViewer
{

	public String collectResponse(String question)
	{
		String response = "";
		
		response = JOptionPane.showInputDialog(null,question);
		
		return response;
	}
	
	public void displaymessage(String message)
}
