package com.example.divyani.dial;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Divyani on 12-04-2018.
 */
public class contact extends AppCompatActivity
{
    EditText mEmailAddress;
    EditText mPhoneNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addcontact);
        mEmailAddress = (EditText) findViewById(R.id.editText2);
        mPhoneNumber = (EditText) findViewById(R.id.editText3);

    }
    public void add(View v)
    {
        //Intent intent;


        Intent intent = new Intent(Contacts.Intents.Insert.ACTION);
// Sets the MIME type to match the Contacts Provider
        intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
        //Add a new Contact in Database of Contact
        intent.putExtra(Contacts.Intents.Insert.EMAIL, mEmailAddress.getText()).putExtra(Contacts.Intents.Insert.EMAIL_TYPE, ContactsContract.CommonDataKinds.Email.TYPE_WORK)
// Inserts a phone number
                .putExtra(Contacts.Intents.Insert.PHONE, mPhoneNumber.getText())
/*
 * In this example, sets the phone type to be a work phone.
 * You can set other phone types as necessary.
 */
                .putExtra(Contacts.Intents.Insert.PHONE_TYPE, ContactsContract.CommonDataKinds.Phone.TYPE_WORK);
        startActivity(intent);
    }
}
