<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2/2/2021
  Time: 9:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
 <h1>Simple Calculator</h1>
  <form method="post" action="/ServletCalculater">
      <fieldset>
          <legend>
              Calculator
          </legend>
          <table>
              <tr>
                  <td>First operand</td>
                  <td><input name="first-operand" type="text"></td>
              </tr>
              <tr>
                  <td>Operand</td>
                  <td>
                      <select name="operand">
                          <option value="+">Cộng</option>
                          <option value="-">Trừ</option>
                          <option value="*">Nhân</option>
                          <option value="/">Chia</option>
                      </select>
                  </td>
              </tr>
              <tr>
                  <td>Second operand</td>
                  <td><input name="second-operand" type="text"></td>
              </tr>
              <tr>
                  <td><input type="submit" name="Calculater"></td>
              </tr>
          </table>
      </fieldset>
  </form>
  </body>
</html>
