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
    private String Player;
    private String Nation;
    private String Pos;
    private Integer Age;
    private Integer MP;
    private Integer Starts;
    private Double Min;
    private Double Gls;
    private Double Ast;
    private Double PK;
    private Double CrdY;
    private Double CrdR;
    private Double xG;
    private Double xAG;
    private String Team;

    public Player() {
    }

    public Player(String player, String nation, String pos, Integer age, Integer MP, Integer starts, Double min, Double gls, Double ast, Double PK, Double crdY, Double crdR, Double xG, Double xAG, String team) {
        Player = player;
        Nation = nation;
        Pos = pos;
        Age = age;
        this.MP = MP;
        Starts = starts;
        Min = min;
        Gls = gls;
        Ast = ast;
        this.PK = PK;
        CrdY = crdY;
        CrdR = crdR;
        this.xG = xG;
        this.xAG = xAG;
        Team = team;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public Double getxAG() {
        return xAG;
    }

    public void setxAG(Double xAG) {
        this.xAG = xAG;
    }

    public Double getxG() {
        return xG;
    }

    public void setxG(Double xG) {
        this.xG = xG;
    }

    public Double getCrdR() {
        return CrdR;
    }

    public void setCrdR(Double crdR) {
        CrdR = crdR;
    }

    public Double getCrdY() {
        return CrdY;
    }

    public void setCrdY(Double crdY) {
        CrdY = crdY;
    }

    public Double getPK() {
        return PK;
    }

    public void setPK(Double PK) {
        this.PK = PK;
    }

    public Double getAst() {
        return Ast;
    }

    public void setAst(Double ast) {
        Ast = ast;
    }

    public Double getGls() {
        return Gls;
    }

    public void setGls(Double gls) {
        Gls = gls;
    }

    public Double getMin() {
        return Min;
    }

    public void setMin(Double min) {
        Min = min;
    }

    public Integer getStarts() {
        return Starts;
    }

    public void setStarts(Integer starts) {
        Starts = starts;
    }

    public Integer getMP() {
        return MP;
    }

    public void setMP(Integer MP) {
        this.MP = MP;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getPos() {
        return Pos;
    }

    public void setPos(String pos) {
        Pos = pos;
    }

    public String getNation() {
        return Nation;
    }

    public void setNation(String nation) {
        Nation = nation;
    }

    public String getPlayer() {
        return Player;
    }

    public void setPlayer(String player) {
        Player = player;
    }
}
