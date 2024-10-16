<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
 <div class="container">
        <h1>Login</h1>
        <form action="LoginServlet" method="post"> <!-- Change method to "post" -->
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required><br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br>
            <button type="submit">Login</button>
        </form>

        <%-- Display error message if login fails --%>
        <% String error = request.getParameter("error");
            if (error != null && error.equals("1")) { %>
                <p>Invalid username or password. Please try again.</p>
        <% } %>
        
        <%-- Display message if Register Successful --%>
        <% String rs = request.getParameter("registration");
            if (rs != null && rs.equals("success")) { %>
                <p>Your Registration is Successful. Please Login.</p>
        <% } %>
    </div>

</body>
</html>