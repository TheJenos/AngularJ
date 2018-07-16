/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cache;

import Controller.AngularJComponent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author TheJenos
 */
public class RamElement {

    ArrayList<RamObj> ram = new ArrayList<RamObj>();

    class RamObj {

        private String SessionID;
        private AngularJComponent Comp;

        public RamObj(String SessionID, AngularJComponent Comp) {
            this.SessionID = SessionID;
            this.Comp = Comp;
        }

        public AngularJComponent getComp() {
            return Comp;
        }

        public String getSessionID() {
            return SessionID;
        }

        public void setComp(AngularJComponent Comp) {
            this.Comp = Comp;
        }

        public void setSessionID(String SessionID) {
            this.SessionID = SessionID;
        }

    }

    private static RamElement instance;

    public static RamElement getInstance() {
        if (instance == null) {
            instance = new RamElement();
        }
        return instance;
    }

    private RamElement() {
    }

    public void addToRam(String SessionID, AngularJComponent comp) {
        ram.add(new RamObj(SessionID, comp));
    }

    public void removeByHash(int hash){
        ram.remove(getByHash(hash));
    }
    
    public void removeBySessionID(String SessionID) {
        ram.removeAll(getBySessionID(SessionID));
    }

    public ArrayList<RamObj> getBySessionID(String SessionID) {
        ArrayList<RamObj> objlist = new ArrayList<RamObj>();
        for (RamObj ramObj : ram) {
            if (ramObj.getSessionID().equals(SessionID)) {
                objlist.add(ramObj);
            }
        }
        return objlist;
    }

    public RamObj getByHash(int hash) {
        for (RamObj ramObj : ram) {
            if (ramObj.getComp().hashCode() == hash) {
                return ramObj;
            }
        }
        return null;
    }
}
