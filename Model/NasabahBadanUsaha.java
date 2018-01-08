package Latihan4.Model;
package Latihan4.Aplikasi;
import Latihan4.Aplikasi;


public class NasabahBadanUsaha extends Tabungan {

	String namainstitusi, nomerNpwp, alamatKantor;
    Tabungan tabungan;

    String getNamainstitusi(){
    	return namainstitusi;
    }

    String getNomerNpwp(){
    	return nomerNpwp;
    }
    String getAlamatKantor(){
    	return alamatKantor;
    }
    Tabungan getTabungan(){
    	return tabungan
    }

    public void setNamainstitusi(String namainstitusi){
    	return this.namainstitusi=namainstitusi;
    }

    public void setNomerNpwp( String nomerNpwp){
    	return this.nomerNpwp=nomerNpwp;
    }
    public void setAlamatKantor(String alamatKantor){
    	return this.alamatKantor=alamatKantor;
    }

    public void setTabungan(Tabungan tabungan){
    	return this.tabungan=tabungan;
    }

  }
	
