package org.acmClassRoom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "work")
public class Work {
    @Id
    @Column(name = "Id", nullable = false)
    private Long id;
    @Column(name = "Time_To_Get_Job")
    private Date timeToWork;
    @Column(name = "Size_Of_Work")
    private Long sizeOfWork;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTimeToWork() {
        return timeToWork;
    }

    public void setTimeToWork(Date timeToWork) {
        this.timeToWork = timeToWork;
    }

    public Long getSizeOfWork() {
        return sizeOfWork;
    }

    public void setSizeOfWork(Long sizeOfWork) {
        this.sizeOfWork = sizeOfWork;
    }
}
