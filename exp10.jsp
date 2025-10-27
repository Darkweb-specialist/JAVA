<%@ page language="java" %>
    <html>

    <body>
        <form method="post">
            Name: <input type="text" name="uname">
            <input type="submit" value="Go">
        </form>

    <%
      String n = request.getParameter("uname"):
      if(n != null){
        out.println("Hello" + n + "<br>");
        java.util.Date d = new
        java.util.Date();
        out.println("Time now:" + d);
      }
      %>
    </body>

    </html>