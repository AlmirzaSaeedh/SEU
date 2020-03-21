package com.example.seu_map;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class nameDropDownOnClickListener implements OnItemClickListener {

    @Override
    public void onItemClick( AdapterView<?> parent,
                                      View view,
                                      int position,
                                      long id ) {

        Context mContext = view.getContext();
        listpop Listpop = ((listpop) mContext);

        Animation fadeInAnimation = AnimationUtils.loadAnimation(view.getContext(), android.R.anim.fade_in);
        fadeInAnimation.setDuration(10);
        view.startAnimation(fadeInAnimation);

        Listpop.popupWindows.dismiss();

        Toast.makeText(mContext, "Selected Positon is: " + position, Toast.LENGTH_LONG).show();


    }

}
