This is simple fix for problem, explained here: http://stackoverflow.com/questions/42817929/wso2esb-how-to-add-xml-into-the-message-sent-to-pox-endpoint

I've got this solution in another question in Stack Overflow: http://stackoverflow.com/questions/13019908/wso2-xml-declaration - just implemented it as a maven-based project.

This fix was tested with WSO2 EI 6.0.0

For installing fix just place it into _<wso2ei>/dropins_ and change messageFormatter class for application/xml type to com.example.axis2.messageformatter.CustomApplicationXmlFormatter in _<wso2ie>/conf/axis2/axis2.xml_ (to use in send mediator) and in _<wso2ie>/conf/axis2/axis2_blocking_client.xml_ to use in CallOut mediator and in Scheduler Message Forwarding Processor:
```xml
<messageFormatter contentType="application/xml"
                          class="com.example.axis2.messageformatter.CustomApplicationXmlFormatter"/>
```
