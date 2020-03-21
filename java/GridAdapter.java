package com.example.seu_map;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.Button;
import android.view.View.OnClickListener;

public class GridAdapter extends BaseAdapter {

  Context rContext;
       private LayoutInflater rInflater;
       private Activity activity;
    PopupWindow popupWindows;

       public GridAdapter(Context c) {

            rInflater = LayoutInflater.from(c);

            rContext = c;
        }

        public  GridAdapter(Activity btnbinding) {

            activity = btnbinding;

            rContext = btnbinding;
            rInflater = LayoutInflater.from(btnbinding);
            rContext = btnbinding;
            rInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
       public int getCount() {
           return 10;
       }

       @Override
       public Object getItem(int arg0) {
           return null;
       }

       @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
       public View getView(final int position, View convertView,
               ViewGroup parent) {

           convertView = rInflater.inflate(R.layout.child, null);
           final MyDat mydat = new MyDat();

           mydat.button=(Button) convertView.findViewById(R.id.button);
           mydat.button.setOnClickListener(new OnClickListener() {

               @Override
               public void onClick(View v) {
                   popupWindows.showAsDropDown(v, -5, 0);

               }
           });

           return convertView;
       }

       class MyDat {
         Button button;
     }
}
