package com.example.wangluoxueyuan.book.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wangluoxueyuan.R;
import com.example.wangluoxueyuan.frame.BaseFragment;

public class Book_Recommend extends BaseFragment {

	private View view;

	public Book_Recommend() {

	}

	public static Book_Recommend getInstance(Context context) {
		Book_Recommend fragment = new Book_Recommend();
		return fragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.book_recommend, container, false);
		return view;
	}

}
