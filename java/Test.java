package com.example.seu_map;


import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class Test extends AppCompatActivity implements OnClickListener {

    private ArrayList<Button> mButtons = new ArrayList<Button>();

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Button cb = null;

        for (int i =0; i<8; i++) {
            cb = new Button(this);
            cb.setText("B"+Integer.toString(i+1));
            cb.setBackgroundResource(R.drawable.fancy_button_selector);
            cb.setOnClickListener(this);
            cb.setId(i);
            registerForContextMenu(cb);
            mButtons.add(cb);
        }

        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new CustomAdapter(mButtons));

    }

    @Override
    public void onClick(View v) {
        Button selection = (Button)v;
       Toast.makeText(getBaseContext(),
       selection.getText()+ " was pressed!", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        Button b = (Button)v;
        menu.setHeaderTitle(b.getText());
        menu.add(0, v.getId(), 0, "Action 1");
        menu.add(0, v.getId(), 0, "Action 2");
    }

     @Override
       public boolean onContextItemSelected(MenuItem item) {
         Button selectedButton = mButtons.get(item.getItemId());
         Toast.makeText(getBaseContext(),
                item.getTitle()+" of "+selectedButton.getText()+ " was pressed!",
              Toast.LENGTH_SHORT).show();


         return true; }


}
