CREATE TABLE planes (
    id SERIAL PRIMARY KEY,
    referencia_propietario INT NOT NULL,
    fecha_creacion TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    fecha_fin TIMESTAMP WITHOUT TIME ZONE,
    ubicacion_latitud DOUBLE PRECISION,
    ubicacion_longitud DOUBLE PRECISION,
    descripcion TEXT,
    modo VARCHAR(50) CHECK (modo IN ('privada', 'publica')),  -- Restricción para asegurar valores válidos
    ciudad VARCHAR(255)  -- Asume que existe una tabla 'usuarios' con una columna 'id'
);