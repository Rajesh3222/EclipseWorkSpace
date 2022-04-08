package com.demo.com.competitiveProgram;

import java.util.*;

public class Geektrust {
	boolean WaterAllotment = false;
	int totalCost_For_Guests = 0;
	int apartmentType = 0;
	boolean BillAllotment = false;
	int t_guests = 0;
	static int cost_withoutGuests = 0;
	static int cost_forGuests = 0;

	public static void main(String[] args) {
		Geektrust a = new Geektrust();
		Scanner scan = new Scanner(System.in);
		int total_bill = 0;
		int total_waterQuant = 0;
		List<String> input = new ArrayList<String>();
		while (true) {
			String val = scan.nextLine();
			input.add(val);
			if (val.equals("BILL"))
				break;
			}
		for (String var : input) {
			if (var.contains("ALLOT_WATER"))
				cost_withoutGuests = a.WaterCost_WithoutGuests(var);
			else if (var.contains("ADD_GUESTS"))
				cost_forGuests = a.WaterCost_WithGuests(var);
			else if (var.contains("BILL"))
				total_bill = a.TotalBill();

		}

		total_waterQuant = a.totalWaterQuantity();
		System.out.println(total_waterQuant + "  " + total_bill);
	}

	public int WaterCost_WithoutGuests(String command1) {
		double total_waterCost = 0.0;
		String cmd = null;
		String ratio = null;
		int CorporationWater = 0;
		int BorewellWater = 0;
		int sumOfRatio = 0;
		String s1 = command1;
		if (WaterAllotment == false) {

			StringTokenizer st = new StringTokenizer(s1);
			while (st.hasMoreTokens()) {
				cmd = st.nextToken();
				apartmentType = Integer.parseInt(st.nextToken());
				ratio = st.nextToken();
			}
			String splitratio[] = ratio.split(":");
			CorporationWater = Integer.parseInt(splitratio[0]);
			BorewellWater = Integer.parseInt(splitratio[1]);
			sumOfRatio = CorporationWater + BorewellWater;
			if (apartmentType == 2) {

				total_waterCost = (900 * ((double) CorporationWater / sumOfRatio))
						+ (900 * ((double) BorewellWater / sumOfRatio) * 1.5);
			}

			else if (apartmentType == 3) {
				total_waterCost = (1500 * ((double) CorporationWater / sumOfRatio))
						+ (1500 * ((double) BorewellWater / sumOfRatio) * 1.5);
			}
			WaterAllotment = true;
		}

		return (int) total_waterCost;
	}

	public int WaterCost_WithGuests(String command2) {
		String cmd = null;
		String s1 = command2;
		int totalWater_For_Guests = 0;
		int diff = 0;
		int Guests = 0;
		StringTokenizer st = new StringTokenizer(s1);
		while (st.hasMoreTokens()) {
			cmd = st.nextToken();
			Guests = Integer.parseInt(st.nextToken());
			t_guests += Guests;
		}
		totalWater_For_Guests = Guests * 300;
		if (totalWater_For_Guests < 501) {
			totalCost_For_Guests += totalWater_For_Guests * 2;
		} else if (totalWater_For_Guests < 1501) {
			diff = totalWater_For_Guests - 500;
			totalCost_For_Guests += 500 * 2 + (diff * 3);
		}

		else if (totalWater_For_Guests < 3001) {
			diff = totalWater_For_Guests - 1500;
			totalCost_For_Guests += 500 * 2 + (1000 * 3) + (diff * 5);
		} else {
			diff = totalWater_For_Guests - 3000;
			totalCost_For_Guests += 500 * 2 + (1000 * 3) + (1500 * 5) + (diff * 8);
		}
		return totalCost_For_Guests;
	}

	public int TotalBill() {
		int t_bill = 0;
		if (BillAllotment == false) {
			t_bill = totalCost_For_Guests + cost_withoutGuests;
		}
		return t_bill;
	}

	public int totalWaterQuantity() {
		int t_Water = 0;
		if (apartmentType == 2)
			t_Water = 900 + (t_guests * 300);
		else if (apartmentType == 3)
			t_Water = 1500 + (t_guests * 300);
		return t_Water;
	}
}