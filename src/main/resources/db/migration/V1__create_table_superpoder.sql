CREATE TABLE superpoder
(
    id                BIGINT,
    nome              VARCHAR(255),
    descricao         VARCHAR(255),
    nivel_inutilidade INTEGER NOT NULL,
    CONSTRAINT pk_superpoder PRIMARY KEY (id)
);