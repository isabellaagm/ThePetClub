<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Cadastro de Pet</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link rel="stylesheet" href="./styles/styles.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>

<body class="bg-pink ">
    <div class="row align-items-center justify-content-start w-100">
        <a class="col" href="cadastroMenu.jsp"><i class="text-black ms-3 bi bi-box-arrow-right fs-1"></i></a>
</div>

    <main class="d-flex align-items-center flex-column vh-100 mt-4">

        <h1 class=" text-yonky my-2">Cadastro Colaborador</h1>
        
        
        <form class="w-75 text-varche" action="NovoColaboradorServlet" method="get">
            <input type="text" class="my-3 form-control rounded-pill" placeholder="Nome" name="nome"/>
            <input type="text" class="my-3 form-control rounded-pill" placeholder="CPF" name="cpf"/>
            <input type="password" class="mb-3 form-control rounded-pill" placeholder="Senha" name="senha"/>
            <input class="text-yonky rounded-pill bg-green text-center text-blue border-0 p-3" value="Salvar" type="submit">
        </form>


                    
        

    </main>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>

</html>