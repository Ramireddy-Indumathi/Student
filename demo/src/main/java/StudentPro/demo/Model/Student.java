package StudentPro.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table
@Getter
@Setter
public class Student {

    @Id
    private Integer Id;
    private String name;
    private Integer score;

    public Integer getId() {
        return Id;
    }

    public Integer getScore() {
        return score;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
