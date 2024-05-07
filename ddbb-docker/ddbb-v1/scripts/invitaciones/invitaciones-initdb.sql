CREATE TABLE invitaciones (
    invitacion_id SERIAL PRIMARY KEY,
    usuario_id_emisor INT NOT NULL,
    usuario_id_receptor INT NOT NULL,
    plan_id INT NOT NULL,
    fecha_envio TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    estado VARCHAR(50) NOT NULL  -- Ejemplos: 'enviada', 'aceptada', 'rechazada'
    );