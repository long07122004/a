<!doctype html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>
<body class="container">
<h1>Day la trang sinh vien</h1>
<form action="/sinh-vien/update" method="post">
    <div class="mb-3">
        <label class="form-label">ID</label>
        <input type="text" class="form-control" name="id" value="${sinhVien.id}" readonly>
    </div>
    <div class="mb-3">
        <label class="form-label">Ho ten</label>
        <input type="text" class="form-control" name="hoTen" value="${sinhVien.hoTen}">
    </div>
    <div class="mb-3">
        <label class="form-label">Dia chi</label>
        <input type="text" class="form-control" name="diaChi" value="${sinhVien.diaChi}">
    </div>
    <div class="mb-3">
        <label class="form-label">Gioi tinh</label>
        <div class="form-check col-4">
            <input class="form-check-input" type="radio" value="Nam" name="gioiTinh"
            <c:if test="${sinhVien.gioiTinh == 'Nam'}"> checked</c:if>

            >
            <label class="form-check-label">
                Nam
            </label>
        </div>
        <div class="form-check col-4">
            <input class="form-check-input" type="radio" value="Nu" name="gioiTinh"
            <c:if test="${sinhVien.gioiTinh == 'Nu'}"> checked</c:if>
            >
            <label class="form-check-label">
                Nu
            </label>
        </div>
    </div>
    <div class="mb-3">
        <label class="form-label">Trang thai</label>
        <div class="form-check col-4">
            <input class="form-check-input" type="radio" value="Hoat dong" name="trangThai"
            <c:if test="${sinhVien.trangThai == 'Hoat dong'}"> checked</c:if>
            >
            <label class="form-check-label">
                Hoat dong
            </label>
        </div>
        <div class="form-check col-4">
            <input class="form-check-input" type="radio" value="Ngung hoat dong" name="trangThai"
            <c:if test="${sinhVien.trangThai == 'Ngung hoat dong'}"> checked</c:if>
            >
            <label class="form-check-label">
                Ngung hoat dong
            </label>
        </div>

    </div>

    <button type="submit" class="btn btn-primary">Update</button>
</form>

</body>
</html>