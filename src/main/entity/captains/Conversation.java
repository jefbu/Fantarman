package main.entity.captains;

import java.io.Serializable;

public class Conversation implements Serializable {

	private static final long serialVersionUID = 1L;

	public Captain owner;
	public Captain partner;
	public String[] texts;
	public boolean[] ownVoice;
	
	public boolean alreadyDone;
	
	public Conversation(Captain owner, Captain partner, String[] texts, boolean[] ownVoice) {
		
		this.owner = owner;
		this.partner = partner;
		this.texts = texts;
		this.ownVoice = ownVoice;
		
		alreadyDone = false;
	}

}
