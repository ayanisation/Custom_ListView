package com.example.listviewsample;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] avengers = {"Iron Man","Doctor Strange","Captain America","Thor","Hulk","Black Widow","Hawkeye","Spiderman","Starlord","Scarlett Witch" };
        ListAdapter myadapter = new CustomAdapter(this,avengers);
        ListView mylist = (ListView)findViewById(R.id.mylist);
        mylist.setAdapter(myadapter);
        mylist.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String [] name = {"Tony Stark","Dr. Stephen Strange","Steve Rogers","Thor Odinson","Dr. Bruce Banner","Natasha Romanoff","Clint Barton","Peter Parker","Peter Quill","Wanda Maximoff" };
                        String avenger = name[position];
                        Toast.makeText(MainActivity.this,avenger,Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
