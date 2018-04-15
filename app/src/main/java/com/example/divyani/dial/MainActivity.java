package com.example.divyani.dial;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView t;
    String s1 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.phone);

    }

    public void contact(View v) {
        Intent i = new Intent(MainActivity.this, contact.class);
        startActivity(i);
    }

    public void callme(View v) {
        String s = t.getText().toString();
        Toast.makeText(MainActivity.this, "her " + s, Toast.LENGTH_SHORT).show();
        Intent i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:" + s));
        //i.setData(Uri.parse(s));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 1);

            //Toast.makeText(getApplicationContext(),"domrr",Toast.LENGTH_SHORT).show();
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        startActivity(i);


    }
    public void log(View v)
    {
        Intent i=new Intent(MainActivity.this,logInfo.class);
        startActivity(i);
    }
    public void add1(View v)
    {
        String s=t.getText().toString();
        s=s+"1";
        t.setText(s);

    }
    public void add2(View v)
    {
        String s=t.getText().toString();
        s=s+"2";
        t.setText(s);

    }
    public void add3(View v)
    {
        String s=t.getText().toString();
        s=s+"3";
        t.setText(s);

    }
    public void add4(View v)
    {
        String s=t.getText().toString();
        s=s+"4";
        t.setText(s);

    }
    public void add5(View v)
    {
        String s=t.getText().toString();
        s=s+"5";
        t.setText(s);

    }
    public void add6(View v)
    {
        String s=t.getText().toString();
        s=s+"6";
        t.setText(s);

    }
    public void add7(View v)
    {
        String s=t.getText().toString();
        s=s+"7";
        t.setText(s);

    }
    public void add8(View v)
    {
        String s=t.getText().toString();
        s=s+"8";
        t.setText(s);

    }
    public void add9(View v)
    {
        String s=t.getText().toString();
        s=s+"9";
        t.setText(s);

    }
    public void add0(View v)
    {
        String s=t.getText().toString();
        s=s+"0";
        t.setText(s);

    }
    public void clear(View v)
    {
        String s=t.getText().toString();
        t.setText("");
      //  t.setText(s);

    }
    public void addstar(View v)
    {
        String s=t.getText().toString();
        s=s+"*";
        t.setText(s);

    }

}

