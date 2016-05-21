
import java.util.ArrayList;

class MyCount {
	String name;
	int count;

	MyCount() {
	}

	MyCount(String _name, int _count) {
		this.name = _name;
		this.count = _count;
	}

	public String toString() {
		return this.name + "=" + this.count;
	}
}

public class GradeAnalyzer {

	int cntUserInput = 0;
	double TotalNum = 0, SD = 0, Avg = 0, GetNum = 0, SDtemp = 0;
	ArrayList<Double> NumScore = new ArrayList<Double>();
	MyCount[] GradeDistri = new MyCount[11];
	boolean FirstTime = true;

	static boolean isValidGrade(double aGrade) {
		if (aGrade <= 110 && aGrade >= 0)
			return true;
		return false;
	}

	void addGrade(double aGrade) {
		// Good, +2.
		if (FirstTime) {
			GradeDistri[0] = new MyCount("A+", 0);
			GradeDistri[1] = new MyCount("A", 0);
			GradeDistri[2] = new MyCount("A-", 0);
			GradeDistri[3] = new MyCount("B+", 0);
			GradeDistri[4] = new MyCount("B", 0);
			GradeDistri[5] = new MyCount("B-", 0);
			GradeDistri[6] = new MyCount("C+", 0);
			GradeDistri[7] = new MyCount("C", 0);
			GradeDistri[8] = new MyCount("C-", 0);
			GradeDistri[9] = new MyCount("D", 0);
			GradeDistri[10] = new MyCount("F", 0);
			FirstTime = false;
		}

		if (!isValidGrade(aGrade)) {
			return;
		}
		NumScore.add(aGrade);
		TotalNum += aGrade;
		cntUserInput++;
		if (aGrade >= 98) {
			GradeDistri[0].count++;
		}
		if (aGrade >= 92 && aGrade < 98) {
			GradeDistri[1].count++;
		}
		if (aGrade >= 90 && aGrade < 92) {
			GradeDistri[2].count++;
		}
		if (aGrade >= 88 && aGrade < 90) {
			GradeDistri[3].count++;
		}
		if (aGrade >= 82 && aGrade < 88) {
			GradeDistri[4].count++;
		}
		if (aGrade >= 80 && aGrade < 82) {
			GradeDistri[5].count++;
		}
		if (aGrade >= 78 && aGrade < 80) {
			GradeDistri[6].count++;
		}
		if (aGrade >= 72 && aGrade < 78) {
			GradeDistri[7].count++;
		}
		if (aGrade >= 70 && aGrade < 72) {
			GradeDistri[8].count++;
		}
		if (aGrade >= 60 && aGrade < 70) {
			GradeDistri[9].count++;
		}
		if (aGrade < 60) {
			GradeDistri[10].count++;
		}

		if (cntUserInput < 2) {
			System.out.println("You did not enter enough grades to analyze. Please enter at least 2 valid grades ");
		}

	}

	void analyzeGrades() {
		Avg = TotalNum / cntUserInput;
		for (int i = 0; i < NumScore.size(); i++) {
			SDtemp += (NumScore.get(i) - Avg) * (NumScore.get(i) - Avg);
		}
		SD = Math.round((Math.sqrt(SDtemp / cntUserInput)));
	}

	public String toString() {

		String rlt = "";
		for (int i = 0; i < GradeDistri.length; i++) {
			rlt += GradeDistri[i] + "\n";
		}
		return "The grade distribution is:\n\n" + rlt;
	}
}
