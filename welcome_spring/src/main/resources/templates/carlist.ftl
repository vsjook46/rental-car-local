<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Group list</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
<div>
    <table class="table table-dark">
        <tr>
            <th>Mark</th>
            <th>Rent Price</th>
            <th>Type</th>
            <th>Rent Start</th>
            <th>Rent End</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.mark}</td>
                <td>${item.rentPrice}</td>
                <td>${item.type}</td>
                <td>${item.rentStart}</td>
                <td>${item.rentEnd}</td>
            </tr>
        </#list>
    </table>

</div>
</body>
</html>