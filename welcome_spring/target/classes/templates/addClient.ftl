<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>

<div>
    <fieldset>
        <legend>Add client</legend>
        <form name="client" action="" method="POST">
            Name:<@spring.formInput "clientForm.name" "" "text"/>
            <br>
            SurName:<@spring.formInput "clientForm.surName" "" "text"/>
            <br>
            PhoneNumber:<@spring.formInput "clientForm.phoneNumber" "" "text"/>
            <br>
            Address:<@spring.formInput "clientForm.adress" "" "text"/>
            <br>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>

</body>
</html>