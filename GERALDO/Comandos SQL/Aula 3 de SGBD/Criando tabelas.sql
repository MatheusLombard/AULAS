--Criando a "tb_funcionarios"
--Restriões: 
--		PK aplicada a coluna "CPF"
-- 		FK aplicada a coluna "CPF"


CREATE TABLE tb_servidores(
cpf 			VARCHAR(15),
nm_servidor 	int,
CONSTRAINT pk_tb_servidores_cpf PRIMARY KEY(cpf)
)

--Criando a "tb_funcionarios"
--Restriões: 
--		PK aplicada a coluna "CPF"
-- 		FK aplicada a coluna "CPF"

DROP TABLE tb_funcionarios cascade
CREATE TABLE tb_funcionarios(
cpf 			VARCHAR(15),
dsc_funcao 	VARCHAR(50),
CONSTRAINT pk_tb_funcionarios_cpf PRIMARY KEY(cpf),
CONSTRAINT fk_tb_funcionarios_cpf FOREIGN KEY(cpf) REFERENCES tb_servidores(cpf)
)

CREATE TABLE tb_professores(
cpf 			VARCHAR(15),
titulacao 		VARCHAR(20),
categoria 		VARCHAR(20),
CONSTRAINT pk_tb_professores_cpf PRIMARY KEY(cpf),
CONSTRAINT fk_tb_professores_cpf FOREIGN KEY(cpf) REFERENCES tb_servidores(cpf)
)






--Criando a tb_pessoas()
--Restrições:
--			PK aplicada a coluna codigo

CREATE TABLE tb_pessoas(
codigo 			INTEGER,
nm_pessoa 		VARCHAR(60),
CONSTRAINT pk_tb_pessoas_codigo PRIMARY KEY(codigo)
)

--Criando tb_cnh()
--Restrições:
--			- PK aplicada a coluna Numero
--			- Fk aplicada a coluna codigo
--			- NN aplicado a coluna codigo
--			- Unique(uq) aplicado a coluna codigo
CREATE TABLE tb_cnh(
numero 			INTEGER,
dt_expedicao 	DATE,
validade		DATE,
categoria		VARCHAR(5),
codigo			INTEGER CONSTRAINT nn_tb_cnh_codigo NOT NULL
						CONSTRAINT uq_tb_cnh_codigo UNIQUE,
dt_retirada		DATE,
CONSTRAINT pk_tb_cnh_numero PRIMARY KEY(numero),
CONSTRAINT fk_tb_cnh_codigo FOREIGN KEY(codigo)
			REFERENCES tb_pessoas(codigo)
)


-- Criando a "tb_homens"
-- Restrições:
-- 				PK aplicada a coluna RG
CREATE TABLE tb_homens(
rg 			VARCHAR(15),
nm_homem 	VARCHAR(60),
CONSTRAINT pk_tb_homens_rg PRIMARY KEY(rg)
)

-- Criando a "tb_mulheres"
-- Restrições:
-- 				PK aplicada a coluna RG
CREATE TABLE tb_mulheres(
rg 			VARCHAR(15),
nm_mulher 	VARCHAR(60),
CONSTRAINT pk_tb_mulheres_rg PRIMARY KEY(rg)
)
-- Criando a "tb_casamentos"
-- Restrições:
--	 			PK aplicada a coluna rg_h
--	 			FK aplicada a coluna rg_h
--	 			PK aplicada a coluna rg_m
--	 			FK aplicada a coluna rg_m

CREATE TABLE tb_casamentos(
rg_h 			VARCHAR(15),
rg_m			VARCHAR(15) CONSTRAINT uq_tb_casamentos_rg_m UNIQUE,
dt_casamento	DATE,
CONSTRAINT pk_tb_casamentos_rg_h PRIMARY KEY(rg_h),
CONSTRAINT fk_tb_casamentos_rg_h FOREIGN KEY(rg_h) REFERENCES tb_homens(rg),
CONSTRAINT fk_tb_casamentos_rg_m FOREIGN KEY(rg_m) REFERENCES tb_mulheres(rg)
)


--Criando tb_dpto()
--Restrições:
--				PK aplicada em codigo

CREATE TABLE tb_dpto(
codigo 			INTEGER,
nm_dpto			VARCHAR(20),
CONSTRAINT pk_tb_dpto_codigo PRIMARY KEY(codigo)
);

--Criando tb_empregados
-- Restrições:
--				PK aplicada a CPF
--				FK aplicakda a cod_dpto
--				NN aplicada a cod_dpto

CREATE TABLE tb_empregados(
cpf 			VARCHAR(15),
nm_empregados 	VARCHAR(60),
cod_dpto		INTEGER CONSTRAINT nn_tb_empregados_cod_dpto NOT NULL,
dt_lotacao		DATE,
CONSTRAINT pk_tb_empregados_cpf PRIMARY KEY(cpf),
CONSTRAINT fk_tb_empregados_cod_dpto FOREIGN KEY(cod_dpto) REFERENCES tb_dpto(codigo)
)


-- Criando a "tb_pessoas"
-- Restrição:
-- 			PK aplicada a coluna "rg"
DROP TABLE tb_pessoas CASCADE

CREATE TABLE tb_pessoas(
rg 			VARCHAR(15),
nm_pessoa 	VARCHAR(60),
CONSTRAINT pk_tb_pessoas_rg PRIMARY KEY(rg)
)
-- Criando a "tb_automoveis"
-- Restrição:
-- 			PK aplicada a coluna "chassi"

CREATE TABLE tb_automoveis(
chassi 			VARCHAR(17),
ano_modelo		INTEGER,
ano_fabricacao	INTEGER,
CONSTRAINT pk_tb_automoveis_chassi PRIMARY KEY(chassi)
)

--Criando tb_posses
--Restrições:
--			PK aplicada a coluna chassi
--			FK aplicada a coluna chassi
--			FK aplicada a coluna rg
CREATE TABLE tb_posses(
chassi	VARCHAR(17),
rg		VARCHAR(15),
dt_compra 	DATE,
CONSTRAINT pk_tb_posses_chassi PRIMARY KEY(chassi),
CONSTRAINT fk_tb_posses_chassi FOREIGN KEY(chassi) REFERENCES tb_automoveis(chassi),
CONSTRAINT fk_tb_posses_rg FOREIGN KEY(rg) REFERENCES tb_pessoas(rg)
)