<!DOCTYPE html>
<html>
<head>
    <title>Example</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">

    <script src="../../assets/js/html5shiv.js"></script>
    <script src="../../assets/js/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<div class="col-md-4 col-md-offset-4 tytle ">
    <h1>Money Transfer Form</h1>
</div>

<form action="moneytransferform.php" role="form" method="get">
    <div  class="col-md-4 col-md-offset-4 input-group">
        <h3>Sender</h3>
        <select name="sender" class="col-md-4  form-control">
            <option value="John Smith">John Smith</option>
            <option value="Bob Braun">Bob Braun</option>
            <option value="System">System</option>
        </select>
    </div>

    <div class="col-md-4 col-md-offset-4 input-group">
        <h3>Receiver</h3>
        <select name="receiver" class="col-md-4  form-control">
            <option value="John Smith">John Smith</option>
            <option value="Bob Braun">Bob Braun</option>
            <option value="System">System</option>
        </select>
    </div>

    <div class="col-md-4 col-md-offset-4 input-group">
        <h3>Amount</h3>
        <div class="input-group">
            <input name = "amount" type="text" class="form-control">
            <span class="input-group-addon">$</span>
        </div>
    </div>

    <div class="col-md-offset-4 col-md-4  col-md-offset-4 btns">
        <button type="button" class="col-md-offset-4 col-md-offset-4 col-md-4 btn btn-primary">Send</button>
        <button type="button" class="col-md-offset-4 col-md-offset-4 col-md-4 btn btn-default">Cancel</button>
        <button  type="submit" class="col-md-offset-4 col-md-offset-4 col-md-4 btn btn-success">Submit</button>
    </div>
</form>

<script src="//code.jquery.com/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>

</body>
</html>
