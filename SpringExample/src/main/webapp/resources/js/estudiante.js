let hidId, txtNombre, txtApellido, txtFechaNacimiento, cmbCiudad, txtSemestre, txtDireccion;

function nuevoEstudiante() {
    hidId.value = '';
    txtNombre.value = '';
    txtApellido.value = '';
    txtFechaNacimiento.value = '';
    cmbCiudad.value = '';
    txtSemestre.value = '';
    txtDireccion.value = '';
}

function editarEstudiante(estudiante) {
    hidId.value = estudiante.id;
    txtNombre.value = estudiante.nombre;
    txtApellido.value = estudiante.apellido;
    txtFechaNacimiento.value = estudiante.fechaNacimiento;
    cmbCiudad.value = estudiante.idCiudad;
    txtSemestre.value = estudiante.semestre;
    txtDireccion.value = estudiante.direccion;
}

let registrarEstudiante = async function() {
    let estudiante = {
        id: hidId.value == '' ? null : hidId.value,
        nombre: txtNombre.value,
        apellido: txtApellido.value,
        fechaNacimiento: txtFechaNacimiento.value,
        idCiudad: cmbCiudad.value,
        semestre: txtSemestre.value,
        direccion: txtDireccion.value
    }

    if (estudiante.id == null) {
        await axios.post('/estudiantes', estudiante);
    } else {
        await axios.put('/estudiantes', estudiante);
    }

    mostrarEstudiantes();
}

let eliminarEstudiante = async function(id) {
    await axios.delete(`/estudiantes/${id}`);
    mostrarEstudiantes();
}

let mostrarEstudiantes = async function() {
    let data = await axios.get('/estudiantes');
    let estudiantes = data.data;

    let tbEstudiantes = document.getElementById("tbEstudiantes");
    tbEstudiantes.innerHTML = '';

    for (let estudiante of estudiantes) {
        let tr = document.createElement('tr');
        let tdNombre = document.createElement('td');
        tdNombre.innerHTML = estudiante.nombre;

        let tdApellido = document.createElement('td');
        tdApellido.innerHTML = estudiante.apellido;

        let tdFechaNacimiento = document.createElement('td');
        tdFechaNacimiento.innerHTML = estudiante.fechaNacimiento;

        let tdCiudad = document.createElement('td');
        tdCiudad.innerHTML = estudiante.ciudad;

        let tdSemestre = document.createElement('td');
        tdSemestre.innerHTML = estudiante.semestre;

        let tdOpcion = document.createElement('td');
        let btnEditar = document.createElement('button');
        btnEditar.innerHTML = 'Editar';
        btnEditar.className = 'btn btn-primary';
        btnEditar.addEventListener('click', () => {
            editarEstudiante(estudiante);
        });

        let btnEliminar = document.createElement('button');
        btnEliminar.innerHTML = 'Eliminar';
        btnEliminar.className = 'btn btn-danger';
        btnEliminar.addEventListener('click', () => {
            eliminarEstudiante(estudiante.id);
        });

        tdOpcion.appendChild(btnEditar);
        tdOpcion.appendChild(btnEliminar);

        tr.appendChild(tdNombre);
        tr.appendChild(tdApellido);
        tr.appendChild(tdFechaNacimiento);
        tr.appendChild(tdCiudad);
        tr.appendChild(tdSemestre);
        tr.appendChild(tdOpcion);
        tbEstudiantes.appendChild(tr);
    }
}

window.onload = async function() {
    hidId = document.getElementById('hidId');
    txtNombre = document.getElementById('txtNombre');
    txtApellido = document.getElementById('txtApellido');
    txtFechaNacimiento = document.getElementById('txtFechaNacimiento');
    cmbCiudad = document.getElementById('cmbCiudad');
    txtSemestre = document.getElementById('txtSemestre');
    txtDireccion = document.getElementById('txtDireccion');

    let ciudades = await axios.get('/ciudades');

    for (let ciudad of ciudades.data) {
        let option = document.createElement('option');
        option.value = ciudad.id;
        option.innerHTML = ciudad.nombre;
        cmbCiudad.appendChild(option);
    }

    mostrarEstudiantes();
}