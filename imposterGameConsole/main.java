import java.util.*;
import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


class Game {

	Scanner scan = new Scanner(System.in);

	public boolean OneType;
	public boolean TwoType;
	public boolean ThreeType;
	public boolean FourType;
	public String GivenWord;
	public char Continue;
	public char ControlKey;



	public void KeyControl() {
		System.out.println("For Skip enter : s or S");
		System.out.print("Enter anykey expect s or S: ");
		ControlKey = scan.next().charAt(0);
		ControlKey = Character.toUpperCase(ControlKey);
	}
	public void ContinueGame() {
		System.out.print("Continue by enter anything: ");
		Continue = scan.next().charAt(0);
	}

	public void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("\n");
	}

	public void ImposterSelection(int Imposter) {

		switch (Imposter) {

		case 0:
			OneType = true;
			//	System.out.println(0);
			break;

		case 1:
			TwoType = true;
			//	System.out.println(1);
			break;

		case 2:
			ThreeType = true;
			//	System.out.println(2);
			break;

		case 3:
			FourType = true;
			//	System.out.println(3);
			break;
		}
	}

	public void Default() {
		OneType = false;
		TwoType = false;
		ThreeType = false;
		FourType = false;
	}

	public void PlayerOne(String OneName) {
		System.out.println("Player 1: " + OneName);
		System.out.println("Your word is " + GivenWord);

	}


	public void PlayerTwo(String TwoName) {

		System.out.println("Player 2: " + TwoName);
		System.out.println("Your word is " + GivenWord);


	}


	public void PlayerThree(String ThreeName) {
		System.out.println("Player 3: " + ThreeName);
		System.out.println("Your word is " + GivenWord);

	}


	public void PlayerFour(String FourName) {
		System.out.println("Player 4: " + FourName);
		System.out.println("Your word is " + GivenWord);

	}
}

public class Main {
	public static void main(String[] args) {

		//Arrays & Array List
		String [] Normal = {"Bottle", "Fork", "Cup", "Stair", "Pen", "Shampoo", "Light Bulb", "Horse", "Sunflower", "CocaCola", "Airplane"};
		String [] Imposter = {"Gallon", "Spoon", "Mug", "Ladder", "Pencil", "Soap", "Candle", "Donkey", "Jasmine", "7up", "Helicopter"};
		ArrayList <String> NameList = new ArrayList <String>();
		ArrayList <String> TempName = new ArrayList <String>();

		//object Declarations
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		Game obj = new Game();

		//Other Vadiables

		int Vote = 0;
		int Tries = 2;
		int PlayerNo = 5;
		int SetName = 0;
		String Name;
		String ImposterPlayer = "Null";
		//Name Giving
		int size = Normal.length;
		while (SetName != 4) {
			System.out.print("Player " + (SetName + 1) + "'s Name : ");
			Name = input.nextLine();
			NameList.add(Name);
			SetName++;

		}

		System.out.println();

		obj.ControlKey = 'O';
		while (obj.ControlKey == 'O') {

			Collections.shuffle(NameList);
			System.out.println("\nFirst Turn: " + NameList.get(0));
			TempName.addAll(NameList);
			obj.ContinueGame();

			int WordSelection = random.nextInt(size);

			int  ImposterNo = random.nextInt(4);
			obj.ImposterSelection(ImposterNo);

			if (obj.ControlKey != 'S') {
				if (obj.OneType  == true) {
					obj.GivenWord = Imposter[WordSelection];
					ImposterPlayer = NameList.get(0);
					obj.PlayerOne(NameList.get(0));

				} else {
					obj.GivenWord = Normal[WordSelection];
					obj.PlayerOne(NameList.get(0));

				}
				obj.KeyControl();
				obj.clearScreen();
				System.out.println("Next Turn: " + NameList.get(1));
			}

			if (obj.ControlKey != 'S') {
				if (obj.TwoType  == true) {
					obj.ContinueGame();
					obj.GivenWord = Imposter[WordSelection];
					ImposterPlayer = NameList.get(1);
					obj.PlayerTwo(NameList.get(1));


				}

				else {
					obj.ContinueGame();
					obj.GivenWord = Normal[WordSelection];
					obj.PlayerTwo(NameList.get(1));
				}

				obj.KeyControl();
				obj.clearScreen();
				System.out.println("Next Turn: " +  NameList.get(2));
			}

			if (obj.ControlKey != 'S') {
				if (obj.ThreeType  == true) {
					obj.ContinueGame();
					obj.GivenWord = Imposter[WordSelection];
					ImposterPlayer = NameList.get(2);
					obj.PlayerThree(NameList.get(2));


				}

				else {
					obj.ContinueGame();
					obj.GivenWord = Normal[WordSelection];
					obj.PlayerThree(NameList.get(2));
				}
				obj.KeyControl();
				obj.clearScreen();
				System.out.println("Next Turn: " +  NameList.get(3));
			}

			if (obj.ControlKey != 'S') {
				if (obj.FourType  == true) {
					obj.ContinueGame();
					obj.GivenWord = Imposter[WordSelection];
					ImposterPlayer = NameList.get(3);
					obj.PlayerFour(NameList.get(3));

				}

				else {
					obj.ContinueGame();
					obj.GivenWord = Normal[WordSelection];
					obj.PlayerFour(NameList.get(3));

				}
				//	System.out.println("Imposter Name "+ImposterPlayer);
				obj.KeyControl();
				obj.clearScreen();
			}

			if (obj.ControlKey != 'S') {
				while (Vote != 2) {

					System.out.println("\nDiscuss & Vote");
					System.out.println("Tries left " + Tries + "\n");
					for (int i = 0; i < TempName.size(); i++) {
						System.out.println((i + 1) + " " + TempName.get(i));
					}

					System.out.print("\nEnter player number to eleminate: ");
					PlayerNo = input.nextInt();
					if (PlayerNo > 0  && PlayerNo < (TempName.size() + 1)) {
						if (ImposterPlayer == TempName.get(PlayerNo - 1)) {
							System.out.println("\n" + TempName.get(PlayerNo - 1) + " Eliminated");
							System.out.println("Innocent Won\n");
							Vote = 2;

						} else {
							System.out.println("\n" + TempName.get(PlayerNo - 1) + " Eliminated");
							System.out.println(TempName.get(PlayerNo - 1) + " was not the Imposter");
							TempName.remove(PlayerNo - 1);
							Vote ++;
							Tries --;
						}
					} else {
						System.out.println("\nPlease input available player number\n");
					}
				}
			}

			if (obj.ControlKey != 'S') {
				if (Tries == 0) {
					System.out.println("Innocent Lose\n");
					System.out.println("The imposter was: " + ImposterPlayer + "\n");
				}
				obj.ContinueGame();
			}

			obj.ControlKey = 'S';

			while (obj.ControlKey == 'S') {
				obj.clearScreen();
				TempName.removeAll(TempName);
				obj.Default();
				Vote = 0;
				Tries = 2;
				obj.ControlKey = 'O';
			}

		}

	}