package sg.edu.rp.c346.id21024625.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;
    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.buttonReset);
        cbEnabled = findViewById(R.id.checkBoxSmoking);
        btnCheck = findViewById(R.id.buttonCheck);
        tvShow = findViewById(R.id.textViewSmoking);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = "Time is " + "tp.getCurrentHour(), tp.getCurrentMinute()";
                tvDisplay.setText(str);

            }

        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "Date is " + dp.getDayOfMonth() + "/" + (1 + dp.getMonth()) + "/" + dp.getYear();
                tvDisplay.setText(str);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setCurrentHour(19);
                tp.setCurrentMinute(30);
                dp.updateDate(2020, 05, 01);
            }
        });


        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyActivity", "Inside onClick()");
                if(cbEnabled.isChecked()){
                    String str = "Smoking.";
                    tvShow.setText(str);

                } else{
                    String str = "Non-smoking";
                    tvShow.setText(str);
                }
                Toast.makeText(MainActivity.this,"Button Click", Toast.LENGTH_LONG).show();
            }
        }   )  ;
    }
}
