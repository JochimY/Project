package com.example.wangluoxueyuan;


import java.util.ArrayList;
import com.example.wangluoxueyuan.frame.BaseActivity;
import com.example.wangluoxueyuan.information.ui.Information_InformationList;
import com.example.wangluoxueyuan.message.ui.Message_MessageList;
import com.example.wangluoxueyuan.mine.ui.Mine_PersonalSpace;
import com.example.wangluoxueyuan.smallclass.ui.SmallClass_Classification;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;

public class MainActivity extends BaseActivity {
	public static ViewPager mPager;
	
	private ArrayList<Fragment> fragmentList;
	private Message_MessageList message;
	private Mine_PersonalSpace mine;
	private Information_InformationList infomInformation;
	private SmallClass_Classification smallClass;
	private Information_InformationList book;

	private Button messageB;

	private Button smallclassB;

	private Button bookB;

	private Button informationB;

	private Button mineB;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		messageB=(Button)findViewById(R.id.messageB);
		smallclassB=(Button)findViewById(R.id.smallclassB);
		bookB=(Button)findViewById(R.id.bookB);
		informationB=(Button)findViewById(R.id.informationB);
		mineB=(Button)findViewById(R.id.mineB);
		
		messageB.setOnClickListener(new swithTo(0));
		smallclassB.setOnClickListener(new swithTo(1));
		bookB.setOnClickListener(new swithTo(2));
		informationB.setOnClickListener(new swithTo(3));
		mineB.setOnClickListener(new swithTo(4));
		
		

		mPager = (ViewPager) findViewById(R.id.viewpager);
		
		
		fragmentList=new ArrayList<Fragment>();
		
		message=Message_MessageList.getInstance(this);
		smallClass=SmallClass_Classification.getInstance(this);
		book=Information_InformationList.getInstance(this);
		infomInformation=Information_InformationList.getInstance(this);
		mine=Mine_PersonalSpace.getInstance(this);
		
		fragmentList.add(message);
		fragmentList.add(smallClass);
		fragmentList.add(book);
		fragmentList.add(infomInformation);
		fragmentList.add(mine);
		// 给ViewPager设置适配器
		mPager.setOffscreenPageLimit(5);
		mPager.setAdapter(new MyFragmentPagerAdapter(
				getSupportFragmentManager(), fragmentList));
		mPager.setCurrentItem(0);// 设置当前显示标签页为第一页
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	class MyFragmentPagerAdapter extends FragmentPagerAdapter{
		ArrayList<Fragment> list;
		public MyFragmentPagerAdapter(FragmentManager fm,ArrayList<Fragment> list) {
			super(fm);
			this.list = list;
			
		}
		
		
		@Override
		public int getCount() {
			return list.size();
		}
		
		@Override
		public Fragment getItem(int arg0) {
			return list.get(arg0);
		}
		
		
		
		
	}
	public class swithTo implements View.OnClickListener {
		private int index = 0;

		public swithTo(int i) {
			index = i;
		}

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

			bottomSet(index);

		}
	}
	
	public void bottomSet(int i) {
		mPager.setCurrentItem(i);
		switch (i) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			break;
		}
	}
}