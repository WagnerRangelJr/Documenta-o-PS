![](Aspose.Words.cb938290-9f2c-4a3c-8925-73627d94c0aa.001.png)

**Descrição do MiniMundo**

O produto deste projeto é uma plataforma de agendamento de atendimento multiempresas, que a partir do cadastro do administrador, pode ser moldada ao tipo de negócio a que a empresa opera.

O objetivo principal deste produto é permitir o cadastramento de cada profissional de atendimento ao público em nome da empresa, que terá uma agenda associada ao mesmo para que os clientes usuários possam acessar a plataforma e escolher tanto o profissional de atendimento quanto o dia e horário, dentre os disponíveis na agenda do mesmo.

O resultado do atendimento será registrado na plataforma pelo profissional, mantendo assim um histórico de atendimento ao usuário, para futuras demandas, associadas ou não ao mesmo evento originário.

Os usuários ao se cadastrarem além de escolher profissional, data e horário de atendimento, também deverão fazer um breve relato da demanda a ser discutida ou atendida.

A plataforma também permitirá que o usuário faça uma avaliação ao atendimento que recebeu, de forma que o administrador possa avaliar o desempenho de sua equipe e promover melhorias de maneira que a qualidade de atendimento aos usuários seja sempre aprimorada.

Todos os profissionais e usuários que acessem a plataforma deverão estar cadastrados tendo sido escolhida como chave de acesso deles o número do CPF.

O sistema prevê a existência de um administrador, que será o responsável por eleger seus atendentes, dentre os funcionários cadastrados no sistema.

O administrador será responsável também pela criação e abertura da agenda mensal de todos os atendentes. Os atendentes deverão confirmar e liberar sua agenda, após validarem e marcarem as eventuais ausências já previstas, para evitar a exibição de horário que não estarão presentes para escolha dos usuários.

O usuário terá acesso a plataforma através da tela de login, sendo levado de imediato para tela de atendimento, no qual poderá consultar suas marcações futuras, agendar outras e avaliar os atendimentos já realizados.

**1. REQUISITOS**

1. Requisitos funcionais



|ID|Nome|Descrição|Referência|
| - | - | - | - |
|RFN01|Gerenciar Papéis de Usuário|O sistema deve conter meios para gerenciar diversos papéis..||
|RFN02|Marcar Atendimento|O sistema deve permitir que o cliente efetue a marcação de atendimentos.||
|RFN03|Listar Histórico do Atendimento|O sistema deve listar todo o histórico de agendamentos realizados pelo usuário.||
|RFN04|Listar Atendimentos|O sistema deve registrar e apresentar as datas agendadas pelo atendente.||
|RFN05|Efetuar Login|O usuário deverá se autenticar no sistema.||
|RFN06|Definir Tempo Padrão|O sistema deve ter um slot de tempo para agendamento.|8|
|RFN07|Cancelar Agendamento|O sistema deve permitir o cancelamento do agendamento.||
|RFN08|Emitir Protocolo|O sistema deve emitir um protocolo para cada agendamento.||
|RFN9|Deletar Usuário|O sistema deve permitir a deleção de um usuário.||
|RFN10|Enviar E-mail|O sistema deve enviar email ao usuário quando houver modificação de status.||
|RFN11|Registrar Feedback|O sistema deve permitir o registro do feedback do usuário após o atendimento.||
|RFN12|Gerar Relatório|O sistema deve gerar um relatório estatístico de número de atendimentos no período||
|RFN13|Cadastrar Usuário|O sistema deve permitir o cadastro de usuário||
|RFN14|Registrar Justificativa|O sistema deve permitir o registro de  uma justificativa para cancelar.||
|RF N15|Completar Perfil|O sistema deve permitir a inserção de dados no perfil dos usuários., como nome, atividade e descrição.||
|RFN16|Efetuar Busca|O sistema deve permitir a busca/filtragem de agendamentos.||
|RFN017|Cadastrar Atendente|O sistema deve ter uma tela para cadastro de atendentes .||
|RFN18|Cadastrar Administrador|O sistema deve permitir a criação do administrador.||
|RF N19|Solicitar Exclusão|O sistema deve permitir que o usuário solicite a exclusão da conta.||
|RFN20|Criar Notificações|O sistema deve permitir a criação de notificação na página inicial.||
|RFN21|Editar Notificações|O sistema deve permitir a edição das notificações da página inicial.||
|RFN22|Registrar Datas|O sistema deve registrar as datas/horário de não atendimento.||
|RFN 3|Criar Agenda|O sistema deve permitir a criação da agenda do mês.||
|RFN24|Identificar Atendente|Cada atendente da equipe que utilize o sistema deverá identificado pelo CPF.||
|RFN25|Alterar senha.|O sistema deve permitir a alteração de senha da conta.||
2. Requisitos não funcionais



|ID|Descrição|Classificação|
| - | - | - |
|RNF 1|O sistema deve respeitar as leis da LGPD.|Requisitos legais.|
|RNF 2|O sistema deve permitir que os usuários realizem as operações sem interrupções, isto é, todas as requisições devem transcorrer em tempo máximo de 1 minuto.|Requisitos de produtos|
|RNF 3|O sistema não apresentará aos usuários quaisquer dados de cunho privativo.|Requisitos éticos.|
|RNF 4|O sistema deve ser implementado com a persistência do sistema usando JDBC.|Requisitos de padrão|
|RNF 5|O padrão do código será definido pelo versionamento semântico (https://semver.org/lang/ pt-BR/).|Requisitos organizacionais:|
|RNF 6|O sistema deve ser acessado pelos seguintes navegadores web: Opera, Google Chrome.|Requisitos de portabilidade..|
|RNF 7|A versão do sistema somente será disponível para aplicações web em desktop, não sendo suportada versão mobile.|Requisitos de produtos|
|RNF 8|Os horários informados no sistema devem corresponder com o horário oficial do Brasil , o qual é de Brasília.|Requisitos externos|
|RNF 9|O sistema deverá ter disponibilidade dentre os horários 08:00 às 20:00.|Requisitos de confiabilidade|
|RNF 10|Os usuários não precisarão de treinamento para realizar a operação  no sistema.|Requisitos de usabilidade|
|RNF 11|As informações exibidas no sistema serão sempre na língua portuguesa.|Requisitos de produtos|
|RNF 12|O código do sistema será arquivado no Github.|Requisitos organizacionais.|
|RNF 13|O sistema não deve ultrapassar 3GB de tamanho |Requisito de implementação|
|RNF 14|Para o desenvolvimento dos códigos será adotado o git flow para a gerência de manutenção de código.|Requisitos organizacionais.|
|RNF 15|O tamanho do código executável do sistema não deve requerer mais do que 16GB de RAM|Requisito de implementação|
