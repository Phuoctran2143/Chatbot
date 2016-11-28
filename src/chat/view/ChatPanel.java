package chat.view;

import java.awt.Color;

import javax.swing.*;
import chat.controller.ChatController;


public class ChatPanel extends JPanel 
{
	private ChatController baseController;
	private SpringLayout baseLayout;
	private JTextArea chatDisplay;
	private JTextField chatField;
	private JButton chatButton;
	private Color green;
	
	
	public ChatPanel(ChatController baseController)
	{
		super();
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		chatDisplay = new JTextArea(5,25);
		chatField = new JTextField(25);
		chatButton = new JButton("Chat with the bot");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupChatDisplay()
	{
		chatDisplay.setEditable(false);
		chatDisplay.setEnabled(false);
		chatDisplay.setWrapStyleWord(true);
		chatDisplay.setLineWrap(true);
	}
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(green);
		this.add(chatButton);
		this.add(chatDisplay);
	
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		
	}
}

