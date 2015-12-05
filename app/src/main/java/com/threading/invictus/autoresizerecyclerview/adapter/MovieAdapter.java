package com.threading.invictus.autoresizerecyclerview.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.threading.invictus.autoresizerecyclerview.R;
import com.threading.invictus.autoresizerecyclerview.helpers.SimpleCache;
import com.threading.invictus.autoresizerecyclerview.objects.Movie;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/**
 * Created by invictus on 12/3/2015.
 */
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyHolder> {

    List<Movie> movies = Collections.EMPTY_LIST;
    Context context;

    public MovieAdapter(Context context,List<Movie> movies) {
        this.movies = movies;
        this.context=context;
    }

    @Override
    public MovieAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_movie, parent, false);

        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(final MovieAdapter.MyHolder holder, int position) {
        final Movie movie=movies.get(position);

        //get from weakreference
        holder.textViewWeakReference.get().setText(movie.getMovieName());
        holder.imageViewWeakReference.get().setImageResource(movie.getMovieImage());

        //change text_color using palette
      Palette palette= SimpleCache.getPalette(context,movie.getMovieImage());

        holder.cardViewWeakReference.get().setBackgroundColor(palette.getMutedColor(context.getResources().getColor(R.color.colorAccent)));


    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        final public WeakReference<ImageView> imageViewWeakReference;
        final public WeakReference<TextView> textViewWeakReference;
        final public WeakReference<LinearLayout> cardViewWeakReference;

        public MyHolder(View itemView) {
            super(itemView);

            imageViewWeakReference = new WeakReference<ImageView>((ImageView) itemView.findViewById(R.id.movie_image));
            textViewWeakReference=new WeakReference<TextView>((TextView) itemView.findViewById(R.id.movie_name));
            cardViewWeakReference=new WeakReference<LinearLayout>((LinearLayout) itemView.findViewById(R.id.card_view));
        }
    }
}
