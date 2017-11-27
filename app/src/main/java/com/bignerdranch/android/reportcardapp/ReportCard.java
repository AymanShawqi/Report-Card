package com.bignerdranch.android.reportcardapp;


public class ReportCard {
    private String mStudentName;
    private double mEnglishGrade;
    private double mMathGrade;
    private double mHistoryGrade;
    private double mBiologyGrade;
    private double mChemistryGrade;
    private double mPhysicsGrade;

    public ReportCard(String studentName, double englishGrade, double mathGrade, double historyGrade, double biologyGrade, double chemistryGrade, double physicsGrade) {
        mStudentName = studentName;
        setEnglishGrade(englishGrade);
        setMathGrade(mathGrade);
        setHistoryGrade(historyGrade);
        setBiologyGrade(biologyGrade);
        setChemistryGrade(chemistryGrade);
        setPhysicsGrade(physicsGrade);
    }

    public double getEnglishGrade() {
        return mEnglishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        if (englishGrade >= 0 && englishGrade <= 100)
            mEnglishGrade = englishGrade;
    }

    public double getMathGrade() {
        return mMathGrade;
    }

    public void setMathGrade(double mathGrade) {
        if (mathGrade >= 0 && mathGrade <= 100)
            mMathGrade = mathGrade;
    }

    public double getHistoryGrade() {
        return mHistoryGrade;
    }

    public void setHistoryGrade(double historyGrade) {
        if (historyGrade >= 0 && historyGrade <= 100)
            mHistoryGrade = historyGrade;
    }

    public double getBiologyGrade() {
        return mBiologyGrade;
    }

    public void setBiologyGrade(double biologyGrade) {
        if (biologyGrade >= 0 && biologyGrade <= 100)
            mBiologyGrade = biologyGrade;
    }

    public double getChemistryGrade() {
        return mChemistryGrade;
    }

    public void setChemistryGrade(double chemistryGrade) {
        if (chemistryGrade >= 0 && chemistryGrade <= 100)
            mChemistryGrade = chemistryGrade;
    }

    public double getPhysicsGrade() {
        return mPhysicsGrade;
    }

    public void setPhysicsGrade(double physicsGrade) {
        if (physicsGrade >= 0 && physicsGrade <= 100)
            mPhysicsGrade = physicsGrade;
    }

    @Override
    public String toString() {
        String output;
        output = String.format("Student name is : %s/nEnglish grade = %f/nMath grade = %f/nHistory grade = %f/nBiology grade = %f/nChemistry grade = %f/nPhysics grade = %f/n"
                , mStudentName, mEnglishGrade, mMathGrade, mHistoryGrade, mBiologyGrade, mChemistryGrade, mPhysicsGrade);


        return output;
    }
}
