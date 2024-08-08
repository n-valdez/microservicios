package models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity(name= "Student")
@Table(name= "\"Students\"", schema="public")
@PrimaryKeyJoinColumn(name="id", foreignKey = @ForeignKey(name="fk_stundent_person"))
public class Student extends Person implements Serializable {
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Boolean getSchoolarship() {
        return schoolarship;
    }

    public void setSchoolarship(Boolean schoolarship) {
        this.schoolarship = schoolarship;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    private static final long serialVersionUID= 1L;

    @Column(name="schoolarship", columnDefinition = "boolean DEFAULT 'false'")
    private Boolean schoolarship = false;

    @Column(name="state", columnDefinition = "integer DEFAULT '1'")
    private Integer state = 1;
}
