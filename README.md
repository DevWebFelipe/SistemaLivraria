# 📚 Sistema de Biblioteca — Java (Console)

![Java Badge](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![License: MIT](https://img.shields.io/badge/License-MIT-brightgreen?style=for-the-badge)

Descrição
---------
Projeto simples de sistema de biblioteca implementado em Java com interface via console. Permite listar livros, registrar empréstimos e exibir um pequeno relatório ao finalizar a execução.

Badges
------
- **Java:** badge acima.
- **Licença:** MIT (badge acima).

Funcionalidades
---------------
- Listar livros disponíveis
- Solicitar e registrar empréstimos
- Exibir histórico/relatório de empréstimos ao finalizar
- Dados iniciais carregados a partir da classe `repository.Biblioteca`

Tecnologias
-----------
- Java (recomendado JDK 11+)
- Coleções padrão do Java (`ArrayList`)
- Entrada via `Scanner` (console)

Requisitos
----------
- Java JDK instalado (recomenda-se JDK 11 ou superior)
- Variável de ambiente `JAVA_HOME` configurada e `javac`/`java` disponíveis no `PATH`

Instalação e execução (Windows PowerShell)
-----------------------------------------
Abra o PowerShell na raiz do projeto e execute:

```powershell
# cria pasta para classes compiladas
mkdir out

# compila os arquivos .java (ajuste se adicionar novos arquivos)
javac -d out src\model\*.java src\repository\*.java src\app\Main.java

# executa a aplicação
java -cp out app.Main
```

Observações:
- Os arquivos usam declarações de pacote (`package app;`, `package model;`, `package repository;`). O comando `javac -d out` irá gerar a hierarquia de pacotes dentro da pasta `out`.
- Se a execução falhar por `Main` não ser pública, abra `src/app/Main.java` e altere a assinatura do método principal para `public static void main(String[] args)`.

Estrutura de pastas
-------------------
Estrutura principal do projeto:

```
README.md
requirements.txt
src/
  app/
    Main.java
  model/
    Autor.java
    Emprestimo.java
    Livro.java
  repository/
    Biblioteca.java
```

Como contribuir
---------------
- Abra uma issue descrevendo a sugestão ou bug.
- Para pequenas correções, abra um pull request com uma descrição clara das mudanças.
- Mantenha o estilo de código Java simples e direto. Evite mudanças que alterem a API sem necessidade.

Licença
-------
Este projeto está licenciado sob a licença MIT. Se desejar, adicione um arquivo `LICENSE` com o texto completo da MIT License.

Autor / Contato
---------------
- Desenvolvedor: DevWebFelipe

Próximos passos recomendados
---------------------------
- Adicionar um arquivo `LICENSE` com o texto da MIT License.
- Converter para um build system (Maven ou Gradle) para facilitar compilação e empacotamento.
- Adicionar testes unitários automáticos.

---

Se quiser, posso também:
- adicionar o arquivo `LICENSE` com o texto MIT;
- criar um `build.gradle` ou `pom.xml` para automação;
- ajustar `Main.java` para tornar o método `main` público e garantir compatibilidade de execução.
