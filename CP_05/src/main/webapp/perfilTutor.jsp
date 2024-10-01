<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Perfil de ${tutor.nome}</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="./styles/styles.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
  </head>
  <body class="bg-orange text-varche">

    <section>
        <div id="superior" class="d-flex row justify-content-between align-items-center flex-nowrap m-3">
            <div class="d-flex row justify-content-left align-items-left h-25" id="infos">
                <img src="./resources/img/foto-default.png" alt="Foto do Usuário" class="col img-fluid foto">
                <div class="col rounded bg-light card-infos h-25 d-flex flex-column">
                    <h1 class="m-0">Nome: ${tutor.nome}</h1>
                    <p class="m-0">Endereço: ${tutor.endereco}</p>
                    <p class="m-0">CPF: ${tutor.cpf}</p>
                    <p class="m-0">Telefone: ${tutor.telefone}</p>
                </div>
            </div>
    
            <div id="botoes" class="d-flex flex-column gap-2">
                <a href=""><img src="./resources/img/btn-agendamento.png" alt="Novo Agendamento" class="img-fluid"></a>
                <a href=""><img src="./resources/img/btn-addPet.png" alt="Novo Pet" class="img-fluid"></a>
            </div>
        </div>
        <div id="inferior" class="w-100 d-flex flex-column justify-content-center align-items-center">
            <div id="pets" class="d-flex row gap-5">
            	<c:forEach items="${animais}" var="animal">
            	<div id="pet1" class="col pet d-flex row">
                    <img src="./resources/img/foto-pet-default.png" alt="Foto do Pet" class="col img-fluid foto m-0 p-0">
                    <div class="col d-flex flex-column justify-content-center text-end">
                        <h1 class="m-0">${animal.nome}</h1>
                        <i class="bi bi-search-heart"></i>
                    </div>
                </div>
		        </c:forEach>
            </div>
            <div id="anotacoes" class="card bg-pink rounded-4 p-3 mt-5 w-75">
                <h1>Anotações</h1>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Deserunt consectetur tempora voluptatem excepturi illum vero!</p>
            </div>
        </div>
        
    </section>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>