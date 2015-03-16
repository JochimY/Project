package com.example.wangluoxueyuan.information.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wangluoxueyuan.R;
import com.example.wangluoxueyuan.frame.BaseFragment;

public class Information_InformationList extends BaseFragment {

	private View view;

	public Information_InformationList() {

	}

	public static Information_InformationList getInstance(Context context) {
		Information_InformationList fragment = new Information_InformationList();
		return fragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.information_informationlist, container, false);
		return view;
	}

}
