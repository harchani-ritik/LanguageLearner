package com.example.android.languagelearner;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

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

        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("डाडो","grandfather",R.drawable.family_grandfather,R.raw.sindhi_grandfather));
        words.add(new Word("डाडी","grandmother",R.drawable.family_grandmother,R.raw.sindhi_grandmother));
        words.add(new Word("पिय","father",R.drawable.family_father,R.raw.sindhi_father));
        words.add(new Word("माव","mother",R.drawable.family_mother,R.raw.sindhi_mother));
        words.add(new Word("पुत्त्र","son",R.drawable.family_son,R.raw.sindhi_son));
        words.add(new Word("धीय","daughter",R.drawable.family_daughter,R.raw.sindhi_daughter));
        words.add(new Word("वॅड्डो भाव","older brother",R.drawable.family_older_brother,R.raw.sindhi_olderbrother));
        words.add(new Word("नॅंढो भाव","younger brother",R.drawable.family_younger_brother,R.raw.sindhi_youngerbrother));
        words.add(new Word("वॅड्डी भेड़","older sister",R.drawable.family_older_sister,R.raw.sindhi_oldersister));
        words.add(new Word("नाँधि भेड़","younger sister",R.drawable.family_younger_sister,R.raw.sindhi_youngersister));



        WordAdapter adapter = new WordAdapter(this,words,"#379237");
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() /*anynonymous class*/ {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Release the media player if it currently exists because we are about to
                // play a different sound file
                releaseMediaPlayer();

                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(FamilyMembers.this,word.getAudioResourceId());
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
