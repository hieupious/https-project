package com.android.TourGuide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class TourGuideActivity extends Activity {
    /** Called when the activity is first created. */
	
	ImageButton btSearch;
	EditText txtSearch;
	Button btTourInfo;
	Button btComSentences;
	ImageButton btMap;
	
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainportrait);
        
        txtSearch = (EditText)findViewById(R.id.txtSearch1);        
        btSearch = (ImageButton)findViewById(R.id.searchButton);
        btMap = (ImageButton)findViewById(R.id.mapButton);
        btTourInfo = (Button)findViewById(R.id.touristButton);
        btComSentences = (Button)findViewById(R.id.communicateButton);
        
        
        btTourInfo.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intend = new Intent(getApplicationContext(),TouristInformationMenu.class);
				startActivity(intend);
			}
		});
        
        btComSentences.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),CommunicateSentenseMenu.class);
				startActivity(intent);				
			}
		});
        
        btMap.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(getApplicationContext(),MapMenu.class);
				startActivity(intent);				
			}
		});
        
    }
}