
package laboratoriotp4grupo4;


public class Materia {
    private int idMateria;
    private String nombre;
    private int ano;

    public Materia(int idMateria, String nombre, int ano) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.ano = ano;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
