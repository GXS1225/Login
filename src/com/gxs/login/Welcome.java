package com.gxs.login;

import com.bzu.title.Title;
import com.example.login.R;
import com.gxs.listview.*;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Welcome extends Activity {
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
    }

    public void To_fruist(View v){
    	Intent intent = new Intent(Welcome.this,ListView1.class);
    	startActivity(intent);
    }
    
    public void To_Title(View v){
    	Intent intent = new Intent(Welcome.this,Title.class);
    	startActivity(intent);
    }
    
}
