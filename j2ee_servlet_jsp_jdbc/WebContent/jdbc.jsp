<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>JDBC Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="jumbotron text-center bg-warning">
		<h1>JDBC CRUD Operations</h1>
		<p>
			Basic DB Create(<i>INSERT</i>), Read(<i>SELECT</i>), Update, and
			Delete operations
		</p>
	</div>
	<div class="container-fluid">
		<div class="row mx-4 mb-4 ">
			<div class="col-sm-3 bg-primary text-white py-1">
				<h3>
					Create (<i>INSERT</i>)
				</h3>


				<form action="createCustomer" method="post" class="was-validated">
					<div class="form-group">
						<input type="text" class="form-control" id="name"
							placeholder="Enter name" name="name" required>
						<div class="valid-feedback">Valid.</div>
						<div class="invalid-feedback text-white">Please fill out
							this field.</div>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="address"
							placeholder="Enter address" name="address" required>
						<div class="valid-feedback">Valid.</div>
						<div class="invalid-feedback text-white">Please fill out
							this field.</div>
					</div>
					<button type="submit" class="btn btn-success">Insert</button>
				</form>


			</div>
			<div class="col-sm-3 bg-success text-white py-1">
				<h3>
					Read (<i>SELECT</i>)
				</h3>

				<form action="readCustomer" class="was-validated">
					<div>
						<i>By default it is selecting all the data. By clicking <b>Refresh</b>
							you can refetch data from DB
						</i>
					</div>
					<button type="submit" class="btn btn-info">Refresh</button>
				</form>


			</div>
			<div class="col-sm-3 bg-info text-white py-1">
				<h3>Update</h3>


				<form action="updateCustomer" method="post" class="was-validated">
					<div class="form-group">
						<input type="number" class="form-control" id="id"
							placeholder="Enter id" name="id" required>
						<div class="valid-feedback">Valid.</div>
						<div class="invalid-feedback text-white">Please fill out
							this field.</div>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="name"
							placeholder="Enter name" name="name" required>
						<div class="valid-feedback">Valid.</div>
						<div class="invalid-feedback text-white">Please fill out
							this field.</div>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="address"
							placeholder="Enter address" name="address" required>
						<div class="valid-feedback">Valid.</div>
						<div class="invalid-feedback text-white">Please fill out
							this field.</div>
					</div>
					<button type="submit" class="btn btn-warning">Update</button>
				</form>


			</div>
			<div class="col-sm-3 bg-warning text-white py-1">
				<h3>Delete</h3>


				<form action="deleteCustomer" method="post" class="was-validated">
					<div class="form-group">
						<input type="number" class="form-control" id="id"
							placeholder="Enter id" name="id" required>
						<div class="valid-feedback">Valid.</div>
						<div class="invalid-feedback text-white">Please fill out
							this field.</div>
					</div>
					<button type="submit" class="btn btn-primary">Delete</button>
				</form>


			</div>
		</div>
	</div>
	<div class="container p-3 my-3 bg-primary text-white">
		<p>
		<h6>Objects which are came from DB :</h6>${customers}</p>
		<br>
		<c:choose>
			<c:when test="${not empty customers}">
				<table class="table table-bordered text-white">
					<thead class="text-center">
						<tr>
						<th colspan="3"><h4>CUSTOMER</h4></th>
						</tr>
						<tr>
							<th><h5>Id</h5></th>
							<th><h5>Name</h5></th>
							<th><h5>Address</h5></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="current" items="${customers}" varStatus="count">
							<tr>
								<td>${current.id}</td>
								<td>${current.name}</td>
								<td>${current.address}</td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</c:when>
			<c:otherwise>
				<p>No data available</p>
			</c:otherwise>
		</c:choose>
	</div>

</body>
</html>
