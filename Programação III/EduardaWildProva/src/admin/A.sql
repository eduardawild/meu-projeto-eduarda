CREATE TABLE aviao
(
  numero integer NOT NULL,
  saida character varying(15),
  chegada character varying(15),
  paradas integer,
  CONSTRAINT aviao_pkey PRIMARY KEY (numero)
)