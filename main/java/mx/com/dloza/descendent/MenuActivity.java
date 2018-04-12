package mx.com.dloza.descendent;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mx.com.dloza.descendent.dolores.FirstActivity;
import mx.com.dloza.descendent.dolores.LoginActivity;
import mx.com.dloza.descendent.dolores.PrincipalActivity;
import mx.com.dloza.descendent.dolores.Session;
import mx.com.dloza.descendent.dolores.ToursActivity;

public class MenuActivity extends AppCompatActivity {

    private Button btnLogout;
    private Session session;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        session = new Session(this);
        if (!session.loggedin()) {
            logout();
        }
        btnLogout = (Button) findViewById(R.id.btn_logout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });

    }

    private void logout() {
        session.setLoggedin(false);
        finish();
        startActivity(new Intent(MenuActivity.this, LoginActivity.class));
    }

    public void next_video(View view) {
        Intent intent = new Intent(MenuActivity.this, FirstActivity.class);
        startActivity(intent);
    }

    public void next_crafts(View view) {
        Intent intent = new Intent(MenuActivity.this, HandicraftsActivity.class);
        startActivity(intent);
    }

    public void next_snow(View view) {
        Intent intent = new Intent(MenuActivity.this, PrincipalActivity.class);
        startActivity(intent);
    }

    public void next_tour(View view) {
        Intent intent = new Intent(MenuActivity.this, ToursActivity.class);
        startActivity(intent);
    }

    public void galleryActivity (View view){
        Intent intent= new Intent(MenuActivity.this, GalleryActivity.class);
        startActivity(intent);
        //finish();
    }

    public void churchActivity (View view){
        Intent intent= new Intent(MenuActivity.this,ChurchActivity.class);
        startActivity(intent);
    }

    public void restaurantActivity (View view){
        Intent intent= new Intent(MenuActivity.this,RestaurantActivity.class);
        startActivity(intent);
    }

    public void videoActivity (View view){
        Intent intent= new Intent(MenuActivity.this,SubMenuVideoActivity.class);
        startActivity(intent);
    }

    public void doloresGalleryActivity (View view){
        Intent intent= new Intent(MenuActivity.this,DoloresGalleryActivity.class);
        startActivity(intent);
    }

    public void gameActivity (View view){
        Intent intent= new Intent(MenuActivity.this,GameActivity.class);
        startActivity(intent);
    }

}
