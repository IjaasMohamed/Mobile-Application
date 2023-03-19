package com.example.labsheet03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val nYear = findViewById(R.id.tbInputNumber);
        var  display = findViewById(R.id.lbAns);

    }
    fun calcAge (View : view){
        var nYear = nYear.getText().toString();
        var cYear = Calender.getInstance().get(Calender.Year);
        var ans = String.valueOf (cYear - nYear)

        display.setText("Your age is " + ans)
    }
}