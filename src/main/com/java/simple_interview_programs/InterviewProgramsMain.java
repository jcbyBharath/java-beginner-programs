package main.com.java.simple_interview_programs;

public class InterviewProgramsMain {

    public static void main(String[] args) {
        InterviewPrograms interviewPrograms = new InterviewPrograms();
        int[] evenNumbers = interviewPrograms.getEvenNumbers();
        interviewPrograms.printElementsInAnArray(evenNumbers);


       // System.out.println(interviewPrograms.getMissingNumber());

        interviewPrograms.swapElements(10, 20);
    }
}
