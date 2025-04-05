# Grade API

## :door: Conteúdo

- [Sobre](#Sobre)
- [Tecnologias](#Tecnologias)
- [Modelagem](#Modelagem)
- [Como executar o projeto](#Como-executar)
- [Endpoints](#Endpoints)

---

<a name="Sobre"></a>
## :school: Sobre

A **Grade API** faz parte de um sistema maior chamado [schedule-api](https://github.com/reetz-dev/schedule-api), permitindo a gestão de grades horárias escolares. O objetivo é possibilitar a criação, edição e remoção de dias da semana e horários em uma determinada grade.

---

<a name="Tecnologias"></a>
## :zap: Tecnologias

### Backend

- [Java](https://www.java.com/pt-BR/) (OpenJDK 17)
- [Spring Boot](https://spring.io/projects/spring-boot/)
- [PostgreSQL](https://www.postgresql.org/)
- [JUnit5](https://junit.org/junit5/)

---

<a name="Modelagem"></a>
## :game_die: Modelagem

![image](https://github.com/user-attachments/assets/52f4c2ea-7918-4c62-b531-574f5a810f67)

---

<a name="Como-executar"></a>
##  :arrow_forward: Como executar

Para rodar a API localmente:

```shell
$ git clone https://github.com/reetz-dev/schedule-api.git
$ cd grade-api

#Caso use o docker

$ docker compose up -d
```
Para rodar ele no terminal:

```shell
$ cd schedule-api
$ ./mvnw spring-boot:run
```

Grade API estará acessível em `http://localhost:3001`

<a name="Endpoints"></a>
## :pushpin: Endpoints

<details>
  <summary>
    <strong>:blue_book: GET</strong>
  </summary>
  
#### Retorna todas as matérias

```http
  GET http://localhost:3001/grades
```

##### Exemplo de resposta:
```json
[
	{
		"id": 1,
		"nome": "Filosofia",
		"horarios": [
			"PRIMEIRA_AULA"
		],
		"weekdays": [
			"TERCA_FEIRA"
		]
	},
	{
		"id": 2,
		"nome": "Sociologia",
		"horarios": [
			"SEGUNDA_AULA",
			"PRIMEIRA_AULA"
		],
		"weekdays": [
			"SEGUNDA_FEIRA",
			"QUINTA_FEIRA"
		]
	},
	{
		"id": 4,
		"nome": "Artes",
		"horarios": [
			"TERCEIRA_AULA"
		],
		"weekdays": [
			"QUARTA_FEIRA"
		]
	}
]
```
