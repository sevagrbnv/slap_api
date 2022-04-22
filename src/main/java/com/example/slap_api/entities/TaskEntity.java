package com.example.slap_api.entities;
import javax.persistence.*;
import java.sql.Date;

/**
 * Класс представляет собой сущность, связанную с БД
 */
@Entity
@Table(name = "task")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long taskid;
    private String name;
    private String desc;
    private Date startdate;//YYYY-MM-dd
    private Date enddate;

    @ManyToOne(targetEntity = ColumnEntity.class)
    @JoinColumn(name = "columnid")
    private Long columnid;

    public Long getTaskid() {
        return taskid;
    }

    public void setTaskid(Long taskid) {
        this.taskid = taskid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Long getColumnid() {
        return columnid;
    }

    public void setColumnid(Long columnid) {
        this.columnid = columnid;
    }
}
