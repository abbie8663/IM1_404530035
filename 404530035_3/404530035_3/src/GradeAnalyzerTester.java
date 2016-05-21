
/*
 * [A]100
 * [TA's Advise]
 * 1. 沒什麼太大的問題, 很棒!
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {
	public static void main(String[] args) {
		double TempScore = 0;
		String TempInput = "";
		GradeAnalyzer GG = new GradeAnalyzer();

		while (true) {
			TempInput = JOptionPane.showInputDialog(null, "Please enter your score:");
			if (TempInput.equalsIgnoreCase("q")) {
				break;
			}
			try {
				GG.addGrade(Double.parseDouble(TempInput));
			} catch (Exception e) {
				System.out.println("Error! Please enter again!");
			}
		}
		// 缺少判斷是否個數<2, -2.
		GG.analyzeGrades();

		System.out.println(
				"You entered " + GG.cntUserInput + "Valid grades from 0 to 110.  Invalid grades are ignored! ");
		System.out.println("The average = " + (int) GG.Avg + " with a standard deviation = " + (int) GG.SD);
		System.out.println(GG);
	}
}