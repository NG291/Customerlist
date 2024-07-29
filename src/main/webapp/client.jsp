<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customer List</title>
    <style>
        .table-view{
            border-collapse: collapse;
        }
        .td-view{
            border-bottom: 1px solid #100f10;
            padding: 10px;
        }
    </style>
</head>
<body>
<div class="container">
    <table class="table-view">
            <h1>Danh sách khách hàng</h1>
        <thead>
        <tr class="tr-view">
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Ảnh</th>
        </tr>
        </thead>
        <tbody>
        <C:forEach var="customer" items="${customerList}">
            <tr class="tr-view">
                <td class="td-view">
                    <C:out value="${customer.name}"/>
                </td>
                <td class="td-view">
                    <C:out value="${customer.date}"/>
                </td>
                <td class="td-view">
                    <C:out value="${customer.address}"/>
                </td>
                <td class="td-view">
                  <C:out value="${customer.img}"/>
                </td>
            </tr>
        </C:forEach>
        </tbody>
    </table>
</div>
</body>
</html>