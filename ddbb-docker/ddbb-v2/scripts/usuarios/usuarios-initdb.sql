-- ? Crear la base de datos para producción
CREATE DATABASE usuarios_planealo_prod;

-- ? Conectar a la base de datos de producción
\c usuarios_planealo_prod

-- ? Crear tabla de usuarios
CREATE TABLE usuarios (
    usuario_id SERIAL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    ref VARCHAR(255) UNIQUE NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    contrasena VARCHAR(255) NOT NULL,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    fecha_ultima_actualizacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    ultime_inicio_sesion TIMESTAMP
);

CREATE DATABASE usuarios_planealo_dev;

\c usuarios_planealo_prod

CREATE TABLE  usuarios_planealo_dev.usuarios (
    usuario_id SERIAL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    ref VARCHAR(255) UNIQUE NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    contrasena VARCHAR(255) NOT NULL,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    fecha_ultima_actualizacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    ultime_inicio_sesion TIMESTAMP
);