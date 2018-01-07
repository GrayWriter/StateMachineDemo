package com.example.graymonkey.statemachinedemo.states;

import android.os.Message;
import android.util.Log;

import com.example.graymonkey.statemachinedemo.stateMachineLib.State;
import com.example.graymonkey.statemachinedemo.stateMachineLib.StateMachine;

/**
 * Created by graymonkey on 18-1-7.
 */

public class BaseState extends State {
    protected BaseState() {
        super();
    }

    @Override
    public void enter() {
        super.enter();
        Log.d("StateMachineTest",getName()+":"+"enter");
    }

    @Override
    public void exit() {
        super.exit();
        Log.d("StateMachineTest",getName()+":"+"exit");
    }

    @Override
    public boolean processMessage(Message msg) {
        Log.d("StateMachineTest",getName()+":"+"processMsg--->what"+msg.what);
        return super.processMessage(msg);
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
