package com.rsmoreira.math;

public class SimpleCalcProxy implements com.rsmoreira.math.SimpleCalc {
  private String _endpoint = null;
  private com.rsmoreira.math.SimpleCalc simpleCalc = null;
  
  public SimpleCalcProxy() {
    _initSimpleCalcProxy();
  }
  
  public SimpleCalcProxy(String endpoint) {
    _endpoint = endpoint;
    _initSimpleCalcProxy();
  }
  
  private void _initSimpleCalcProxy() {
    try {
      simpleCalc = (new com.rsmoreira.math.SimpleCalcImplServiceLocator()).getSimpleCalcImplPort();
      if (simpleCalc != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)simpleCalc)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)simpleCalc)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (simpleCalc != null)
      ((javax.xml.rpc.Stub)simpleCalc)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.rsmoreira.math.SimpleCalc getSimpleCalc() {
    if (simpleCalc == null)
      _initSimpleCalcProxy();
    return simpleCalc;
  }
  
  public float subtrair(float arg0, float arg1) throws java.rmi.RemoteException{
    if (simpleCalc == null)
      _initSimpleCalcProxy();
    return simpleCalc.subtrair(arg0, arg1);
  }
  
  public float multiplicar(float arg0, float arg1) throws java.rmi.RemoteException{
    if (simpleCalc == null)
      _initSimpleCalcProxy();
    return simpleCalc.multiplicar(arg0, arg1);
  }
  
  public float dividir(float arg0, float arg1) throws java.rmi.RemoteException{
    if (simpleCalc == null)
      _initSimpleCalcProxy();
    return simpleCalc.dividir(arg0, arg1);
  }
  
  public float somar(float arg0, float arg1) throws java.rmi.RemoteException{
    if (simpleCalc == null)
      _initSimpleCalcProxy();
    return simpleCalc.somar(arg0, arg1);
  }
  
  
}