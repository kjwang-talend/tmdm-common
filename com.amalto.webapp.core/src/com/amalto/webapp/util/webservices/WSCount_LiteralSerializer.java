// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.webapp.util.webservices;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.xsd.XSDConstants;
import com.sun.xml.rpc.encoding.literal.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.ArrayList;

public class WSCount_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_wsDataClusterPK_QNAME = new QName("", "wsDataClusterPK");
    private static final QName ns2_WSDataClusterPK_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPK");
    private CombinedSerializer ns2_myWSDataClusterPK_LiteralSerializer;
    private static final QName ns1_countPath_QNAME = new QName("", "countPath");
    private static final QName ns3_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns3_myns3_string__java_lang_String_String_Serializer;
    private static final QName ns1_whereItem_QNAME = new QName("", "whereItem");
    private static final QName ns2_WSWhereItem_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSWhereItem");
    private CombinedSerializer ns2_myWSWhereItem_LiteralSerializer;
    private static final QName ns1_spellTreshold_QNAME = new QName("", "spellTreshold");
    private static final QName ns3_int_TYPE_QNAME = SchemaConstants.QNAME_TYPE_INT;
    private CombinedSerializer ns3_myns3__int__int_Int_Serializer;
    
    public WSCount_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public WSCount_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns2_myWSDataClusterPK_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.webapp.util.webservices.WSDataClusterPK.class, ns2_WSDataClusterPK_TYPE_QNAME);
        ns3_myns3_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns3_string_TYPE_QNAME);
        ns2_myWSWhereItem_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.webapp.util.webservices.WSWhereItem.class, ns2_WSWhereItem_TYPE_QNAME);
        ns3_myns3__int__int_Int_Serializer = (CombinedSerializer)registry.getSerializer("", int.class, ns3_int_TYPE_QNAME);
    }
    
    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.amalto.webapp.util.webservices.WSCount instance = new com.amalto.webapp.util.webservices.WSCount();
        Object member=null;
        QName elementName;
        List values;
        Object value;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_wsDataClusterPK_QNAME)) {
                member = ns2_myWSDataClusterPK_LiteralSerializer.deserialize(ns1_wsDataClusterPK_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setWsDataClusterPK((com.amalto.webapp.util.webservices.WSDataClusterPK)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_wsDataClusterPK_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_countPath_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_countPath_QNAME, reader, context);
                instance.setCountPath((java.lang.String)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_countPath_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_whereItem_QNAME)) {
                member = ns2_myWSWhereItem_LiteralSerializer.deserialize(ns1_whereItem_QNAME, reader, context);
                instance.setWhereItem((com.amalto.webapp.util.webservices.WSWhereItem)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_whereItem_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_spellTreshold_QNAME)) {
                member = ns3_myns3__int__int_Int_Serializer.deserialize(ns1_spellTreshold_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setSpellTreshold(((Integer)member).intValue());
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_spellTreshold_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }
    
    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.webapp.util.webservices.WSCount instance = (com.amalto.webapp.util.webservices.WSCount)obj;
        
    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.webapp.util.webservices.WSCount instance = (com.amalto.webapp.util.webservices.WSCount)obj;
        
        if (instance.getWsDataClusterPK() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myWSDataClusterPK_LiteralSerializer.serialize(instance.getWsDataClusterPK(), ns1_wsDataClusterPK_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getCountPath(), ns1_countPath_QNAME, null, writer, context);
        ns2_myWSWhereItem_LiteralSerializer.serialize(instance.getWhereItem(), ns1_whereItem_QNAME, null, writer, context);
        if (new Integer(instance.getSpellTreshold()) == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns3_myns3__int__int_Int_Serializer.serialize(new Integer(instance.getSpellTreshold()), ns1_spellTreshold_QNAME, null, writer, context);
    }
}
