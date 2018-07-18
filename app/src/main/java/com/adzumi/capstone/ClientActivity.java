package com.adzumi.capstone;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.adzumi.capstone.ui.HomeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ClientActivity extends Activity implements View.OnClickListener{
    @BindView(R.id.biotextView)TextView mBioTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);
        ButterKnife.bind(this);

        mBioTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
if (view==mBioTextView){
    Intent intent = new Intent(ClientActivity.this, HomeActivity.class);
    startActivity(intent);
}    }
}
