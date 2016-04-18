package shamim.com.interactivestory.model;

/**
 * Created by shamim on 12/1/2015.
 */
public class Choice {
    private String mText;
    private int mNextpage;

    public Choice(String text,int nextpage)
    {
        mText = text;
        mNextpage = nextpage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextpage() {
        return mNextpage;
    }

    public void setNextpage(int nextpage) {
        mNextpage = nextpage;
    }
}
