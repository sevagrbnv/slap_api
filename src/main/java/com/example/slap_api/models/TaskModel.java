package com.example.slap_api.models;

import java.sql.Date;

/**
 * Модель таска, возвращаемая клиенту
 */
public class TaskModel {
    private Long task_id;
    private String name;
    private String desc;
    private Date start_date;//YYYY-MM-dd
    private Date end_date;
    private Long column_id;

    public TaskModel(Long task_id, String name, String desc, Date start_date, Date end_date, Long column_id) {
        this.task_id = task_id;
        this.name = name;
        this.desc = desc;
        this.start_date = start_date;
        this.end_date = end_date;
        this.column_id = column_id;
    }

    public Long getTask_id() {
        return task_id;
    }

    public void setTask_id(Long task_id) {
        this.task_id = task_id;
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

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Long getColumn_id() {
        return column_id;
    }

    public void setColumn_id(Long column_id) {
        this.column_id = column_id;
    }
}
