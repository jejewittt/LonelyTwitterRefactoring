package ca.ualberta.cs.lonelytweet;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by jejewitt on 3/15/18.
 */

public abstract class LonleyTweet implements Serializable {
    private static final long serialVersionUID = 1L;     //made private

    Date tweetDate;
    String textzzz;

    Date getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    public void setTextzzz(String textzzz) {
        this.textzzz = textzzz;
    }

    //made private
    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(tweetDate);
        out.writeObject(textzzz);
    }

    //made private
    private void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        tweetDate = (Date) in.readObject();
        textzzz = (String) in.readObject();
    }

    public abstract boolean isValid();
}
