// Smaiyl Makyshov & Jin Hong //

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		play();
	}


	public static void play() {
		Scanner in = new Scanner(System.in);
		char a[][] = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = '_';
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		a[a1 - 1][a2 - 1] = 'O';
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}
		int num = 0;
		int b1 = 0, b2 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == '_' && num == 0) {
					a[i][j] = 'X';
					num++;
					b1 = i + 1;
					b2 = j + 1;
					break;
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}
		int a3 = in.nextInt();
		int a4 = in.nextInt();
		int win = 0;
		if (a[a3 - 1][a4 - 1] == '_'){
			a[a3 - 1][a4 - 1] = 'O';
		}
			else {
			System.out.println("Cheater! You lost the game due to dishonesty!");
			win++;
			return;
			}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}
		num = 0;
		int b3 = 0;
		int b4 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == '_' && num == 0) {
					a[i][j] = 'X';
					num++;
					b3 = i + 1;
					b4 = j + 1;
					break;
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}
		int a5 = in.nextInt();
		int a6 = in.nextInt();
		a[a5 - 1][a6 - 1] = 'O';
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			System.out.println();

		}
		win = 0;
		num = 0;
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == 'O') {
					num++;
				}
					if (num == 3 && win == 0) {
						System.out.println("Congratulations! You have Won");
						win++;
						play();
						return;
				}
			}
			num = 0;
		}
		num = 0;
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[j][i] == 'O') {
					num++;
				}
				if (num == 3 && win == 0) {
					System.out.println("Congratulations! You have Won");
					win++;
					play();
					return;
				}
			}
			num = 0;
		}
		num = 0;
		for (int i = 0; i < 3; i++) {
			if (a[i][i] == 'O') {
				num++;
			}
			if (num == 3 && win == 0) {
				System.out.println("Congratulations! You have Won");
				win++;
				play();
				return;
			}
		}
		num = 0;
		for (int i = 0; i < 3; i++) {
			if (a[i][2 - i] == 'O') {
				num++;
			}
			if (num == 3 && win == 0) {
				System.out.println("Congratulations! You have Won");
				win++;
				play();
				return;
			}
		}
		num = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == '_' && num == 0 && win == 0) {
					a[i][j] = 'X';
					num++;
					break;
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}
		num = 0;
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == 'X') {
					num++;
				}
				if (num == 3 && win == 0) {
					System.out.println("FeelsBadMan, Try harder.");
					win++;
					play();
					return;
				}
			}
			num = 0;
		}
		num = 0;
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[j][i] == 'X') {
					num++;
				}
				if (num == 3 && win == 0) {
					System.out.println("FeelsBadMan, Try harder.");
					win++;
					play();
					return;
				}
			}
			num = 0;
		}
		num = 0;
		for (int i = 0; i < 3; i++) {
			if (a[i][i] == 'X') {
				num++;
			}
			if (num == 3 && win == 0) {
				System.out.println("FeelsBadMan, Try harder.");
				win++;
				play();
				return;
			}
		}
		num = 0;
		for (int i = 0; i < 3; i++) {
			if (a[i][2 - i] == 'X') {
				num++;
			}
			if (num == 3 && win == 0) {
				System.out.println("FeelsBadMan, Try harder.");
				win++;
				play();
				return;
			}
		}
		int a7 = in.nextInt();
		int a8 = in.nextInt();
		if (a[a7 - 1][a8 - 1] == '_'){
			a[a7 - 1][a8 - 1] = 'O';
			}
			else {
			System.out.println("Cheater! You lost the game due to dishonesty!");
			win++;
			return;
			}
		if (win == 0){
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
				System.out.println();
						
			}
		num = 0;
		}
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == 'O') {
					num++;
				}
				if (num == 3 && win == 0) {
					System.out.println("Congratulations! You have Won");
					win++;
					play();
					return;
				}
			}
			num = 0;
		}
		num = 0;
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[j][i] == 'O') {
					num++;
				}
				if (num == 3 && win == 0) {
					System.out.println("Congratulations! You have Won");
					win++;
					play();
					return;
				}
			}
			num = 0;
		}
		num = 0;
		for (int i = 0; i < 3; i++) {
			if (a[i][i] == 'O') {
				num++;
			}
			if (num == 3 && win == 0) {
				System.out.println("Congratulations! You have Won");
				win++;
				play();
				return;
			}
		}
		num = 0;
		for (int i = 0; i < 3; i++) {
			if (a[i][2 - i] == 'O') {
				num++;
			}
			if (num == 3 && win == 0) {
				System.out.println("Congratulations! You have Won");
				win++;
				play();
				return;
			}
		}
		num = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == '_' && num == 0 && win == 0) {
					a[i][j] = 'X';
					num++;
					break;
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}
		num = 0;
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == 'X' && win == 0) {
					num++;
				}
				if (num == 3 && win == 0) {
					System.out.println("FeelsBadMan, Try harder.");
					win++;
					play();
					return;
				}
			}
			num = 0;
		}
		num = 0;
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[j][i] == 'X') {
					num++;
				}
				if (num == 3 && win == 0) {
					System.out.println("FeelsBadMan, Try harder.");
					win++;
					play();
					return;
				}
			}
			num = 0;
		}
		num = 0;
		for (int i = 0; i < 3; i++) {
			if (a[i][i] == 'X') {
				num++;
			}
			if (num == 3 && win == 0) {
				System.out.println("FeelsBadMan, Try harder.");
				win++;
				play();
				return;
			}
		}
		num = 0;
		for (int i = 0; i < 3; i++) {
			if (a[i][2 - i] == 'X') {
				num++;
			}
			if (num == 3 && win == 0) {
				System.out.println("FeelsBadMan Try harder.");
				win++;
				play();
				return;
			}
		}
		int a9 = in.nextInt();
		int a10 = in.nextInt();
		if (a[a9 - 1][a10- 1] == '_'){
			a[a9 - 1][a10 - 1] = 'O';
		}
			else {
			System.out.println("Cheater! You lost the game due to dishonesty!");
			win++;
			}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (win == 0){
					System.out.print(a[i][j] + " ");
			}
			System.out.println();
			System.out.println();

		}
		num = 0;
		}
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == 'O') {
					num++;
				}
				if (num == 3 && win == 0) {
					System.out.println("Congratulations! You have Won");
					win++;
					play();
					return;
				}
			}
			num = 0;
		}
		num = 0;
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[j][i] == 'O') {
					num++;
				}
				if (num == 3 && win == 0) {
					System.out.println("Congratulations! You have Won");
					win++;
					play();
					return;
				}
			}
			num = 0;
		}
		num = 0;
		for (int i = 0; i < 3; i++) {
			if (a[i][i] == 'O') {
				num++;
			}
			if (num == 3 && win == 0) {
				System.out.println("Congratulations! You have Won");
				win++;
				play();
				return;
			}
		}
		num = 0;
		for (int i = 0; i < 3; i++) {
			if (a[i][2 - i] == 'O') {
				num++;
			}
			if (num == 3 && win == 0) {
				System.out.println("Congratulations! You have Won");
				win++;
				play();
				return;
			}
		}
	}
		}
			
	

	

