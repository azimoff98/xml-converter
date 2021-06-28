package com.example;

public class DiamondResponses {


    public static final String RESPONSE_102 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<MethodResponse>\n" +
            "\t<ResponseCode>0</ResponseCode>\n" +
            "\t<ACIP5Response>SUCCESS</ACIP5Response>\n" +
            "\t<ACIP5RawResponse>\n" +
            "\t\t<params>\n" +
            "\t\t\t<param>\n" +
            "\t\t\t\t<value>\n" +
            "\t\t\t\t\t<struct>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>availableServerCapabilities</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<array>\n" +
            "\t\t\t\t\t\t\t\t\t<data>\n" +
            "\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<i4>805642756</i4>\n" +
            "\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<i4>520</i4>\n" +
            "\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t</data>\n" +
            "\t\t\t\t\t\t\t\t</array>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>negotiatedCapabilities</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<array>\n" +
            "\t\t\t\t\t\t\t\t\t<data>\n" +
            "\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<i4>0</i4>\n" +
            "\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t</data>\n" +
            "\t\t\t\t\t\t\t\t</array>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>originTransactionID</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<string>1178140319117762004</string>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>responseCode</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<i4>102</i4>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t</struct>\n" +
            "\t\t\t\t</value>\n" +
            "\t\t\t</param>\n" +
            "\t\t</params>\n" +
            "\t</ACIP5RawResponse>\n" +
            "\t<TransactionID>1178140319117762004</TransactionID>\n" +
            "</MethodResponse>";

    public static final String FAIL_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<MethodResponse>\n" +
            "  <ResponseCode>0</ResponseCode>\n" +
            "  <ACIP5Response>FAULT</ACIP5Response>\n" +
            "  <ACIP5RawResponse>\n" +
            "    <fault>\n" +
            "      <value>\n" +
            "        <struct>\n" +
            "          <member>\n" +
            "            <name>faultCode</name>\n" +
            "            <value>\n" +
            "              <i4>1003</i4>\n" +
            "            </value>\n" +
            "          </member>\n" +
            "          <member>\n" +
            "            <name>faultString</name>\n" +
            "            <value>\n" +
            "              <string>Data out of bounds</string>\n" +
            "            </value>\n" +
            "          </member>\n" +
            "        </struct>\n" +
            "      </value>\n" +
            "    </fault>\n" +
            "  </ACIP5RawResponse>\n" +
            "  <TransactionID>1178135911223318321</TransactionID>\n" +
            "</MethodResponse>";

    public static final String SUCCESS_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<MethodResponse>\n" +
            "\t<ResponseCode>0</ResponseCode>\n" +
            "\t<ACIP5Response>SUCCESS</ACIP5Response>\n" +
            "\t<ACIP5RawResponse>\n" +
            "\t\t<params>\n" +
            "\t\t\t<param>\n" +
            "\t\t\t\t<value>\n" +
            "\t\t\t\t\t<struct>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>accountValue1</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<string>562</string>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>availableServerCapabilities</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<array>\n" +
            "\t\t\t\t\t\t\t\t\t<data>\n" +
            "\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<i4>805642756</i4>\n" +
            "\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<i4>520</i4>\n" +
            "\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t</data>\n" +
            "\t\t\t\t\t\t\t\t</array>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>creditClearanceDate</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<dateTime.iso8601>20220525T12:00:00+0000</dateTime.iso8601>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>currency1</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<string>AZM</string>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>dedicatedAccountInformation</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<array>\n" +
            "\t\t\t\t\t\t\t\t\t<data>\n" +
            "\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<struct>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<name>dedicatedAccountActiveValue1</name>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<string>18000</string>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<name>dedicatedAccountID</name>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i4>128</i4>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<name>dedicatedAccountUnitType</name>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i4>0</i4>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<name>dedicatedAccountValue1</name>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<string>18000</string>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<name>expiryDate</name>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<dateTime.iso8601>20210709T12:00:00+0000</dateTime.iso8601>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<name>pamServiceID</name>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i4>1</i4>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<name>startDate</name>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<dateTime.iso8601>20210509T12:00:00+0000</dateTime.iso8601>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<name>dedicatedAccountValueTime</name>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<string>0d.5h.0m.0s</string>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t</struct>\n" +
            "\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t</data>\n" +
            "\t\t\t\t\t\t\t\t</array>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>languageIDCurrent</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<i4>1</i4>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>negotiatedCapabilities</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<array>\n" +
            "\t\t\t\t\t\t\t\t\t<data>\n" +
            "\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<i4>0</i4>\n" +
            "\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t</data>\n" +
            "\t\t\t\t\t\t\t\t</array>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>offerInformationList</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<array>\n" +
            "\t\t\t\t\t\t\t\t\t<data>\n" +
            "\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<struct>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<name>expiryDate</name>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<dateTime.iso8601>99991231T12:00:00+0000</dateTime.iso8601>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<name>offerID</name>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i4>40</i4>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<name>offerType</name>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i4>0</i4>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<name>pamServiceID</name>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i4>1</i4>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<name>startDate</name>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<dateTime.iso8601>20210509T12:00:00+0000</dateTime.iso8601>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t</struct>\n" +
            "\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<struct>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<name>expiryDate</name>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<dateTime.iso8601>20210709T12:00:00+0000</dateTime.iso8601>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<name>offerID</name>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i4>41</i4>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<name>offerType</name>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i4>0</i4>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<name>pamServiceID</name>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i4>1</i4>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<name>startDate</name>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<dateTime.iso8601>20210609T12:00:00+0000</dateTime.iso8601>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t</struct>\n" +
            "\t\t\t\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t\t\t\t</data>\n" +
            "\t\t\t\t\t\t\t\t</array>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>originTransactionID</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<string>117814022417985672</string>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>responseCode</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<i4>0</i4>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>serviceClassCurrent</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<i4>50</i4>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>serviceFeeExpiryDate</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<dateTime.iso8601>20211126T12:00:00+0000</dateTime.iso8601>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>serviceRemovalDate</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<dateTime.iso8601>20220525T12:00:00+0000</dateTime.iso8601>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>supervisionExpiryDate</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<dateTime.iso8601>20211126T12:00:00+0000</dateTime.iso8601>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t\t<member>\n" +
            "\t\t\t\t\t\t\t<name>accountValueAZN</name>\n" +
            "\t\t\t\t\t\t\t<value>\n" +
            "\t\t\t\t\t\t\t\t<string>5.62</string>\n" +
            "\t\t\t\t\t\t\t</value>\n" +
            "\t\t\t\t\t\t</member>\n" +
            "\t\t\t\t\t</struct>\n" +
            "\t\t\t\t</value>\n" +
            "\t\t\t</param>\n" +
            "\t\t</params>\n" +
            "\t</ACIP5RawResponse>\n" +
            "\t<TransactionID>117814022417985672</TransactionID>\n" +
            "</MethodResponse>\n";
}
