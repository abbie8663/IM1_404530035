
/*
 * [A]93
 * [TA's Advise]
 * 1.�D�بèS���n�D�n�gScanner, �Ш̷��D�حn�D�@���g, �Y����@�~�Y�Q�HScanner�i�漶�g�аȥ��g�ҥ~�B�z, ���ͨҥ~���B�z�N�H�{�����~�i�榩��.
 * 2.�`�����ƾ�method�i�H�O�@�U: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * 3.����i�H���զbjavadoc���g�@�ǵ���.
 * 4.��@�t��k�n�T�P�_�U����������.
 * */

import java.util.Scanner;

public class EasterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Easter easter = new Easter();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Your Year:");
		int aYear1 = scanner.nextInt();
		System.out.println(easter.calculateEaster(aYear1));

		System.out.println("Your Year:");
		int aYear2 = scanner.nextInt();
		System.out.println(easter.calculateEaster(aYear2));

	}

}
