package Latihan4.Model;
import Latihan4.Aplikasi.Tabungan;
import java.math.BigDecimal;

public class NasabahPerorangan extends Nasabah {
	String namalengkap;
	String alamatRumah;
	String foto;
	String nomerHP;
	Tabungan tabungan;

	public NasabahPerorangan(){
    
	}

	public NasabahPerorangan(String namalengkap, String alamatRumah, String nomerHP){
		super("123443",false,BigDecimal.ZERO);
    this.namalengkap= namalengkap;
    this.alamatRumah=alamatRumah;
    this.nomerHP=nomerHP;
    Tabungan cs = new Tabungan(0.1,"Tabungan Mapan"); 
	}
@Override
	public String toString(){
		return "Nasabah [noidentitas]"+getNoidentitas()+"status"+getActive()+"Nama Lengkap"+getNamaLengkap()+"Saldo Tabungan"+getSaldo();
	}


String getNamaLengkap(){

		return namalengkap;

	}
	String getAlamatRumah(){

		return alamatRumah;

	}
    
    String getFoto(){
         
       return foto;

    }
   Tabungan getTabungan(){

   	  return tabungan;
   }

   public void setNamaLengkap(String namalengkap){
   
       this.namalengkap = namalengkap;

   }
    public void setAlamatRumah(String alamatRumah){
   
      this.alamatRumah = alamatRumah;

   }
   public void setFoto(String foto){
   
      this.foto = foto;

   }
   
   public void setTabungan(Tabungan tabungan){
   
       this.tabungan = tabungan;

   }


	 
}