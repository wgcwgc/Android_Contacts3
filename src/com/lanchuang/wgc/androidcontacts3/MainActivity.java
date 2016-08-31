package com.lanchuang.wgc.androidcontacts3;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Contacts.People;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

@SuppressWarnings("deprecation")
public class MainActivity extends Activity
{

	ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);

		listView = new ListView(this);

		Cursor cursor = getContentResolver().query(People.CONTENT_URI ,null ,null ,null ,null);

		startManagingCursor(cursor);
		// ListAdapter listAdapter = new SimpleCursorAdapter(this ,
		// android.R.layout.simple_expandable_list_item_2 , cursor , new String
		// []
		// { People.NAME, People.NUMBER } , new int [] { android.R.id.text1,
		// android.R.id.text2 });

		ListAdapter listAdapter = new SimpleCursorAdapter(this , android.R.layout.simple_expandable_list_item_1 , cursor , new String []
		{ People.NAME } , new int []
		{ android.R.id.text1 });
		listView.setAdapter(listAdapter);

		setContentView(listView);

	}

}
