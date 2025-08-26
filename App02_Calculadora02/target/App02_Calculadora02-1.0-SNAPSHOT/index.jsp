<%-- 
    Document   : index
    Created on : 30 oct. 2024, 19:50:39
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>App02_Calculadora02</title>
        <style>
            /* Estilos CSS para mejorar la apariencia de la calculadora*/
            body {
                background: #f0e68c;
                /* Fondo amarillo pastel */
                display: flex;
                align-items: center;
                justify-content: center;
                height: 100vh;
                margin: 0;
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            }
            .calculadora {
                background-color: #ffffff;
                /* Fondo blanco para la calculadora */
                padding: 20px;
                border-radius: 10px;
                box-shadow: 0 0 15px rgba(0,0,0,0.2);
                text-align: center;
                width: 350px;
            }
            h1{
                color: #2e8b57;
                /* Verde bosque para el titulo */
                margin-bottom: 20px;
            }
            input[type="text"] {
                width:  100%;
                padding: 10px;
            }
            input[type="text"] {
                width: 100%;
                padding: 10px;
                margin: 10px 0;
                /* Azul acero para los bordes*/
                border-radius: 5px;
            }
            select {
                width: 100%;
                padding: 10px;
                margin: 10px 0;
                border: 1px solid #b22222;
                /* Bordo para el menú desplegable */
                border-radius: 5px;
            }
            input[type="submit"] {
                background-color: #ff4500;
                /* Naranja rojizo para el botón */
                color: white;
                padding: 10px 20px;
                border: none;
                border-radius: 5px;
                cursor: pointer;
                margin-top: 10px;
                width: 100%;
            }
            iput[type="submit"]:hover {
                background-color: #ff6347;
                /* Tomate para el efecto hover del botón */
            }
            h2 {
                color: #800080;
                /* Tomate para el efecto hover del botón */

            }
            h2 {
                color: #800080;
                /*Púrpura para el resultado */
                margin-top: 20px;
            }
            p {
                color: #dc143c;
                /* Carmesi para los mensajes de error */
            }
        </style>
    </head>
    <body>
        <div class="calculadora">
            <h1>Calculadora JSP</h1>
            <!-- Formulario de la calculadora -->
            <form method="post" action="index.jsp">
                <input type="text" name="num1" placeholder="Número 1" required />
                <!-- Campo de entrada para el prmer número, requerido -->

                <select name="operador">
                    <!-- Menú desplegable para seleccionar la operación -->
                    <option value="+">Suna (+)</option>
                    <option value="-">Resta (-)</option>
                    <option value="*">Multiplicación (*)</option>
                    <option value="/">División (/)</option>
                    <option value="sin">Seno (sin)</option>
                    <option value="cos">Coseno (cos)</option>
                    <option value="tan">Tangente (tan)</option>
                </select>

                <input type="text" name="num2" placeholder="Número 2 (no necesario para funciones trigonométricas)" />
                <!-- Campo de entrada para el segundo número; no es obligatorio para funciones trigonometricas -->

                <input type="submit" value="Calcular" />
                <!-- Botón para enviar el formulario -->
            </form>

            <%
                //Obtener los parámetros enviados pro el formulario
                String num1Str = request.getParameter("num1");
                String num2Str = request.getParameter("num2");
                String operador = request.getParameter("operador");

                if (num1Str != null && operador != null) {
                    try {
                        double num1 = Double.parseDouble(num1Str);
                        double num2 = 0;
                        double resultado = 0;

                        //Verificar si num2 está presente y lo convierte a double
                        if (num2Str != null && !num2Str.isEmpty()) {
                            num2 = Double.parseDouble(num2Str);
                        }

                        //Realizar la operación seleccionada
                        switch (operador) {
                            case "+":
                                resultado = num1 + num2;
                                break;
                            case "-":
                                resultado = num1 - num2;
                                break;
                            case "*":
                                resultado = num1 * num2;
                                break;
                            case "/":
                                if (num2 != 0) {
                                    resultado = num1 / num2;

                                } else {
                                    out.println("<p>Error: No se puede dividir por cero.</p>");
                                    return;
                                }
                                break;
                            case "sin":
                                resultado = Math.sin(Math.toRadians(num1));
                                //Calcula el seno de ángulo en grados
                                break;
                            case "cos":
                                resultado = Math.sin(Math.toRadians(num1));
                                //Calcula el coseno del ángulo en grados
                            case "tan":
                                resultado = Math.tan(Math.toRadians(num1));
                                //Calcula la tangente del ángulo en grados
                                break;
                            default:
                                out.println("<p>Error: Operador no válido.</p>");
                                return;
                        }
                        //Muestra el resultado de la operación
                        if (resultado == (int) resultado) {
                            out.println("<h2>Resultado: " + (int) resultado + "</h2>");
                        } else {
                            out.println("<h2>Resultado: " + resultado + "</h2>");

                        }
                    } catch (NumberFormatException e) {
                        out.println("<p>Error: Introduce valores numéricos válidos.</p>");
                        //Manejo de error si los valores ingresados no son númericos
                    }
                }
            %>
        </div>
    </body>
</html>
