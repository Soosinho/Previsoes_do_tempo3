insert into tb_usuario (id, login, senha) values (1, 'admin', 'admin')

insert into tb_diasemana (id, diasemana) values (1, 'Quinta')
insert into tb_diasemana (id, diasemana) values (2, 'Sexta')
insert into tb_diasemana (id, diasemana) values (3, 'Sábado')
insert into tb_diasemana (id, diasemana) values (4, 'Domingo')
insert into tb_diasemana (id, diasemana) values (5, 'Segunda')
insert into tb_diasemana (id, diasemana) values (6, 'Terça')
insert into tb_diasemana (id, diasemana) values (7, 'Quarta')

insert into tb_cidade (id, nome, latitude, longitude) values (1, 'Osasco', -21.323232, -49.834343)

insert into tb_previsao (id, id_diasemana, tempminima, tempmaxima, umidade, descricao, datahora, latitude, longitude) values (1, 1, 21, 26, 23, 'Sol', '28 de Março / 13:00', -21.323232, -49.834343)
insert into tb_previsao (id, id_diasemana, tempminima, tempmaxima, umidade, descricao, datahora, latitude, longitude) values (2, 2, 16, 23, 40, 'Nublado', '29 de Março / 13:00', -21.323232, -49.834343)
insert into tb_previsao (id, id_diasemana, tempminima, tempmaxima, umidade, descricao, datahora, latitude, longitude) values (3, 3, 17, 24, 80, 'Chuva', '30 de Março / 13:00', -21.323232, -49.834343)
insert into tb_previsao (id, id_diasemana, tempminima, tempmaxima, umidade, descricao, datahora, latitude, longitude) values (4, 4, 17, 20, 42, 'Nublado', '31 de Março / 13:00', -21.323232, -49.834343)
insert into tb_previsao (id, id_diasemana, tempminima, tempmaxima, umidade, descricao, datahora, latitude, longitude) values (5, 5, 18, 30, 30, 'Sol', '1 de Abril / 13:00', -21.323232, -49.834343)
insert into tb_previsao (id, id_diasemana, tempminima, tempmaxima, umidade, descricao, datahora, latitude, longitude) values (6, 6, 19, 26, 36, 'Sol', '2 de Abril / 13:00', -21.323232, -49.834343)
insert into tb_previsao (id, id_diasemana, tempminima, tempmaxima, umidade, descricao, datahora, latitude, longitude) values (7, 7, 16, 21, 38, 'Nublado', '3 de Abril / 13:00', -21.323232, -49.834343)