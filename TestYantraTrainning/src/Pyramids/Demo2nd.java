package Pyramids;

import java.util.Scanner;

public class Demo2nd  {

	public static void main(String[] args) {

		System.out.println("Enter the rows");
		Scanner sc =new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println("1.SquareStar\n2.Primary Diagonals\n3.Secondary Diagnal\n4.X Pattern\n5.RightAngleTriangle"
				+ "\n6.Z Pattern\n7.Bow and Arrow Pattern\n8.Star&#\n9.Charecter Diagonal " + "And Number");
		System.out.println("Eneter the no");
		System.out.println();
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			for (int r = 1; r <= n; r++) {
				for (int c = 1; c <= n; c++) {
					if (r == 1 || r == n || c == 1 || c == n)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
			break;

		case 2: {
			for (int r = 1; r <= n; r++) {
				for (int c = 1; c <= n; c++) {
					if (r == c)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
			break;
		case 3: {
			for (int r = 1; r <= n; r++) {
				for (int c = 1; c <= n; c++) {
					if (r == c || (r + c == n + 1))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
			break;

		case 4: {
			for (int r = 1; r <= n; r++) {
				for (int c = 1; c <= n; c++) {
					if ((r + c == n + 1) || c == r)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
			break;

		case 5: {
			for (int r = 1; r <= n; r++) {
				for (int c = 1; c <= n; c++) {
					if ((r + c == n + 1) || c == n || r == n)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
			break;

		// Z pattern
		case 6: {
			for (int r = 1; r <= n; r++) {
				for (int c = 1; c <= n; c++) {
					if ((r + c == n + 1) || r == n || r == 1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
			break;

		// Bow and Arrow Pattern
		case 7: {
			for (int r = 1; r <= n; r++) {
				for (int c = 1; c <= n; c++) {
					if ((r + c == n + 1) || r == 1 || c == 1 || r == c)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
			break;

		case 8: {
			for (int r = 1; r <= n; r++) {
				for (int c = 1; c <= n; c++) {
					if ((r + c == n + 1) && (r == n / 2 + 1))
						System.out.print("# ");
					else if ((c == n / 2 + 1) || r == n / 2 + 1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
			break;

		case 9: {
			char ch = 'A';
			for (int r = 1; r <= n; r++) {
				for (int c = 1; c <= n; c++) {
					if (r == c) {
						if (n < 9) {
							System.out.print(ch + "  ");
							ch++;
						} else {
							System.out.print(ch + " ");
							ch++;
						}
					}
					else {
						if (n < 9) {
							System.out.print((r + c) + "  ");
						} else {
							System.out.print((r + c) + " ");
						}
					}
				}
				System.out.println();
			}
		}
		}

	}

}
