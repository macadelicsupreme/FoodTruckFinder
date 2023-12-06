package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Vote {
    @Id
    @GeneratedValue
    private String id;
    private Boolean upVote;
    private Boolean downVote;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getUpVote() {
        return upVote;
    }

    public void setUpVote(Boolean upVote) {
        this.upVote = upVote;
    }

    public Boolean getDownVote() {
        return downVote;
    }

    public void setDownVote(Boolean downVote) {
        this.downVote = downVote;
    }
}
