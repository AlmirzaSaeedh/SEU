package com.example.popgrid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends AppCompatActivity {

GridView gridView;

	static final String[] numbers = new String[] {
			"B1", "B2", "B3", "B4", "B5",
			"B6", "B7", "B8"};

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
                popUpClass.showPopupWindow(v);

    }
  });

    }
}
