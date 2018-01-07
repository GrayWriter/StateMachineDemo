package com.example.graymonkey.statemachinedemo.states;

import android.os.Message;
import android.util.Log;

import com.example.graymonkey.statemachinedemo.stateMachineLib.State;
import com.example.graymonkey.statemachinedemo.stateMachineLib.StateMachine;

/**
 * Created by graymonkey on 18-1-6.
 */

public class S1 extends BaseState {
    public S1() {
        super();
    }

    @Override
    public void enter() {
        super.enter();
    }

    @Override
    public void exit() {
        super.exit();
    }

    @Override
    public boolean processMessage(Message msg) {
        return false;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
