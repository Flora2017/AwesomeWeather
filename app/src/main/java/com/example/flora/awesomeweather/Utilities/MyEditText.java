package com.example.flora.awesomeweather.Utilities;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;

import com.example.flora.awesomeweather.R;
import com.joanzapata.iconify.widget.IconTextView;


public class MyEditText extends FrameLayout {
    private IconTextView mLeftIcon;
    private IconTextView mRightIcon;
    private EditText mContent;

    public MyEditText(@NonNull Context context) {
        super(context);
        init(context);
    }

    public MyEditText(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MyEditText(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public MyEditText(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }


    private void init(Context sContext) {
        LayoutInflater.from(sContext).inflate(R.layout.layout_my_edittext,this);
        mLeftIcon=(IconTextView)findViewById(R.id.lefticon);
        mRightIcon=(IconTextView)findViewById(R.id.righticon);
        mContent=(EditText)findViewById(R.id.content);
        if(mContent.getText().toString().isEmpty()){
            mRightIcon.setVisibility(GONE);
        }else{
            mRightIcon.setVisibility(VISIBLE);
        }
        mContent.addTextChangedListener(new MyEditTextChangeListener());

    }

    public void setContentHint(int sHint){
        mContent.setHint(sHint);
    }

    public void setContentText(String sText){
        mContent.setText(sText);
    }

    public String getContent() {
        return mContent.getText().toString();
    }

    public void setLeftIcon(int sIcon) {
        mLeftIcon.setText(sIcon);
    }
    public void setRightIcon(int sIcon) {
        mRightIcon.setText(sIcon);
    }

    public void setOnCLickListener(OnClickListener sOnClickListener) {
        mRightIcon.setOnClickListener(sOnClickListener);

    }

    public class MyEditTextChangeListener implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int start, int before, int count) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
            String input=charSequence.toString();
            if(input.isEmpty()){
                 mRightIcon.setVisibility(GONE);
            }else{
                mRightIcon.setVisibility(VISIBLE);
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    }


}
