package mx.com.dloza.descendent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageSight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_sight);

        ImageView img = findViewById(R.id.iv_image_complete);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle!=null){
            img.setImageResource(bundle.getInt("IMG"));
        }
    }

}
