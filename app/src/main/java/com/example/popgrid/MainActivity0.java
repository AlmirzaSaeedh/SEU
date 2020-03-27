package com.example.popgrid;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
String selectedItem;
GridView gridView;

	static final String[] numbers = new String[] {
			"B1", "B2", "B3", "B4", "B5",
			"B6", "B7", "B8"};

			final String[] data2 = {"B1", "IT440-21153", "24-3-2020", "04:00"};
    String firstInt = data2[0];
		//String secndInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridv);

  ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
      android.R.layout.simple_list_item_1, numbers);

  gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                PopUpClass popUpClass = new PopUpClass();
                selectedItem = (String) parent.getItemAtPosition(position);
                if (firstInt.equals(selectedItem))
                {popUpClass.showPopupWindow(v);}
                else { Toast.makeText(v.getContext(),
                        "No classes", Toast.LENGTH_SHORT).show();}
                } });


    } }
