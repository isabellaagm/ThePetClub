<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Agendamento</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link rel="stylesheet" href="./styles/styles.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>

<body class="bg-pink">
 
    <section class="d-flex justify-content-between">
        <div class="esquerda vh-100 mt-4 ms-4 justify-content-center w-75 align-items-center">
            <h1 class="text-yonky">Agendamento</h1>

            <form class="mt-3 text-varche" action="NovoServicoServlet">
                <select class="form-select rounded-pill mb-3" aria-label="Default select example" name="animal">
                    <option value="" disabled selected>Pet</option>
                    <c:forEach items="${animais}" var="animal">
                    	<option value="${animal.idAnimal}">${animal.nome}</option>
                    </c:forEach>
                  </select>
                  <select class="form-select rounded-pill mb-3" aria-label="Default select example" name="servico">
                    <option selected disabled>Serviço</option>
                    <option value="Banho">Banho</option>
                    <option value="Tosa">Tosa</option>
                    <option value="Banho & Tosa">Banho & Tosa</option>
                    <option value="Spa">Spa</option>
                  </select>
                  
                  <input type="date" class="mb-3 form-control rounded-pill" placeholder="Data de Nascimento" name="data"/>
                <div class="d-flex justify-content-center">
                	<input class="text-yonky rounded-pill bg-green text-center text-blue border-0 p-3" name="Salvar" type="submit">
            	</div>
            </form>

            
            

        </div>
        <div class="direita d-flex flex-column vh-100 justify-content-between">
            <div class="row align-items-center justify-content-end w-100 me-4 ">
                <a class="d-flex col justify-content-end" href="menu.jsp"><i class="text-black ms-3 mt-4 bi bi-box-arrow-right fs-1"></i></a>
            </div>

            <img src="./resources/img/bg-patas.png" alt="" class="mb-0">
        </div>
    </section>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
    crossorigin="anonymous"></script>
</body>

</html>