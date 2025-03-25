package shapes;

import java.io.PrintStream;

import java.util.Scanner;

public class Menu {

	PrintStream ps = System.out;

	Scanner in = new Scanner(System.in);

	private void displayHeader() {

		ps.println("shapes");

	}

	public void displayMainMenu() {

		displayHeader();

		int sel = 0;

		while (sel != 9) {

			displayHeader();

			ps.println("main menu");

			ps.println();

			ps.println("1delete shape");

			ps.println("2list shapes");

			ps.println("9exit");

			ps.println("Enter your choice:");

			sel = in.nextInt();

			switch (sel) {

			case 1:

				displayMainMenu();

				break;

			case 2:

				break;

			case 3:

				break;

			case 9:

				break;

			default:

				ps.println("Invalid selection.try again!!!");

			}

		}

	}

	private void displayshapesMenu() {

		int sel = 0;

		while (sel != 9) {

			ps.println("Shapes menu");

			ps.println();

			ps.println("1 square shape");

			ps.println("2 Rectangle shape");

			ps.println("3 cube shapes");

			ps.println("4 circle");

			ps.println("9 Exit");

			ps.println("Enter your choice:");

			sel = in.nextInt();

			switch (sel) {

			case 1:

				displayMainMenu();

				break;

			case 2:

				break;

			case 3:

				break;

			case 9:

				break;

			default:

				ps.println("Invalid selection.try again!!!");

			}

		}

	}

}