/**
 * TravelService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.training.ifaces;

public interface TravelService extends java.rmi.Remote {
    public java.lang.String[] weekEndTrips(java.lang.String city) throws java.rmi.RemoteException;
    public java.lang.String[] monthEndTrips(java.lang.String city) throws java.rmi.RemoteException;
}
