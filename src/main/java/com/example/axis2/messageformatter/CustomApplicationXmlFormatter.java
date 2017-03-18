package com.example.axis2.messageformatter;

import java.io.IOException;
import java.io.OutputStream;

import org.apache.axiom.om.OMOutputFormat;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.transport.http.ApplicationXMLFormatter;

public class CustomApplicationXmlFormatter extends ApplicationXMLFormatter {

  @Override
  public void writeTo(MessageContext context, OMOutputFormat format, OutputStream out, boolean preserve) throws AxisFault {
    String xmlHeader = "<?xml version=\"1.0\" encoding=\"" + format.getCharSetEncoding() + "\"?>";
    try {
      out.write(xmlHeader.getBytes());
    } catch (IOException e) {
      throw new AxisFault("Unable to write XML declaration to output stream.", e);
    }
    super.writeTo(context, format, out, preserve);
  }
}
