# Проектирование архитектуры ПО

Курсовой проект по дисциплине "Проектирование архитектур программного обеспечения", 2018.

Филиппов Денис Викторович, группа 13541/3

### Назначение проектируемой системы 
Патентное бюро

## Краткое описание
Полное описание приведено в [Wiki](https://github.com/DenisFV/Architect/wiki).

### Бизнес-процессы
- Заявка на получение патента на изделие
- Проверить верификацию изделия
- Выдать патент на изделие

### Роли
- Клиент
- Менеджер бюро (рассматривает заявки на получение патента, принимает оплату, выдает патент)
- Верификатор (проверяет верифицикацию изделия, принимает решение о выдаче патента)

### Внешняя интеграция
Возможные варианты: патентная история клиента (в виде файла), взаимодействие с платежной системой.

### API, предоставляемый приложением
Возможные варианты: получить список клиентов, детализацию по тематике патента, лог действий.
