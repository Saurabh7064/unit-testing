package com.in28minutes.unittesting.unittesting.business;

public class Vote {
    public void isEligibleToVote(int age){
        if(age>=18)
            getResult("yes");
        else
            getResult("no");

    }

    public String getResult(String result){
        return result;
    }
}
