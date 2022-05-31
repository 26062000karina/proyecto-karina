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

@Entity(name="solicitudasesorias")
public class Solicitudasesorias implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "idsolicitud";


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int idsolicitud;
    @Column(nullable=false, length=50)
    private String nombrecompleto;
    @Column(nullable=false, length=50)
    private String asesor;
    @Column(nullable=false, length=50)
    private String materiasolicitada;
    @Column(nullable=false, length=50)
    private String fechasolicitud;
    @Column(nullable=false, length=50)
    private String fechainicio;
    @Column(nullable=false, length=50)
    private String fechafin;

    /** Default constructor. */
    public Solicitudasesorias() {
        super();
    }

    /**
     * Access method for idsolicitud.
     *
     * @return the current value of idsolicitud
     */
    public int getIdsolicitud() {
        return idsolicitud;
    }

    /**
     * Setter method for idsolicitud.
     *
     * @param aIdsolicitud the new value for idsolicitud
     */
    public void setIdsolicitud(int aIdsolicitud) {
        idsolicitud = aIdsolicitud;
    }

    /**
     * Access method for nombrecompleto.
     *
     * @return the current value of nombrecompleto
     */
    public String getNombrecompleto() {
        return nombrecompleto;
    }

    /**
     * Setter method for nombrecompleto.
     *
     * @param aNombrecompleto the new value for nombrecompleto
     */
    public void setNombrecompleto(String aNombrecompleto) {
        nombrecompleto = aNombrecompleto;
    }

    /**
     * Access method for asesor.
     *
     * @return the current value of asesor
     */
    public String getAsesor() {
        return asesor;
    }

    /**
     * Setter method for asesor.
     *
     * @param aAsesor the new value for asesor
     */
    public void setAsesor(String aAsesor) {
        asesor = aAsesor;
    }

    /**
     * Access method for materiasolicitada.
     *
     * @return the current value of materiasolicitada
     */
    public String getMateriasolicitada() {
        return materiasolicitada;
    }

    /**
     * Setter method for materiasolicitada.
     *
     * @param aMateriasolicitada the new value for materiasolicitada
     */
    public void setMateriasolicitada(String aMateriasolicitada) {
        materiasolicitada = aMateriasolicitada;
    }

    /**
     * Access method for fechasolicitud.
     *
     * @return the current value of fechasolicitud
     */
    public String getFechasolicitud() {
        return fechasolicitud;
    }

    /**
     * Setter method for fechasolicitud.
     *
     * @param aFechasolicitud the new value for fechasolicitud
     */
    public void setFechasolicitud(String aFechasolicitud) {
        fechasolicitud = aFechasolicitud;
    }

    /**
     * Access method for fechainicio.
     *
     * @return the current value of fechainicio
     */
    public String getFechainicio() {
        return fechainicio;
    }

    /**
     * Setter method for fechainicio.
     *
     * @param aFechainicio the new value for fechainicio
     */
    public void setFechainicio(String aFechainicio) {
        fechainicio = aFechainicio;
    }

    /**
     * Access method for fechafin.
     *
     * @return the current value of fechafin
     */
    public String getFechafin() {
        return fechafin;
    }

    /**
     * Setter method for fechafin.
     *
     * @param aFechafin the new value for fechafin
     */
    public void setFechafin(String aFechafin) {
        fechafin = aFechafin;
    }

    /**
     * Compares the key for this instance with another Solicitudasesorias.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Solicitudasesorias and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Solicitudasesorias)) {
            return false;
        }
        Solicitudasesorias that = (Solicitudasesorias) other;
        if (this.getIdsolicitud() != that.getIdsolicitud()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Solicitudasesorias.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Solicitudasesorias)) return false;
        return this.equalKeys(other) && ((Solicitudasesorias)other).equalKeys(this);
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
        i = getIdsolicitud();
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
        StringBuffer sb = new StringBuffer("[Solicitudasesorias |");
        sb.append(" idsolicitud=").append(getIdsolicitud());
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
        ret.put("idsolicitud", Integer.valueOf(getIdsolicitud()));
        return ret;
    }

}
