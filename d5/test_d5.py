import d5
import contextlib
from io import StringIO


def test_compare_list():
    list1 = [1, 2, 3, 4, 5]
    list2 = [6, 7, 8, 9, 10]
    list3 = [1, 1, 4, 4, 5]
    temp_stdout = StringIO()
    with contextlib.redirect_stdout(temp_stdout):
        d5.compare_list(list1, list2)
    output = temp_stdout.getvalue().strip()
    assert output == "Второй список имеет большее среднее значение"
    temp_stdout = StringIO()
    with contextlib.redirect_stdout(temp_stdout):
        d5.compare_list(list2, list1)
    output = temp_stdout.getvalue().strip()
    assert output == "Первый список имеет большее среднее значение"
    temp_stdout = StringIO()
    with contextlib.redirect_stdout(temp_stdout):
        d5.compare_list(list1, list3)
    output = temp_stdout.getvalue().strip()
    assert output == "Средние значения равны"
