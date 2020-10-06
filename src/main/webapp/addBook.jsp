<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <title>Library - Add new book</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="/WEB-INF/fragments/header.jspf"/>

<main role="main" class="container">
    <div class="starter-template">
        <form class="form-group needs-validation" role="form" action="AddBook" method="post">
            <div class="form-group">
                <label for="title">Title</label>
                <input type="text" class="form-control" id="title" placeholder="Book title" name="title" required>
            </div>
            <div class="form-group">
                <label>Author
                    <select class="form-control" name="author">
                        <c:forEach var="author" items="${requestScope.authors}" varStatus="loop">
                            <option value="${author.authorId}"> ${author.lastName} ${author.firstName} </option>
                        </c:forEach>
                    </select>
                </label>
            </div>
            <div class="form-group">
                <label> Category
                    <select class="form-control" name="category">
                        <c:forEach var="category" items="${requestScope.categories}" varStatus="loop">
                            <option value="${category}">${category}</option>
                        </c:forEach>
                    </select>
                </label>
            </div>
            <div class="form-group">
                <label for="release">Release date</label>
                <input type="number" class="form-control" id="release" placeholder="Release" name="release" required>
            </div>
            <div class="form-group">
                <label for="summary">Summary</label>
                <input type="text" class="form-control" id="summary" placeholder="Summary" name="summary" required>
            </div>
            <div class="form-group">
                <label for="pages">Pages</label>
                <input type="number" class="form-control" id="pages" placeholder="Pages" name="pages" required>
            </div>
            <div class="form-group">
                <label for="isbn">ISBN</label>
                <input type="text" class="form-control" id="isbn" placeholder="ISBN" name="isbn" required>
            </div>
            <button type="submit" class="btn btn-primary">Add new book</button>
        </form>
    </div>
</main>
<%@ include file="/WEB-INF/fragments/footer.jspf" %>
</body>
</html>
