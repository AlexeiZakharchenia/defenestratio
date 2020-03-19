# Defenestratio
#### Язык реализации: Java, TypeScript, HTML, CSS  
#### Технологии: Maven, MySQL, Spring Framework, Angular
#### Среда разработки: IntelliJ IDEA  	 

[Documentation](https://github.com/RSlabodchikov/defenestratio/blob/documentation/Documentation/SRS.md)

Архитектура
### Содержание
1. [Часть 1](#part1) <br>
1.1 [Тип приложения](#1) <br>
1.2 [Выбор стратегии развертывания](#2) <br>
1.3 [Выбор технологии](#3) <br>
1.4 [Показатели качества](#4) <br>
1.4.1 [Графический дизайн и взаимодействие с пользователем](#4.1) <br>
1.4.1.1 [Стандартный дизайн](#4.1.1) <br>
1.4.1.2 [Навигация](#4.1.2) <br>
1.4.1.3 [Уведомления](#4.1.3) <br>
1.4.2 [Функциональность](#4.2) <br>
1.4.2.1 [Права доступа](#4.2.1) <br>
1.4.2.2 [Звук](#4.2.2) <br>
1.4.2.3 [Графика и интерфейс пользователя](#4.2.3) <br>
1.4.3 [Производительность и стабильнотсть](#4.3) <br>
1.4.3.1 [Стабильность](#4.3.1) <br>
1.4.3.2 [Производительность](#4.3.2) <br>
1.4.3.3 [Качество визуализации](#4.3.3) <br>
2. [Часть 2](#part2) <br>
2.1 ["To Be Архитектура"](#to_be) <br>
2.2 ["As Is" архитектура](#as_is) <br>
3. [Часть 3](#part3) <br>
3.1 [Сравнение и анализ](#compare_and_analysis) <br>
3.2 [Пути улучшения архитектуры](#way_upgrade) <br>

## Часть 1 <a name="part1"></a>

### 1. Тип приложения <a name="1"></a>
Проект предполагает проектирование и создание веб-приложения для выполнения преимущественно c целью прохождения челленджей на языках Java, TypeScript, HTML, CSS с использованием фреймворков Angular, Spring.

### 2. Выбор стратегии развертывания <a name="2"></a>
Нераспределённое развертывание приложения предполагается посредством возможностей браузера каждого конкретного устройства(как ПК, так и мобильных устройств различных ОС) по ссылке, на которую переходят пользователи.

### 3. Выбор технологии <a name="3"></a>

Язык Java выбран как командный(наиболее знакомый команде разработчиков).
Веб-приложения, доступные не только с ПК, но и с мобильного устройства, пользуются наибольшей популярностью, количеством инструментов для разработки. Также команда имеет возможность для написания, отладки и демонстрации проекта на разных платформах, адаптации приложения под мобильные устройства.
Технология Angular имеет большое количество документации, что позволяет нам быть уверенными в результате, так же она позволяет создавать UI "на ходу", без необходимости пересобирать проект.

### 4. Показатели качества <a name="4"></a>
#### 4.1. Графический дизайн и взаимодействие с пользователем <a name="4.1"></a>
##### 4.1.1. Стандартный дизайн <a name="4.1.1"></a>
* В веб-приложении используется стандартный дизайн с пастельными тонами.
* Вместо стандартной иконки Angular используется иконка, нарисованная дизайнером.
##### 4.1.2. Навигация <a name="4.1.2"></a>
* В приложении поддерживается стандартная системная навигация с помощью кнопки "Назад" , для которой не используются какие-либо адаптированные экранные подсказки.
##### 4.1.3. Уведомления <a name="4.1.3"></a>
* В приложении будут использоваться уведомления для того, чтобы сообщить пользователям о появлении новых челленджей и о необходимости подтверждения пройденных челленджей.
#### 4.2. Функциональность <a name="4.2"></a>
##### 4.2.1. Права доступа <a name="4.2.1"></a>
Приложение запрашивает минимум прав доступа:
* Доступ к галереи пользователя
* Обработка личных данных
* Отправка push-уведомлений
##### 4.2.2. Звук <a name="4.2.3"></a>
* Приложение не должно воспроизводить специальных звуков на главном экране, при переходе в другое приложение, также если отображение на экране выключено, экран заблокирован и в любых других ситуациях.
* В приложении не переопределяется стандартный звук нажатий виджетов и свайпов экрана.
* В фоновом режиме могут приходить уведомления, звук которых определяется пользователем в системных натсройках.
##### 4.2.3. Графика и интерфейс пользователя <a name="4.2.4"></a>
* Приложение поддерживает книжную ориентацию экрана, а так же адаптацию под браузер мобильного устройства.
* Все виджеты и методы разметки страницы определены набором инструментов Bootstrap 4.
#### 4.3. Производительность и стабильнотсть <a name="4.3"></a>
##### 4.3.1. Стабильность <a name="4.3.1"></a>
* При работе приложения не должно происходить аварийных или вынужденных закрытий приложения, зависаний или других аномалий в его работе на любых поддерживаемых устройствах.
##### 4.3.2. Производительность <a name="4.3.2"></a>
* Моментальная загрузка главной страницы приложения, содержащей только данные о приложении, политике приложения с последующей дозагрузкой остальных данных
##### 4.3.3. Качество визуализации <a name="4.3.3"></a>
* Отображение текста, виджетов и других элементов интерфейса без заметных искажений, смазываний или эффектов пикселизации на всех поддерживаемых размерах и форм-факторах экрана ПК и смартфона.
* Обеспечение правильной и читабельной компоновки блоков меню, текста и виждетов.
* Отсутствие обрезанных букв или слов, где это не предусмотрено.
* Анимация некоторых изображений.

## Часть 2 <a name="part2"/></a>

### To Be Архитектура: <a name="to_be"></a>
Архитектурное решение команды по реализации идеи можно увидеть на [структурной схеме](https://github.com/RSlabodchikov/defenestratio/blob/architecture/Documentation/Mockup/structure.png) <br>
Наглядный пример желаемого GUI приведен с помощью мокапов<br>
![](https://github.com/RSlabodchikov/defenestratio/blob/architecture/Documentation/Mockup/1.png) <br>
![](https://github.com/RSlabodchikov/defenestratio/blob/architecture/Documentation/Mockup/2.png) <br>
![](https://github.com/RSlabodchikov/defenestratio/blob/architecture/Documentation/Mockup/3.png) <br>
![](https://github.com/RSlabodchikov/defenestratio/blob/architecture/Documentation/Mockup/4.png) <br>
![](https://github.com/RSlabodchikov/defenestratio/blob/architecture/Documentation/Mockup/5.png) <br>

### As is architecture:<a name="as_is"/></a>
[Диаграмма классов](https://github.com/RSlabodchikov/defenestratio/blob/architecture/Documentation/Mockup/class%20diagram.png) <br>

## Часть 3 <a name="part3"/></a>


**1. Сравнение и анализ** <a name="compare_and_analysis"/></a>
На данный момент архитектура AS-IS не имеет отличительных особенностей от архитектуры TO-BE, поскольку она является довольно примитивной и не имеет сложных связей и решений реализации. Также команда старается жестко придерживаться изначального решения в виде схем, мокапов и диаграмм для воплощении идеи.

**2. Пути улучшения архитектуры** <a name="way_upgrade"/></a>
Возможно внедрение шаблона посредника для взаимодействия некоторых компонентов.

