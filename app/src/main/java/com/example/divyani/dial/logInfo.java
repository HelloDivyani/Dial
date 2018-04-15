package com.example.divyani.dial;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CallLog;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Divyani on 12-04-2018.
 */
public class logInfo extends AppCompatActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.info);
            Intent showCallLog = new Intent();
            showCallLog.setAction(Intent.ACTION_VIEW);
            showCallLog.setType(CallLog.Calls.CONTENT_TYPE);
            startActivity(showCallLog);



        }
}
