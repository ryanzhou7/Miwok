package com.ryanzhou.company.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LookupWordActivity extends AppCompatActivity {

    /* Looks up given word through downloaded database, as new submitted words are submitted and
    * approved then just the word (not audio) is downloaded and saved*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lookup);

    }
}
