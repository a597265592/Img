package com.example.admin.img.other;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.admin.img.R;

/**
 * Created by admin on 2017/4/25.
 */

public class TimeView extends LinearLayout implements IndexInterface {
    private TextView mTextView;

    public TimeView(Context context) {
        super(context);
    }

    public TimeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TimeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflate(context, R.layout.view_time_view,this);
        mTextView = (TextView) findViewById(R.id.tv_time);
    }

    @Override
    public void getTime(Info info) {
        mTextView.setText(info.getAge());
    }


}
