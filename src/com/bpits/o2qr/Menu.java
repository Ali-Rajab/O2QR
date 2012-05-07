package com.bpits.o2qr;



import com.bpits.o2qr.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Menu extends Activity implements OnClickListener{
	Button b;
	Intent i;
	final static int cameraData = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		initialize();
		
		
		
		
		Button OpButton = (Button) findViewById(R.id.buttonOp);
		OpButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity (new Intent("com.bpits.o2qr.OPTIONS"));
			}
		});
		
		Button HeButton= (Button) findViewById(R.id.buttonH);
		HeButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.bpits.o2qr.HELP"));
			}
		});
		Button AbButton= (Button) findViewById(R.id.but);
		AbButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.bpits.o2qr.ABOUT"));
			}
		});
		
	}
	private void initialize() {
		// TODO Auto-generated method stub
		b= (Button) findViewById(R.id.buttonscan);
		b.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()== R.id.buttonscan){
			i=new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
			startActivityForResult(i,cameraData);
		}
	}

}
