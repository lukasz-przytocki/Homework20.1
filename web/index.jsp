<%--
  Created by IntelliJ IDEA.
  User: szupi
  Date: 10.07.2019
  Time: 21:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Przelicznik</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div style="width: 90%; margin:auto">
  <h2>Przelicznik metryczny</h2>

  <form method="post" action="/calculate">
    <div class="col-2">
      <input type="text" class="form-control" placeholder="metry" name="metry">
      <input type="text" class="form-control" placeholder="centymetry" name="centymetry">
      <input type="text" class="form-control" placeholder="milimetry" name="milimetry">
      <input type="submit" value="Przelicz">
    </div>
  </form>

  <h2>Przelicznik wag</h2>

  <form method="post" action="/calculate">
    <div class="col-2">
      <input type="text" class="form-control" placeholder="kilogramy" name="kilogramy">
      <input type="text" class="form-control" placeholder="gramy" name="gramy">
      <input type="text" class="form-control" placeholder="miligramy" name="miligramy">
      <input type="submit" value="Przelicz">
    </div>

  </form>
</div>
</body>
</html>
