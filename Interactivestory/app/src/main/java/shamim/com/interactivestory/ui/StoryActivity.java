package shamim.com.interactivestory.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import shamim.com.interactivestory.R;
import shamim.com.interactivestory.model.Page;
import shamim.com.interactivestory.model.Story;

public class StoryActivity extends AppCompatActivity {

    public static final String TAG = StoryActivity.class.getSimpleName();

    private Story mStory = new Story();
    private ImageView mImageView;
    private TextView mTextView;
    private Button mChoice1;
    private Button mChoice2;
    private String mName;
    private Page mCurrentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));


        if (mName==null){
            mName = name;
        }

        Log.d(TAG, mName);

        mImageView=(ImageView)findViewById(R.id.storyImageView);
        mTextView=(TextView)findViewById(R.id.storyTextView);
        mChoice1=(Button)findViewById(R.id.choiceButton1);
        mChoice2=(Button)findViewById(R.id.choiceButton2);

        loadpage(0);

    }

    private void loadpage(int choice){
        mCurrentPage = mStory.getPage(choice);

        Drawable drawable=getResources().getDrawable(mCurrentPage.getImageID());
        mImageView.setImageDrawable(drawable);

        String pageText= mCurrentPage.getText();
        //THis will add if placeholder is included. Won't add if no placeholder

        pageText=String.format(pageText,mName);
        mTextView.setText(pageText);

        if(mCurrentPage.isFinal()){
            mChoice1.setVisibility(View.INVISIBLE);
            mChoice2.setText("Play Again");

            mChoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }

        else {
            mChoice1.setText(mCurrentPage.getChoice1().getText());
            mChoice2.setText(mCurrentPage.getChoice2().getText());

            mChoice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = mCurrentPage.getChoice1().getNextpage();
                    loadpage(nextPage);
                }
            });

            mChoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = mCurrentPage.getChoice2().getNextpage();
                    loadpage(nextPage);
                }
            });
        }
    }
}
