package mx.com.dloza.descendent;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ChurchActivity extends AppCompatActivity {

    ListView list;
    String [][] data;/* ={
            {Resources.getSystem().getString(R.string.info_church_one),"Plaza Principal s/n,\nCentro, Dolores Hidalgo, \nGto., 37800","La edificación de la Parroquia de Nuestra Señora de Los Dolores se inició el 2 de Febrero de 1712 por disposición del Sr. Cura Lic. Álvaro de Osio y Ocampo y se concluyó en el año de 1778. En el año \nde 1803, Don Miguel Hidalgo y Costilla se hace cargo del curato de la Parroquia y, en el pórtico de la misma, proclama el Grito de Independencia la madrugada del domingo 16 de septiembre de 1810."},

            {"Parroquia de \nLa Asunción","Puebla 32, Centro,\nDolores Hidalgo, Gto., 37800","La construcción del Templo de la Asunción de María inició el 12 de mayo de 1875 por disposición del Sr. Cura Don José María Gómez. Antes de ser nombrada como santa patrona bajo la advocación de la Asunción de María, se la veneraba como la Virgen de la Saleta"},

            {"Templo de la \nTercera Orden","Puebla 7, Centro,\nDolores Hidalgo, Gto., 37800","Después de la Parroquia de Nuestra Sra. De los Dolores, es el inmueble religioso más antiguo de la ciudad, según se aprecia en una inscripción que aparece en el arco del coro indicando que fue cerrado en 1755. Edificio compuesto de tres naves, su altar mayor está dedicado a la Virgen de la Inmaculada Concepción"},

            {"Templo el Señor \ndel Calvario","37800 Centro, \nGuanajuato 35B, Centro, Gto.","Este Templo fue construido en 1510., por mano de gente del pueblo y dirigido por los frailes Agustinos."},

            {"Jesús Nazareno","Corregidora 5, Centro, 37800\nDolores Hidalgo C.I.N., Gto.","El Templo de Jesús Nazareno se comenzó construir el 16 de junio 1875. La historia de los registros parroquiales nos indica que: se realizó junta de vecinos del barrio de «la obra banda» -la banda sur del Río Batán- para solicitarle al Señor Cura José María Gómez la necesidad de construir un templo para los auxilios espirituales"},
    };*/

    int[] dataImg = {R.drawable.image_1,R.drawable.image_2,R.drawable.image_3,R.drawable.image_4,R.drawable.image_5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_church);
        getData();

        list = findViewById(R.id.lv_list);

        list.setAdapter(new AdapterListElement(this, data, dataImg));

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent detailViewer = new Intent(view.getContext(),ChurchDetail.class);
                detailViewer.putExtra("TIT",data[i][0]);
                detailViewer.putExtra("DET",data[i][2]);
                startActivity(detailViewer);
            }
        });
    }

    private void getData(){
        data = new String[][]{
                {getString(R.string.title_church_one),getString(R.string.detail_church_one),getString(R.string.info_church_one)},

                {getString(R.string.tilte_church_two),getString(R.string.detail_church_two),getString(R.string.info_church_two)},

                {getString(R.string.tilte_church_three),getString(R.string.detail_church_three),getString(R.string.info_church_three)},

                {getString(R.string.tilte_church_four),getString(R.string.detail_church_four),getString(R.string.info_church_four)},

                {getString(R.string.tilte_church_five),getString(R.string.detail_church_five),getString(R.string.info_church_five)},
        };
    }
}
