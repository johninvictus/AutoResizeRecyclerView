package com.threading.invictus.autoresizerecyclerview.helpers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.graphics.Palette;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by invictus on 12/4/2015.
 */
public class SimpleCache {

    private static Map<Integer, Palette> paletteSimpleCacehe = new HashMap<>();



    public static Palette getPalette(final Context context, final Integer imageResource) {

        //check if there exist such cache


        if (!paletteSimpleCacehe.containsKey(imageResource)) {
            Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), imageResource);

           Palette palette= Palette.generate(bitmap);
            paletteSimpleCacehe.put(imageResource,palette);
        }


        return  paletteSimpleCacehe.get(imageResource);

    }


}
