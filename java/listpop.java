package com.example.seu_map;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Context;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.GridView;
import android.widget.PopupWindow;
import android.widget.TextView;

public class listpop extends AppCompatActivity {

 String TAG = "MainActivity.java";
 String popUpContents[];
   PopupWindow popupWindows;
  GridView grid1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listpop);

        grid1 = (GridView) findViewById(R.id.grid1);
        grid1.setAdapter(new GridAdapter(listpop.this));

        List<String> nameList = new ArrayList<String>();
         nameList.add("B1");
         nameList.add("B2");
         nameList.add("B3");
         nameList.add("B4");

         popUpContents = new String[nameList.size()];
        nameList.toArray(popUpContents);

        popupWindows = popupWindows();


    }

     public PopupWindow popupWindows(){
       PopupWindow popupWindow = new PopupWindow(this);
       GridView GridViewName =new GridView(this);
       GridViewName.setAdapter(nameAdapter(popUpContents));
       GridViewName.setOnItemClickListener(new nameDropDownOnClickListener());
       popupWindow.setFocusable(true);
       popupWindow.setWidth(250);
       popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
       popupWindow.setContentView(GridViewName);
          return popupWindow;
     }

private ArrayAdapter<String> nameAdapter(String nameArray[]) {

  ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nameArray) {

    @Override
           public View getView(int position, View convertView, ViewGroup parent) {

               String text = getItem(position);

               TextView listItem = new TextView(listpop.this);

               listItem.setText(text);
               listItem.setTag(position);
               listItem.setTextSize(22);
               listItem.setPadding(10, 10, 10, 10);
               listItem.setTextColor(Color.WHITE);

               return listItem;
           }
       };

       return adapter;
  }
}
