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

    ArrayList<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        users = new ArrayList<User>();

        users.add(new User("Andy","andy@gmail.com"));
        users.add(new User("Bobby","bobbie@gmail.com"));
        users.add(new User("Charlie","charlie@gmail.com"));

        ArrayAdapter<User> itemsAdapter =
                new ArrayAdapter<User>(this, android.R.layout.simple_list_item_1, users);
        ListView listView = (ListView) findViewById(R.id.lvUsers);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id){
                final User u = (User) parent.getItemAtPosition(position);
                Intent in = new Intent(MainActivity.this, UserHomeActivity.class);
                in.putExtra("user", u);
                startActivity(in);
            }
        });


    }

    public void newUser(View view) {
        EditText etName = (EditText)findViewById(R.id.editText);
        EditText etEmail = (EditText)findViewById(R.id.editText2);

        User new_user = new User(etName.getText().toString(),etEmail.getText().toString());
        users.add(new_user);

        Intent in = new Intent(this, UserHomeActivity.class);
        in.putExtra("user", new_user);
        startActivity(in);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        ArrayAdapter<User> itemsAdapter =
                new ArrayAdapter<User>(this, android.R.layout.simple_list_item_1, users);
        ListView listView = (ListView) findViewById(R.id.lvUsers);
        listView.setAdapter(itemsAdapter);
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
