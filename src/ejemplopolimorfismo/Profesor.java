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
public class Profesor extends Persoa{
    private String modulo;

    public Profesor() {
    }

    public Profesor(String modulo, String nome, float soldo) {
        super(nome, soldo);
        this.modulo = modulo;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    @Override
    public String toString() {
        return super.toString() + ", modulo = " + modulo;
    }
    
    
}
