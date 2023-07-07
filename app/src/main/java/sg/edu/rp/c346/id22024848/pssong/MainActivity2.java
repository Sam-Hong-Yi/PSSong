package sg.edu.rp.c346.id22024848.pssong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView lw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lw=findViewById(R.id.listView);
        Intent intentReceived=getIntent();
        DBHelper db = new DBHelper(MainActivity2.this);
        ArrayList<Song> data=db.getSong();
        db.close();
        ArrayAdapter aaSong=new ArrayAdapter<Song>(this, android.R.layout.simple_list_item_1, data);
        lw.setAdapter(aaSong);
    }
}