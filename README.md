# BookRaiders
Projeto de criação de um sistema web para compartilhamento de livros, desenvolvido para a disciplina de Desenvolvimento de Software III dos cursos de TI da Unisinos.

## Instruções de configuração do ambiente
1. [Fazer download do Spring Boot](https://start.spring.io/)
* Marcar o _**'Project'**_ como **Maven**.
* Marcar _**'Language'**_ como **Java**.
* Selecionar a versão **3.2.5** do Spring Boot.
* No _**'Project Metadata'**_:
  * _Group_: **br.com.bookraiders**
  * _Artifact_: **bookraiders**
  * _Name_: **bookraiders**
  * _Description_: **Bookraiders project**
  * _Package name_: **br.com.bookraiders**
  * _Packaging_: Marcar formato **Jar**
  * _Java_: Marcar a versão **17**
* Em _**'Dependencies'**_, clicar em **'ADD DEPENDENCIES'** e procurar por **H2 Database**, adicionando em seguida.
* Agora, clique em **'GENERATE'** no rodapé da página ou aperte **CTRL + Enter**.
* Baixe o arquivo **.zip** e faça a extração para algum local de trabalho.<br>

2.  [Faça download da IDE IntelliJ Community Edition](https://www.jetbrains.com/pt-br/idea/download/?section=windows)<br>
    **RECOMENDADO:** Alternativamente, você pode baixar a versão **Ultimate** e [criar uma conta de estudante](https://www.jetbrains.com/shop/eform/students).

3. Abra o projeto extraído anteriormente a partir do diretório principal como **projeto do IntelliJ**.
4. Configure o projeto para integrar o **H2 Database**, seguindo [a partir do tópico 3 deste guia](https://www.baeldung.com/spring-boot-h2-database#database-configuration:~:text=3.-,Database%20Configuration,-By%20default%2C%20Spring).

**Para demais instruções, somente depois que recuperar meu computador. - Gus Haag**
