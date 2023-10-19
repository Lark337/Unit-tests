"Сравнивает два списка и выводит результат сравнения"


def compare_list(list1, list2):
    "Сравнивает два списка и выводит результат сравнения"
    averege1 = sum(list1) / len(list1)
    averege2 = sum(list2) / len(list2)
    if averege1 > averege2:
        print("Первый список имеет большее среднее значение")
    elif averege1 == averege2:
        print("Средние значения равны")
    else:
        print("Второй список имеет большее среднее значение")
