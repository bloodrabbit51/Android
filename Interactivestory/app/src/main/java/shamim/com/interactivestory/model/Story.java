package shamim.com.interactivestory.model;

import shamim.com.interactivestory.R;

/**
 * Created by shamim on 12/1/2015.
 */
public class Story {
    private Page[] mPages;

    public Story(){
        mPages = new Page[7];

        mPages[0] = new Page(R.mipmap.b,"On %1$s, your return trip from studying saturn rings, you hear a distress signal",
                            new Choice("Stop and investigate",1),
                            new Choice("Continue home to Earth",2));

        mPages[1] = new Page(R.mipmap.a,"this is page 1",new Choice("go to page 3",3),new Choice("go to page 4",4));
        mPages[2] = new Page(R.mipmap.b,"this is page 2",new Choice("go to page 4",4),new Choice("go to page 6",6));
        mPages[3] = new Page(R.mipmap.c,"this is page 3",new Choice("go to page 4",4),new Choice("go to page 5",5));
        mPages[4] = new Page(R.mipmap.a,"this is page 4",new Choice("go to page 5",5),new Choice("go to page 6",6));
        mPages[5] = new Page(R.mipmap.b,"this is page 5");
        mPages[6] = new Page(R.mipmap.c,"this is page 6");
    }

    public Page getPage(int pageNumber){
        return mPages[pageNumber];
    }
}



