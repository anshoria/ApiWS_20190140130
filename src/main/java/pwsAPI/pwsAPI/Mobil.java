/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwsAPI.pwsAPI;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author msi gf75
 */
@Entity
@Table(name = "mobil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mobil.findAll", query = "SELECT m FROM Mobil m"),
    @NamedQuery(name = "Mobil.findByIdmobil", query = "SELECT m FROM Mobil m WHERE m.idmobil = :idmobil"),
    @NamedQuery(name = "Mobil.findByMerkmobil", query = "SELECT m FROM Mobil m WHERE m.merkmobil = :merkmobil"),
    @NamedQuery(name = "Mobil.findByJenismobil", query = "SELECT m FROM Mobil m WHERE m.jenismobil = :jenismobil"),
    @NamedQuery(name = "Mobil.findByHargasewa", query = "SELECT m FROM Mobil m WHERE m.hargasewa = :hargasewa")})
public class Mobil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idmobil")
    private Integer idmobil;
    @Column(name = "merkmobil")
    private String merkmobil;
    @Column(name = "jenismobil")
    private String jenismobil;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "hargasewa")
    private Float hargasewa;

    public Mobil() {
    }

    public Mobil(Integer idmobil) {
        this.idmobil = idmobil;
    }

    public Integer getIdmobil() {
        return idmobil;
    }

    public void setIdmobil(Integer idmobil) {
        this.idmobil = idmobil;
    }

    public String getMerkmobil() {
        return merkmobil;
    }

    public void setMerkmobil(String merkmobil) {
        this.merkmobil = merkmobil;
    }

    public String getJenismobil() {
        return jenismobil;
    }

    public void setJenismobil(String jenismobil) {
        this.jenismobil = jenismobil;
    }

    public Float getHargasewa() {
        return hargasewa;
    }

    public void setHargasewa(Float hargasewa) {
        this.hargasewa = hargasewa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmobil != null ? idmobil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mobil)) {
            return false;
        }
        Mobil other = (Mobil) object;
        if ((this.idmobil == null && other.idmobil != null) || (this.idmobil != null && !this.idmobil.equals(other.idmobil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pwsAPI.pwsAPI.Mobil[ idmobil=" + idmobil + " ]";
    }
    
}
