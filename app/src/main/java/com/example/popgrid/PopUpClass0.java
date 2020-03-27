package com.example.popgrid;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Toast;

public class PopUpClass {
   // private final Activity;

    //PopupWindow display method

    public void showPopupWindow(final View view) {

      /*  ListView listV;

        String[] crn={"IT440-21153", "IT342-21155", "IT448-21154"};
        int[] date={24-3-2020, 24-3-2020, 24-3-2020};
        String[] time={"04:00","06:00", "05:00"}; */

    /*  List<Data> dataList = new ArrayList<>();
        Data D1 = new Data();
        D1.setCrn("IT440-21153");
        D1.setDate(24-3-2020);
        D1.setTime("04:00");

        Data D2 = new Data( );
        D2.setCrn("IT342-21155");
        D2.setDate(24-3-2020);
        D2.setTime("06:00");

          Data D3 = new Data();
          D3.setCrn("IT448-21154");
          D3.setDate(24-3-2020);
          D3.setTime("05:00");

          dataList.add(D1);
          dataList.add(D2);
          dataList.add(D3); */

        //Create a View object yourself through inflater
        LayoutInflater inflater = (LayoutInflater) view.getContext().getSystemService(view.getContext().LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.childgv, null);

        ListView mListView2 = popupView.findViewById(R.id.lstV);

       final String[] data2 = {"B1", "IT440-21153", "24-3-2020", "04:00"};
      //  final String[] data1 = {"B1", "IT448-21154", "24-3-2020", "05:00"};
       mListView2.setAdapter(new ArrayAdapter<>(view.getContext(), android.R.layout.simple_list_item_1, data2));

        //Specify the length and width through constants
        int width = LinearLayout.LayoutParams.MATCH_PARENT;
        int height = LinearLayout.LayoutParams.MATCH_PARENT;

        //Make Inactive Items Outside Of PopupWindow
        boolean focusable = true;

        //Create a window with our parameters
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        //Set the location of the window on the screen
        popupWindow.showAtLocation(view, Gravity.CENTER, 30, 20);

  /*      ListAdapter adapter = new ListAdapter(this, R.layout.childgv, crn, date, time);
         listV = (ListView) findViewById(R.id.lstV);
      listV.setAdapter(adapter); */

        //Initialize the elements of our window, install the handler
    /*    TextView test2 = popupView.findViewById(R.id.txtvcrn);
        test2.setText(Data.getCrn());

        EditText edtxt = popupView.findViewById(R.id.txtdate);
        edtxt.setText(Data.getDate());

          EditText edtxt2 = popupView.findViewById(R.id.txttime);
          edtxt2.setText(Data.getTime()); */

        Button buttonEdit = popupView.findViewById(R.id.messageButton);
        buttonEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //As an example, display the message
                Toast.makeText(view.getContext(), "Wow, popup action button", Toast.LENGTH_SHORT).show();
            }
        });



        //Handler for clicking on the inactive zone of the window

        popupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                //Close the window when clicked
                popupWindow.dismiss();
                return true;
            }
        });
    }

}
