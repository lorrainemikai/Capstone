package com.adzumi.capstone;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.adzumi.capstone.ui.HomeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ClientActivity extends Activity implements View.OnClickListener{
    @BindView(R.id.biotextView)TextView mBioTextView;
    @BindView(R.id.bioEditText)EditText mBioEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);
        ButterKnife.bind(this);

        mBioTextView.setOnClickListener(this);
        mBioEditText.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View view) {
if (view==mBioTextView){
    mBioEditText.setVisibility(View.VISIBLE);
}    }
}
