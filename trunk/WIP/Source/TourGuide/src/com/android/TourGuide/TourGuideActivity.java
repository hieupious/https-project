package com.android.TourGuide;

import android.app.Activity;
import android.gesture.GestureOverlayView;
import android.os.Bundle;
import android.view.GestureDetector;
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
        setContentView(R.layout.main_portrait);
        //setContentView(R.layout.main_landscape);
        //setContentView(R.layout.tourist_information_main);
        
        txtSearch = (EditText)findViewById(R.id.txtSearch1);
        btTourInfo = (Button)findViewById(R.id.touristButton);
        
        
    }
}