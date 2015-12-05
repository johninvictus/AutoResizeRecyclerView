package com.threading.invictus.autoresizerecyclerview.helpers;

import com.threading.invictus.autoresizerecyclerview.R;
import com.threading.invictus.autoresizerecyclerview.objects.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by invictus on 12/3/2015.
 */
public class Faker {

    public static int[] movie_poster = {R.drawable.angry_birds, R.drawable.avata, R.drawable.big_hero, R.drawable.cell, R.drawable.champs,
            R.drawable.gods_egypt, R.drawable.jungle_book, R.drawable.mac_beth, R.drawable.pan, R.drawable.pirates_caribean, R.drawable.pixels,
            R.drawable.shooting_starts, R.drawable.stung, R.drawable.suicide_squad, R.drawable.war_craft};

    public static String[] movie_names = {"Angry Birds", "Avatar", "Big Hero 6", "Cell", "Champs",
            "gods of egypt", "Jungle Book", "Mac Beth", "Pan", "Pirates", "Pixels", "Shooting Starts", "Stung", "Suicide Squad", "Warcraft"};

    public static List<Movie> getMovies() {
        List<Movie> temp = new ArrayList<>();

        for (int i = 0; i < movie_names.length; i++) {
            Movie movie = new Movie(movie_names[i], movie_poster[i]);
            temp.add(movie);
        }
        return temp;
    }
}
