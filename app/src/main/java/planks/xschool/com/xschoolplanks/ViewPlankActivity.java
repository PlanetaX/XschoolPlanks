package planks.xschool.com.xschoolplanks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ViewPlankActivity extends AppCompatActivity {

    StoriesProgressView storiesProgressView;
    ImageView ImageView;

    int counter = 0;
    int[] resources = new int[]{
            R.drawable.item_1,
            R.drawable.item_2,
            R.drawable.item_3
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_plank);

        storiesProgressView = (StoriesProgressView) findViewById(R.id.stories);
        storiesProgressView.setStoriesCount(3);
        storiesProgressView.setStoryDuration(1500L)
        storiesProgressView.setStoriesListener(this);
        storiesProgressView.startStories();

        imageView = (ImageView) findViewById(R.id.image);
        imageView.setOnClickListener (new View.onClickListener() {

        @Override
        public void onNext() {
            imageView.setImageResource(resources[++counter])
        }

        @Override
        public void onComplete() {
            Toast.makeText(ViewPlankActivity.this, "Completed", Toast.LENGTH_SHORT).show();
        }
    });




        imageView.setImageResource(resources[counter]);

     }

     @Override
    protected void onDestroy() {
        storiesProgressView.destroy();
        super.onDestroy();
     }

}
