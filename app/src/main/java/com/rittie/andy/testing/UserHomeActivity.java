package com.rittie.andy.testing;
//Andy Rittie
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class UserHomeActivity extends AppCompatActivity {

    private Band band;
    User u;
    double[] restingHR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);

        Intent intent = getIntent();



        u = (User) intent.getParcelableExtra("user");

        TextView tvName = (TextView) findViewById(R.id.txtName);
        tvName.setText(u.getName());

        TextView tvEmail = (TextView) findViewById(R.id.txtEmail);
        tvEmail.setText(u.getEmail());

    }

    public void connectBand(View view) {
        band = new Band();
        TextView tvConn = (TextView) findViewById(R.id.txtConn);
        tvConn.setText(band.getTypeBand());
    }

    public void calcHR(View view) {

        double x;
        restingHR = new double[30];
        TextView tvAvgHR = (TextView) findViewById(R.id.txtAvgHR);



            //u.setRestingHR(x);
        for(int i=0; i<30; i++) {
                    x = band.getAvgHeartRate();
                    restingHR[i] = x;



        }
        tvAvgHR.setText(String.valueOf(u.calcAvg(restingHR)));

    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_user_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
