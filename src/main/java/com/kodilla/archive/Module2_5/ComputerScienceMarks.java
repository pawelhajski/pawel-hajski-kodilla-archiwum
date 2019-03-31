package com.kodilla.archive.Module2_5;

public class ComputerScienceMarks {

    ArrayList<Integer> marks = new ArrayList<Integer>();

    public void computerScienceMarksListCreation() {

        marks.add(5);
        marks.add(4);
        marks.add(2);
        marks.add(3);
        marks.add(4);
        marks.add(2);
        marks.add(4);
        marks.add(6);
        marks.add(1);
        marks.add(5);
        marks.add(4);

        Collections.sort(marks);
    }

    public void computerScienceMarksAverage() {

        double sum = 0;

        for(int i=1; i<(marks.size()-1); i++) {
            System.out.println(marks.get(i)); //Dodane tylko w celu sprawdzenia czy metoda sort działa poprawnie.
            sum += marks.get(i);
        }

        double average = sum / (marks.size()-2);
        System.out.println("Student marks average is: " + average);
    }
}
