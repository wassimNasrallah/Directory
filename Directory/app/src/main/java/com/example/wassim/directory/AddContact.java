package com.example.wassim.directory;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Wassim on 14/05/2018.
 */

public class AddContact extends AppCompatActivity {

    Button AddContact;
    EditText textFirstName, textLastName, textEmail, textPhone;
    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);


        getSupportActionBar().setTitle("Add Contact");
        buttonListener();

        /*AddContact = (Button) findViewById(R.id.buttonAdd);
        lv = (ListView) findViewById(R.id.ListView);
        textFirstName = (EditText)findViewById(R.id.editText_FirstName);
        textLastName = (EditText)findViewById(R.id.editText_LastName);
        textEmail = (EditText)findViewById(R.id.editText_Email);
        textPhone = (EditText)findViewById(R.id.editText_Phone);


        al = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(AddContact.this, android.R.layout.simple_list_item_1, al);

        lv.setAdapter(adapter);*/

    }

    public void buttonListener() {

        AddContact = (Button) findViewById(R.id.buttonAdd);
        AddContact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String res = textFirstName.getText().toString();
                al.add(res);
                adapter.notifyDataSetChanged();


                AddContact = (Button) findViewById(R.id.buttonAdd);
                lv = (ListView) findViewById(R.id.ListView);
                textFirstName = (EditText)findViewById(R.id.editText_FirstName);
                textLastName = (EditText)findViewById(R.id.editText_LastName);
                textEmail = (EditText)findViewById(R.id.editText_Email);
                textPhone = (EditText)findViewById(R.id.editText_Phone);


                al = new ArrayList<String>();
                adapter = new ArrayAdapter<String>(AddContact.this, android.R.layout.simple_list_item_1, al);

                lv.setAdapter(adapter);


                Intent i = new Intent(getBaseContext(), MainActivity.class);
                startActivity(i);

            }
        });
    }
}
