package ca.ualberta.cs.lonelytweet;

import java.util.Date;

public class ImportantLonelyTweet extends LonleyTweet {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.textzzz = text;
	}

	//if statment simplified
	@Override
	public boolean isValid() {
		return !(textzzz.trim().length() == 0
				|| textzzz.trim().length() > 20);
	}

	@Override
	public String toString() {
		//removed redundant variables
		return getTweetDate() + " | " + getTextzzz();
	}
	//made private
	private String getTextzzz() {
        return textzzz.toUpperCase();
    }
}