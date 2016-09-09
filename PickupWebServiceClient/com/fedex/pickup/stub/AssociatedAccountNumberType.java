/**
 * AssociatedAccountNumberType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class AssociatedAccountNumberType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AssociatedAccountNumberType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FEDEX_EXPRESS = "FEDEX_EXPRESS";
    public static final java.lang.String _FEDEX_FREIGHT = "FEDEX_FREIGHT";
    public static final java.lang.String _FEDEX_GROUND = "FEDEX_GROUND";
    public static final java.lang.String _FEDEX_OFFICE = "FEDEX_OFFICE";
    public static final AssociatedAccountNumberType FEDEX_EXPRESS = new AssociatedAccountNumberType(_FEDEX_EXPRESS);
    public static final AssociatedAccountNumberType FEDEX_FREIGHT = new AssociatedAccountNumberType(_FEDEX_FREIGHT);
    public static final AssociatedAccountNumberType FEDEX_GROUND = new AssociatedAccountNumberType(_FEDEX_GROUND);
    public static final AssociatedAccountNumberType FEDEX_OFFICE = new AssociatedAccountNumberType(_FEDEX_OFFICE);
    public java.lang.String getValue() { return _value_;}
    public static AssociatedAccountNumberType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AssociatedAccountNumberType enumeration = (AssociatedAccountNumberType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AssociatedAccountNumberType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AssociatedAccountNumberType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "AssociatedAccountNumberType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
