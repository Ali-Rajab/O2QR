package com.bpits.o2qr;

import java.util.Locale;

import com.bpits.o2qr.R;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class final1 extends Activity implements OnClickListener{
	static final String text="y";
	TextToSpeech tts;
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(this);
        tts = new TextToSpeech(final1.this, new TextToSpeech.OnInitListener() {
			
			@Override
			public void onInit(int status) {
				// TODO Auto-generated method stub
				if(status != TextToSpeech.ERROR){
					tts.setLanguage(Locale.US);
				}
			}
		});
    }
    
    
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		if(tts != null){
			tts.stop();
			tts.shutdown();
		}
		super.onPause();
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
	}

}
