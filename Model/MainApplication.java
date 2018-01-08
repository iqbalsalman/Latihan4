package Latihan4.Model;
import Latihan4.Model.NasabahPerorangan;
import java.math.BigDecimal;

public class MainApplication{

	public static void main(String[] args){
		NasabahPerorangan np = new NasabahPerorangan("Muhamad Yusuf","jl sukapura","08577372823");
		np.setSaldo(new BigDecimal(50));
		System.out.print(np.toString());

	}
}