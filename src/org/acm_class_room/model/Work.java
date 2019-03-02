package org.acm_class_room.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "work")
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Id", nullable = false)
    private Long id;
    @Column(name = "Time_To_Get_Job")
    private Date timeToWork;
    @Column(name = "Size_Of_Work")
    private Long sizeOfWork;
    @ManyToOne
    private Workers workers;

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

    public Workers getWorkers() {
        return workers;
    }

    public void setWorkers(Workers workers) {
        this.workers = workers;
    }
}
