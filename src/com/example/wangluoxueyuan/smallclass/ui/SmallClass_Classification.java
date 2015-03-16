package com.example.wangluoxueyuan.smallclass.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wangluoxueyuan.R;
import com.example.wangluoxueyuan.frame.BaseFragment;

public class SmallClass_Classification extends BaseFragment {

	private View view;

	public SmallClass_Classification() {

	}

	public static SmallClass_Classification getInstance(Context context) {
		SmallClass_Classification fragment = new SmallClass_Classification();
		return fragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.smallclass_classification, container, false);
		return view;
	}

}
