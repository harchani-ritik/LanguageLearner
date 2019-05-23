package com.example.android.languagelearner;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    /**
     * This listener gets triggered when the {@link MediaPlayer} has completed
     * playing the audio file.
     */
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onStop() {
        super.onStop();
        mMediaPlayer.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("हिक", "one", R.drawable.number_one,R.raw.sindhi_one));
        words.add(new Word("ब", "two", R.drawable.number_two,R.raw.sindhi_two));
        words.add(new Word("ट्रे", "three", R.drawable.number_three,R.raw.sindhi_three));
        words.add(new Word("चार", "four", R.drawable.number_four,R.raw.sindhi_four));
        words.add(new Word("पंज", "five", R.drawable.number_five,R.raw.sindhi_five));
        words.add(new Word("छ", "six", R.drawable.number_six,R.raw.sindhi_six));
        words.add(new Word("सत", "seven", R.drawable.number_seven,R.raw.sindhi_seven));
        words.add(new Word("अठ", "eight", R.drawable.number_eight,R.raw.sindhi_eight));
        words.add(new Word("नॅव", "nine", R.drawable.number_nine,R.raw.sindhi_nine));
        words.add(new Word("डह", "ten", R.drawable.number_ten,R.raw.sindhi_ten));

        WordAdapter adapter = new WordAdapter(this, words, "#FD8E09");
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() /*anynonymous class*/ {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Release the media player if it currently exists because we are about to
                // play a different sound file
                releaseMediaPlayer();

                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(Numbers.this,word.getAudioResourceId());
                mMediaPlayer.start();

                // Setup a listener on the media player, so that we can stop and release the
                // media player once the sound has finished playing.
                mMediaPlayer.setOnCompletionListener(mCompletionListener);

                mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {

                    }
                });

            }
        });
    }
    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }
}
