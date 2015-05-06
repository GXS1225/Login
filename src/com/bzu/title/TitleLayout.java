package com.bzu.title;

import com.example.login.R;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class TitleLayout extends LinearLayout{
	private Button btnBack;
	private Button btnEdit;
	
	public TitleLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		LayoutInflater.from(context).inflate(R.layout.layout_title1, this);

	    findViewById();
	    //点击Edit按钮的时间处理
	    btnEdit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//点击Edit按钮出现的信息
				Toast.makeText(getContext(), "GXS......", Toast.LENGTH_LONG).show();
				
			}
		});
	    
	}

	private void findViewById() {
		btnBack = (Button) findViewById(R.id.btnBack);
		btnEdit = (Button) findViewById(R.id.btnEdit);
		
	}


}
