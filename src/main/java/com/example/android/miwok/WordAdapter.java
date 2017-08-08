package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sufya on 17-06-2017.
 */

public class WordAdapter extends ArrayAdapter<Word>{
    private int mColorResourceId;
    private MediaPlayer mediaplayer;

    public WordAdapter(Context context, ArrayList<Word> words,int colorResourceId) {
        super(context,0, words);
        mColorResourceId=colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.v("Word Adapter-Numb","number activity called");
        View listItemView=convertView;
        if(listItemView == null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        final Word currentWord=getItem(position);

        TextView miTextView=(TextView)listItemView.findViewById(R.id.miwok_text_view);
        miTextView.setText(currentWord.getMiwokTranslation());

        TextView engTextView=(TextView)listItemView.findViewById(R.id.default_text_view);
        engTextView.setText(currentWord.getDefaultTranslation());

        ImageView mImageView =(ImageView)listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()) {

            //get the imageResource get and set it as source of the image view
            mImageView.setImageResource(currentWord.getImageResourceId());

            //make the image view visible
            mImageView.setVisibility(View.VISIBLE);
        }
        else {
            mImageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

       /*textContainer.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    mediaplayer= MediaPlayer.create(getContext(),currentWord.getSoundResourceId());
                    mediaplayer.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    mediaplayer.release();
                }
                return true;
            }
        });*/

        return listItemView;
    }
}
