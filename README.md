Михаил Трајковиќ 213203

2. 

![ControlFlowGraph (2)](https://github.com/Miki007a/SI_2023_lab2_213203/assets/127977697/964e98af-29cb-4ac7-835e-ca1543a31c0d)

3. Цикломатичната комплесност изнесува 11, резултатот е добиен со броење на региони 
4. Првин треба да се напишат сите можни гранки, па потоа треба да се напишат најмал број на тестови кои ќе ги опфатат сите гранки. се опафќаат сите гранки во 5 тестови. 
~Во првиот тест ќе го истестираме условот кои содржи Exception Така што ќе испратиме user кој има нулева вредност.
Вредностите кои ќе ни се потребни за да се овозможи тоа се:user=null и allUsers=anything.

~Во вториот тест ќе ги истестираме условите за mail и password(сакаме да ги исполниме), каде што внатре во mail условот кога ќе ги итерираме сите Users од листата од allUsers ќе направиме да содржи еден User кој ќе содржи ист mail и Username како нашиот user со кој што ќе го споредуваме и ќе создадеме уште еден User кој нема да содржи ист mail и Username со нашиот user со кој што ќе го споредуваме. Вредностите кои ќе ни се потребни за да се овозможи тоа се: user.username=null,user.email="Darko@yahoo.com",user.password="das",User Darko=new User("Darko@yahoo.com","Darko@yahoo.com",filo),User Marko=new User("Marko@yahoo.com","Marko@yahoo.com","pas"), allUsers=[Darko,Marko].

~Во третиот тест ќе ги истестираме условите за mail и password(сакаме да не ги исполниме), со цел да ги поминеме сите гранки кои не сме ги прошле и да дополнително поминеме други гранки внатре во password сегментот, каде што поконкретно ќе го тестираме дали содржи специјални карактери и дали има празни места, каде што ќе направиме да содржи специјални карактери и да нема празни места.
Вредностите кои ќе ни се потребни за да се овозможи тоа се:user.username="Darko",user.email="Darko",user.password="filoz>ofija", allUsers=null;

~Четвртиот тест ќе го тестираме password сегментот каде што ќе нема специјални карактери и ќе нема празни места
Вредностите кои ќе ни се потребни за да се овозможи тоа се:user.username="Darko",user.email="Darko",user.password="filozofija", allUsers=null;

~Петтиот тест ќе го тестираме password сегментот каде што ќе го тестираме условот за празни места и ќе направиме да има.
Вредностите кои ќе ни се потребни за да се овозможи тоа се:user.username="Darko",user.email="Darko",user.password="filoz> ofija", allUsers=null;
Со сите овие тестови успеавме да ги поминеме сите гранки.

5. Сите тест случаеви за (user==null || user.getPassword()==null || user.getEmail()==null) се:
 
 T F F ->User user=null;
 
 F T F ->User user=new User(null,pas,null); Не е возможно првото да не е вистинито а второто или третото да е, бидејќи ако има една не нулева вредност објектов тогаш не е нулева вредност.
 
 F F T -> User user=new User(null,null,Darko@yahoo.com);
 
 F F F -> User user=new User("username","password","email");



