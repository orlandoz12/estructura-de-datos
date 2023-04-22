
package estructuradatos;

import java.util.Stack;
import javax.swing.Timer;


public class datos {
    String placa;
    private String tipo;
    private int hingreso;
    private int nvehiculo;
    private String estado;
    private int hsalida;
    private String hingresop;
    private String hsalidap;
    private int pagar;
    
    public void setpagar(int pagar){
        this.pagar=pagar;
    }
    public int getpagar(){
        return pagar;
    }
    public void sethingresop(String hingresop){
        this.hingresop=hingresop;
    }
    public String gethingresop(){
        return hingresop;
    }
     public void sethsalidap(String hsalidap){
        this.hsalidap=hsalidap;
    }
    public String gethsalidap(){
        return hsalidap;
    }
    public void setplaca(String placa){
        this.placa=placa;
    }
    public String getplaca(){
        return placa;
    }
     public void settipo(String tipo){
        this.tipo=tipo;
    }
    public String gettipo(){
        return tipo;
    }
     public void setestado(String estado){
        this.estado=estado;
    }
    public String getestado(){
        return estado;
    }
     public void setnvehiculo(int nvehiculo){
        this.nvehiculo=nvehiculo;
     }
    public int getnvehiculo(){
        return nvehiculo;
    }
     public void sethingreso(int hingreso){
        this.hingreso=hingreso;
    }
    public int gethingreso(){
        return hingreso;
    }
     public void sethsalida(int hsalida){
        this.hsalida=hsalida;
    }
    public int gethsalida(){
        return hsalida;
    } 
    public void ceros(){
        placa="";
        tipo="";
        hingreso=0;
          nvehiculo=0;
    estado="";
   hsalida=0;
    hingresop="";
    hsalidap="";
   pagar=0;
    }
}
