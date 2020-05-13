package com.example.aartiplayer;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import de.hdodenhof.circleimageview.CircleImageView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MusicOn extends AppCompatActivity {

    ImageButton pause, stop, next, prevoius;
  // TextView song_name;
    AudioManager audioManager;
    MediaPlayer mediaPlayer;
    int position;
    ArrayList<String> songs;
    SeekBar timeline;
    String name;
    int curposition;
    Thread updateSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_on2);

        pause = findViewById(R.id.pause);
        stop = findViewById(R.id.stop);
        next = findViewById(R.id.next);
        prevoius = findViewById(R.id.previous);
    //song_name = findViewById(R.id.name);
        timeline = findViewById(R.id.timeline);


        Intent i = getIntent();
        Bundle b = i.getExtras();

        // songs = (ArrayList)b.getParcelableArrayList("songs");
//        name = songs.get(position).toString();
        songs = (ArrayList<String>)getIntent().getSerializableExtra("songs");
        final String songName = i.getStringExtra("songName");
//        song_name.setText(songName);
//        song_name.setSelected(true);
//        final int pic = b.getInt("image");
//        imageView.setImageResource(pic);
        position = b.getInt("position",0);

        if (mediaPlayer!= null){
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        int r = getResources().getIdentifier(songs.get(position), "raw", getPackageName());
        mediaPlayer = MediaPlayer.create(MusicOn.this,r);
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        mediaPlayer.start();

//        Uri uri = Uri.parse(songs.get(position).toString());
//        mediaPlayer = MediaPlayer.create(getApplicationContext(),uri);
//        mediaPlayer.start();
//        timeline.setMax(mediaPlayer.getDuration());

//        updateSeekBar = new Thread(){
//            @Override
//            public void run() {
//
//                int toatalduration = mediaPlayer.getDuration();
//                int curpos = 0;
//                while (curpos < toatalduration){
//                    try {
//                        sleep(5000);
//                        curpos = mediaPlayer.getCurrentPosition();
//                        timeline.setProgress(curpos);
//
//                    } catch (InterruptedException e){
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };

        timeline.setMax(mediaPlayer.getDuration());
        timeline.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mediaPlayer.seekTo(seekBar.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        // customize
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                timeline.setProgress(mediaPlayer.getCurrentPosition());
            }
        }, 0, 1000);


        int maxvol = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int currentvol = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        SeekBar volume = findViewById(R.id.volume);
        volume.setMax(maxvol);
        volume.setProgress(currentvol);

       volume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           @Override
           public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
           }

           @Override
           public void onStartTrackingTouch(SeekBar seekBar) {

           }

           @Override
           public void onStopTrackingTouch(SeekBar seekBar) {

           }
       });

       pause.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               timeline.setMax(mediaPlayer.getDuration());
               if (mediaPlayer.isPlaying()){
                   pause.setBackgroundResource(R.drawable.ic_play_arrow_black_24dp);
                   mediaPlayer.pause();
               }
               else {
                   pause.setBackgroundResource(R.drawable.ic_pause_black_24dp);
                   mediaPlayer.start();
               }
           }
       });
       stop.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               timeline.setMax(mediaPlayer.getDuration());
               if (mediaPlayer.isPlaying()){
                   pause.setBackgroundResource(R.drawable.ic_stop_black_24dp);
                   pause.setEnabled(false);
                   mediaPlayer.stop();
               }
               mediaPlayer.stop();
           }
       });

       next.setOnClickListener(new View.OnClickListener() {
           @SuppressLint("ResourceType")
           @Override
           public void onClick(View v) {
               mediaPlayer.stop();
               mediaPlayer.release();
//               position = (position + 1) % songs.size();
//
//               int r = getResources().getIdentifier(songs.get(position), "raw", getPackageName());
//               mediaPlayer = MediaPlayer.create(MusicOn.this,r);
//               Bundle bundle = null;
//               String i = String.valueOf(bundle.get(String.valueOf(position)));
//               imageView.setImageResource(Integer.parseInt(i));
//               mediaPlayer.start();
//                Uri u = Uri.parse(songs.get(position).toString());
//                mediaPlayer = MediaPlayer.create(getApplicationContext(), u);
//                mediaPlayer.start();

               if (position < songs.size() -1){
                   position++;
               }
               else{
                    position = 0;
               }

               int r = getResources().getIdentifier(songs.get(position), "raw", getPackageName());
               mediaPlayer = MediaPlayer.create(MusicOn.this,r);
               mediaPlayer.start();
               pause.setBackgroundResource(R.drawable.ic_play_arrow_black_24dp);
               pause.setBackground(Drawable.createFromPath("#ffffff"));
           }
       });
       prevoius.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mediaPlayer.stop();
               mediaPlayer.release();
//               position = ((position - 1) < 0) ?(songs.size()-1): position - 1;
//               int r = getResources().getIdentifier(songs.get(position), "raw", getPackageName());
//               mediaPlayer = MediaPlayer.create(MusicOn.this,r);
////               String s = imageView.getClass().toString();
////               imageView.setImageResource(Integer.parseInt(s));
//                mediaPlayer.start();

               if (position <= 0){
                   position = songs.size();
               }
               else{
                   position--;
               }
               int r = getResources().getIdentifier(songs.get(position), "raw", getPackageName());
               mediaPlayer = MediaPlayer.create(MusicOn.this,r);
               mediaPlayer.start();
               pause.setBackgroundResource(R.drawable.ic_play_arrow_black_24dp);
           }
       });

    }
    @Override
    public void onBackPressed() {
        mediaPlayer.stop();
        Intent intent = new Intent(MusicOn.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}

