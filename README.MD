This is simple fix for problem, explained here: http://stackoverflow.com/questions/42817929/wso2esb-how-to-add-xml-into-the-message-sent-to-pox-endpoint
I've got this solution in another question in Stack Overflow: http://stackoverflow.com/questions/13019908/wso2-xml-declaration - just implemented it as a maven-based project.
This fix was tested with WSO2 EI 6.0.0
For installing fix just place it into <wso2ei>dropins and change messageFormatter class in <wso2ie>/conf/axis2/axis2.xml