package shamim.com.interactivestory.model;

/**
 * Created by shamim on 12/1/2015.
 */
public class Page {
    private int mImageid;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal = false;

    public Page(int imageid,String text,Choice choice1,Choice choice2){
        mImageid = imageid;
        mText = text;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setIsFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

    public Page(int imageid, String text)
    {
        mImageid=imageid;
        mText= text;
        mChoice1=null;
        mChoice2=null;
        mIsFinal=true;

    }

    public int getImageID(){
        return mImageid;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public void setImageid(int id){
        mImageid = id;
    }
}
