-- Criando a tabela empregados
-- Restrições: 
--				- PK aplicada a coluna "RG"

CREATE TABLE tb_empregado(
rg			 	VARCHAR(15),
nm_empregado 	VARCHAR(60),
dt_nascimento	DATE,
CONSTRAINT fk_tb_empregado_rg PRIMARY KEY(rg)
)


-- Criando tabela tb_pedido
-- Restrições:
--				-PK aplicada a coluna nr_pedido

CREATE TABLE tb_pedidos(
nr_pedido 			INTEGER,
ds_pedido		VARCHAR(45),
dt_pedido 		DATE,
CONSTRAINT fk_tb_pedidos_nr_pedido PRIMARY KEY(nr_pedido)
)

-- Criação da nomenclatura da constraint:
-- SUFIXO_TABLE_NAME_COLUMN_NAME

-- Criando tb_itens
-- Restrições:
-- 				- PK composta aplicada as colunas (nr_pedido, nr_item)
--				- FK aplicada a coluna nr_pedido

CREATE TABLE tb_itens(
nr_pedido 		INTEGER,
nr_item			INTEGER,
ds_produto 		VARCHAR(45),
qtde 			INTEGER,
CONSTRAINT pk_tb_itens_nr_pedido_nr_item PRIMARY KEY(nr_pedido, nr_item),
CONSTRAINT fk_tb_itens_nr_pedido FOREIGN KEY(nr_pedido)
	REFERENCES tb_pedidos(nr_pedido)
)


-- Excluindo a tb_empregados

DROP TABLE tb_empregados CASCADE;

-- Recriando a "tb_empregado"
-- Restrições: 
--				- PK aplicada a coluna rg

CREATE TABLE tb_empregados(
rg 				VARCHAR(15),
nm_empregado 	VARCHAR(60),
dt_nascimento 	DATE,
plano_saude 	VARCHAR(20),
rua 			VARCHAR(45),
numero 			VARCHAR(5),
cidade			VARCHAR(45),
CONSTRAINT pk_tb_empregados_rg PRIMARY KEY(rg)
)

-- Criando "tb_telefones"
-- Restrições:
--			  - Pk composta aplicada as colunas rg, nr_telefone)
--			  - Fk aplicada a coluna rg

CREATE TABLE tb_telefones(
rg 				VARCHAR(15),
telefone		VARCHAR(15),
CONSTRAINT pk_tb_telefones_rg_telefone PRIMARY KEY(rg, telefone),
CONSTRAINT fk_tb_telefones_rg FOREIGN KEY(rg)
	REFERENCES tb_empregados(rg)
)