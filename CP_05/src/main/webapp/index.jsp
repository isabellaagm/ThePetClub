<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="./styles/styles.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300..800;1,300..800&display=swap" rel="stylesheet">
</head>

<body class="bg-pink open-sans text-varche">

    <section class="vh-100 bg-green">
        <!-- div principal -->
        <div class="container py-3">
            <div class="my-2 row d-flex justify-content-center align-items-center h-100">
                <div class="card bg-light text-black rounded border border-5 border-orange col-12 col-md-8 col-lg-6 col-xl-5">
                    <div class="card-body px-5 text-center mb-md-5 mt-md-4 pb-5 align-items-center">
					<form>
                        <div class="logo align-items-center justify-content-center mx-auto">
                            <img class="img-fluid" src="./resources/img/tpc-fundolaranja.png" alt="Logotipo com fundo laranja">
                        </div>

                        <div class="form-outline form-white my-4">
                            <input type="email" placeholder="CPF" id="typeEmailX" class="text-varche form-control form-control-md border border-3 border-orange" name="cpf" />
                        </div>

                        <div class="form-outline form-white mb-4 ">
                            <input type="password" placeholder="Senha" id="typePasswordX" class="text-varche form-control form-control-md border border-3 border-orange" name="senha"/>
                        </div>

                        <input data-mdb-button-init data-mdb-ripple-init class="btn border border-3 border-orange btn-lg px-5" type="submit" value="login">
                        <p class="open-sans mb-0 text-black-90 fs-6"><b>Ainda não tem cadastro?</b> <a href="cadastroMenuLogin.jsp" >Cadastre-se agora!</a></p>
                       </form>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous">
    </script>
</body>

</html>