import math

def perfect_square_check(array):

    new_array = []

    for index_count in range(len(array)):

        number_square_root = math.sqrt(array[index_count])

        if number_square_root % 1 == 0:

            new_array.append(array[index_count])

    return new_array
