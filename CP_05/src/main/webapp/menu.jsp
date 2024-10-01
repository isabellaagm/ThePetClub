<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>ThePetCenter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="./styles/styles.css">
</head>
  <body class="bg-1">
    
    <section>
        <div class="d-flex flex-column container align-items-center justify-content-center">
                <img src="./resources/img/foto-default.png" alt="Foto de perfil do atendente" class="my-5 foto img-fluid">
            <div class="d-flex gap-5 text-center flex-wrap justify-content-center align-items-center m-auto text-varche">
                    
                    <form action="ListaTutores" method="post">
                   		<input class="btn btnMenu bg-orange border border-pink border-5 col-6 text-center" value="TUTORES" type="submit">
                    </form>
                    
                    <form action="ListaPets" method="post">
                   		<input class="btn btnMenu bg-orange border border-pink border-5 col-6 text-center" value="PETS" type="submit">
					</form>
                    <a href="cadastroMenu.jsp"><button class="btn btnMenu bg-orange border border-pink border-5 col-6 text-center" type="submit">CADASTRO</button></a>

                    <form action="AgendamentoServlet" method="post">
	                    <input class="btn btnMenu bg-orange border border-pink border-5 col-6 text-center p-2" type="submit" value="AGENDAMENTO">
                	</form>
            </div>
        </div>
    </section>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>