package com.example.seu_map;

        import androidx.appcompat.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button TestB;
    Button BPup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestB =(Button) findViewById(R.id.btMap);
        TestB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent T = new Intent(MainActivity.this,Test.class);
                startActivity(T);
            }
        });

      /*  BPup =(Button) findViewById(R.id.btacademic);
        BPup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent B = new Intent(MainActivity.this,listpop.class);
                startActivity(B);
            }
        }); */
    }

}
