-- conectado no database postgres criarmos um novo database 
-- para realizarmos a interpretação do modelo lógico relacional
-- criando os objetos "tables", juntamente com sua respectivas restrições

CREATE DATABASE "ES_03_03_26" -- IDENTIFICADOR UNICO
TEMPLATE = TEMPLATE0 -- PERMITE TRABALHAR COM HERANÇA
ENCODING 'UTF-8' -- ACENTUAÇÕES E VALORES MONETARIOS
CONNECTION LIMIT 100 -- NR MAXIMO DE CONEXÕES SIMULTANEAS