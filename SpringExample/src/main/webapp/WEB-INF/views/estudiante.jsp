<!DOCTYPE html>
<html>
    <head>
        <title>
            Something
        </title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/axios/1.3.5/axios.min.js" integrity="sha512-nnNHpffPSgINrsR8ZAIgFUIMexORL5tPwsfktOTxVYSv+AUAILuFYWES8IHl+hhIhpFGlKvWFiz9ZEusrPcSBQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <script type="text/javascript" src="/resources/js/estudiante.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="bg-primary text-white p-3">
                <h1>Registro de estudiantes</h1>
            </div>
            <input id="hidId" type="hidden" />
            <div class="container p-2 px-5">
                <div>
                    <label class="form-label" for="txtNombre">Nombre:</label>
                    <input id="txtNombre" class="form-control" />
                </div>
                <div>
                    <label for="txtApellido" class="form-label">Apellido:</label>
                    <input id="txtApellido" class="form-control" />
                </div>
                <div>
                    <label for="txtFechaNacimiento" class="form-label">Fecha de nacimiento:</label>
                    <input id="txtFechaNacimiento" type="date" class="form-control" />
                </div>
                <div>
                    <label for="cmbCiudad" class="form-label">Ciudad:</label>
                    <select id="cmbCiudad" class="form-control">
                    </select>
                </div>
                <div>
                    <label for="txtSemestre" class="form-label">Semestre:</label>
                    <input id="txtSemestre" type="number" class="form-control" />
                </div>
                <div>
                    <label for="txtDireccion" class="form-label">Direccion:</label>
                    <textarea id="txtDireccion" class="form-control"></textarea>
                </div>
                <button class="btn btn-dark" onclick="nuevoEstudiante()">Nuevo estudiante</button>
                <button class="btn btn-primary" onclick="registrarEstudiante()">Registrar estudiante</button>
            </div>
            <div>
                <table class="table table-primary">
                    <thead>
                        <tr>
                            <th>
                                Nombre
                            </th>
                            <th>
                                Apellido
                            </th>
                            <th>
                                Fecha de nacimiento
                            </th>
                            <th>
                                Ciudad
                            </th>
                            <th>
                                Semestre
                            </th>
                        </tr>
                    </thead>
                    <tbody id="tbEstudiantes">
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>