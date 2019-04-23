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
public class Persoa {
    private String nome;
    private float soldo;
    
    // Contructor

    public Persoa() {}

    public Persoa(String nome, float soldo) {
        this.nome = nome;
        this.soldo = soldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSoldo() {
        return soldo;
    }

    public void setSoldo(float soldo) {
        this.soldo = soldo;
    }

    @Override
    public String toString() {
        return "Nome = " + nome + ", Soldo = " + soldo;
    }
    
    
    public float calcularSoldo(){
        return 1500;
    }
    
    
}
