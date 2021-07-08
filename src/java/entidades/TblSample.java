/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author EDWIN
 */
@Entity
@Table(name = "tbl_sample")
@NamedQueries({
    @NamedQuery(name = "TblSample.findAll", query = "SELECT t FROM TblSample t"),
    @NamedQuery(name = "TblSample.findById", query = "SELECT t FROM TblSample t WHERE t.id = :id"),
    @NamedQuery(name = "TblSample.findByFirstName", query = "SELECT t FROM TblSample t WHERE t.firstName = :firstName"),
    @NamedQuery(name = "TblSample.findBySalary", query = "SELECT t FROM TblSample t WHERE t.salary = :salary"),
    @NamedQuery(name = "TblSample.findByEmail", query = "SELECT t FROM TblSample t WHERE t.email = :email")})
public class TblSample implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "first_name")
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "salary")
    private float salary;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "email")
    private String email;

    public TblSample() {
    }

    public TblSample(Integer id) {
        this.id = id;
    }

    public TblSample(Integer id, String firstName, float salary, String email) {
        this.id = id;
        this.firstName = firstName;
        this.salary = salary;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblSample)) {
            return false;
        }
        TblSample other = (TblSample) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TblSample[ id=" + id + " ]";
    }
    
}
