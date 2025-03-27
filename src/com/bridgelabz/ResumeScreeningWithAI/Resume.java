package com.bridgelabz.ResumeScreeningWithAI;

public class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void processResume() {
        System.out.println("Processing Resume for " + jobRole.getCandidateName() + "...");
        jobRole.displayResume();
    }
}
