package com.rittie.andy.testing;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HeartRateMonitor extends AppCompatActivity {

    private User u;
    private TextView tvBaseline;
    private TextView tvActual;
    private TextView tvSmoothed;
    private TextView tvLevel;
    private Button startBtn;
    private Button stopBtn;
    private Handler handler = new Handler();
    final double[] dummyHR = new double[] {64.71,66.75,64.92,69.88,63.98,64.76,68.06,63.85,66.65,66.44,62.24,67.51,63.67,62.61,70,64,65.47,69.22,63.63,67.04,66.52,65.65,69.89,68.93,69.02,71.31,70.23,73.52,75.93,72.95,69.55,68.42,65.5,67.41,62.63,63.5,68.27,63.66,69.29,68.24,71.39,74,70.5,70.28,74.96,72.14,76.45,74.78,77.3,79.54,76.8,77.8,77.53,74.56,78.11,82.88,83.59,86.33,84.84,84.15,86.05,81.7,80.48,79.59,75.88,77.89,77.4,79.56,79.39,79.12,80.21,76.44,72.44,73.18,70.27,69.6,71.23,68.14,69.3,72.18,70.4,74.82,72.06,75.96,77.64,72.35,70.68,65.65,61.34,63.79,64.77,62.76,65.8,64.64,61.49,65.47,62.91,60.3,66.35,61.84,59.75,67.69,62.92,63.66,68.62,64.79,68.62,71.98,73.48,74.66,69.26,69.51,66.9,70.53,71.41,70.09,72.55,70.8,74.31,71.7,69.27,70.25,64.86,65.09,65.43,64.32,69.44,69.61,70.01,66.93,62.39,63.64,64.56,66.01,67.75,66.19,70.09,65.62,61.91,62.98,66.02,63.74,64.83,67.45,64.99,66.7,65.18,65.06,67.41,62.46,62.1,64.06,62.4,64.99,66.26,67.94,72.2,75.11,76.67,76.45,73.33,71.36,72.15,64.96,63.53,66.37,63.31,65.59,66.2,64.44,67.95,65.63,63.13,68.91,63.71,65.18,66.1,62.26,61.68,63.68,63.06,61.35,64.47,65.04,68.03,73.75,74.83,74.5,76.4,71.63,67.26,67.93,70.13,71.46,80.43,84.43,80.66,77.77,70.1,65.77,65.02,63.06,63.75,65.3,64.74,71.35,66.22,65.53,71.25,68.38,71.27,72.33,71.24,71.74,71.57,69.57,68.72,65.69,68.35,71.75,75.94,81.91,81.78,85.34,78.09,74.67,67.12,69.09,72.76,73.38,80.13,83.93,80.55,66.52,66.23,68.63,70.2,65.85,69.96,67.13,65.14,66.15,72.67,67.04,67.7,69.24,67.02,65.48,69.77,70.62,71.26,71.03,66.8,67.98,66.16,63.31,68.65,70.83,74.67,80.3,76.35,66.66,66.03,64.16,59.13,60.91,65.02,63.9,67.66,65.24,62.45,69.38,62.57,62.67,69.42,64.73,63.87,66.04,65.25,63.61,68.22,65.12,64.8,72.46,67.8,70.41,73.48,66.29,61.6,61.85,64.4,61.18,61.4,69.63,64.78,67.27,72.1,74.9,75.24,70.15,66.78,67.78,67.17,63.59,66.93,64.45,65.6,70.67,67.84,67.29,68.37,65.66,65.75,69.95,71.36,78.61,82.22,84.98,88.83,89.46,86.93,85.01,85.43,81.96,79.03,70.25,68.23,70.64,65.94,65.48,68.37,64.38,63.57,69.19,65.85,66.64,69.65,71.23,68.77,68.65,71.28,68.18,70.27,72.44,69.87,68.09,70.15,66.21,66.53,66.49,62.91,65.56,64.4,63.57,65.79,68.78,64.31,62.19,64.12,63.63,67.29,71.12,73.57,75.18,68.68,67.96,62.24,65.16,67.09,63.86,60.13,64.22,65.03,64.54,68.4,64.63,63.68,66.76,65.24,63.52,65.23,64.23,62.07,66,65.58,64.89,67.71,66.1,65.59,67.76,68.18,66,69.1,68.73,67,70.74,68.33,67.12,69.35,69.13,67.56,70.07,71.94,71.94,76.4,78.29,76.34,74.51,68.58,63.23,67.37,66.02,64.59,68.35,66.05,65.87,68.79,71.86,70.32,71.93,67.72,66.09,68.4,67.71,69.13,71.17,72.27,75.2,77.91,75.72,76.44,71.86,73.81,73.4,72.31,78.37,83.64,86.05,83.85,75.98,76.37,80.61,80.37,81.67,84.22,80.49,82.36,81.3,77.98,77.17,71.87,73.22,72.79,72.39,74.31,74.23,76.96,81.33,79.91,81.57,79.17,79.89,83.32,80.17,78.17,78.45,72.69,72.36,75.26,75.07,77.91,83.43,83.4,84.55,84.73,82.09,80.92,76.76,79.12,78.46,81.49,85.02,80.84,80.03,79.04,77.19,78.3,74.5,74.07,76.43,74.37,79.72,77.83,77.31,77.64,71.06,69.64,71.22,68.89,73.94,70.7,71.96,76.09,75.5,81.77,85.52,92.1,91.33,84.77,74.96,74.48,71.94,68.15,74.46,71.56,71.6,73.45,75.95,82.57,80.26,78.06,73.85,68.91,68.37,68,69.32,70.07,68.79,71.96,71.88,71.02,76.04,73.82,73.68,77.5,75.81,79.47,77.84,75.36,74.96,73.5,77.76,77.81,76.96,81.34,81.07,78.26,79.91,80.3,87.03,91.91,94.69,93.7,85.35,87.38,82.4,82.2,84.14,77.64,77.57,79.26,77.3,78.09,78,72.48,72.25,73.74,72.29,77.62,85.72,88.45,83.98,76.32,75.92,71.42,70.51,73.09,69.57,70.61,72.17,67.39,68.95,71.68,67.53,71.29,71.58,69.31,71.44,71.61,68.78,74.54,71.68,72.39,75.63,76.47,76.86,78.62,75.78,77.84,86.16,90.03,92.28,93.15,91.26,92.7,96.8,101.72,101.67,96.34,90.39,80.38,77.63,79.08,73.72,76.2,79.04,75.58,78.66,79.97,78.4,80.16,71.71,75.73,71.24,70.15,76.23,72.6,72,76,70.13,75.52,77.17,81.39,88.91,93.75,94.5,84.7,76.23,79.99,77.42,77.67,76.59,72.29,75.54,78.88,77.62,81.81,76.73,77.74,71.29,69.74,75.73,77.08,77.72,78.32,72.71,74.94,71.27,70.81,71.09,66.88,68.33,67.67,69.6,70.06,69.58,71.9,74.3,82.14,84.41,77.83,67.02,67.04,66.8,65.14,67.38,67.04,65.36,70.68,66.19,64.43,70.37,63.81,66.6,68.52,64.82,69.54,66.06,65.38,68.91,64.94,66.58,68.05,64.54,69.22,67.71,67.81,71.04,68.73,73.36,74.62,73.28,75.13,68.86,68.01,67.85,65.59,71.41,68.18,71.68,72.95,68.25,73.45,69.46,68.74,76.43,77.94,77.17,74.76,67.26,70.1,70.87,67.59,73.75,69.43,71.52,72.84,69.31,74.35,73.58,82.37,90.35,92.59,93.41,92.8,87.21,90.42,92.43,94.93,96.86,96.89,95.25,88.06,90.18,89.65,95.65,91.95,86.57,79.26,80.29,74.45,77.28,75.74,73.91,77.37,74.86,76.09,80.14,80.36,85.07,80.4,80.48,83.97,83.46,87.53,86.5,86.98,91.79,95.44,96.36,88.22,80.88,82.02,75.91,74.03,77.8,80.62,85.38,93.27,94.2,83.7,80.51,75.78,75.11,71.89,70.71,72.87,71.31,69.41,74.34,69.66,72.87,72.48,70.18,74.93,68.35,69.34,69.65,67.72,69.35,70.58,69.85,74.31,74.87,74.31,73.78,73.02,70.99,67.95,71.68,71.15,73.7,76.91,79.86,82.62,75.59,69.15,74.18,76.11,77.29,77.19,74.55,71.9,73.06,70.05,73.27,70.63,72.72,74.82,74.08,76.02,69.03,66.5,68.88,67.8,67.51,74.12,82.34,88.35,87.37,77.73,79.03,73.72,77.97,75.92,73.36,67.03,64.23,68.89,63.09,63.26,66.67,65.11,66.6,65.38,68.58,69.52,66.35,68.18,70.93,67.42,68.7,73.15,68.56,66.46,68.22,71.74,72.45,82.27,86.56,81.03,77.73,73.62,68.73,70.43,68.24,67.74,74.85,75.69,79.69,82.52,76.19,73.68,74.77,70.11,69.48,70.06,67.48,70.7,68.37,68.18,71.93,72.16,68.22,70.14,73.4,69.27,70.48,73.72,73.14,70.17,76.46,74.25,77.74,77.48,73.94,77.19,78,85.08,91.52,94.95,89.97,79.97,82.11,84.67,77.72,71.63,74.29,73.5,71.8,80.26,92.52,99.31,95.53,86.33,77.83,78,73.97,79.35,84.3,85.12,93.22,92.32,80.19,74.9,77.7,76.95,83.17,83.08,86.61,91.44,93.23,96.07,100.83,101.82,102.7,103.82,106.15,107.83,107.81,108.89,107.69,105.46,104.75,104.91,102.87,105.47,107.26,107.64,103.09,104.59,106.49,109.35,108.24,109.22,108.07,107.16,107.96,111.63,113.06,115.77,117.6,118.3,118.62,118.66,118.87,120.13,121.54,121.75,123.51,124.96,126.67,127.01,127.86,126.81,127.91,127.54,129.42,131.52,133.33,133.78,134.06,133.89,132.6,132.51,132.64,132.5,132.66,131.91,132.24,130.08,129.72,127.65,127.77,129.58,130.69,129.71,128.74,126.43,126.14,125.94,126.87,125.42,125.16,123.03,122.7,121.53,120.7,119.29,119.64,120.65,118.92,121.48,122.02,122.1,121.86,123.57,123.02,123.73,122.15,121.2,118.57,118.45,119.46,119.07,120.85,120.79,120.9,123.85,129.08,128.96,126.04,124.8,129.28,131.18,128.04,128.12,127.14,126.13,123.75,125.21,124.83,125.88,124.65,123.9,124.46,124.53,123.33,122.12,122.15,122.16,122.82,124.11,123.9,123.01,119.94,120.53,124.47,125.37,123.36,120.69,120.53,117.95,116.83,118.78,118.6,119.33,116.16,114.39,113,114.68,114.74,114.47,118.48,118.66,119.64,117.71,115.23,113.62,111.39,110.86,104.21,109.15,111.23,114.05,112.97,113.46,111.47,114.5,118.06,121.24,120.7,116.26,115.41,115.51,113.05,113.47,114.78,116.23,117.04,117.14,116.7,117.65,115.43,115.88,113.19,109.8,104.62,111.66,109.72,111.66,110.79,116.11,118.81,115.14,112.38,106.13,113.76,118.2,110.41,104.24,104.98,102.55,106.38,105.47,106.93,107.25,107.23,109.14,110.18,110.53,106.36,106.17,104.95,103.31,103.16,106.97,105.31,103.91,99.11,96.86,93.75,98.61,100.3,102.23,104.68,107.3,112.19,108.14,103.27,99.48,100.2,98.56,99.77,97.33,97.43,94.94,97.46,97.94,99.35,101.87,106.7,101.89,98.65,96.14,96.73,95.87,98.72,98.36,99.9,98.65,93.27,92.82,93.64,95.14,95.71,96.16,98.68,101.51,99.99,101.47,98.99,99.32,97.1,95.35,104.03,109.15,109.08,113.95,115.5,109.82,101.64,99.51,98.63,101.07,100.87,102.93,101.54,102.09,101.2,103.23,103,106.23,105.96,104.77,101.1,100.04,98.8,100.09,99.85,102.01,99.39,98.87,101.2,101.15,102.74,101.84,100.93,101.34,101.7,104.46,104.3,102.51,101.21,99.98,97.73,100.32,105.56,108.67,108.35,104.93,102.22,96.94,98.67,96.72,98.61,95.35,95.59,93.06,90.2,93.84,92.63,95.95,104.52,107.24,105.43,104.72,103.8,97.89,96.96,92.82,91.97,93.44,95.63,100.7,99.55,100.23,99.67,92.79,92.42,95.42,102.69,100.46,94.81,92.13,92.89,92.29,94.73,90.9,91.54,93.43,91.38,93.96,93.75,96.95,94.59,93.87,94.45,91.83,93.22,91.44,91.04,93.61,101.33,104.02,103.52,99.1,98.83,95.69,96.79,94.99,95.46,95.59,96.16,98.52,99.33,99.24,96.24,96.3,97.51,98.41,97.62,98.69,97.6,98.94,96.41,97.13,95.23,96.58,98.53,102.14,101.8,101.69,103.12,107.1,106.13,103.28,101.31,102.21,99.31,99.47,98.02,97.65,97.92,99.82,98.9,98.73,97.61,99.2,98.7,100.44,100.84,101.69,100.61,100.67,99.08,95.76,94.92,96.69,100.52,104.15,103.74,100.99,98.43,98.24,95.98,95.91,93.43,93.7,95.09,97.64,98.22,98.22,95.85,95.03,92.46,92.66,89.68,90.73,92.39,94.06,95.02,92.18,92.74,90.7,91.4,90.2,91.1,91.42,88.08,87.92,91.28,98.49,104.26,107.22,103.71,101.27,96.82,91.25,91.39,87.28,89.85,88.75,88.73,92.49,91.41,91.26,87.69,84.22,85.96,83.72,85.66,83.41,86.54,84.81,86.01,84.59,83.21,85.87,85.07,87.42,88.46,88.24,89.48,86.33,87.6,87.27,88.58,88.59,86.76,88.43,89.06,95.55,94.69,90.18,85.88,86.55,84.74,87.44,85.64,89.64,97.91,100.77,98.44,95.33,96.78,94.43,94.94,97.42,100.76,100.76,98.5,96.77,95.73,94.59,95.18,92.94,92.37,93.92,92.28,92.95,91.44,89.34,86.96,87.05,87.91,87.28,88.46,88.48,91.24,89.28,89.32,90.15,89.55,91.75,91,93.04,90.81,91.52,93.05,91.88,91.81,91.37,93.01,92.61,93.17,98.34,98.84,97.28,92.52,92.25,90.57,90.86,92.29,95.45,99.17,96.34,95.69,90.26,89.86,88.07,88.46,86.95,86.05,88.54,86.32,89.28,88.89,91.64,90.08,88.92,86.81,87.65,91.04,92.14,94.05,90.58,90.28,88.07,89.74,92.66,97.89,97.7,93.62,86.16,85.65,84.74,83.6,86.22,83.68,84.23,80,80.13,82.61,82.48,87.05,86.53,86.67,86.86,89.29,88.12,86.71,85.37,85.51,88.65,91.51,93.31,92.2,90.87,85.69,93.09,98.19,92.33,86.7,85.46,88.33,90.31,86.49,81.62,80.7,79.3,79.52,89.08,95.47,99.19,87.82,74.38,74.26,75.61,76.49,86.98,89.09,84.6,79.92,82.04,77.99,80.58,87.39,86.83,84.33,84.83,79.88,77.97,80.12,80.31,88.28,92.87,90.51,92.13,86.87,86.01,84.17,80.16,82.27,84.01,82.17,85.44,82.15,80,80.95,83.05,78.09,83.09,80.27,79.04,84.62,86.63,94.33,94.94,90.62};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_rate_monitor);

        Intent intent = getIntent();

        u = (User) intent.getParcelableExtra("user");

        tvBaseline = (TextView) findViewById(R.id.txtBaseline);
        tvBaseline.setText(String.format("%.2f", u.getAvgHR()));
        tvActual = (TextView) findViewById(R.id.txtActual);
        tvSmoothed = (TextView) findViewById(R.id.txtSmoothed);
        tvLevel = (TextView) findViewById(R.id.colorchange);

        startBtn = (Button) findViewById(R.id.btnMonitorStart);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(updateHR, 1000);
            }
        });

        stopBtn = (Button) findViewById(R.id.btnMonitorEnd);
        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.removeCallbacks(updateHR);
            }
        });
    }

    private Runnable updateHR = new Runnable() {
        int i = 0;
        double avg = 0;
        double[] pastResults = new double[] {avg,avg,avg,avg,avg};
        double arousalLevelStep = 0.01875; //based on game percentages it is 0.0375
        double currentAverage;
        double currentSum = 0;
        double averageHeartRate;

        public void run() {
            double hr = dummyHR[i];
            tvActual.setText(String.format("%.2f",hr));
            for (int x = 0; x < pastResults.length - 1; x++) {
                pastResults[x] = pastResults[x + 1];
            }
            pastResults[pastResults.length - 1] = hr;
            currentSum = 0;
            for (int x = 0; x < pastResults.length; x++) {
                currentSum = currentSum + pastResults[x];
            }
            currentAverage = currentSum / pastResults.length;
            tvSmoothed.setText(String.format("%.2f",currentAverage));
            averageHeartRate = u.getAvgHR();

            if (currentAverage > averageHeartRate * (1 + arousalLevelStep * 9)) { //Level 10
                tvLevel.setBackgroundColor(Color.RED);
            } else if (currentAverage > averageHeartRate * (1 + arousalLevelStep * 8)) { //Level 9
                tvLevel.setBackgroundColor(Color.RED);
            } else if (currentAverage > averageHeartRate * (1 + arousalLevelStep * 7)) { //Level 8
                tvLevel.setBackgroundColor(Color.RED);
            } else if (currentAverage > averageHeartRate * (1 + arousalLevelStep * 6)) { //Level 7
                tvLevel.setBackgroundColor(Color.RED);
            } else if (currentAverage > averageHeartRate * (1 + arousalLevelStep * 5)) { //Level 6
                tvLevel.setBackgroundColor(Color.YELLOW);
            } else if (currentAverage > averageHeartRate * (1 + arousalLevelStep * 4)) { //Level 5
                tvLevel.setBackgroundColor(Color.YELLOW);
            } else if (currentAverage > averageHeartRate * (1 + arousalLevelStep * 3)) { //Level 4
                tvLevel.setBackgroundColor(Color.YELLOW);
            } else if (currentAverage > averageHeartRate * (1 + arousalLevelStep * 2)) { //Level 3
                tvLevel.setBackgroundColor(Color.YELLOW);
            } else if (currentAverage > averageHeartRate * (1 + arousalLevelStep)) { //Level 2
                tvLevel.setBackgroundColor(Color.GREEN);
            } else if (currentAverage > averageHeartRate) { //Level 1
                tvLevel.setBackgroundColor(Color.GREEN);
            } else { //Level 0
                tvLevel.setBackgroundColor(Color.GREEN);
            }
            i++;
            if (i == dummyHR.length) {
                handler.removeCallbacks(this);
            }
            else{
                handler.postDelayed(this,1000);
            }
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_heart_rate_monitor, menu);
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
