package com.example.aartiplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import android.graphics.Bitmap;
import android.widget.SeekBar;


public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<UserPojo> arrayList = new ArrayList<>();
    ArrayList<String> arrayList1 = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        final UserPojo userPojo = new UserPojo();
        userPojo.setImage(R.drawable.jai_jagdish);
        userPojo.setName("Om Jai Jagdish Hare Aarti By Anuradha Poudwal");
        arrayList.add(userPojo);

        UserPojo userPojo1 = new UserPojo();
        userPojo1.setImage(R.drawable.ganesha);
        userPojo1.setName("Ganesh Aarti By Anuradha Poudwal");
        arrayList.add(userPojo1);

        UserPojo userPojo2 = new UserPojo();
        userPojo2.setImage(R.drawable.laxmi_maa);
        userPojo2.setName("Laxmi Maa Aarti By Anuradha Poudwal");
        arrayList.add(userPojo2);


        UserPojo userPojo3 = new UserPojo();
        userPojo3.setImage(R.drawable.laxmi_ramana);
        userPojo3.setName("Laxmi Ramana Aarti By Anuradha Poudwal");
        arrayList.add(userPojo3);

        UserPojo userPojo4 = new UserPojo();
        userPojo4.setImage(R.drawable.jai_ambe_gauri);
        userPojo4.setName("Ambe Maa Arti By Anuradha Poudwal");
        arrayList.add(userPojo4);


        UserPojo userPojo5 = new UserPojo();
        userPojo5.setImage(R.drawable.ambe_ma);
        userPojo5.setName("Ambe Tu Hai Jagdambe Kali By Anuradha Poudwal");
        arrayList.add(userPojo5);

        UserPojo userPojo6 = new UserPojo();
        userPojo6.setImage(R.drawable.saraswati_ma);
        userPojo6.setName("Saraswati Maa Aarti By Anuradha Poudwal");
        arrayList.add(userPojo6);


        UserPojo userPojo7 = new UserPojo();
        userPojo7.setImage(R.drawable.ganga_maa);
        userPojo7.setName("Ganga Maiya Aarti By Anuradha Poudwal");
        arrayList.add(userPojo7);

        UserPojo userPojo8 = new UserPojo();
        userPojo8.setImage(R.drawable.santoshi_maa);
        userPojo8.setName("Santoshi Maa Arti By Anuradha Poudwal");
        arrayList.add(userPojo8);


        UserPojo userPojo9 = new UserPojo();
        userPojo9.setImage(R.drawable.shiv);
        userPojo9.setName("Shiv Aarti By Anuradha Poudwal");
        arrayList.add(userPojo9);

        UserPojo userPojo10 = new UserPojo();
        userPojo10.setImage(R.drawable.vaishnavi_maa);
        userPojo10.setName("Vaishno Maa Aarti By Anuradha Poudwal");
        arrayList.add(userPojo10);


        UserPojo userPojo11 = new UserPojo();
        userPojo11.setImage(R.drawable.kunj_bihari);
        userPojo11.setName("Krishn Aarti By Anuradha Poudwal");
        arrayList.add(userPojo11);

        UserPojo userPojo12 = new UserPojo();
        userPojo12.setImage(R.drawable.satyanarayan);
        userPojo12.setName("Satyanaran Arti By Anuradha Poudwal");
        arrayList.add(userPojo12);

        UserPojo userPojo13 = new UserPojo();
        userPojo13.setImage(R.drawable.ramchandra);
        userPojo13.setName("Ram ji Aarti By Anuradha Poudwal");
        arrayList.add(userPojo13);

        UserPojo userPojo14 = new UserPojo();
        userPojo14.setImage(R.drawable.hanuman);
        userPojo14.setName("Hanuman Aarti ");
        arrayList.add(userPojo14);


        UserPojo userPojo15 = new UserPojo();
        userPojo15.setImage(R.drawable.jhulela);
        userPojo15.setName("Jhulelal Aarti ");
        arrayList.add(userPojo15);

        UserPojo userPojo16 = new UserPojo();
        userPojo16.setImage(R.drawable.jhulela);
        userPojo16.setName("Jhulelal Palav ");
        arrayList.add(userPojo16);

        UserPojo userPojo17 = new UserPojo();
        userPojo17.setImage(R.drawable.vishkarma);
        userPojo17.setName("Vishkarma Ki Aarti By Anuradha Poudwal");
        arrayList.add(userPojo17);

        UserPojo userPojo18 = new UserPojo();
        userPojo18.setImage(R.drawable.surya_narayan);
        userPojo18.setName("Surya Dev Aarti By Anuradha Poudwal");
        arrayList.add(userPojo18);

        UserPojo userPojo19 = new UserPojo();
        userPojo19.setImage(R.drawable.shani_dev);
        userPojo19.setName("Shani Dev Aarti ");
        arrayList.add(userPojo19);

        UserPojo userPojo20 = new UserPojo();
        userPojo20.setImage(R.drawable.sai_baba);
        userPojo20.setName("Sai Baba Arti ");
        arrayList.add(userPojo20);

        UserPojo userPojo21 = new UserPojo();
        userPojo21.setImage(R.drawable.gan_gapataye);
        userPojo21.setName("Ganesh Vandana By Anuradha Poudwal");
        arrayList.add(userPojo21);

        UserPojo userPojo22 = new UserPojo();
        userPojo22.setImage(R.drawable.shiv_amritwani);
        userPojo22.setName("Shiv Amritvani");
        arrayList.add(userPojo22);


        UserPojo userPojo23 = new UserPojo();
        userPojo23.setImage(R.drawable.vaishno_devi);
        userPojo23.setName("Vaishno Devi Chalisa ");
        arrayList.add(userPojo23);

        UserPojo userPojo24 = new UserPojo();
        userPojo24.setImage(R.drawable.hanuman_chalisa);
        userPojo24.setName("Hanuman Chalisa");
        arrayList.add(userPojo24);

        UserPojo userPojo25 = new UserPojo();
        userPojo25.setImage(R.drawable.hanuman_amritwani);
        userPojo25.setName("Hanuman Amritvani");
        arrayList.add(userPojo25);

        UserPojo userPojo26 = new UserPojo();
        userPojo26.setImage(R.drawable.mangal_bhavan);
        userPojo26.setName("Mangal Bhavan Ammangal Hari ");
        arrayList.add(userPojo26);

        UserPojo userPojo27 = new UserPojo();
        userPojo27.setImage(R.drawable.gayatri_mantra);
        userPojo27.setName("Gayatri Mantra ");
        arrayList.add(userPojo27);

        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.list_item, arrayList);
        listView.setAdapter(customAdapter);

        final Field[] fields = R.raw.class.getFields();
        for (int i  = 0; i<fields.length ;i++){
            arrayList1.add(fields[i].getName());
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String song = listView.getItemAtPosition(position).toString();

                switch (position){
                    case 0:
                        Intent intent = new Intent(MainActivity.this,MusicOn.class);
//                        Bundle bundle = new Bundle();
//                        bundle.putInt("image",R.drawable.jai_jagdish);
//                        intent.putExtras(bundle);
                        intent.putExtra("songName", "Om Jai Jagdish Hare");
                        intent.putExtra("songs",arrayList1);
                        intent.putExtra("position",position);
                        startActivity(intent);
                        finish();
                        break;

                    case 1:
                        Intent intent1 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle1 =new Bundle();
                        bundle1.putInt("image",R.drawable.ganesha);
                        intent1.putExtras(bundle1);
                        intent1.putExtra("songName", " Ganesh Aarti");
                        intent1.putExtra("songs",arrayList1);
                        intent1.putExtra("position",position);
                        startActivity(intent1);
                        finish();
                        break;

                    case 2:
                        Intent intent2 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle2 =new Bundle();
                        bundle2.putInt("image",R.drawable.laxmi_maa);
                        intent2.putExtras(bundle2);
                        intent2.putExtra("songName","Laxmi Maa Aati");
                        intent2.putExtra("position",position);
                        intent2.putExtra("songs",arrayList1);
                        startActivity(intent2);
                        finish();
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle3 =new Bundle();
                        bundle3.putInt("image",R.drawable.laxmi_ramana);
                        intent3.putExtra("songName", "Laxmi Ramana Aarti");
                        intent3.putExtras(bundle3);
                        intent3.putExtra("songs",arrayList1);
                        intent3.putExtra("position",position);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle4 =new Bundle();
                        bundle4.putInt("image",R.drawable.jai_ambe_gauri);
                        intent4.putExtras(bundle4);
                        intent4.putExtra("songName", "Ambe Maa Aarti");
                        intent4.putExtra("position",position);
                        intent4.putExtra("songs",arrayList1);
                        startActivity(intent4);
                        finish();
                        break;
                    case 5:
                        Intent intent5 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle5 =new Bundle();
                        bundle5.putInt("image",R.drawable.ambe_ma);
                        intent5.putExtras(bundle5);
                        intent5.putExtra("songName", "Ambe Tu Hai Jagdambe Kaali");
                        intent5.putExtra("songs",arrayList1);
                        intent5.putExtra("position",position);
                        startActivity(intent5);
                        finish();
                        break;
                    case 6:
                        Intent intent6 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle6 =new Bundle();
                        bundle6.putInt("image",R.drawable.saraswati_ma);
                        intent6.putExtras(bundle6);
                        intent6.putExtra("songName", "Saraswati Maa Aarti");
                        intent6.putExtra("songs",arrayList1);
                        intent6.putExtra("position",position);
                        startActivity(intent6);
                        finish();
                        break;
                    case 7:
                        Intent intent7 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle7 = new Bundle();
                        bundle7.putInt("image",R.drawable.ganga_maa);
                        intent7.putExtra("songName", "Ganga Maa Aarti");
                        intent7.putExtras(bundle7);
                        intent7.putExtra("songs",arrayList1);
                        intent7.putExtra("position",position);
                        startActivity(intent7);
                        finish();
                        break;
                    case 8:
                        Intent intent8 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle8 =new Bundle();
                        bundle8.putInt("image",R.drawable.santoshi_maa);
                        intent8.putExtras(bundle8);
                        intent8.putExtra("songs",arrayList1);
                        intent8.putExtra("songName", "Santoshi Maa Aarti");
                        intent8.putExtra("position",position);
                        startActivity(intent8);
                        finish();
                        break;
                    case 9:
                        Intent intent9 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle9 =new Bundle();
                        bundle9.putInt("image",R.drawable.shiv);
                        intent9.putExtras(bundle9);
                        intent9.putExtra("songName", "Shiv Aarti");
                        intent9.putExtra("songs",arrayList1);
                        intent9.putExtra("position",position);
                        startActivity(intent9);
                        finish();
                        break;
                    case 10:
                        Intent intent10 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle10 =new Bundle();
                        bundle10.putInt("image",R.drawable.vaishnavi_maa);
                        intent10.putExtras(bundle10);
                        intent10.putExtra("songName", "Vaishno Maa Aarti");
                        intent10.putExtra("songs",arrayList1);
                        intent10.putExtra("position",position);
                        startActivity(intent10);
                        finish();
                        break;
                    case 11:
                        Intent intent11 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle11 =new Bundle();
                        bundle11.putInt("image",R.drawable.kunj_bihari);
                        intent11.putExtras(bundle11);
                        intent11.putExtra("songs",arrayList1);
                        intent11.putExtra("songName", "Krishna Aarti");
                        intent11.putExtra("position",position);
                        startActivity(intent11);
                        finish();
                        break;
                    case 12:
                        Intent intent12 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle12 =new Bundle();
                        bundle12.putInt("image",R.drawable.satyanarayan);
                        intent12.putExtras(bundle12);
                        intent12.putExtra("songName", "Satyanarayan Aarti");
                        intent12.putExtra("songs",arrayList1);
                        intent12.putExtra("position",position);
                        startActivity(intent12);
                        finish();
                        break;
                    case 13:
                        Intent intent13 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle13 =new Bundle();
                        bundle13.putInt("image",R.drawable.ramchandra);
                        intent13.putExtras(bundle13);
                        intent13.putExtra("songName", "RamChandra Ji Aarti");
                        intent13.putExtra("songs",arrayList1);
                        intent13.putExtra("position",position);
                        startActivity(intent13);
                        finish();
                        break;
                    case 14:
                        Intent intent14 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle14 =new Bundle();
                        bundle14.putInt("image",R.drawable.hanuman);
                        intent14.putExtras(bundle14);
                        intent14.putExtra("songName", "Hanuman Aarti");
                        intent14.putExtra("songs",arrayList1);
                        intent14.putExtra("position",position);
                        startActivity(intent14);
                        finish();
                        break;
                    case 15:
                        Intent intent15 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle15 =new Bundle();
                        bundle15.putInt("image",R.drawable.jhulela);
                        intent15.putExtras(bundle15);
                        intent15.putExtra("songName", "Jhulelal Aarti");
                        intent15.putExtra("songs",arrayList1);
                        intent15.putExtra("position",position);
                        startActivity(intent15);
                        finish();
                        break;
                    case 16:
                        Intent intent16 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle16 =new Bundle();
                        bundle16.putInt("image",R.drawable.jhulela);
                        intent16.putExtras(bundle16);
                        intent16.putExtra("songName", "Jhulelal Palav");
                        intent16.putExtra("songs",arrayList1);
                        intent16.putExtra("position",position);
                        startActivity(intent16);
                        finish();
                        break;
                    case 17:
                        Intent intent17 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle17 =new Bundle();
                        bundle17.putInt("image",R.drawable.vishkarma);
                        intent17.putExtras(bundle17);
                        intent17.putExtra("songName", "Vishkarma Ji Aarti");
                        intent17.putExtra("songs",arrayList1);
                        intent17.putExtra("position",position);
                        startActivity(intent17);
                        finish();
                        break;
                    case 18:
                        Intent intent18 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle18 =new Bundle();
                        bundle18.putInt("image",R.drawable.surya_narayan);
                        intent18.putExtras(bundle18);
                        intent18.putExtra("songName", "Surya Narayan Aarti");
                        intent18.putExtra("songs",arrayList1);
                        intent18.putExtra("position",position);
                        startActivity(intent18);
                        finish();
                        break;
                    case 19:
                        Intent intent19 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle19 =new Bundle();
                        bundle19.putInt("image",R.drawable.shani_dev);
                        intent19.putExtras(bundle19);
                        intent19.putExtra("songName", "Shani Dev Aarti");
                        intent19.putExtra("songs",arrayList1);
                        intent19.putExtra("position",position);
                        startActivity(intent19);
                        finish();
                        break;
                    case 20:
                        Intent intent20 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle20 =new Bundle();
                        bundle20.putInt("image",R.drawable.sai_baba);
                        intent20.putExtras(bundle20);
                        intent20.putExtra("songName", "Sai Baba Aarti");
                        intent20.putExtra("songs",arrayList1);
                        intent20.putExtra("position",position);
                        startActivity(intent20);
                        finish();
                        break;
                    case 21:
                        Intent intent21 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle21 =new Bundle();
                        bundle21.putInt("image",R.drawable.gan_gapataye);
                        intent21.putExtras(bundle21);
                        intent21.putExtra("songName", "Ganesh Vandana");
                        intent21.putExtra("songs",arrayList1);
                        intent21.putExtra("position",position);
                        startActivity(intent21);
                        finish();
                        break;
                    case 22:
                        Intent intent22 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle22 =new Bundle();
                        bundle22.putInt("image",R.drawable.shiv_amritwani);
                        intent22.putExtras(bundle22);
                        intent22.putExtra("songName", "Shiv Amritwani");
                        intent22.putExtra("songs",arrayList1);
                        intent22.putExtra("position",position);
                        startActivity(intent22);
                        finish();
                        break;
                    case 23:
                        Intent intent23 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle23 =new Bundle();
                        bundle23.putInt("image",R.drawable.vaishno_devi);
                        intent23.putExtras(bundle23);
                        intent23.putExtra("songName", "Vaishno Devi Chalisa");
                        intent23.putExtra("songs",arrayList1);
                        intent23.putExtra("position",position);
                        startActivity(intent23);
                        finish();
                        break;
                    case 24:
                        Intent intent24 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle24 =new Bundle();
                        bundle24.putInt("image",R.drawable.hanuman_chalisa);
                        intent24.putExtras(bundle24);
                        intent24.putExtra("songName", "Hanuman Chalisa");
                        intent24.putExtra("songs",arrayList1);
                        intent24.putExtra("position",position);
                        startActivity(intent24);
                        finish();
                        break;
                    case 25:
                        Intent intent25 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle25 =new Bundle();
                        bundle25.putInt("image",R.drawable.hanuman_amritwani);
                        intent25.putExtra("songName", "Hanuman Amritwani");
                        intent25.putExtras(bundle25);
                        intent25.putExtra("songs",arrayList1);
                        intent25.putExtra("position",position);
                        startActivity(intent25);
                        finish();
                        break;
                    case 26:
                        Intent intent26 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle26 =new Bundle();
                        bundle26.putInt("image",R.drawable.mangal_bhavan);
                        intent26.putExtras(bundle26);
                        intent26.putExtra("songName", "Mangal Bhanvan Ammangal Hari");
                        intent26.putExtra("songs",arrayList1);
                        intent26.putExtra("position",position);
                        startActivity(intent26);
                        finish();
                        break;
                    case 27:
                        Intent intent27 = new Intent(MainActivity.this,MusicOn.class);
                        Bundle bundle27 =new Bundle();
                        bundle27.putInt("image",R.drawable.gayatri_mantra);
                        intent27.putExtras(bundle27);
                        intent27.putExtra("songName", "Gayatri Mantra");
                        intent27.putExtra("songs",arrayList1);
                        intent27.putExtra("position",position);
                        startActivity(intent27);
                        finish();
                        break;
                }
            }
        });

    }

}
