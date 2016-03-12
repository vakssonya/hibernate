<%@ page import="logic.Comment,java.util.List,m.Main" %>
<link rel="stylesheet" type="text/css" href="css/style.css">
<html>
    <body>
    
    <h1>Hiiiii</h1>
    
    <table>
<caption>Details of comment</caption>
<tr>
<th>Id</th>
<th>Time of creation</th>
<th>Text</th>
<th>Author login</th>
<th>Title of Post</th>
</tr>
<% List<Comment> com = Main.getList(); 
for(Comment i : com)
{
%>
<tr>
<td><%= i.getId() %>
<td ><%= i.getTime()%></td>
<td ><%= i.getText()%></td>
<td><%= i.getUser().getLogin()%></td>
<td><%= i.getPost().getTitle()%></td>
</tr>
<%
}
%>

</table>
    </body>
</html>
