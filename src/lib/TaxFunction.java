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
	
	public class Income{
		public static void main(String args[])
		{
			double tax=0,it;
			Scanner sc=new Scanner(System.in);System.out.println("masukan data keuangan keluarga anda");
			it=sc.nextDouble();
			if (it<=4500000)
				tax=0;
				else if(it<=300000)
				tax=0.5*(it-4500000);
			else if(it<=500000)
				tax=(0.5*(it-300000))+(0.5*100000);
			else if(it<=1000000)
				tax=(0.5*(it-500000))+(0.5*200000)+(0.5*100000);
			else
				tax=(0.5*(it-1000000))+(0.5*500000)+(0.5*200000)+(0.5*100000);
			System.out.println("Peghasilan dari yang dipotong di keluarga anda "+tax);
		}
	}

	
	
}
