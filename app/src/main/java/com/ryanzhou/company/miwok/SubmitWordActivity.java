package com.ryanzhou.company.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SubmitWordActivity extends AppCompatActivity {

    /* Would look to see if the word is already in db. If not, then user would choose category
    * for word to be submitted. Then user would record & play using android android.media. Finally,
    * submission would be made to the cloud.*/
    @BindView(R.id.spinner)
    Spinner mCategorySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        ButterKnife.bind(this);
        setAdapterforCategorySpinner();
    }

    private void setAdapterforCategorySpinner() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.word_categories_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mCategorySpinner.setAdapter(adapter);
    }
}
