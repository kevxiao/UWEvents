package com.uwtools.uwevents;

import android.os.Bundle;
import android.os.AsyncTask;


import android.app.Activity;
import android.app.ProgressDialog;

import android.view.Menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
 
import android.content.Intent;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;


import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class Events extends Activity {
	
	// Progress Dialog
    private ProgressDialog pDialog;
 
    // Array list for list view
    ArrayList<HashMap<String, String>> rssFeedList;
 
    RSSParser rssParser = new RSSParser();
 
    RSSFeed rssFeed;
     
    // button add new website
    ImageButton btnAddSite;
     
    // array to trace sqlite ids
    String[] sqliteIds;
 
    public static String TAG_ID = "id";
    public static String TAG_TITLE = "title";
    public static String TAG_LINK = "link";
     
    // List view
    ListView lv;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.events, menu);

        return super.onCreateOptionsMenu(menu);
    }
    
}
