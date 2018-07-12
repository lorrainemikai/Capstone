package com.adzumi.capstone.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.adzumi.capstone.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HairIntroActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.getStartedButton) Button mGetStartedButton;
    @BindView(R.id.my_toolbar) Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair_intro);
        ButterKnife.bind(this);

        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HomeActivity.class));
            }
        });
        mGetStartedButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if (view == mGetStartedButton){
            Intent intent = new Intent(HairIntroActivity.this, HairServicesActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
