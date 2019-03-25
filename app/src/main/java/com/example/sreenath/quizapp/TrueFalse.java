package com.example.sreenath.quizapp;

public class TrueFalse {
    private int mQuestionId;
    private boolean mAnswer;
    TrueFalse(int questionResourceID, boolean trueOrfalse){
        mQuestionId=questionResourceID;
        mAnswer=trueOrfalse;
    }

    public int getmQuestionId() {
        return mQuestionId;
    }

    public void setmQuestionId(int mQuestionId) {
        this.mQuestionId = mQuestionId;
    }

    public boolean ismAnswer() {
        return mAnswer;
    }

    public void setmAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}
