3- De forma incremental, traduza o seguinte conjunto de classes em um
programa Java. Importante: Não são permitidas chamadas a System.in,
System.out ou similares de dentro das classes criadas.\
a. Classe: Porta\
Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ
Métodos: void abre(), void fecha(), void pinta(String s),
boolean estaAberta(). Para testar, crie uma porta, abra e feche
a mesma, pinte‐a de diversas cores, altere suas dimensões e
use o método estaAberta para verificar se ela está aberta.\
b. Classe: Casa\
Atributos: cor, porta1, porta2, porta3
Método: void pinta(String s), int
quantasPortasEstaoAbertas(), int totalDePortas()
Para testar, crie uma casa e pinte‐a. Crie três portas e coloque‐
as na casa; abra e feche as mesmas como desejar. Utilize o
método quantasPortasEstaoAbertas para imprimir o número
de portas abertas.\
c. Classe: Edificio\
Atributos: cor, totalDePortas, totalDeAndares, portas[]
Métodos: void pinta(String s), int
quantasPortasEstaoAbertas(), void
adicionaPorta(Porta p), int totalDePortas(), void
adicionarAndar(), int
totalDeAndares()
Para testar, crie um edifício, pinte‐o. Crie seis portas e
coloque‐as no edifício
através do método adicionaPorta, abra e feche‐as como
desejar. Utilize o método quantasPortasEstaoAbertas para
imprimir o número de portas abertas e o método
totalDePortas para imprimir o total de portas em seu edifício.
Cria alguns andares utilizado o método adicionarAndar e
retorne o número total de andares utilizando o método
totalDeAndares.
