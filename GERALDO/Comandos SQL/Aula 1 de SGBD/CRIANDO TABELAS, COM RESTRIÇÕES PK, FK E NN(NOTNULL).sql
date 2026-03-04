-- Conectado no database "ES_03_03_26"
-- Inicio a criação dos objetos table;

-- Criando a tb_departamento
-- Restrição:
		-- Pk aplicada a coluna "cod_depto"

CREATE TABLE tb_departamento(
cod_depto 		integer,
nm_depto		varchar(40),
CONSTRAINT pk_tb_depto_cod_depto PRIMARY KEY(cod_depto)
)

-- Como nomear as restrições na table
-- sufixo_table_name_column_name
-- exemplo: pk_tb_depto_cod_depto

SELECT * FROM tb_departamento


-- Realizando uma carga de dados na tb_departamento

INSERT INTO tb_departamento (cod_depto, nm_depto) 
VALUES 
(1, 'Computação'),
(2, 'Engenharia'),
(3, 'Ciencias Medicas'),
(4, 'Administração');


-- Criando a tb_disciplina
-- Restrições:
			-- PK aplicada a coluna cod_disciplina
			-- FK aplicada a coluna cod_dpto
			-- NOT NULL aplicado a cod_dpto

CREATE TABLE tb_disciplina(
cod_disciplina		integer,
cod_depto 			integer CONSTRAINT nn_tb_disc_cod_depto NOT NULL,
nm_disciplina		varchar(40),
credito				integer,
CONSTRAINT pk_tb_disc_cod_disc PRIMARY KEY(cod_disciplina),
CONSTRAINT fk_tb_disc_cod_depto FOREIGN KEY(cod_depto)
		REFERENCES tb_departamento(cod_depto)

)





