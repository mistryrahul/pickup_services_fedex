/**
 * CodAddTransportationChargesDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class CodAddTransportationChargesDetail  implements java.io.Serializable {
    /* Select the type of rate from which the element is to be selected. */
    private com.fedex.pickup.stub.RateTypeBasisType rateTypeBasis;

    private com.fedex.pickup.stub.CodAddTransportationChargeBasisType chargeBasis;

    private com.fedex.pickup.stub.ChargeBasisLevelType chargeBasisLevel;

    /* Select the type of rate used to calculate the percentage value
     * of variable handling. */
    private com.fedex.pickup.stub.RateLevelBasisType rateLevelBasis;

    public CodAddTransportationChargesDetail() {
    }

    public CodAddTransportationChargesDetail(
           com.fedex.pickup.stub.RateTypeBasisType rateTypeBasis,
           com.fedex.pickup.stub.CodAddTransportationChargeBasisType chargeBasis,
           com.fedex.pickup.stub.ChargeBasisLevelType chargeBasisLevel,
           com.fedex.pickup.stub.RateLevelBasisType rateLevelBasis) {
           this.rateTypeBasis = rateTypeBasis;
           this.chargeBasis = chargeBasis;
           this.chargeBasisLevel = chargeBasisLevel;
           this.rateLevelBasis = rateLevelBasis;
    }


    /**
     * Gets the rateTypeBasis value for this CodAddTransportationChargesDetail.
     * 
     * @return rateTypeBasis   * Select the type of rate from which the element is to be selected.
     */
    public com.fedex.pickup.stub.RateTypeBasisType getRateTypeBasis() {
        return rateTypeBasis;
    }


    /**
     * Sets the rateTypeBasis value for this CodAddTransportationChargesDetail.
     * 
     * @param rateTypeBasis   * Select the type of rate from which the element is to be selected.
     */
    public void setRateTypeBasis(com.fedex.pickup.stub.RateTypeBasisType rateTypeBasis) {
        this.rateTypeBasis = rateTypeBasis;
    }


    /**
     * Gets the chargeBasis value for this CodAddTransportationChargesDetail.
     * 
     * @return chargeBasis
     */
    public com.fedex.pickup.stub.CodAddTransportationChargeBasisType getChargeBasis() {
        return chargeBasis;
    }


    /**
     * Sets the chargeBasis value for this CodAddTransportationChargesDetail.
     * 
     * @param chargeBasis
     */
    public void setChargeBasis(com.fedex.pickup.stub.CodAddTransportationChargeBasisType chargeBasis) {
        this.chargeBasis = chargeBasis;
    }


    /**
     * Gets the chargeBasisLevel value for this CodAddTransportationChargesDetail.
     * 
     * @return chargeBasisLevel
     */
    public com.fedex.pickup.stub.ChargeBasisLevelType getChargeBasisLevel() {
        return chargeBasisLevel;
    }


    /**
     * Sets the chargeBasisLevel value for this CodAddTransportationChargesDetail.
     * 
     * @param chargeBasisLevel
     */
    public void setChargeBasisLevel(com.fedex.pickup.stub.ChargeBasisLevelType chargeBasisLevel) {
        this.chargeBasisLevel = chargeBasisLevel;
    }


    /**
     * Gets the rateLevelBasis value for this CodAddTransportationChargesDetail.
     * 
     * @return rateLevelBasis   * Select the type of rate used to calculate the percentage value
     * of variable handling.
     */
    public com.fedex.pickup.stub.RateLevelBasisType getRateLevelBasis() {
        return rateLevelBasis;
    }


    /**
     * Sets the rateLevelBasis value for this CodAddTransportationChargesDetail.
     * 
     * @param rateLevelBasis   * Select the type of rate used to calculate the percentage value
     * of variable handling.
     */
    public void setRateLevelBasis(com.fedex.pickup.stub.RateLevelBasisType rateLevelBasis) {
        this.rateLevelBasis = rateLevelBasis;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodAddTransportationChargesDetail)) return false;
        CodAddTransportationChargesDetail other = (CodAddTransportationChargesDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rateTypeBasis==null && other.getRateTypeBasis()==null) || 
             (this.rateTypeBasis!=null &&
              this.rateTypeBasis.equals(other.getRateTypeBasis()))) &&
            ((this.chargeBasis==null && other.getChargeBasis()==null) || 
             (this.chargeBasis!=null &&
              this.chargeBasis.equals(other.getChargeBasis()))) &&
            ((this.chargeBasisLevel==null && other.getChargeBasisLevel()==null) || 
             (this.chargeBasisLevel!=null &&
              this.chargeBasisLevel.equals(other.getChargeBasisLevel()))) &&
            ((this.rateLevelBasis==null && other.getRateLevelBasis()==null) || 
             (this.rateLevelBasis!=null &&
              this.rateLevelBasis.equals(other.getRateLevelBasis())));
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
        if (getRateTypeBasis() != null) {
            _hashCode += getRateTypeBasis().hashCode();
        }
        if (getChargeBasis() != null) {
            _hashCode += getChargeBasis().hashCode();
        }
        if (getChargeBasisLevel() != null) {
            _hashCode += getChargeBasisLevel().hashCode();
        }
        if (getRateLevelBasis() != null) {
            _hashCode += getRateLevelBasis().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodAddTransportationChargesDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CodAddTransportationChargesDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateTypeBasis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "RateTypeBasis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "RateTypeBasisType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeBasis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ChargeBasis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CodAddTransportationChargeBasisType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeBasisLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ChargeBasisLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ChargeBasisLevelType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateLevelBasis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "RateLevelBasis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "RateLevelBasisType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
