package com.threading.invictus.autoresizerecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.threading.invictus.autoresizerecyclerview.adapter.MovieAdapter;
import com.threading.invictus.autoresizerecyclerview.helpers.Faker;

import java.lang.ref.WeakReference;

public class MainActivity extends AppCompatActivity {

    WeakReference<RecyclerView> recyclerViewWeakReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUi();

        processUi();
    }

    private void initUi() {
        recyclerViewWeakReference = new WeakReference<RecyclerView>((RecyclerView) findViewById(R.id.recyclerview));
    }

    private void processUi() {
        MovieAdapter adapter = new MovieAdapter(getBaseContext(),Faker.getMovies());

        recyclerViewWeakReference.get().setAdapter(adapter);
    }


}
