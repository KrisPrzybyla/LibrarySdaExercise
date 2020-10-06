<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>Library - edit book</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="/WEB-INF/fragments/header.jspf"/>

<main role="main" class="container">

    <div class="starter-template">
        <h1>Edit book</h1>

        <form action="HomeServlet" method="post">
            <table class="table">
                <thead class="thead-light">
                <tr>
                    <th scope="col">Title</th>
                    <th scope="col">Author</th>
                    <th scope="col">Category</th>
                    <th scope="col">Release date</th>
                    <th scope="col">Summary</th>
                    <th scope="col">Pages</th>
                    <th scope="col">ISBN</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>${requestScope.book.title}</td>
                    <td>${requestScope.book.author.firstName} ${requestScope.book.author.lastName}</td>
                    <td>${requestScope.book.bookCategory}</td>
                    <td>${requestScope.book.releaseDate}</td>
                    <td>${requestScope.book.summary}</td>
                    <td>${requestScope.book.pages}</td>
                    <td>${requestScope.book.isbn}</td>

                </tr>
                </tbody>
            </table>
            <%--            <button type="submit" class="btn btn-success" name="action" value="add">Add</button>--%>
            <button type="submit" class="btn btn-success" name="action" value="edit">Save</button>
            <a class="btn btn-warning" href="/" role="button">Cancel</a>
        </form>
    </div>
    <form class="needs-validation" novalidate>
        <div class="form-row">
            <div class="col-md-4 mb-3">
                <label for="title">Title</label>
                <input type="text" class="form-control" id="title" placeholder="Title"
                       value=${requestScope.book.title} required>
            </div>
            <div class="col-md-4 mb-3">
                <label for="release">Release</label>
                <input type="text" class="form-control" id="release" placeholder="Release Date"
                       value=${requestScope.book.releaseDate}
                               required>
            </div>
        </div>
        <button class="btn btn-primary" type="submit">Submit form</button>
    </form>

</main><!-- /.container -->

</body>
</html>
