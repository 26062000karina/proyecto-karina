// Generated with g9.

package com.dwa.proyecto.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="asesoria")
public class Asesoria implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "id";

   

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int id;
    @Column(nullable=false, length=100)
    private String descasesoria;
    @Column(nullable=false, length=80)
    private String nombreprofesor;
    @Column(nullable=false, length=10)
    private String fechacreacion;
    @Column(nullable=false, length=20)
    private String materiaasesorar;

    /** Default constructor. */
    public Asesoria() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for descasesoria.
     *
     * @return the current value of descasesoria
     */
    public String getDescasesoria() {
        return descasesoria;
    }

    /**
     * Setter method for descasesoria.
     *
     * @param aDescasesoria the new value for descasesoria
     */
    public void setDescasesoria(String aDescasesoria) {
        descasesoria = aDescasesoria;
    }

    /**
     * Access method for nombreprofesor.
     *
     * @return the current value of nombreprofesor
     */
    public String getNombreprofesor() {
        return nombreprofesor;
    }

    /**
     * Setter method for nombreprofesor.
     *
     * @param aNombreprofesor the new value for nombreprofesor
     */
    public void setNombreprofesor(String aNombreprofesor) {
        nombreprofesor = aNombreprofesor;
    }

    /**
     * Access method for fechacreacion.
     *
     * @return the current value of fechacreacion
     */
    public String getFechacreacion() {
        return fechacreacion;
    }

    /**
     * Setter method for fechacreacion.
     *
     * @param aFechacreacion the new value for fechacreacion
     */
    public void setFechacreacion(String aFechacreacion) {
        fechacreacion = aFechacreacion;
    }

    /**
     * Access method for materiaasesorar.
     *
     * @return the current value of materiaasesorar
     */
    public String getMateriaasesorar() {
        return materiaasesorar;
    }

    /**
     * Setter method for materiaasesorar.
     *
     * @param aMateriaasesorar the new value for materiaasesorar
     */
    public void setMateriaasesorar(String aMateriaasesorar) {
        materiaasesorar = aMateriaasesorar;
    }

    /**
     * Compares the key for this instance with another Asesoria.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Asesoria and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Asesoria)) {
            return false;
        }
        Asesoria that = (Asesoria) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Asesoria.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Asesoria)) return false;
        return this.equalKeys(other) && ((Asesoria)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Asesoria |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
