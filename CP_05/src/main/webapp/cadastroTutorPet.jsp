<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="./styles/styles.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>

<body class="bg-blue m-0">

    <section id="sectionPrincipal h-100">
        <div id="voltar" class="mt-3 h-25">
            <a href=""><i class="ms-3 mt-3 bi bi-box-arrow-right fs-1"></i></a>
        </div>
        <div class="container my-4 mx-auto">


            <div class="d-flex justify-content-center container-fluid rounded">
                            <form class="card rounded d-flex flex-row w-100 bg-blue" action="NovoTutorPet" method="post">
                    <div id="tutor" class="card-body col-6 bg-orange rounded-start-2 w-50 text-center">
                        <h1 class="mb-4 text-yonky">Cadastro Tutor</h1>
                        <div>
                                <input type="text" class="my-3 form-control rounded-pill" placeholder="Nome" name="nomeT"/>
                                <input type="text" class="my-3 form-control rounded-pill" placeholder="Endereço" name="endereco"/>
                                <input type="text" class="mb-3 form-control rounded-pill" placeholder="Telefone" name="telefone"/>
                                <input type="text" class="mb-3 form-control rounded-pill" placeholder="CPF" name="cpf"/>
                                <input type="password" class="mb-3 form-control rounded-pill" placeholder="Senha" name="senha"/>
                                <textarea class="mb-3 form-control" rows="3" placeholder="Anotações"></textarea>
                            
                        </div>
                    </div>
                    <div id="pet" class="card-body col-6 bg-pink w-50 text-center rounded-end-2">
                        <h1 class="mb-4 text-yonky">Cadastro Pet</h1>
                            <input type="text" class="my-3 form-control rounded-pill" placeholder="Nome" name="nome"/>
                            <input type="text" class="my-3 form-control rounded-pill" placeholder="idade" name="idade"/>
                            <input type="text" class="mb-3 form-control rounded-pill" placeholder="Cor" name="cor"/>
                            <input type="text" class="mb-3 form-control rounded-pill" placeholder="Raça" name="raca"/>
                       		<div class="d-flex justify-content-center gap-3 mb-3">
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="opcao-genero">
                                    <label class="form-check-label" for="flexRadioDefault1">
                                        Macho
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="opcao-genero">
                                    <label class="form-check-label" for="flexRadioDefault2">
                                        Fêmea
                                    </label>
                                </div>
                            </div>

                        <div id="inferior">
                            <div id="esquerda" class="w-25">
                                <button class="btn border border-0 rounded-circle">
                                    <img src="./resources/img/btn-add-foto.png" alt="Adicionar Foto do Pet" class="img-fluid">
                                </button>
                            </div>
                            <div id="direita" class="row gap-2 justify-content-end align-items-end">
                                <input class="text-yonky rounded-pill bg-green text-blue border-0 w-25 h-25" value="Salvar" type="submit">
                                <button class="rounded-circle border-0 btn py-0" style="width: 70px;" id="addPet">
                                    <img src="./resources/img/addPet.png" alt="Adicionar Pet" class="img-fluid ">
                                </button>
                            </div>
                        </div>
                    </div>
                 </form>
            </div>


        </div>
    </section>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>

</html>