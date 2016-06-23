package com.ryanzhou.company.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @OnClick(R.id.buttonQuickLookup)
    public void clickLookup(View view) {
        startActivity(new Intent(getApplicationContext(), LookupWordActivity.class));
    }

    @OnClick(R.id.buttonExplore)
    public void clickExplore(View view) {
        startActivity(new Intent(getApplicationContext(), ExploreWordActivity.class));

    }

    @OnClick(R.id.buttonSubmit)
    public void clickSubmit(View view) {
        startActivity(new Intent(getApplicationContext(), SubmitWordActivity.class));
    }

}
