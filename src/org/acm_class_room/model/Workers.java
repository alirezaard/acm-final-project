package org.acm_class_room.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Worker")
public class Workers {
    @Id
    @Column(name = "Id", nullable = false)
    private Long id;
    @Column(name = "IP_Address")
    private String ip;
    @Column(name = "Port_Number")
    private Long port;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }
}
