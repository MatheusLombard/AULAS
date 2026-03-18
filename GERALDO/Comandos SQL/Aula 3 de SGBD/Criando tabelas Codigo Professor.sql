-- Data: 17/03/2026

-- Criando a tb_servidores
-- Restrição:
--      PK aplicada a coluna "cpf"
CREATE TABLE tb_servidores(
cpf			VARCHAR(15),
nm_servidor	VARCHAR(60),
CONSTRAINT pk_tb_servidores_cpf PRIMARY KEY(cpf)
);

-- Criando a "tb_funcionarios"
-- Restrições:
--    PK aplicada a coluna "cpf"
--    FK aplicada a coluna "cpf"
CREATE TABLE tb_funcionarios(
cpf			VARCHAR(15),
ds_funcao	VARCHAR(25),
CONSTRAINT pk_tb_func_cpf PRIMARY KEY(cpf),
CONSTRAINT fk_tb_func_cpf FOREIGN KEY(cpf)
	REFERENCES tb_servidores(cpf)
);

-- Criando a "tb_professores"
-- Restrições:
--     PK aplicada a coluna "cpf"
--     FK aplicada a coluna "cpf"
CREATE TABLE tb_professores(
cpf			VARCHAR(15),
titulacao	VARCHAR(25),
categoria	VARCHAR(25),
CONSTRAINT pk_tb_prof_cpf PRIMARY KEY(cpf),
CONSTRAINT fk_tb_prof_cpf FOREIGN KEY(cpf)
	REFERENCES tb_servidores(cpf)
);

-- Criando a "tb_pessoas"
-- Restrição:
--  PK aplicada a coluna "codigo"
CREATE TABLE tb_pessoas(
codigo			INTEGER,
nm_pessoa		VARCHAR(60),
CONSTRAINT pk_tb_pessoas_codigo PRIMARY KEY(codigo)
);
-- Criando a "tb_cnh"
-- Restrições:
--  PK aplicada a coluna "numero"
--  FK aplicada a coluna "codigo"
--  NN aplicada a coluna "codigo"
--  UQ aplicada a coluna "codigo"
CREATE TABLE tb_cnh(
numero			INTEGER,
dt_expedicao	DATE,
validade		DATE,
categoria		VARCHAR(5),
codigo			INTEGER CONSTRAINT nn_tb_cnh_codigo NOT NULL
                        CONSTRAINT uq_tb_cnh_codigo UNIQUE,
dt_retirada		DATE,
CONSTRAINT pk_tb_cnh_nr PRIMARY KEY(numero),
CONSTRAINT fk_tb_cnh_codigo FOREIGN KEY(codigo)
	REFERENCES tb_pessoas(codigo)
);

-- Criando a "tb_homens"
-- Restrição:
--    PK aplicada a coluna "rg"
CREATE TABLE tb_homens(
rg			VARCHAR(15),
nm_homem	VARCHAR(60),
CONSTRAINT pk_tb_homens_rg PRIMARY KEY(rg)
);

-- Criando a "tb_mulheres"
-- Restrição:
-- PK aplicada a coluna "rg"
CREATE TABLE tb_mulheres(
rg			VARCHAR(15),
nm_mulher	VARCHAR(60),
CONSTRAINT pk_tb_mulheres_rg PRIMARY KEY(rg)
);

-- Criando a "tb_casamentos"
-- Restrições: 
-- PK aplicada a coluna "rg_h"
-- FK aplicada a coluna "rg_h" 
-- FK aplicada a coluna "rg_m"
-- UQ aplicada a coluna "rg_m"
CREATE TABLE tb_casamentos(
rg_h			VARCHAR(15),
rg_m			VARCHAR(15) CONSTRAINT uq_tb_casamentos_rg_m UNIQUE,
dt_casamento	DATE,
CONSTRAINT pk_tb_casamentos_rg_h PRIMARY KEY(rg_h),
CONSTRAINT fk_tb_casamentos_rg_h FOREIGN KEY(rg_h)
	REFERENCES tb_homens(rg),
CONSTRAINT fk_tb_casamentos_rg_m FOREIGN KEY(rg_m)
	REFERENCES tb_mulheres(rg)
);

-- Criando a "tb_departamentos"
--   PK aplicada a coluna "codigo"
CREATE TABLE tb_departamentos(
codigo			INTEGER,
nm_depto		VARCHAR(45),
CONSTRAINT pk_tb_depto_codigo PRIMARY KEY(codigo)
);

-- Criando a "tb_empregados"
-- Restrições:
-- PK aplicada a coluna "cpf"
-- FK aplicada a coluna "cod_depto"
-- NN aplicada a coluna "cod_depto"
-- DROP TABLE tb_empregados CASCADE;
CREATE TABLE tb_empregados(
cpf				VARCHAR(15),
nm_empregado	VARCHAR(60),
cod_depto		INTEGER CONSTRAINT nn_tb_emp_cod_depto NOT NULL,
dt_lotacao		DATE,
CONSTRAINT pk_tb_emp_cpf PRIMARY KEY(cpf),
CONSTRAINT fk_tb_emp_cod_depto FOREIGN KEY(cod_depto)
	REFERENCES tb_departamentos(codigo)
);
















