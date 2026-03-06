-- Criando a "tb_curso"
-- Restrição:
--            PK aplicada a coluna "cod_curso"
CREATE TABLE tb_curso(
cod_curso		INTEGER,
nm_curso		VARCHAR(40),
CONSTRAINT pk_tb_curso_cod_curso PRIMARY KEY(cod_curso)
);
SELECT * 
FROM tb_curso

--RESTRIÇÕES:
--			PK aplicada a coluna "cod_aluno"
-- 			FK aplicada a coluna "cod_curso"
--			NN aplicada a coluna "cod_curso"
CREATE TABLE tb_aluno(
cod_aluno INTEGER,
nm_aluno VARCHAR(40),
cod_curso INTEGER CONSTRAINT nn_tb_aluno_cod_curso NOT NULL,
dt_nascimento DATE,
CONSTRAINT pk_tb_aluno_cod_aluno PRIMARY KEY(cod_aluno),
CONSTRAINT fk_tb_aluno_cod_aluno FOREIGN KEY(cod_curso)
		REFERENCES tb_curso(cod_curso)
)



-- CRIANDO A "tb_disciplina_curso"
-- RESTRIÇÕES:
-- 			PK composta aplicada as colunas "cod_disciplina" e "cod_curso"
--			FK aplicada a coluna "cod_disciplina"
--			FK aplicada a coluna "cod_curso"

CREATE TABLE tb_disciplica_curso(
cod_disciplina INTEGER,
cod_curso INTEGER,
CONSTRAINT pk_tb_dc_cod_disc_cod_disc_cod_curso PRIMARY KEY(cod_disciplina, cod_curso),
CONSTRAINT fk_tb_dc_cod_disc_cod_disc FOREIGN KEY(cod_disciplina)
		REFERENCES tb_disciplina(cod_disciplina),
CONSTRAINT fk_tb_dc_cod_disc_cod_curso FOREIGN KEY(cod_curso)
		REFERENCES tb_curso(cod_curso)
)


-- CRIANDO A 'tb_pre_requisito'
-- RESTRIÇÕES:
-- 			PK composta aplicada as colunas "cod_disciplina_liberada" e "cod_disciplina_liberadora"
--			FK aplicada a coluna "cod_disciplina_liberada"
--			FK aplicada a coluna "cod_disciplina_liberadora"

CREATE TABLE tb_pre_requisito(
cod_disciplina_liberada 		INTEGER,
cod_disciplina_liberadora 		INTEGER,
CONSTRAINT pk_tb_pr_liberada_liberadora
	PRIMARY KEY(cod_disciplina_liberada, cod_disciplina_liberadora),
CONSTRAINT fk_tb_pr_liberada FOREIGN KEY(cod_disciplina_liberada) 
	REFERENCES tb_disciplina(cod_disciplina),
CONSTRAINT fk_tb_pr_liberadora FOREIGN KEY(cod_disciplina_liberadora) 
	REFERENCES tb_disciplina(cod_disciplina)

)




SELECT * FROM tb_departamento


SELECT * FROM tb_curso
-- REALIZANDO UMA CARGA NA tb_curso
INSERT INTO tb_curso(cod_curso, nm_curso)
VALUES
	(10, 'Engenharia de Software'),
	(11, 'Ciência da Computação'),
	(12, 'Sistemas da Informação')


INSERT INTO tb_disciplina(cod_disciplina,
						  cod_depto,
						  nm_disciplina,
						  credito)
VALUES
(1, 1, 'Banco de Dados I', 80),
(2, 1, 'Banco de Dados II', 80),
(3, 2, 'Gestão de Projetos', 40)


INSERT INTO tb_aluno(cod_aluno,
					 nm_aluno,
					 cod_curso,
					 dt_nascimento)
VALUES
(100, 'Isadora Chieregato', 10, '12/12/2006'),
(101, 'Victor Santucci', 10, '09/08/2006'),
(102, 'Igor de Souza Gonçalves', 10, '17/01/2005')

INSERT INTO tb_pre_requisito(cod_disciplina_liberada,
							 cod_disciplina_liberadora)
VALUES
(2,1)

SELECT * FROM tb_disciplina

SELECT 
    t1.nm_disciplina AS disciplina_liberada, 
    t2.nm_disciplina AS disciplina_pre_requisito
FROM tb_pre_requisito
INNER JOIN tb_disciplina t1	
    ON t1.cod_disciplina = tb_pre_requisito.cod_disciplina_liberada
INNER JOIN tb_disciplina t2	
    ON t2.cod_disciplina = tb_pre_requisito.cod_disciplina_liberadora;
	
