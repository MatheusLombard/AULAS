CREATE TABLE tb_instituicoes(
sigla  VARCHAR(10),
nm_instituto VARCHAR(50),
CONSTRAINT pk_tb_instituicoes_sigla PRIMARY KEY(sigla)
)

CREATE TABLE tb_projetos(
nr 		integer,
ds_projeto	VARCHAR(50),
orcamento  INTEGER,
CONSTRAINT pk_tb_projetos_nr PRIMARY KEY(nr)
)

CREATE TABLE tb_pesquisadores(
rg		VARCHAR(15),
nm_pesquisador	VARCHAR(60),
dt_nascimento 	DATE,
CONSTRAINT pk_tb_pesquisadores_rg PRIMARY KEY(rg)
)

CREATE TABLE tb_pesquisas(
sigla 	VARCHAR(10),
nr_projeto	INTEGER,
rg			VARCHAR(15),
dt_inicio 	DATE,
CONSTRAINT pk_tb_pesquisas_sigla_nr_projeto_rg PRIMARY KEY(sigla, nr_projeto, rg),
CONSTRAINT fk_tb_pesquisas_sigla FOREIGN KEY(sigla)
	REFERENCES tb_instituicoes(sigla),
CONSTRAINT fk_tb_pesquisas_nr_projeto FOREIGN KEY(nr_projeto)
	REFERENCES tb_projetos(nr),
CONSTRAINT fk_tb_pesquisas_rg FOREIGN KEY(rg)
	REFERENCES tb_pesquisadores(rg)
)

CREATE TABLE tb_produtos(
codigo 			INTEGER,
ds_prod 		VARCHAR(50),
preco			NUMERIC(7,2),
CONSTRAINT pk_tb_produto_codigo PRIMARY KEY(codigo)
)

CREATE TABLE tb_cidades(
codigo			INTEGER,
nm_cidade		VARCHAR(50),
dt_nasc			DATE,
CONSTRAINT pk_tb_cidades_codigo PRIMARY KEY(codigo)
)

CREATE TABLE tb_distribuidores(
rg				VARCHAR(15),
nm_distribuidor VARCHAR(60),
dt_nasc			DATE,
CONSTRAINT pk_tb_distribuidores_rg PRIMARY KEY(rg)
)

CREATE TABLE tb_distribuicoes(
cod_prod		INTEGER,
cod_cidade		INTEGER,
rg				VARCHAR(15),
CONSTRAINT pk_tb_distribuicoes_cod_prod_cod_cidade PRIMARY KEY(cod_prod, cod_cidade),
CONSTRAINT fk_tb_distribuicoes_cod_prod FOREIGN KEY(cod_prod)
	REFERENCES tb_produtos(codigo),
CONSTRAINT fk_tb_distribuicoes_cod_cidade FOREIGN KEY(cod_cidade)
	REFERENCES tb_cidades(codigo),
CONSTRAINT fk_tb_distribuicoes_rg FOREIGN KEY(rg)
	REFERENCES tb_distribuidores(rg)
)


CREATE TABLE tb_bairros(
codigo 			INTEGER,
nm_bairro		VARCHAR(30),
nm_cidade		VARCHAR(30),
uf				VARCHAR(2),
CONSTRAINT pk_tb_bairros_codigo PRIMARY KEY(codigo)
)

CREATE TABLE tb_carteiros(
rg 				VARCHAR(15),
nm_carteiro		VARCHAR(60),
dt_nasc			DATE,
CONSTRAINT pk_tb_carteiros_rg PRIMARY KEY(rg)
)

CREATE TABLE tb_correspondencias(
cod_carta		INTEGER,
peso			NUMERIC(7,2),
cod_bairro		INTEGER CONSTRAINT nn_tb_correspondencias_cod_bairro NOT NULL,
rg				VARCHAR(15) CONSTRAINT nn_tb_correspondencias_rg NOT NULL,
CONSTRAINT pk_tb_correspondencias_cod_carta PRIMARY KEY(cod_carta),
CONSTRAINT fk_tb_correspondencias_cod_bairro FOREIGN KEY(cod_bairro)
	REFERENCES tb_bairros(codigo),
CONSTRAINT fk_tb_correspondencias_rg FOREIGN KEY(rg)
	REFERENCES tb_carteiros(rg)
)




