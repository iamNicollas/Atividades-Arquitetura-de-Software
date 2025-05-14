
# 🏗️ Atividades de Arquitetura de Software - Design Patterns

Este repositório contém implementações práticas realizadas durante a disciplina de Arquitetura de Software, com foco em três padrões de projeto (Design Patterns): Factory, State e Adapter. 
Cada atividade teve como objetivo aplicar os conceitos aprendidos em contextos reais simulados.

---

## 📦 Factory Pattern - Sistema de Notificações

**Objetivo:** Criar um sistema capaz de enviar mensagens por diferentes canais (E-mail, SMS, Push Notification) de forma flexível e extensível, sem alterar o código principal ao adicionar novos tipos de notificações (como WhatsApp ou Telegram).

**Solução:** Implementei o padrão Factory, permitindo que a criação de notificações seja feita por uma fábrica responsável por instanciar dinamicamente o tipo correto de notificação.

✔️ **Benefícios:**

- Facilita a manutenção e expansão do sistema.
- Reduz acoplamento entre classes.

---

## 🚦 State Pattern - Semáforo Inteligente

**Objetivo:** Simular um semáforo inteligente que muda automaticamente entre os estados: Verde, Amarelo e Vermelho, de acordo com o comportamento esperado de cada um.

**Solução:** Apliquei o padrão State, onde cada estado do semáforo é representado por uma classe com comportamentos próprios, e a transição ocorre de forma automatizada.

✔️ **Benefícios:**

- Clareza na lógica de transição de estados.
- Código mais organizado e com responsabilidade bem definida.

---

## 💡 Adapter Pattern - Automação Residencial

**Objetivo:** Permitir que o controle infravermelho antigo de luzes funcione com o novo sistema baseado em Wi-Fi, garantindo compatibilidade sem reescrever o sistema existente.

**Solução:** Desenvolvi um Adapter que atua como um tradutor entre os dois sistemas, conectando o legado (infrared) ao moderno (Wi-Fi).

✔️ **Benefícios:**

- Reutilização de código legado.
- Redução de impacto na mudança de tecnologia.

---

## 🧠 Conclusão

Essas atividades reforçaram a importância dos padrões de projeto para criar sistemas flexíveis, reutilizáveis e de fácil manutenção, abordando desafios reais da engenharia de software.
