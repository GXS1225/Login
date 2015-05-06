package com.gxs.listview;
import java.util.List;

import com.example.login.R;
import com.gxs.*;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class ListView1 extends Activity{
	private ListView listview_fruits;
	//准备好的数据
	private String[] date = {"Apple", "Banana", "Orange", "Watermelon","Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_liatview);
		//ID
		findViewById();
		
		//建立Adapter和数据源的关联
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, date);
		
		//显示数据
		listview_fruits.setAdapter(adapter);
	}
	private void findViewById() {
		
		listview_fruits = (ListView) findViewById(R.id.listview_fruit);
		
	}

}
