CREATE TABLE IF NOT EXISTS 'usuario' (
    'id'             long         AUTO_INCREMENT PRIMARY KEY,
    'nome'           varchar(100) NOT NULL,
    'email'          varchar(50)  NOT NULL,
    'senha'          varchar(100) NOT NULL,
    'username'       varchar(50) NOT NULL,
    'endereco'       varchar(100) NOT NULL,
    'dataNascimento' date NOT NULL,
    'telefone'       varchar(10) NOT NULL
);