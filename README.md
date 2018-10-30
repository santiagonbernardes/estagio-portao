# estagio-portao
Solução para problema proposto em prova de estágio feita em 08/2017. Na época não consegui finalizar o exercício.

Segue o problema proposto:

<b>1 - Tarefa</b>

Você foi contratado por uma companhia produtora de portões eletrônicos para garagens. Acidentes com a linha de produtos atual resultaram em danos a inúmeros carros, braços e pernas de pessoas quebradas e vários animais de estimação mortos. Sua missão é escrever uma versão mais segura do software controlador deles.

<b>1.1 - Especificação</b>

A porta sempre começa fechada. O controle remoto possui exatamente um botão, com o seguinte comportamento:

* Se a porta estiver fechada, ela começa a abrir. Se estiver aberta, começa a fechar.
* Leva 5 segundos para a porta abrir ou fechar completamente.
* Enquanto a porta está se movendo, apertar o botão pausa o movimento e apertar novamente faz com que ela continue na mesma direção.

Para tornar a porta mais segura, ela foi equipada com uma detecção de obstáculos. Quando a porta detecta um obstáculo, ela deve imediatamente inverter o sentido de seu movimento.

<b>1.2 - Entrada</b>

A entrada do programa será uma String em que cada caracter representa o evento ocorrido em um segundo, sendo os seguintes possíveis caracteres:

'.' - Nenhum evento
'P' - Botão pressionado
'O' - Obstáculo detectado

Por exemplo, "..P...." significa que nada aconteceu por 2 segundos, então o botão foi pressionado e não houve qualquer outro evento a seguir.

<b>1.3 - Saída</b>

Uma String onde cada caracter representa a posição da porta em um segundo (0 significa totalmente fechada e 5 totalmente aberta). A porta começa a se mover imediatamente, então sua posição muda no mesmo segundo em que receber um evento.
Exemplo: a entrada "..P...O....." como entrada resultaria em "001234321000" como saída.

<b>2 - Testes</b>

O funcionamento da solução deve ser garantida através de testes unitários. A seguir encontra-se um código em Java com as comparações e seus resultados.

Essas são as comparações mínimas que devem ser feitas para garantir o funcionamento. Utilize esse código como base da implementação dos testes unitários.
  Dica: Implemente os testes antecipadamente.
  
controller.execute("..P...O.....").equals("001234321000");

controller.execute(".P....").equals("012345");

controller.execute("...P.P...P..").equals("000122222345");

controller.execute("P..O..").equals("123210");

controller.execute("P..P...PO...").equals("123333343210");

controller.execute("P...O.O.P...P..").equals("123432344444555");

controller.execute("P.....P.P..P...").equals("123455433332100");
