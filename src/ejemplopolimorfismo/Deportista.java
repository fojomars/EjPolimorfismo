/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

/**
 *
 * @author fojomars
 */
public class Deportista extends Persoa{
    private String tipoDeporte;

    public Deportista() {}

    public Deportista(String tipoDeporte, String nome, float soldo) {
        super(nome, soldo);
        this.tipoDeporte = tipoDeporte;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo Deporte = " + tipoDeporte;
    }

    
    @Override
    public float calcularSoldo(){
        return super.calcularSoldo() + 20000;
    }
    
    
    
}
