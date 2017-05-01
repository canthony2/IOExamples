/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioexamples;

import java.util.Objects;

/**
 *
 * @author canthony2
 */
public class Contact {
    
    private String name;
    private String address;
    private String home;
    private String region;
    private String island;
    private String planet;
    private String sector;

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", address=" + address + ", home=" + home + ", region=" + region + ", island=" + island + ", planet=" + planet + ", sector=" + sector + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.address);
        hash = 23 * hash + Objects.hashCode(this.home);
        hash = 23 * hash + Objects.hashCode(this.region);
        hash = 23 * hash + Objects.hashCode(this.island);
        hash = 23 * hash + Objects.hashCode(this.planet);
        hash = 23 * hash + Objects.hashCode(this.sector);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contact other = (Contact) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.home, other.home)) {
            return false;
        }
        if (!Objects.equals(this.region, other.region)) {
            return false;
        }
        if (!Objects.equals(this.island, other.island)) {
            return false;
        }
        if (!Objects.equals(this.planet, other.planet)) {
            return false;
        }
        if (!Objects.equals(this.sector, other.sector)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getIsland() {
        return island;
    }

    public void setIsland(String island) {
        this.island = island;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
    
}
