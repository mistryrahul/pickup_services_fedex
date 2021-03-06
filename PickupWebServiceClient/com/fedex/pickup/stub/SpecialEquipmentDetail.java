/**
 * SpecialEquipmentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;


/**
 * Specification for special equipment used in loading/unloading shipment.
 */
public class SpecialEquipmentDetail  implements java.io.Serializable {
    /* Contains an entry for each type of special equipment used with
     * shipment */
    private com.fedex.pickup.stub.SpecialEquipmentLineItem[] lineItems;

    public SpecialEquipmentDetail() {
    }

    public SpecialEquipmentDetail(
           com.fedex.pickup.stub.SpecialEquipmentLineItem[] lineItems) {
           this.lineItems = lineItems;
    }


    /**
     * Gets the lineItems value for this SpecialEquipmentDetail.
     * 
     * @return lineItems   * Contains an entry for each type of special equipment used with
     * shipment
     */
    public com.fedex.pickup.stub.SpecialEquipmentLineItem[] getLineItems() {
        return lineItems;
    }


    /**
     * Sets the lineItems value for this SpecialEquipmentDetail.
     * 
     * @param lineItems   * Contains an entry for each type of special equipment used with
     * shipment
     */
    public void setLineItems(com.fedex.pickup.stub.SpecialEquipmentLineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public com.fedex.pickup.stub.SpecialEquipmentLineItem getLineItems(int i) {
        return this.lineItems[i];
    }

    public void setLineItems(int i, com.fedex.pickup.stub.SpecialEquipmentLineItem _value) {
        this.lineItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpecialEquipmentDetail)) return false;
        SpecialEquipmentDetail other = (SpecialEquipmentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItems==null && other.getLineItems()==null) || 
             (this.lineItems!=null &&
              java.util.Arrays.equals(this.lineItems, other.getLineItems())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpecialEquipmentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "SpecialEquipmentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "LineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "SpecialEquipmentLineItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
