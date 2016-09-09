/**
 * PickupServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class PickupServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.fedex.pickup.stub.PickupPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPickupAvailability");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupAvailabilityRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupAvailabilityRequest"), com.fedex.pickup.stub.PickupAvailabilityRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupAvailabilityReply"));
        oper.setReturnClass(com.fedex.pickup.stub.PickupAvailabilityReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupAvailabilityReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createPickup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CreatePickupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CreatePickupRequest"), com.fedex.pickup.stub.CreatePickupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CreatePickupReply"));
        oper.setReturnClass(com.fedex.pickup.stub.CreatePickupReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CreatePickupReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelPickup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CancelPickupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CancelPickupRequest"), com.fedex.pickup.stub.CancelPickupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CancelPickupReply"));
        oper.setReturnClass(com.fedex.pickup.stub.CancelPickupReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CancelPickupReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

    }

    public PickupServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PickupServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PickupServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "AccessorRoleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.AccessorRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "Address");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "AssociatedAccount");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.AssociatedAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "AssociatedAccountNumberType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.AssociatedAccountNumberType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "BuildingPartCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.BuildingPartCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CancelPickupReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.CancelPickupReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CancelPickupRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.CancelPickupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CarrierCodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.CarrierCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ChargeBasisLevelType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ChargeBasisLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ClientDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ClientDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CloseTimeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.CloseTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CodAddTransportationChargeBasisType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.CodAddTransportationChargeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CodAddTransportationChargesDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.CodAddTransportationChargesDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CodCollectionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.CodCollectionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CodDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.CodDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CodReturnReferenceIndicatorType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.CodReturnReferenceIndicatorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CompletedFreightPickupDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.CompletedFreightPickupDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CompletedFreightPickupLineItem");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.CompletedFreightPickupLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "Contact");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ContactAndAddress");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ContactAndAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CountryRelationshipType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.CountryRelationshipType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CreatePickupReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.CreatePickupReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CreatePickupRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.CreatePickupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CustomDeliveryWindowDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.CustomDeliveryWindowDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CustomDeliveryWindowType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.CustomDeliveryWindowType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "DateRange");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "DayOfWeekType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.DayOfWeekType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "DeliveryOnInvoiceAcceptanceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.DeliveryOnInvoiceAcceptanceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "DetentionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.DetentionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "Dimensions");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.Dimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "Distance");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.Distance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "DistanceUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.DistanceUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "EMailDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.EMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "EMailLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.EMailLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "EmailOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.EmailOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "EmailOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.EmailOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "EMailRecipient");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.EMailRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "EtdConfirmationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.EtdConfirmationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "EtdDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.EtdDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ExpressFreightPickupDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ExpressFreightPickupDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ExpressRegionCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ExpressRegionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ExtraLaborDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ExtraLaborDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "FaxDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.FaxDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "FedExLocationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.FedExLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "FlatbedTrailerDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.FlatbedTrailerDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "FlatbedTrailerOption");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.FlatbedTrailerOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "FreightGuaranteeDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.FreightGuaranteeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "FreightGuaranteeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.FreightGuaranteeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "FreightPickupDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.FreightPickupDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "FreightPickupLineItem");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.FreightPickupLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "FreightServiceCenterDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.FreightServiceCenterDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "FreightServiceSchedulingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.FreightServiceSchedulingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "FreightShipmentRoleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.FreightShipmentRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "HoldAtLocationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.HoldAtLocationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "HomeDeliveryPremiumDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.HomeDeliveryPremiumDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "HomeDeliveryPremiumType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.HomeDeliveryPremiumType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "InternationalControlledExportDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.InternationalControlledExportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "InternationalControlledExportType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.InternationalControlledExportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "InternationalTrafficInArmsRegulationsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.InternationalTrafficInArmsRegulationsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "LinearUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.LinearUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "Localization");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.Localization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "MarkingOrTaggingDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.MarkingOrTaggingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "Money");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.Money.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "NonBusinessTimeDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.NonBusinessTimeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "Notification");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.Notification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "NotificationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.NotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "NotificationEventType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.NotificationEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "NotificationFormatType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.NotificationFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "NotificationParameter");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.NotificationParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "NotificationSeverityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.NotificationSeverityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "NotificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.NotificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PackagingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PalletShrinkwrapDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PalletShrinkwrapDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PalletsProvidedDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PalletsProvidedDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "Party");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.Party.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "Payment");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.Payment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PaymentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "Payor");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.Payor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PendingShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PendingShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PendingShipmentProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PendingShipmentProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PendingShipmentProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PendingShipmentProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PendingShipmentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PendingShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PhysicalPackagingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PhysicalPackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupAvailabilityReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PickupAvailabilityReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupAvailabilityRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PickupAvailabilityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupBuildingLocationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PickupBuildingLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupEventType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PickupEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupOriginDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PickupOriginDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupRequestType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PickupRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupScheduleOption");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PickupScheduleOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupServiceCategoryType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PickupServiceCategoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupShipmentAttributes");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PickupShipmentAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.PickupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "RateLevelBasisType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.RateLevelBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "RateTypeBasisType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.RateTypeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "RecommendedDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.RecommendedDocumentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "RecommendedDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.RecommendedDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "RequestedShippingDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.RequestedShippingDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ReturnAssociationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ReturnAssociationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ReturnEMailAllowedSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ReturnEMailAllowedSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ReturnEMailDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ReturnEMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ReturnShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ReturnShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ReturnType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ReturnType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "Rma");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.Rma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ShipmentAssemblyDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ShipmentAssemblyDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ShipmentDryIceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ShipmentDryIceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ShipmentDryIceProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ShipmentDryIceProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ShipmentDryIceProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ShipmentDryIceProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ShipmentEventNotificationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ShipmentEventNotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ShipmentEventNotificationSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ShipmentEventNotificationSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ShipmentNotificationAggregationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ShipmentNotificationAggregationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ShipmentNotificationFormatSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ShipmentNotificationFormatSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ShipmentNotificationRoleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ShipmentNotificationRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ShipmentSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ShipmentSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ShipmentSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.ShipmentSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "SmsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.SmsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "SortAndSegregateDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.SortAndSegregateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "SpecialEquipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.SpecialEquipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "SpecialEquipmentLineItem");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.SpecialEquipmentLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "SpecialEquipmentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.SpecialEquipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "StorageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.StorageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "TaxpayerIdentification");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.TaxpayerIdentification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "TinType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.TinType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "TrackingId");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.TrackingId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "TrackingIdType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.TrackingIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "TrailerSizeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.TrailerSizeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "TransactionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.TransactionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "TruckType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.TruckType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "UploadDocumentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.UploadDocumentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "UploadDocumentIdProducer");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.UploadDocumentIdProducer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "UploadDocumentProducerType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.UploadDocumentProducerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "UploadDocumentReferenceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.UploadDocumentReferenceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "UploadDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.UploadDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "VersionId");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.VersionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "WebAuthenticationCredential");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.WebAuthenticationCredential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "WebAuthenticationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.WebAuthenticationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "WeighingDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.WeighingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "WeighingScaleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.WeighingScaleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "Weight");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.Weight.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "WeightUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.pickup.stub.WeightUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.fedex.pickup.stub.PickupAvailabilityReply getPickupAvailability(com.fedex.pickup.stub.PickupAvailabilityRequest pickupAvailabilityRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/pickup/v13/getPickupAvailability");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPickupAvailability"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pickupAvailabilityRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.pickup.stub.PickupAvailabilityReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.pickup.stub.PickupAvailabilityReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.pickup.stub.PickupAvailabilityReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.pickup.stub.CreatePickupReply createPickup(com.fedex.pickup.stub.CreatePickupRequest createPickupRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/pickup/v13/createPickup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createPickup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createPickupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.pickup.stub.CreatePickupReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.pickup.stub.CreatePickupReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.pickup.stub.CreatePickupReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.pickup.stub.CancelPickupReply cancelPickup(com.fedex.pickup.stub.CancelPickupRequest cancelPickupRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/pickup/v13/cancelPickup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancelPickup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cancelPickupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.pickup.stub.CancelPickupReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.pickup.stub.CancelPickupReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.pickup.stub.CancelPickupReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
