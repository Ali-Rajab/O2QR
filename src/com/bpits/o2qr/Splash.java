package com.bpits.o2qr;

import com.bpits.o2qr.R;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity{
MediaPlayer ourSong;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spalsh);
		 ourSong = MediaPlayer.create(Splash.this, R.raw.hehe);
		ourSong.start();
		 Thread timer = new Thread(){
		@Override
		public void run(){
			try{
				sleep(5000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}finally{
			Intent openMain= new Intent("com.bpits.o2qr.MAIN");
				startActivity(openMain);
			}
			
		}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSong.release();
		finish();
	}
	

}
