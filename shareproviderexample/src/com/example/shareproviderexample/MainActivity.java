package com.example.shareproviderexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

	private ShareActionProvider myShareActionProvider;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		MenuItem shareOpt = menu.findItem(R.id.menu_item_share);
		//Inicializamos nuestro ShareActionProvider
		myShareActionProvider = (ShareActionProvider)MenuItemCompat.getActionProvider(shareOpt);
		
		//Creamos nuestro sharer Intent
		Intent i = new Intent(Intent.ACTION_SEND);
		i.setType("text/plain");
		i.putExtra(Intent.EXTRA_TEXT, "mensaje de prueba");
		myShareActionProvider.setShareIntent(i);
		
		return true;
	}

}
