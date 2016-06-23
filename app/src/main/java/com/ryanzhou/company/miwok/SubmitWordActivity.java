package com.ryanzhou.company.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SubmitWordActivity extends AppCompatActivity {

    /* Would look to see if the word is already in db. If not, then user would choose category
    * for word to be submitted. Then user would record & play using android android.media. Finally,
    * submission would be made to the cloud*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
    }
}
