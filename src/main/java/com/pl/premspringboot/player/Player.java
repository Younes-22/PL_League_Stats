package com.pl.premspringboot.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="prem_stats")
public class Player {
    @Id // this specifies that the primary key of the entity is the string player
    //its also a unique identifier for all player records in the db
    @Column(name = "Player", unique = true)
    private String player;
    private String nation;
    private String pos;
    private Integer age;
    private Integer mp;
    private Integer starts;
    private Double min;
    private Double gls;
    private Double ast;
    private Double pk;
    private Double crdY;
    private Double crdR;
    private Double xG;
    private Double xAG;
    private String team;

    public Player() {
    }

    public Player(String player, String nation, String pos, Integer age, Integer mp, Integer starts, Double min, Double gls, Double ast, Double pk, Double crdY, Double crdR, Double xG, String team, Double xAG) {
        this.player = player;
        this.nation = nation;
        this.pos = pos;
        this.age = age;
        this.mp = mp;
        this.starts = starts;
        this.min = min;
        this.gls = gls;
        this.ast = ast;
        this.pk = pk;
        this.crdY = crdY;
        this.crdR = crdR;
        this.xG = xG;
        this.team = team;
        this.xAG = xAG;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getAst() {
        return ast;
    }

    public void setAst(Double ast) {
        this.ast = ast;
    }

    public Double getCrdY() {
        return crdY;
    }

    public void setCrdY(Double crdY) {
        this.crdY = crdY;
    }

    public Double getxG() {
        return xG;
    }

    public void setxG(Double xG) {
        this.xG = xG;
    }

    public Double getxAG() {
        return xAG;
    }

    public void setxAG(Double xAG) {
        this.xAG = xAG;
    }

    public Double getGls() {
        return gls;
    }

    public void setGls(Double gls) {
        this.gls = gls;
    }

    public Double getPk() {
        return pk;
    }

    public void setPk(Double pk) {
        this.pk = pk;
    }

    public Double getCrdR() {
        return crdR;
    }

    public void setCrdR(Double crdR) {
        this.crdR = crdR;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
