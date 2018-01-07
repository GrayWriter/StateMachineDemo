package com.example.graymonkey.statemachinedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.graymonkey.statemachinedemo.stateMachineLib.StateMachine;
import com.example.graymonkey.statemachinedemo.states.TestStateMachine;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private StateMachine mSm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSm = new TestStateMachine("stateMachine");
        setupView();

    }
    private void setupView(){
        findViewById(R.id.start).setOnClickListener(this);
        findViewById(R.id.stop).setOnClickListener(this);
        findViewById(R.id.force_stop).setOnClickListener(this);
        findViewById(R.id.reset).setOnClickListener(this);
        findViewById(R.id.sendMsg).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.start:
                mSm.start();
                break;
            case R.id.stop:
                mSm.quit();
                break;
            case R.id.force_stop:
                mSm.quitNow();
                break;
            case R.id.reset:
                mSm = new TestStateMachine("stateMachine");
                break;
            case R.id.sendMsg:
                mSm.sendMessage(666);
                break;
            default:
        }
    }
}
