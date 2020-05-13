package com.example.aartiplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;

public class CustomAdapter extends ArrayAdapter {

    Context context;
    int resource;
    ArrayList<UserPojo> arrayList;
  //  int red,green, blue;

    public CustomAdapter(@NonNull Context context, int resource, ArrayList<UserPojo> arrayList) {
        super(context, resource, arrayList);

        this.context = context;
        this.resource = resource;
        this.arrayList = arrayList;
    }

    @SuppressLint("ResourceAsColor")
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(resource, null, false);
        ImageView imageView = view.findViewById(R.id.image);
        TextView name = view.findViewById(R.id.name);
//        ImageButton play = view.findViewById(R.id.play);
//        ImageButton pause = view.findViewById(R.id.pause);
//        ImageButton stop = view.findViewById(R.id.stop);
        UserPojo up = arrayList.get(position);
        imageView.setImageResource(up.getImage());
        name.setText(up.getName());
//        play.setImageResource(up.getPlay());
//        pause.setImageResource(up.getPause());
//        stop.setImageResource(up.getStop());

//        if (position % 2 == 0 ){
//            view.setBackgroundColor(R.color.bg1);
//
//        }
//        else {
//            view.setBackgroundColor(R.color.bg2);
//        }

        return view;

    }
}
