package lib;



public class TaxFunction {

	
	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 * 
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 * 
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena pajaknya adalah Rp 	0.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 * 
	 */
	
	public class TaxCalculator {
		static void calculate() {
	
			final double RATE1 = 0.20;
			final double RATE2 = 0.25;
			final double RATE3 = 0.10;
			final double RATE4 = 0.15;
			final double RATE5 = 0.30;
			final double RATE1_SINGLE_LIMIT = 0;
			final double RATE2_MARRIED_LIMIT = 0;
			final double RATE3_COHABITATING_LIMIT = 20000;
			final double RATE4_COHABITATING_LIMIT = 50000;
			double tax = 0;
			Scanner in = new Scanner(System.in);
			//Enter Income
			System.out.print("Please enter your income: ");
			double income = in.nextDouble();
			in.nextLine();
	
			System.out.print("Please enter 's' for single, 'm' for married, or 'c' for cohabitating: ");
			String maritalStatus = in.next();
			in.nextLine();
	
			//Calculate Taxes
	
			if (maritalStatus.equals("s") && income > RATE1_SINGLE_LIMIT) {
				tax = RATE1 * income;
			} else if (maritalStatus.equals("m") && income > RATE2_MARRIED_LIMIT) {
				tax = RATE2 * income;
			} else if (maritalStatus.equals("c") && income <= RATE3_COHABITATING_LIMIT) {
				tax = RATE3 * income;
			} else if (maritalStatus.equals("c") && income <= RATE4_COHABITATING_LIMIT) {
				tax = RATE4 * income;
			} else {
				tax = RATE5 * income;
			}
	
			System.out.print("Your tax is: " + tax);
	
		}
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String newResponse = "";
			do {
				calculate();
				System.out.println();
				System.out.println("Process another response?. Please enter 'y' for yes, or 'n' for no: ");
				newResponse = in.next();
				in.nextLine();
			} while (newResponse.equals("y"));
	
		}
	}

	
	
}
