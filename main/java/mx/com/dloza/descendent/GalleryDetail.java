package mx.com.dloza.descendent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

import mx.com.dloza.descendent.common.Common;
import mx.com.dloza.descendent.model.Gallery;

public class GalleryDetail extends AppCompatActivity {

    KenBurnsView gallery_image;
    TextView gallery_title, gallery_summary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_detail);

        gallery_image = findViewById(R.id.gallery_image);
        gallery_title = findViewById(R.id.gallery_title);
        gallery_summary = findViewById(R.id.gallery_summary);

        if(getIntent() != null){
            int gallery_index = getIntent().getIntExtra("gallery_index",-1);
            if (gallery_index != -1){
                loadGalleryDetail(gallery_index);
            }
        }
    }

    private void loadGalleryDetail(int index) {
        Gallery gallery = Common.galleryList.get(index);

        //Load image
        Picasso.with(getBaseContext()).load(gallery.getUrl()).into(gallery_image);//.placeholder(R.drawable.mcclaren).into(gallery_image);
        gallery_title.setText(gallery.getTitle());
        gallery_summary.setText(gallery.getSummary());
    }
}
