<html>
<body>
<b><% out.println("Hello World! from azure xxx"); %></b>
<%
    java.util.Properties p = System.getProperties();
    for (Object key :
            p.keySet()) {
        out.println(key +" : "+p.get(key)+"<br>");
    }
%>
</body>
</html>
