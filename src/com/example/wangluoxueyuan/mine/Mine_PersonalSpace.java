package com.example.wangluoxueyuan.mine;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wangluoxueyuan.R;
import com.example.wangluoxueyuan.frame.BaseFragment;

public class Mine_PersonalSpace extends BaseFragment {

	private View view;

	public Mine_PersonalSpace() {

	}

	public static Mine_PersonalSpace getInstance(Context context) {
		Mine_PersonalSpace fragment = new Mine_PersonalSpace();
		return fragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.mine_personalspace, container, false);
		return view;
	}

}
