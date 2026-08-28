#  Sistema de Caixa Eletrônico (ATM) em Java

Uma aplicação em **Java** desenvolvida para simular as operações essenciais de uma conta bancária via terminal, focando na aplicação prática dos fundamentos de **Programação Orientada a Objetos (POO)** e **controle de fluxo**.

---

## 📌 Funcionalidades

- **Abertura de Conta:** Cadastro do titular e geração automática de número de conta.
- **Consulta de Saldo:** Exibição do saldo atualizado com formatação monetária (`R$`).
- **Depósito:** Adição de valores com validação contra depósitos nulos ou negativos.
- **Saque:** Realização de retiradas com verificação dupla (valor válido + saldo suficiente).
- **Menu Interativo:** Interface via linha de comando contínua até a finalização pelo usuário.

---

## 🛠️ Conceitos & Boas Práticas Aplicados

- **Encapsulamento (POO):** Atributos (`titular`, `numeroConta`, `saldo`) definidos como `private`, garantindo o acesso seguro via *getters* e operações controladas.
- **Separação de Responsabilidades:** A classe `ContaBancaria` gerencia exclusivamente as regras de negócio bancárias, enquanto a classe `InteracaoSistema` cuida da interface com o usuário.
- **Estruturas de Controle:** 
  - `while`: Mantém a navegação ativa no menu principal.
  - `switch-case`: Gerencia a escolha de opções do usuário de forma limpa.
  - `if-else`: Trata exceções de negócio (como tentativas de saque com saldo insuficiente ou valores inválidos).

---

## 📂 Estrutura do Projeto

```text
src/
└── sistemacaixaeletronico/
    ├── ContaBancaria.java     # Classe de modelo e regras de negócio
    └── InteracaoSistema.java  # Classe principal (Entry Point e Interface Terminal)
