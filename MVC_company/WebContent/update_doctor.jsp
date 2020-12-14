
<!DOCTYPE html>
<html>
<body bgcolor="grey" align="center">
<form action="./updateDoctorController" method="post">
<table align="center">
<tr>
<td>Id </td>
</tr>
<tr>
<td>Name</td>
<td><input type="text" name="name" ></td>
</tr>
<tr>
<td>Email</td>
<td><input type="mail" name="mail"></td>
</tr>
<tr>
<td>Mobile</td>
<td><input type="number" name="mobile" ></td>
</tr>
<tr>
<td>Specialist :</td>
<td><input type="radio" name="specialist" value="ENT"  >ENT
<input type="radio" name="specialist" value="Cardiologist" >Cardiologist
<input type="radio" name="specialist" value="Dentist" >Dentist
</td>
</tr>
<tr>
<td>Age</td>
<td><input type="number" name="age" ></td>
</tr>
<tr>
<tr>
<td>Country:</td>
<td><select name="nationality"> 
<option value="India">India</option>
<option value="U.S.A">U.S.A</option>  
<option value="Canada">Canada</option>
<option value="Australia">Australia</option>  
</select> </td>
</tr>
</table>
<input type="submit" value="Update">
</form>
</body>
</html>