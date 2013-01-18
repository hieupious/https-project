package com.android.TourGuide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class TourGuideActivity extends Activity {
    /** Called when the activity is first created. */
	
	Button btSearch;
	EditText txtSearch;
	Button btTourInfo;
	Button btComSentences;
	
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainportrait);
        
        txtSearch = (EditText)findViewById(R.id.txtSearch1);
        btTourInfo = (Button)findViewById(R.id.touristButton);
        btSearch = (Button)findViewById(R.id.searchButton);
        btComSentences = (Button)findViewById(R.id.communicateButton);
        
        btTourInfo.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intend = new Intent(getApplicationContext(),TouristInformationMenu.class);
				startActivity(intend);
			}
		});
        
    }
}