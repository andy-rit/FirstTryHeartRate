package com.rittie.andy.testing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> userNames = new ArrayList<String>();
        userNames.add("Andy");
        userNames.add("Bobby");
        userNames.add("Charlie");
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, userNames);
        ListView listView = (ListView) findViewById(R.id.lvUsers);
        listView.setAdapter(itemsAdapter);
    }

    public void newUser(View view) {
        EditText etName = (EditText)findViewById(R.id.editText);
        EditText etEmail = (EditText)findViewById(R.id.editText2);

        User new_user = new User(etName.getText().toString(),etEmail.getText().toString());

        Intent in = new Intent(this, UserHomeActivity.class);
        in.putExtra("user",new_user);
        startActivity(in);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
