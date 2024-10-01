<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Perfil do Pet</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="./styles/styles.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

  </head>
  <body class="bg-blue">

    <section class="container-fluid d-flex align-items-center flex-column mt-3">
        <header class="col  justify-content-between d-flex ">
            <div class="row gap-2 h-25 w-50 flex-nowrap">
                <img src="./resources/img/foto-default.png" alt="Foto do Usuário" class="col img-fluid foto">
                <img src="./resources/img/foto-pet-default.png" alt="Foto do Usuário" class="col img-fluid w-25">
                <div class="card text-varche">
                    <div class="card-body">
                         <h1 class="m-0">Nome: ${animal.nome}</h1>
	                    <p class="m-0">Raça: ${animal.raca}</p>
	                    <p class="m-0">Idade: ${animal.idade}</p>
	                    <p class="m-0">Cor: ${animal.cor}</p>
	                    <p class="m-0">Tutor: ${tutor.nome}</p>
                    </div>
                </div>
            </div>
            <div class="d-flex flex-column w-25 h-25 align-items-end">
                <button class="btn border border-0 rounded-circle w-25">
                    <img src="./resources/img/btn-agendamento.png" alt="Agendar serviço" class="img-fluid">
                </button>
                <button class="btn border border-0 rounded-circle w-25">
                    <img src="./resources/img/btn-user.png" alt="Acessar perfil do tutor" class="img-fluid">
                </button>
            </div>
        </header>

        <div class="w-100 px-4 mt-4">
            <div id="historico" class="mb-4 col card rounded-4 bg-light p-2 mh-25">
                <h1 class="text-yonky">Agendamento</h1>
                <div class="card-body fs-6">
                    <ul>
                        <c:forEach items="${servicos}" var="servico">
		                	<li>${servico.servico} - ${sevico.data} - <a href="/CP_05/RemoveServico?id=${servico.idServico}&idAnimal=${animal.idAnimal}">Remover</a></li>
		                </c:forEach>
                    </ul>
                </div>
            </div>

            <div class="col card bg-light p-2 rounded-4 text-varche">
                <h3>Anotações do Tutor: </h3>
                <p>Esposa pode buscar os cachorros na minha ausência</p>
            </div>

            <div id="voltar" class="mt-3 h-25 d-flex justify-content-end">
                <a href=""><i class="ms-3 mt-3 bi bi-box-arrow-right fs-1"></i></a>
            </div>
        </div>

    </section>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>