/**
 * PickupEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class PickupEventType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PickupEventType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ASSIGNED_TO_DRIVER = "ASSIGNED_TO_DRIVER";
    public static final java.lang.String _CANCELED = "CANCELED";
    public static final java.lang.String _EXCEPTION = "EXCEPTION";
    public static final java.lang.String _PICKED_UP = "PICKED_UP";
    public static final java.lang.String _SCHEDULED = "SCHEDULED";
    public static final PickupEventType ASSIGNED_TO_DRIVER = new PickupEventType(_ASSIGNED_TO_DRIVER);
    public static final PickupEventType CANCELED = new PickupEventType(_CANCELED);
    public static final PickupEventType EXCEPTION = new PickupEventType(_EXCEPTION);
    public static final PickupEventType PICKED_UP = new PickupEventType(_PICKED_UP);
    public static final PickupEventType SCHEDULED = new PickupEventType(_SCHEDULED);
    public java.lang.String getValue() { return _value_;}
    public static PickupEventType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PickupEventType enumeration = (PickupEventType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PickupEventType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PickupEventType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupEventType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
