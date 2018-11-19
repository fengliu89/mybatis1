package com.aaa.mb.entity;

/**
 * className:Emp
 * discriptoin:
 * author:FLZ
 * createTime:2018-11-06 14:43
 */
public class Emp {
    private Integer empNO;
    private String ename;
    private double salary;
    private String job;
    private Double comm;

    public Integer getEmpNO() {
        return empNO;
    }

    public void setEmpNO(Integer empNO) {
        this.empNO = empNO;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }
}
