package org.omg.PortableServer.POAManagerPackage;


/**
* org/omg/PortableServer/POAManagerPackage/AdapterInactive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/puppet/workspace/8-2-build-windows-amd64-cygwin/jdk8u73/6086/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Friday, January 29, 2016 5:40:18 PM PST
*/

public final class AdapterInactive extends org.omg.CORBA.UserException
{

  public AdapterInactive ()
  {
    super(AdapterInactiveHelper.id());
  } // ctor


  public AdapterInactive (String $reason)
  {
    super(AdapterInactiveHelper.id() + "  " + $reason);
  } // ctor

} // class AdapterInactive
