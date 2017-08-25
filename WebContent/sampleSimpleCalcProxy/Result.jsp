<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleSimpleCalcProxyid" scope="session" class="com.rsmoreira.math.SimpleCalcProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSimpleCalcProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleSimpleCalcProxyid.getEndpoint();
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
        sampleSimpleCalcProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.rsmoreira.math.SimpleCalc getSimpleCalc10mtemp = sampleSimpleCalcProxyid.getSimpleCalc();
if(getSimpleCalc10mtemp == null){
%>
<%=getSimpleCalc10mtemp %>
<%
}else{
        if(getSimpleCalc10mtemp!= null){
        String tempreturnp11 = getSimpleCalc10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String arg0_1id=  request.getParameter("arg016");
        float arg0_1idTemp  = Float.parseFloat(arg0_1id);
        String arg1_2id=  request.getParameter("arg118");
        float arg1_2idTemp  = Float.parseFloat(arg1_2id);
        float subtrair13mtemp = sampleSimpleCalcProxyid.subtrair(arg0_1idTemp,arg1_2idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(subtrair13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 20:
        gotMethod = true;
        String arg0_3id=  request.getParameter("arg023");
        float arg0_3idTemp  = Float.parseFloat(arg0_3id);
        String arg1_4id=  request.getParameter("arg125");
        float arg1_4idTemp  = Float.parseFloat(arg1_4id);
        float multiplicar20mtemp = sampleSimpleCalcProxyid.multiplicar(arg0_3idTemp,arg1_4idTemp);
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(multiplicar20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
break;
case 27:
        gotMethod = true;
        String arg0_5id=  request.getParameter("arg030");
        float arg0_5idTemp  = Float.parseFloat(arg0_5id);
        String arg1_6id=  request.getParameter("arg132");
        float arg1_6idTemp  = Float.parseFloat(arg1_6id);
        float dividir27mtemp = sampleSimpleCalcProxyid.dividir(arg0_5idTemp,arg1_6idTemp);
        String tempResultreturnp28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(dividir27mtemp));
        %>
        <%= tempResultreturnp28 %>
        <%
break;
case 34:
        gotMethod = true;
        String arg0_7id=  request.getParameter("arg037");
        float arg0_7idTemp  = Float.parseFloat(arg0_7id);
        String arg1_8id=  request.getParameter("arg139");
        float arg1_8idTemp  = Float.parseFloat(arg1_8id);
        float somar34mtemp = sampleSimpleCalcProxyid.somar(arg0_7idTemp,arg1_8idTemp);
        String tempResultreturnp35 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(somar34mtemp));
        %>
        <%= tempResultreturnp35 %>
        <%
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