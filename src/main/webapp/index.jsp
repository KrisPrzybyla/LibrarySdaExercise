<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.1.1">
    <title>Library 1.0</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/starter-template/">

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/docs/4.5/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

    <!-- Favicons -->
    <link rel="apple-touch-icon"
          href="${pageContext.request.contextPath}/docs/4.5/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
    <link rel="mask-icon" href="${pageContext.request.contextPath}/docs/4.5/assets/img/favicons/safari-pinned-tab.svg"
          color="#563d7c">
    <meta name="msapplication-config" content="/docs/4.5/assets/img/favicons/browserconfig.xml">
    <meta name="theme-color" content="#563d7c">


    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            -ms-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
    </style>
    <!-- Custom styles for this template -->
    <%--    <link href="starter-template.css" rel="stylesheet">--%>
</head>
<body>
<jsp:include page="/WEB-INF/fragments/header.jspf"/>

<main role="main" class="container">

    <div class="starter-template">
        <h1>All books from the library</h1>

        <form action="BookOperations" method="get">
            <table class="table">
                <thead class="thead-light">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Title</th>
                    <th scope="col">Author</th>
                    <th scope="col">Category</th>
                    <th scope="col">Release date</th>
                    <th scope="col">Summary</th>
                    <th scope="col">Pages</th>
                    <th scope="col">ISBN</th>
                    <%--                    <th scope="col">Borrowed</th>--%>
                    <th scope="col">Select</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="book" items="${requestScope.books}" varStatus="loop">
                    <tr>
                        <th scope="row">${loop.index + 1}</th>
                        <td>${book.title}</td>
                        <td>${book.author.firstName} ${book.author.lastName}</td>
                        <td>${book.bookCategory}</td>
                        <td>${book.releaseDate}</td>
                        <td>${book.summary}</td>
                        <td>${book.pages}</td>
                        <td>${book.isbn}</td>
                            <%--                        <td>${book.borrow}</td>--%>
                        <td>
                            <label for="radio"></label><input type="radio" name="bookId" id="radio"
                                                               value=${book.bookId}>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <%--            <button type="submit" class="btn btn-success" name="action" value="add">Add</button>--%>
            <a class="btn btn-success" href="${pageContext.request.contextPath}/AddBook" role="button">Add</a>
            <button type="submit" class="btn btn-warning" name="action" value="edit">Edit</button>
            <button type="submit" class="btn btn-danger" name="action" value="remove">Remove</button>
            <button type="submit" class="btn btn-primary" name="action" value="borrow">Borrow</button>
        </form>
    </div>

</main><!-- /.container -->

<%@ include file="/WEB-INF/fragments/footer.jspf" %>
</body>
</html>
