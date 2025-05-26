package com.pl.premspringboot.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_statistic") // Matches your actual table name
public class Player {
    @Id
    @Column(name = "player_name")
    private String player; // SQL type: character varying

    @Column(name = "nation")
    private String nation; // SQL type: character varying

    @Column(name = "position")
    private String pos; // SQL type: character varying

    @Column(name = "age")
    private Integer age; // SQL type: integer

    @Column(name = "matches_played")
    private Integer mp; // SQL type: integer

    @Column(name = "starts")
    private Integer starts; // SQL type: integer

    @Column(name = "minutes_played")
    private Double min; // SQL type: double precision

    @Column(name = "goals")
    private Double gls; // SQL type: double precision

    @Column(name = "assists")
    private Double ast; // SQL type: double precision

    @Column(name = "penalties_scored")
    private Double pk; // SQL type: double precision

    @Column(name = "yellow_cards")
    private Double crdY; // SQL type: double precision

    @Column(name = "red_cards")
    private Double crdR; // SQL type: double precision

    @Column(name = "expected_goals")
    private Double xG; // SQL type: double precision

    @Column(name = "expected_assists")
    private Double xAG; // SQL type: double precision

    @Column(name = "team_name")
    private String team; // SQL type: character varying

    // Constructors
    public Player() {
    }

    public Player(String player, String nation, String pos, Integer age, Integer mp, Integer starts, Double min, Double gls, Double ast, Double pk, Double crdY, Double crdR, Double xG, Double xAG, String team) {
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
        this.xAG = xAG; // Corrected order based on typical field sequence
        this.team = team;
    }

    // Getters and Setters
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

    public Double getGls() {
        return gls;
    }

    public void setGls(Double gls) {
        this.gls = gls;
    }

    public Double getAst() {
        return ast;
    }

    public void setAst(Double ast) {
        this.ast = ast;
    }

    public Double getPk() {
        return pk;
    }

    public void setPk(Double pk) {
        this.pk = pk;
    }

    public Double getCrdY() {
        return crdY;
    }

    public void setCrdY(Double crdY) {
        this.crdY = crdY;
    }

    public Double getCrdR() {
        return crdR;
    }

    public void setCrdR(Double crdR) {
        this.crdR = crdR;
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

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}