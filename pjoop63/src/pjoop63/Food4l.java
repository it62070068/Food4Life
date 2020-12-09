/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pjoop63;

/**
 *
 * @author Admin
 */
public class Food4l {
    private int fid;
    private String fname;
    private int fcal;
    private float fcost;
    private String fstatus;

    public Food4l(int fid, String fname,int fcal, float fcost, String fstatus) {
        this.fid = fid;
        this.fname = fname;
        this.fcal = fcal;
        this.fcost = fcost;
        this.fstatus = fstatus;
    }

    Food4l(int aInt, String string, int aInt0, float aFloat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the fid
     */
    public int getFid() {
        return fid;
    }
    /**
     * @param fid the fid to set
     */
    public void setFid(int fid) {
        this.fid = fid;
    }
    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }
    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }
    /**
     * @return the fcost
     */
    public float getFcost() {
        return fcost;
    }
    /**
     * @param fcost the fcost to set
     */
    public void setFcost(float fcost) {
        this.fcost = fcost;
    }
    /**
     * @return the fstatus
     */
    public String getFstatus() {
        return fstatus;
    }
    /**
     * @param fstatus the fstatus to set
     */
    public void setFstatus(String fstatus) {
        this.fstatus = fstatus;
    }

    /**
     * @return the fcal
     */
    public int getFcal() {
        return fcal;
    }

    /**
     * @param fcal the fcal to set
     */
    public void setFcal(int fcal) {
        this.fcal = fcal;
    }
    
}