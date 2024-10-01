<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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

<body class="bg-pink">
    <main class="bg-pink d-flex justify-content-center align-items-center flex-column">
        
        <div class="row align-items-center justify-content-start w-100">
                <a class="col" href="cadastroMenu.jsp"><i class="text-black ms-3 mt-4 bi bi-box-arrow-right fs-1"></i></a>
        </div>

        <h1 class="col text-yonky my-4">Cadastro pet</h1>
        
        
        <form class="w-75 text-varche" action="NovoPetServlet" method="post">
            <input type="text" class="my-3 form-control rounded-pill" placeholder="Nome" name="nome" />
            <input type="text" class="mb-3 form-control rounded-pill" placeholder="Cor" name="cor"/>
            <input type="text" class="mb-3 form-control rounded-pill" placeholder="Idade" name="idade"/>
            <input type="text" class="mb-3 form-control rounded-pill" placeholder="Raça" name="raca"/>
            <select class="form-select rounded-pill mb-3" aria-label="Default select example" name="tutor">
		                    <option selected>Tutor</option>
		                    <c:forEach items="${tutores}" var="tutor">
		                   		<option value="${tutor.idTutor}">${tutor.nome}</option>
		                    </c:forEach>
		                  </select>
            <div class="d-flex justify-content-center gap-3 mb-3">
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="opcao-genero" value="M">
                    <label class="form-check-label" for="flexRadioDefault1">
                        Macho
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="opcao-genero" value="F">
                    <label class="form-check-label" for="flexRadioDefault2">
                        Fêmea
                    </label>
                </div>
            </div>
            
            
           			<input class="text-yonky rounded-pill bg-green text-center text-blue border-0 p-3" value="Salvar" type="submit">
        </form>

        <div class="buttons-area d-flex justify-content-center">
            <button class="btn border border-0 rounded-circle w-25"><img src="./resources/img/btn-add-foto.png" alt="" class="img-fluid"></button>
        </div>

        <div class="vw-100 justify-content-end align-items-center d-flex me-5 mb-3">
          
                
        </div>

        

    </main>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>

</html>