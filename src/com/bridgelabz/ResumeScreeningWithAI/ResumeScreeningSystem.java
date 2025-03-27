package com.bridgelabz.ResumeScreeningWithAI;

import java.util.List;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        // Create resumes for different job roles
        SoftwareEngineer se = new SoftwareEngineer("Sanya Khanna", 2, "Java, C++");
        DataScientist ds = new DataScientist("Sehajpreet Kaur", 5, "Java, Javascript, SQL");
        ProductManager pm = new ProductManager("Chirag", 3, "E-commerce, SaaS");

        // Processing resumes
        Resume<SoftwareEngineer> resumeSE = new Resume<>(se);
        Resume<DataScientist> resumeDS = new Resume<>(ds);
        Resume<ProductManager> resumePM = new Resume<>(pm);

        resumeSE.processResume();
        resumeDS.processResume();
        resumePM.processResume();

        // Screen multiple resumes using wildcard
        System.out.println("\n------ Screening Multiple Resumes ------");
        screenResumes(List.of(se, ds, pm));
    }

    // Wildcard method to screen resumes for any job role
    public static void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.displayResume();
        }
    }
}

