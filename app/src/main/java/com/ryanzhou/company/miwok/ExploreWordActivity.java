package com.ryanzhou.company.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ExploreWordActivity extends AppCompatActivity {

    /* Shows a list of the most popular words as found through network call, UI is just prototyped
     * with linearlayout and one "item" from the list. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
    }
}
