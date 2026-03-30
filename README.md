Projeto Herança em Java - Sistema de RPG

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos, com foco em Herança, Polimorfismo e Colaboração via GitHub Flow.

Integrantes do Trio
Victor Hugo Rodrigues Alves** - RA: 42421886
Matheus da Silva Ferreira** - RA: 4231924502
Vinicius Pereira Paiva** - RA: 4231923132

Estrutura do Projeto
O sistema simula uma hierarquia de personagens de um jogo:
- **Superclasse (Personagem):** Define os atributos básicos (nome e nível) e o método comum `atacar()`.
- **Subclasse A (Guerreiro):** Especialização que adiciona o atributo `forca` e sobrescreve o ataque para dano físico.
- **Subclasse B (Mago):** Especialização que adiciona o atributo `mana` e sobrescreve o ataque para uso de magia.

Demonstração de Polimorfismo
No arquivo `Main.java`, utilizamos uma `List<Personagem>` para armazenar instâncias de `Guerreiro` e `Mago`, percorrendo-as e invocando seus métodos sobrescritos de forma polimórfica.

Tecnologias
- Java 17+
- GitHub Flow (Branches: main, dev, feature/*)
