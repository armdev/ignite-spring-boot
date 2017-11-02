package io.project.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.apache.ignite.cache.query.annotations.QuerySqlField;


@Entity
@Table(name = "flights")
public class Flight implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    @QuerySqlField(index = true)
    private Long id;
    @QuerySqlField(index = true)
    @Column(name = "year")    
    private Integer year;
    @Column(name = "quarter")
    @QuerySqlField(index = true)
    private Integer quarter;
    @Column(name = "month")
    @QuerySqlField(index = true)
    private Integer month;
    @QuerySqlField(index = true)
    @Column(name = "dayofmonth")
    private Integer dayofmonth;
    @Column(name = "dayofweek")
    @QuerySqlField(index = true)
    private Integer dayofweek;
    @Column(name = "flightdate")
    @Temporal(TemporalType.TIMESTAMP)
    @QuerySqlField(index = false)
    private Date flightdate;    
    @QuerySqlField(index = false)
    @Column(name = "uniquecarrier")
    private String uniquecarrier;
    @QuerySqlField(index = false)
    @Column(name = "airlineid")
    private Integer airlineid;
    @QuerySqlField(index = false)
    @Column(name = "carrier")
    private String carrier;  
    @Column(name = "tailnum")
    @QuerySqlField(index = false)
    private String tailnum;
    @QuerySqlField(index = false)
    @Column(name = "flightnum")
    private Integer flightnum;
    @QuerySqlField(index = false)
    @Column(name = "originairportid")
    private Integer originairportid;
    @QuerySqlField(index = false)
    @Column(name = "originairportseqid")
    private Integer originairportseqid;
    @QuerySqlField(index = false)
    @Column(name = "origincitymarketid")
    private Integer origincitymarketid;
    @QuerySqlField(index = false)
    @Column(name = "origin")
    private String origin;
    @QuerySqlField(index = false)   
    @Column(name = "origincityname")
    private String origincityname;
   
    @Column(name = "originstate")
    @QuerySqlField(index = false)
    private String originstate;
    @Column(name = "originstatefips")
    @QuerySqlField(index = false)
    private Integer originstatefips;    
    @Column(name = "originstatename")
    @QuerySqlField(index = false)
    private String originstatename;
    @Column(name = "originwac")
    @QuerySqlField(index = false)
    private Integer originwac;
    @Column(name = "destairportid")
    @QuerySqlField(index = false)
    private Integer destairportid;
    @Column(name = "destairportseqid")
    @QuerySqlField(index = false)
    private Integer destairportseqid;
    @Column(name = "destcitymarketid")
    @QuerySqlField(index = false)
    private Integer destcitymarketid;  
    @Column(name = "dest")
    @QuerySqlField(index = false)
    private String dest;    
    @Column(name = "destcityname")
    @QuerySqlField(index = false)
    private String destcityname;    
    @Column(name = "deststate")
    @QuerySqlField(index = false)
    private String deststate;
    @Column(name = "deststatefips")
    @QuerySqlField(index = false)
    private Integer deststatefips;    
    @Column(name = "deststatename")
    @QuerySqlField(index = false)
    private String deststatename;

    public Flight() {
    }

    public Flight(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getQuarter() {
        return quarter;
    }

    public void setQuarter(Integer quarter) {
        this.quarter = quarter;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDayofmonth() {
        return dayofmonth;
    }

    public void setDayofmonth(Integer dayofmonth) {
        this.dayofmonth = dayofmonth;
    }

    public Integer getDayofweek() {
        return dayofweek;
    }

    public void setDayofweek(Integer dayofweek) {
        this.dayofweek = dayofweek;
    }

    public Date getFlightdate() {
        return flightdate;
    }

    public void setFlightdate(Date flightdate) {
        this.flightdate = flightdate;
    }

    public String getUniquecarrier() {
        return uniquecarrier;
    }

    public void setUniquecarrier(String uniquecarrier) {
        this.uniquecarrier = uniquecarrier;
    }

    public Integer getAirlineid() {
        return airlineid;
    }

    public void setAirlineid(Integer airlineid) {
        this.airlineid = airlineid;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getTailnum() {
        return tailnum;
    }

    public void setTailnum(String tailnum) {
        this.tailnum = tailnum;
    }

    public Integer getFlightnum() {
        return flightnum;
    }

    public void setFlightnum(Integer flightnum) {
        this.flightnum = flightnum;
    }

    public Integer getOriginairportid() {
        return originairportid;
    }

    public void setOriginairportid(Integer originairportid) {
        this.originairportid = originairportid;
    }

    public Integer getOriginairportseqid() {
        return originairportseqid;
    }

    public void setOriginairportseqid(Integer originairportseqid) {
        this.originairportseqid = originairportseqid;
    }

    public Integer getOrigincitymarketid() {
        return origincitymarketid;
    }

    public void setOrigincitymarketid(Integer origincitymarketid) {
        this.origincitymarketid = origincitymarketid;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigincityname() {
        return origincityname;
    }

    public void setOrigincityname(String origincityname) {
        this.origincityname = origincityname;
    }

    public String getOriginstate() {
        return originstate;
    }

    public void setOriginstate(String originstate) {
        this.originstate = originstate;
    }

    public Integer getOriginstatefips() {
        return originstatefips;
    }

    public void setOriginstatefips(Integer originstatefips) {
        this.originstatefips = originstatefips;
    }

    public String getOriginstatename() {
        return originstatename;
    }

    public void setOriginstatename(String originstatename) {
        this.originstatename = originstatename;
    }

    public Integer getOriginwac() {
        return originwac;
    }

    public void setOriginwac(Integer originwac) {
        this.originwac = originwac;
    }

    public Integer getDestairportid() {
        return destairportid;
    }

    public void setDestairportid(Integer destairportid) {
        this.destairportid = destairportid;
    }

    public Integer getDestairportseqid() {
        return destairportseqid;
    }

    public void setDestairportseqid(Integer destairportseqid) {
        this.destairportseqid = destairportseqid;
    }

    public Integer getDestcitymarketid() {
        return destcitymarketid;
    }

    public void setDestcitymarketid(Integer destcitymarketid) {
        this.destcitymarketid = destcitymarketid;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getDestcityname() {
        return destcityname;
    }

    public void setDestcityname(String destcityname) {
        this.destcityname = destcityname;
    }

    public String getDeststate() {
        return deststate;
    }

    public void setDeststate(String deststate) {
        this.deststate = deststate;
    }

    public Integer getDeststatefips() {
        return deststatefips;
    }

    public void setDeststatefips(Integer deststatefips) {
        this.deststatefips = deststatefips;
    }

    public String getDeststatename() {
        return deststatename;
    }

    public void setDeststatename(String deststatename) {
        this.deststatename = deststatename;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Flight)) {
            return false;
        }
        Flight other = (Flight) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "io.project.model.Flight[ id=" + id + " ]";
    }
    
}
