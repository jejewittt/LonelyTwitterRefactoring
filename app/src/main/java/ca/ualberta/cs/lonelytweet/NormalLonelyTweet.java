package ca.ualberta.cs.lonelytweet;

import java.util.Date;

public class NormalLonelyTweet extends LonleyTweet {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.textzzz = text;
	}

	@Override
	public boolean isValid() {
		if (textzzz.trim().length() == 0
				|| textzzz.trim().length() > 10) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTextzzz() ;
	}

	String getTextzzz() {
        return textzzz;
    }
}