package com.example.graymonkey.statemachinedemo.states;

import com.example.graymonkey.statemachinedemo.stateMachineLib.State;
import com.example.graymonkey.statemachinedemo.stateMachineLib.StateMachine;


/**
 * Created by graymonkey on 18-1-6.
 * StateMachine类的构造函数是Protect访问权限，所以只能通过继承实现实例化
 */

public class TestStateMachine extends StateMachine {
    public TestStateMachine(String name) {
        super(name);
        constructStatesHierarchy();
    }
    /**
     * 构造状态层次结构（树形结构，可多棵）
     */
    private void constructStatesHierarchy(){
        //构造第一棵树形层次结构
        State s1 = new S1();
        State s2 = new S2();
        State p1 = new P1();
        addState(s1,p1);
        addState(s2,p1);
        //构造第二棵树形层次结构
        State p2 = new P2();
        addState(p2);
        setInitialState(s1);
    }

}
