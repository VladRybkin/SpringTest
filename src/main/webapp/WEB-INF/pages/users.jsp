<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
    <body>
        <h2>Hello World!</h2>
        <br/>
          <c:out value="${getList}"/><br/>
        <c:out value="${aop}"/><br/>
        ${getList}


        <%--<form  action="add" commandName=user>--%>
            <%--<label><input type="text" name="user_id"></label><id /><br>--%>
            <%--<label><input type="password" name="user_name"></label>< name/><br>--%>

            <%--<input type="submit" value="register"><br>--%>

        <%--</form>--%>
        <form  method="post" >
            <label><input type="text" name="param"></label><id /><br>


            <input type="submit" value="register"><br>

        </form>
        <form  method="post" action="/users/addUser" modelAttribute="user" >
            <label><input type="text" name=" userName"></label><id /><br>
            <label><input type="number" name=" userID"></label><id /><br>

            <input type="submit" value="register"><br>

        </form>
        ${param1}
        ${param}
        ${user}



    </body>
</html>