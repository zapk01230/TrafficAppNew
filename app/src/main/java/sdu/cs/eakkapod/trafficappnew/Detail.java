package sdu.cs.eakkapod.trafficappnew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //ผูกตัวแปล java กับ  xml
        TextView  titleTextView  = findViewById(R.id.txtTitle);
        TextView  detailTextView = findViewById(R.id.txtDetail);
        ImageView logoImageView  = findViewById(R.id.imvLogo);


        //รับค่าจาก Intent
        titleTextView.setText(getIntent().getStringExtra("Title"));
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        logoImageView.setImageResource(getIntent().getIntExtra("Logo",R.drawable.traffic_01));



    }//end onCreat

    public void clickBack(View view) {

        finish();

    }//end cilckback
}//end class
