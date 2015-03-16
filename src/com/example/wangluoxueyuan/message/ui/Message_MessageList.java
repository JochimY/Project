package com.example.wangluoxueyuan.message.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wangluoxueyuan.R;
import com.example.wangluoxueyuan.frame.BaseFragment;

public class Message_MessageList extends BaseFragment {

	private View view;

	public Message_MessageList() {

	}

	public static Message_MessageList getInstance(Context context) {
		Message_MessageList fragment = new Message_MessageList();
		return fragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.message_messagelist, container, false);
		return view;
	}

}
