package sg.edu.rp.c346.id19037610.demosimplemovielist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewMovie);

        ArrayList<String> movieList = new ArrayList<String>();
        movieList.add("Avengers Infinity War Release Date: 2018.04");
        movieList.add("Justice League Release Date: 2017.11");

        ArrayAdapter<String> aaMovie = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, movieList);
        lvExamTips.setAdapter(aaMovie);
    }
}
