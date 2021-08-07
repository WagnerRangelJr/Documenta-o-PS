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



|ID|Descrição|Referência|
| - | - | - |
|RFN 01|O sistema deve ter 3 perfis de usuários: Administrador, Atendente e Beneficiário.||
|RFN 02|O cliente deve ser capaz de marcar atendimentos de acordo com as datas que o permitem.||
|RFN 03|O sistema deve listar todo o histórico de agendamentos realizados pelo beneficiário.||
|RFN 04|O Beneficiário deve ser capaz de realizar um agendamento no sistema||
|RFN 05|O Atendente deve ser capaz de gerenciar sua própria agenda.||
|RFN 06|O usuário deverá se autenticar no sistema.||
|RFN 07|O sistema deve ter um slot de tempo para agendamento fixo em 30 minutos.|8|
|RFN 08|O beneficiário deverá ser capaz de cancelar o agendamento||
|RFN 09|Todo agendamento realiza a geração de Protocolo correspondente.||
|RFN 10|O administrador deverá gerenciar a política de permissão dos usuários.||
|RFN 11|O sistema deve enviar email ao usuário quando houver modificação de status.||
|RFN 12|Toda pessoa física pode ter apenas uma conta no sistema.||
|RFN 13|O beneficiário deve ser capaz de avaliar o atendimento||
|RFN 14|O sistema deve gerar um relatório estatístico de número de atendimentos no período||
|RFN 15|O usuário deve ser capaz de se cadastrar no sistema.||
|RFN 16|Caso o atendente cancele um atendimento deve ser gerado uma nota justificando tal cancelamento.||
|RFN 17|O atendente deve ter uma pequena descrição, com nome e atividade.||
|RFN 18|O administrador deve ser capaz de realizar buscas/filtragens nas agendas.||
|RFN 19|Todo usuário deve ter um perfil o qual suas informações estão salvas.||
|RFN 20|O administrador deve ser capaz de visualizar a página de histórico de agendamento de qualquer agenda filtrada.||
|RFN 21|A página de histórico do agendamento deve exibir as informaçẽos de;Data evento, Nome do evento, Situação anterior, Situação Atual, responsável pela alteração.||
|RFN 22|O beneficiário deve ser capaz de solicitar a deleção da sua conta na plataforma.||
|RFN 23|Todo agendamento deve respeitar uma data limite, exemplo: o beneficiário não pode marcar um atendimento para o dia atual.||
|RFN 24|O usuário pode marcar múltiplos agendamentos desde que não ultrapasse o limite de agendamentos definido pelo administrador.||
|RFN 25|Ao ser autenticado no sistema o beneficiário deve visualizar inicialmente a página inicial.||
|RFN 26|A página inicial deve exibir as notificações da plataforma.||
|RFN 27|As notificações da plataforma são criadas pelos administradores.||
2. Requisitos não funcionais

|ID|Descrição|Classificação|
| - | - | - |
|RNF 1|O sistema deve respeitar as leis da LGPD.|Requisitos legais.|
|RNF 2|O sistema deve permitir que os usuários realizem as operações sem interrupções.|Requisitos de produtos|
|RNF 3|O sistema não apresentará aos usuários quaisquer dados de cunho privativo.|Requisitos éticos.|
|RNF 4|O sistema deve ser implementado com a persistência do sistema usando JDBC. Pode ser spring boot?|Requisitos de padrão|
|RNF 5|O padrão do código será definido pelo versionamento semântico (https://semver.org/lang/ pt-BR/).|Requisitos organizacionais:|
|RNF 6|O sistema deve ser acessado pelos seguintes navegadores web: Opera, Google Chrome.|Requisitos de portabilidade..|
|RNF 7|A versão do sistema somente será disponível para aplicações web em desktop, não sendo suportada versão mobile.|Requisitos de produtos|
|RNF 8|Os horários disponibilizados no sistema devem obedecer o horário oficial do Brasil o qual é de Brasília. |Requisitos externos|
|RNF 9|O sistema deverá ter alta disponibilidade, cerca de 80%.|Requisitos de confiabilidade|
|RNF 10|Os usuários no caso dos beneficiários não vão precisar de treinamento para realizar a operação no sistema.|Requisitos de usabilidade|
|RNF 11|O sistema oferece suporte apenas à língua portuguesa.|Requisitos de produtos|
|RNF 12|O código do sistema será arquivado no Github.|Requisitos organizacionais.|
|RNF 13|O sistema não deve ultrapassar 3GB de tamanho |Requisito de implementação|
|RNF 14|Para o desenvolvimento dos códigos será adotado o git flow para a gerência de manutenção de código.|Requisitos organizacionais.|
|RNF 15|O tempo de carregamento de tela não deve ser superior a 1 minuto.|Requisitos de eficiência|
|RNF 16|O sistema deve ser compatível com >um hardware mínimo de 4GB de memória RAM|Requisito de implementação|