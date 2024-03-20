package com.daclink.lifecycle_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.daclink.lifecycle_v2.databinding.ActivityChildBinding;

public class ChildActivity extends AppCompatActivity {


    private static final String SHOW_MESSAGE_ONE = "com.daclink.lifecycle_v2_show_message_one";

    ActivityChildBinding activityChildBinding;
    Button childButton;
    TextView childTextView;
    boolean showMessage1Child;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        activityChildBinding = ActivityChildBinding.inflate(getLayoutInflater());
        setContentView(activityChildBinding.getRoot());

        showMessage1Child = getIntent().getBooleanExtra(SHOW_MESSAGE_ONE, true);

        childButton = activityChildBinding.buttonChild;
        childTextView = activityChildBinding.textviewChildMessage;

        if(showMessage1Child){
            childButton.setText(R.string.true_button);
            childTextView.setText(R.string.true_message);
        }else {
            childButton.setText(R.string.false_button);
            childTextView.setText(R.string.false_message);
        }

        childButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = MainActivity.intentFactory(getApplicationContext());
                startActivity(intent);
            }
        });
    }


    public static Intent intentFactory(Context packageContext, boolean showMessageOne){
        Intent intent = new Intent(packageContext, ChildActivity.class);
        intent.putExtra(SHOW_MESSAGE_ONE, showMessageOne);

        return intent;
    }
}