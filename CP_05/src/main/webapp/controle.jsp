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

<body class="bg-green">

    <section class="vw-100">
        <div class="superior d-flex justify-content-between mt-3 gap-3 me-0">
            <div class=" col sup-esq w-50 ms-4">
                <h1 class="text-yonky mb-5">Controle</h1>
            </div>
            <div class="col w-50">
                <div class="row align-items-center w-100 p-0">
                    <a class="d-flex col justify-content-end align-items-center  p-0" href=""><i
                            class="text-black mt-4 bi bi-box-arrow-right fs-1"></i></a>
                </div>
            </div>

        </div>

        <div class="inferior mt-5 d-flex flex-column justify-content-center mx-5 text-varche">
            <form class="d-flex align-items-center text-varche w-50 mb-3" role="search">
                <input class="form-control me-2 rounded-pill" type="search" placeholder="Busca" aria-label="Search">
                <button class="btn btn-outline-success border border-0" type="submit"><i
                        class="bi bi-search"></i></button>
            </form>
            <div class="row justify-content-between flex-nowrap">
                

                <div class="card w-50 me-2">
                    <table class="table w-100">
                        <thead class="text-yonky">
                            <tr>
                                <th scope="col">Nome</th>
                                <th scope="col">CPF</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>José Luiz</td>
                                <td>Capela do padre Sé</td>
                                <td><i class="bi bi-pencil"></i></td>
                                <td><i class="bi bi-x"></i></td>
                            </tr>
                            <tr>
                                <td>José Luiz</td>
                                <td>Capela do padre Sé</td>
                                <td><i class="bi bi-pencil"></i></td>
                                <td><i class="bi bi-x"></i></td>
                            </tr>
                            <tr>
                                <td>José Luiz</td>
                                <td>Capela do padre Sé</td>
                                <td><i class="bi bi-pencil"></i></td>
                                <td><i class="bi bi-x"></i></td>
                            </tr>
                        </tbody>
                        <tfoot>
                            <td>
                                <button class="text-yonky rounded-pill bg-pink text-orange border-0">
                                    Adicionar Novo
                                </button>
                            </td>
                        </tfoot>
                    </table>
                </div>

                <div class="card w-50">
                    <table class="table w-100">
                        <thead class="text-yonky">
                            <tr>
                                <th scope="col">LOG</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>ISABELE Gomes - MARCou massagem PARA Oswaldo</td>
                            </tr>
                            <tr>
                                <td>MARINHO Hilst - MARCOU PEDICURE PARA MARICOTA</td>
                            </tr>
                            <tr>
                                <td>Waldisney silva - MARCOU TOSA PARA pATETA</td>
                            </tr>
                            <tr>
                                <td>Ana Paula Reis - Marcou penteado para Kerberus</td>
                            </tr>
                        </tbody>
                    </table>
                </div>

            </div>



        </div>

    </section>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous">
    </script>
</body>

</html>