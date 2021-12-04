<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="samplePhoneBankingProxyid" scope="session" class="org.example.www.PhoneBanking.PhoneBankingProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
samplePhoneBankingProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = samplePhoneBankingProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        samplePhoneBankingProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        org.example.www.PhoneBanking.PhoneBanking_PortType getPhoneBanking_PortType10mtemp = samplePhoneBankingProxyid.getPhoneBanking_PortType();
if(getPhoneBanking_PortType10mtemp == null){
%>
<%=getPhoneBanking_PortType10mtemp %>
<%
}else{
        if(getPhoneBanking_PortType10mtemp!= null){
        String tempreturnp11 = getPhoneBanking_PortType10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String name_2id=  request.getParameter("name22");
            java.lang.String name_2idTemp = null;
        if(!name_2id.equals("")){
         name_2idTemp  = name_2id;
        }
        String accountId_3id=  request.getParameter("accountId24");
            java.lang.String accountId_3idTemp = null;
        if(!accountId_3id.equals("")){
         accountId_3idTemp  = accountId_3id;
        }
        %>
        <jsp:useBean id="com1example1www1PhoneBanking1AccountType_1id" scope="session" class="com.example.www.PhoneBanking.AccountType" />
        <%
        com1example1www1PhoneBanking1AccountType_1id.setName(name_2idTemp);
        com1example1www1PhoneBanking1AccountType_1id.setAccountId(accountId_3idTemp);
        com.example.www.PhoneBanking.VerificationCode getAccountSummary13mtemp = samplePhoneBankingProxyid.getAccountSummary(com1example1www1PhoneBanking1AccountType_1id);
if(getAccountSummary13mtemp == null){
%>
<%=getAccountSummary13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">completed:</TD>
<TD>
<%
if(getAccountSummary13mtemp != null){
%>
<%=getAccountSummary13mtemp.isCompleted()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(getAccountSummary13mtemp != null){
java.lang.String typecode18 = getAccountSummary13mtemp.getCode();
        String tempResultcode18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode18));
        %>
        <%= tempResultcode18 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 26:
        gotMethod = true;
        String name_5id=  request.getParameter("name31");
            java.lang.String name_5idTemp = null;
        if(!name_5id.equals("")){
         name_5idTemp  = name_5id;
        }
        String accountId_6id=  request.getParameter("accountId33");
            java.lang.String accountId_6idTemp = null;
        if(!accountId_6id.equals("")){
         accountId_6idTemp  = accountId_6id;
        }
        %>
        <jsp:useBean id="com1example1www1PhoneBanking1AccountType_4id" scope="session" class="com.example.www.PhoneBanking.AccountType" />
        <%
        com1example1www1PhoneBanking1AccountType_4id.setName(name_5idTemp);
        com1example1www1PhoneBanking1AccountType_4id.setAccountId(accountId_6idTemp);
        com.example.www.PhoneBanking.Payee[] getPayees26mtemp = samplePhoneBankingProxyid.getPayees(com1example1www1PhoneBanking1AccountType_4id);
if(getPayees26mtemp == null){
%>
<%=getPayees26mtemp %>
<%
}else{
        String tempreturnp27 = null;
        if(getPayees26mtemp != null){
        java.util.List listreturnp27= java.util.Arrays.asList(getPayees26mtemp);
        tempreturnp27 = listreturnp27.toString();
        }
        %>
        <%=tempreturnp27%>
        <%
}
break;
case 35:
        gotMethod = true;
        String name_8id=  request.getParameter("name42");
            java.lang.String name_8idTemp = null;
        if(!name_8id.equals("")){
         name_8idTemp  = name_8id;
        }
        String accountCode_9id=  request.getParameter("accountCode44");
            java.lang.String accountCode_9idTemp = null;
        if(!accountCode_9id.equals("")){
         accountCode_9idTemp  = accountCode_9id;
        }
        %>
        <jsp:useBean id="com1example1www1PhoneBanking1Payee_7id" scope="session" class="com.example.www.PhoneBanking.Payee" />
        <%
        com1example1www1PhoneBanking1Payee_7id.setName(name_8idTemp);
        com1example1www1PhoneBanking1Payee_7id.setAccountCode(accountCode_9idTemp);
        com.example.www.PhoneBanking.CompletionCode addPayee35mtemp = samplePhoneBankingProxyid.addPayee(com1example1www1PhoneBanking1Payee_7id);
if(addPayee35mtemp == null){
%>
<%=addPayee35mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">completed:</TD>
<TD>
<%
if(addPayee35mtemp != null){
%>
<%=addPayee35mtemp.isCompleted()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 46:
        gotMethod = true;
        String ammount_11id=  request.getParameter("ammount55");
        double ammount_11idTemp  = Double.parseDouble(ammount_11id);
        String date_12id=  request.getParameter("date57");
            java.util.Date date_12idTemp = null;
        if(!date_12id.equals("")){
        java.text.DateFormat dateFormatdate57 = java.text.DateFormat.getDateInstance();
        date_12idTemp= dateFormatdate57.parse(date_12id);
        }
        String accountType_13id=  request.getParameter("accountType59");
            java.lang.String accountType_13idTemp = null;
        if(!accountType_13id.equals("")){
         accountType_13idTemp  = accountType_13id;
        }
        String name_15id=  request.getParameter("name63");
            java.lang.String name_15idTemp = null;
        if(!name_15id.equals("")){
         name_15idTemp  = name_15id;
        }
        String accountCode_16id=  request.getParameter("accountCode65");
            java.lang.String accountCode_16idTemp = null;
        if(!accountCode_16id.equals("")){
         accountCode_16idTemp  = accountCode_16id;
        }
        %>
        <jsp:useBean id="com1example1www1PhoneBanking1Payee_14id" scope="session" class="com.example.www.PhoneBanking.Payee" />
        <%
        com1example1www1PhoneBanking1Payee_14id.setName(name_15idTemp);
        com1example1www1PhoneBanking1Payee_14id.setAccountCode(accountCode_16idTemp);
        %>
        <jsp:useBean id="com1example1www1PhoneBanking1BillInfo_10id" scope="session" class="com.example.www.PhoneBanking.BillInfo" />
        <%
        com1example1www1PhoneBanking1BillInfo_10id.setAmmount(ammount_11idTemp);
        com1example1www1PhoneBanking1BillInfo_10id.setDate(date_12idTemp);
        com1example1www1PhoneBanking1BillInfo_10id.setAccountType(accountType_13idTemp);
        com1example1www1PhoneBanking1BillInfo_10id.setPayee(com1example1www1PhoneBanking1Payee_14id);
        com.example.www.PhoneBanking.VerificationCode payBill46mtemp = samplePhoneBankingProxyid.payBill(com1example1www1PhoneBanking1BillInfo_10id);
if(payBill46mtemp == null){
%>
<%=payBill46mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">completed:</TD>
<TD>
<%
if(payBill46mtemp != null){
%>
<%=payBill46mtemp.isCompleted()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(payBill46mtemp != null){
java.lang.String typecode51 = payBill46mtemp.getCode();
        String tempResultcode51 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode51));
        %>
        <%= tempResultcode51 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>