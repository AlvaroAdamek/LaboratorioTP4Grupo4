
package laboratoriotp4grupo4;


public class Materia {
    private int idMateria;
    private String nombre;
    private int ano;

    public Materia() {
    }

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.idMateria;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (this.idMateria != other.idMateria) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  nombre + "  " + ano ;
    }
    
    
    
    
}
