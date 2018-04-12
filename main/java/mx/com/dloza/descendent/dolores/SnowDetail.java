package mx.com.dloza.descendent.dolores;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import mx.com.dloza.descendent.R;

public class SnowDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snow_detail);

        TextView title = findViewById(R.id.txt_title);
        TextView description = findViewById(R.id.txt_description);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle!=null){
            title.setText (bundle.getString("TIT"));
            description.setText (bundle.getString("DET"));
        }

    }
}
